package bballFront;

import bballDB.DBConnect;
import bballUtil.ballDEBUG;
import ballRun.indexPass;
import bballDB.DBDelete;
import bballDB.DBTransInsert;
import bballDB.DBTransUpdate;
import DBAccess.bballAccess;

import bball.BBooks;
import bball.League;
import bball.Team;
import bball.TeamStat;
import bball.Game;
import bball.GameStat;
import bball.Player;
import bball.PlayerStat;

import bballFront.bballGameWindow;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.SwingUtilities;

public class bballBookWindow {
    boolean DEBUG_VAL = true;
    indexPass iPass = new indexPass();

// windows building and displaying
    JFrame frameBook;
    JPanel panelBook;
    Container containerBook;
    GridBagLayout layout;
    GridBagConstraints gbc;
    JMenuBar menuBarBook;

// data structures if necessary
    JList<String> bookNameList;
    DefaultListModel<String> bookListModel;
    DefaultListModel<Integer> bookDBKeyListModel;
    ArrayList <BBooks> bookList;
    BBooks currentBook;

// extra labels
    JLabel headerLabel;
    JLabel statusLabel;

// buttons
    JButton editButton;
    JButton deleteButton;
    JButton saveButton;

// edit fields
    JTextField userText;

    public bballBookWindow(){
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);
        bDebug.msgPrt("bballBookWindow");

        //frameBook.dispose();
        frameBook = new JFrame("Basketball Books");
        iPass.setFrameBook(frameBook);
        iPass.setCurrentBookWindow(this);

        headerLabel = new JLabel("***header***", JLabel.CENTER);
        statusLabel = new JLabel("***status***",JLabel.CENTER);
        statusLabel.setSize(350,100);

        gbc = new GridBagConstraints();

        panelBook = new JPanel();
        panelBook.setBackground(Color.darkGray);
        panelBook.setSize(300,300);

        layout = new GridBagLayout();
        panelBook.setLayout(layout);

        bookListModel = new DefaultListModel<>();
        bookDBKeyListModel = new DefaultListModel<>();

        containerBook = frameBook.getContentPane();
        currentBook = new BBooks();

        openWindow();
        frameBook.pack();
        frameBook.setVisible(true);
    }

    private void openWindow(){
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.setDebug(DEBUG_VAL);
      bDebug.msgPrt("openWindow");

      initBookListsFromDB();

      Dimension d = new Dimension(400, 300);
      bDebug.msgPrt("about to set menu");

      containerBook.setPreferredSize(d);
      bDebug.msgPrt("set size...");

      BooksMenuBuilder bmb = new BooksMenuBuilder();
      menuBarBook = bmb.buildBooksMenuBar();
      frameBook.setJMenuBar(menuBarBook);
      showEditButton();
      showDeleteButton();
      showBookList();

      //
      // gbc.fill = GridBagConstraints.HORIZONTAL;
      // gbc.gridx = 0;
      // gbc.gridy = 1;
      // gbc.insets.left = 5;
      // statusLabel.setBackground(Color.yellow);
      // statusLabel.setForeground(Color.white);
      // panelBook.add(statusLabel,gbc);
      //
      containerBook.add(panelBook);
      frameBook.pack();
      frameBook.revalidate();
      frameBook.repaint();

      //frameBook.setVisible(true);

      frameBook.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent windowEvent) {
              frameBook.setVisible(false);
              frameBook.dispose();
          }
      });
    }

    public void openEditWindow(String type){
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.setDebug(DEBUG_VAL);
      bDebug.msgPrt("openEditWindow");
      frameBook = new JFrame("Basketball Books - Edit");
      iPass.setFrameBook(frameBook);

      containerBook = frameBook.getContentPane();
      gbc = new GridBagConstraints();
      panelBook = new JPanel();
      panelBook.setBackground(Color.blue);

      layout = new GridBagLayout();
      panelBook.setLayout(layout);

      initBookListsFromDB();

      Dimension d = new Dimension(400, 300);
      bDebug.msgPrt("opening edit window");

      containerBook.setPreferredSize(d);

      BooksMenuBuilder bmb = new BooksMenuBuilder();
      menuBarBook = bmb.buildBooksMenuBar();
      frameBook.setJMenuBar(menuBarBook);
      //showBookList();
      bDebug.msgPrt("Adding nameLable");

      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.gridx = 0;
      gbc.gridy = 1;
      gbc.insets.left = 5;

      JLabel  nameLabel = new JLabel("Book Name: ", JLabel.CENTER);
      nameLabel.setBackground(Color.blue);
      nameLabel.setForeground(Color.white);
      panelBook.add(nameLabel,gbc);

      bDebug.msgPrt("Adding userText");

      gbc.gridx = 1;
      gbc.gridy = 1;
      gbc.insets.left = 5;

      userText = new JTextField(6);
      userText.setBackground(Color.blue);
      userText.setForeground(Color.white);
      panelBook.add(userText,gbc);

      bDebug.msgPrt("Adding statusLabel");

      gbc.gridx = 0;
      gbc.gridy = 3;
      gbc.insets.left = 5;
      statusLabel.setBackground(Color.blue);
      statusLabel.setForeground(Color.white);
      panelBook.add(statusLabel,gbc);

      if(type.equals("new")){
        showSaveNewButton();
      } else {
        showSaveButton();
      }

      containerBook.add(panelBook);
      frameBook.pack();
      frameBook.revalidate();
      frameBook.repaint();

      frameBook.setVisible(true);

      frameBook.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent windowEvent) {
              frameBook.setVisible(false);
              frameBook.dispose();
          }
      });
    }

    public BBooks getCurrentBook(){
        return currentBook;
    }

    public void setCurrentBook(String name, int id){
        currentBook.setName(name);
        currentBook.setId(id);
    }

    public ArrayList<BBooks> getBookList(){
        return bookList;
    }

    public JFrame getFrameBook(){
        return frameBook;
    }

    public Container getContainerBook(){
        return containerBook;
    }

    public JList<String> getBookNameList(){
        return bookNameList;
    }

    void showEditButton(){
        editButton = new JButton("Edit");

        editButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            frameBook.dispose();
            openEditWindow("old");
            String data = "Edit...";
         }
       });

       ballDEBUG bDebug = new ballDEBUG();
       bDebug.setDebug(DEBUG_VAL);

       bDebug.msgPrt("Setting up edit button");
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 0;
       gbc.gridy = 2;
       panelBook.add(editButton, gbc);
    }



    void showDeleteButton(){
      deleteButton = new JButton("Delete");

      deleteButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
              DBDelete DBConn = new DBDelete();
              int r = currentBook.getId();
              DBConn.doBooksDelete(r);
              frameBook.dispose();
         }
      });

      gbc.gridx = 1;
      gbc.gridy = 2;
      panelBook.add(deleteButton,gbc);
    }

    void showSaveButton(){
        saveButton = new JButton("Save");
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);

        saveButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            bDebug.msgPrt("Saving...");
            DBTransUpdate dbTUpdate = new DBTransUpdate();
            currentBook.setName(userText.getText());
            dbTUpdate.doBooksUpdate(currentBook);
            frameBook.dispose();
            openWindow();
         }
       });

       bDebug.msgPrt("Setting up save button");
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 1;
       gbc.gridy = 3;
       panelBook.add(saveButton, gbc);
    }


    void showSaveNewButton(){
        saveButton = new JButton("Save New");
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);

        saveButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            bDebug.msgPrt("Saving...New ");
            DBTransInsert dbTInsert = new DBTransInsert();
            currentBook.setName(userText.getText());
            dbTInsert.doBooksInsert(currentBook.getName());
            frameBook.dispose();
            openWindow();
         }
       });

       bDebug.msgPrt("Setting up save new button");
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 1;
       gbc.gridy = 3;
       panelBook.add(saveButton, gbc);
    }


    void showBookList(){
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.setDebug(DEBUG_VAL);
      //bDebug.msgPrt("showBookList: " + bookNameList.getModel().getSize());

      bookNameList.setBackground(Color.blue);
      bookNameList.setForeground(Color.yellow);
      bDebug.msgPrt("set bookNameList");

      gbc.ipady = 10;
      gbc.ipadx = 10;
      gbc.gridx = 0;
      gbc.gridy = 0;
      gbc.insets.left = 5;

      panelBook.add(bookNameList,gbc);
      bDebug.msgPrt("set panelBook");

      bookNameList.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();

                int index = list.locationToIndex(evt.getPoint());
                //currentBook = bookNameList.getModel().getElementAt(index1);

               //set currency
               currentBook.setName(bookListModel.getElementAt(index));
               currentBook.setId(bookDBKeyListModel.getElementAt(index));
               String s = currentBook.getName();
               int i = currentBook.getId();
               bDebug.msgPrt("Current: [" + currentBook.getName() + "][" + currentBook.getId() + "]");
               if (evt.getClickCount() == 2){
                   index = list.locationToIndex(evt.getPoint());
                   bDebug.msgPrt("Clicked on: " + currentBook.getName() + " @ " + index);
                   //Object o = bookNameList.getModel().getElementAt(index);
                   //System.out.println(index + "Double-clicked on: " + o.toString());
               }
           }
       });
    }

    void initBookListsFromDB(){
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);
        bDebug.msgPrt("initBookListsFromDB");

        bballAccess bAccess = new bballAccess();
        bookList = bAccess.getBookList();
        bDebug.msgPrt("got DB: " + bookList.size());

        for(int i=0; i < bookList.size(); i++){
            bDebug.msgPrt("LOOP: " + i);
            BBooks t = null;
            t = bookList.get(i);
            bookListModel.addElement(t.getName());
            bookDBKeyListModel.addElement(t.getId());
          }

          bookNameList = new JList<>(bookListModel);
          bDebug.msgPrt("bookNameList: " + bookNameList.getModel().getSize());
          bDebug.msgPrt("got DB - DONE");
    }

  }
