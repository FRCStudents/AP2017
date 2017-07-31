package bballFront;

import bballDB.DBConnect;
import bballUtil.ballDEBUG;
import ballRun.indexPass;
import bballDB.DBDelete;
import bballDB.DBTransInsert;
import DBAccess.bballAccess;

import bball.BBooks;
import bball.League;
import bball.Team;
import bball.TeamStat;
import bball.Game;
import bball.GameStat;
import bball.Player;
import bball.PlayerStat;

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

public class bballFrontBook {
    static JFrame frameB = new JFrame("Basketball Books Now");
    JList<String> bookNameList;
    Object currentBook = null;

    indexPass iPass = new indexPass();

    Object getCurrentBook(){
      return currentBook;
    }

    JPanel createBooksPanel(){
      JList<String> bookNameList;
      JLabel headerLabel = new JLabel("***header***", JLabel.CENTER);
      JLabel statusLabel = new JLabel("***status***",JLabel.CENTER);
      statusLabel.setSize(350,100);

      JPanel panel = new JPanel();
      panel.setBackground(Color.darkGray);
      panel.setSize(300,300);
      GridBagLayout layout = new GridBagLayout();

      panel.setLayout(layout);
      return panel;
    }


    void setUpBookButtons(GridBagConstraints gbc, JPanel panel,
                      DefaultListModel<String> listModel, ArrayList tl, Container c){
      JButton editButton = new JButton("Edit");

      editButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            indexPass iPass = new indexPass();
            String data = "Edit Username " + iPass.getBookIndexHold();
         }
      });

      JButton deleteButton = new JButton("Delete");

      deleteButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            indexPass iPass = new indexPass();
            //String data = "Delete Username " + iPass.getBookIndexHold();
            DBDelete DBConn = new DBDelete();
            int r = iPass.getBookIndexHold();
            DBConn.doBooksDelete(r);
            createBooksList(listModel,tl,c);
         }
      });

      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.gridx = 0;
      gbc.gridy = 2;
      panel.add(editButton,gbc);

      gbc.gridx = 1;
      gbc.gridy = 2;
      panel.add(deleteButton,gbc);
      return;
    }

    JPanel setUpBookList(JList bookNameList, GridBagConstraints gbc, JPanel panel, ArrayList tl){
      gbc.ipady = 10;
      gbc.ipadx = 10;
      gbc.gridx = 0;
      gbc.gridy = 0;
      gbc.insets.left = 5;

      bookNameList.setBackground(Color.blue);
      bookNameList.setForeground(Color.yellow);
      panel.add(bookNameList,gbc);

      bookNameList.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent evt) {
               JList list = (JList)evt.getSource();

               int index1 = list.locationToIndex(evt.getPoint());
               currentBook = bookNameList.getModel().getElementAt(index1);

               BBooks cBook = (BBooks)tl.get(index1);
               System.out.println("CurrentBook assigned - printing... " + cBook.getId());

               iPass.setBookIndexHold(cBook.getId());

               if (evt.getClickCount() == 2){
                   int index = list.locationToIndex(evt.getPoint());
                   Object o = bookNameList.getModel().getElementAt(index);
                   System.out.println(index + "Double-clicked on: " + o.toString());
               } else if (evt.getClickCount() == 3) {
                   int index = list.locationToIndex(evt.getPoint());
               }
           }
       });

       return panel;
    }

    void createNewBooksScreen(DefaultListModel<String> listModel, ArrayList tl, Container c){
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.debugOn();
      bDebug.msgPrt("createNewBooksScreen");

      JPanel panel = null;
      panel = createBooksPanel();
      GridBagConstraints gbc = new GridBagConstraints();
      // clear the old list
      listModel.removeAllElements();
      bDebug.msgPrt("listModel size (removeAll): " + listModel.getSize());
      // update list fresh from database
      bballAccess bAccess = new bballAccess();

      JLabel  statusLabel= new JLabel("Status: ", JLabel.RIGHT);
      JLabel  namelabel = new JLabel("New Book: ", JLabel.CENTER);
      final JTextField userText = new JTextField(6);

      JButton saveButton = new JButton("Save");

      saveButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            DBTransInsert DBIns = new DBTransInsert();
            DBIns.doBooksInsert(userText.getText());
            listModel.removeAllElements();

            createBooksWindow();
         }
      });

      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.gridx = 0;
      gbc.gridy = 1;
      gbc.insets.left = 5;
      namelabel.setBackground(Color.yellow);
      namelabel.setForeground(Color.white);
      panel.add(namelabel,gbc);

      gbc.insets.left = 25;
      gbc.gridx = 1;
      gbc.gridy = 1;
      //gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.gridwidth = 2;
      userText.setBackground(Color.blue);
      userText.setForeground(Color.yellow);
      panel.add(userText,gbc);

      gbc.fill = GridBagConstraints.HORIZONTAL;
      //gbc.ipady = 20;
      gbc.gridx = 0;
      gbc.gridy = 2;
      panel.add(saveButton,gbc);

      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.ipadx = 20;
      gbc.gridx = 0;
      gbc.gridy = 4;
      panel.add(statusLabel,gbc);

      // tl = bAccess.getBookList();
      //
      // for(int i=0; i < tl.size(); i++){
      //   BBooks t = null;
      //   t = (BBooks)tl.get(i);
      //   listModel.addElement(t.getName());
      // }
      //  bDebug.msgPrt("listModel size (loaded): " + listModel.getSize());
      //
      //  bookNameList = new JList<>(listModel);
      //  panel = setUpBookList(bookNameList, gbc, panel, tl);

      //setUpBookButtons(gbc, panel, listModel, tl, c);
       bDebug.msgPrt("Add the panel...");

       c.add(panel);
       c.revalidate();
       c.repaint();
       c.setVisible(true);
    }


    /********************************************************
     * listModel - windows list for front end
     * tl - fresh list from the database
     ********************************************************/
    void createBooksList(DefaultListModel<String> listModel, ArrayList tl, Container c){
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.debugOn();
      bDebug.msgPrt("createBooksList");

      JPanel panel = null;
      panel = createBooksPanel();
      GridBagConstraints gbc = new GridBagConstraints();
      // clear the old list
      listModel.removeAllElements();
      bDebug.msgPrt("listModel size (removeAll): " + listModel.getSize());
      // update list fresh from database
      bballAccess bAccess = new bballAccess();
      tl = bAccess.getBookList();

      for(int i=0; i < tl.size(); i++){
        BBooks t = null;
        t = (BBooks)tl.get(i);
        listModel.addElement(t.getName());
      }
       bDebug.msgPrt("listModel size (loaded): " + listModel.getSize());

       bookNameList = new JList<>(listModel);
       panel = setUpBookList(bookNameList, gbc, panel, tl);

       setUpBookButtons(gbc, panel, listModel, tl, c);
       bDebug.msgPrt("Add the panel...");

       c.add(panel);
       c.revalidate();
       c.repaint();
       c.setVisible(true);
    }

    void createNewBooksWindow() {
        frameB.dispose();
        frameB = new JFrame("Basketball Books New");
        bballAccess bAccess = new bballAccess();
        ArrayList tl = bAccess.getBookList();

        JLabel label = new JLabel("New Books");
        Container c = frameB.getContentPane();
        c.add(label);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        createNewBooksScreen(listModel, tl, c);
        Dimension d = new Dimension(400, 300);
        c.setPreferredSize(d);

        // BooksMenuBuilder bmb = new BooksMenuBuilder();
	      // JMenuBar menuBar = bmb.buildBooksMenuBar();
	      // frameB.setJMenuBar(menuBar);

        frameB.pack();
        frameB.revalidate();
        frameB.repaint();

        frameB.setVisible(true);

        frameB.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                frameB.setVisible(false);
                frameB.dispose();
            }
        });

    }


    void createBooksWindow() {
        frameB.dispose();
        frameB = new JFrame("Basketball Books");

        bballAccess bAccess = new bballAccess();
        ArrayList tl = bAccess.getBookList();

        JLabel label = new JLabel("Books");
        Container c = frameB.getContentPane();
        c.add(label);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        createBooksList(listModel, tl, c);
        Dimension d = new Dimension(400, 300);
        c.setPreferredSize(d);

        BooksMenuBuilder bmb = new BooksMenuBuilder();
	      JMenuBar menuBar = bmb.buildBooksMenuBar();
	      frameB.setJMenuBar(menuBar);

        frameB.pack();
        frameB.revalidate();
        frameB.repaint();

        frameB.setVisible(true);

        frameB.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                frameB.setVisible(false);
                frameB.dispose();
            }
        });

    }
  }
