package bballFront;

import bballDB.DBConnect;
import bballUtil.ballDEBUG;
import ballRun.indexPass;

import bballDB.DBTransSelect;
import bballDB.DBDelete;
import bballDB.DBTransInsert;
import bballDB.DBTransUpdate;
import DBAccess.bballAccess;

import bball.SubModel;
import bball.BBooks;
// import bball.League;
// import bball.Team;
// import bball.TeamStat;
// import bball.Game;
// import bball.GameStat;
// import bball.Player;
// import bball.PlayerStat;

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

public class bbooksWindow extends subWindow {
    boolean DEBUG_VAL = true;
    indexPass iPass;

// windows building and displaying
    JFrame frameSub;
    JPanel panelSub;
    Container containerSub;
    GridBagLayout layout;
    GridBagConstraints gbc;
    JMenuBar menuBarSub;

// data structures if necessary
    JList<String> subNameList;
    DefaultListModel<String> subListModel;
    DefaultListModel<Integer> subDBKeyListModel;
    ArrayList <BBooks> subList;
    BBooks currentSub;

// extra labels
    JLabel headerLabel;
    JLabel statusLabel;

// buttons
    JButton editButton;
    JButton deleteButton;
    JButton saveButton;

// edit fields
    JTextField userText;

    /**************************************************
     * subList - an Array list of database entries
     * since all my database records are children of
     *        SubModel
     * call this object like this:
     *    bW = new bookWindow(<BBooks>dataList)
     *    bW.getData();
     *    bW.getButtonList();
     *    bW.getMenu();
     *    bW.showWindow();
     **************************************************/
    public bbooksWindow(){
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);
        bDebug.msgPrt("bbooksWindow");

        //frameSub.dispose();
        frameSub = new JFrame("BBooks Frame");
        iPass = new indexPass();

        iPass.setFrameSub(frameSub);

        headerLabel = new JLabel("*** header ***", JLabel.CENTER);
        statusLabel = new JLabel("*** status ***",JLabel.CENTER);
        statusLabel.setSize(350,100);

        gbc = new GridBagConstraints();

        panelSub = new JPanel();
        panelSub.setBackground(Color.darkGray);
        panelSub.setSize(300,300);

        layout = new GridBagLayout();
        panelSub.setLayout(layout);

        subListModel = new DefaultListModel<>();
        subDBKeyListModel = new DefaultListModel<>();

        containerSub = frameSub.getContentPane();
        currentSub = new BBooks();

        openWindow();
        frameSub.pack();
        frameSub.setVisible(true);
    }

    private void openWindow(){
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.setDebug(DEBUG_VAL);
      bDebug.msgPrt("openWindow - with subList");

      initBooksListsFromDB();

      Dimension d = new Dimension(400, 300);
      bDebug.msgPrt("about to set menu");

      containerSub.setPreferredSize(d);
      bDebug.msgPrt("set size...");

      BooksMenuBuilder bmb = new BooksMenuBuilder();
      menuBarSub = bmb.buildBooksMenuBar();
      frameSub.setJMenuBar(menuBarSub);

      showEditButton(panelSub, currentSub);
      showDeleteButton(panelSub, currentSub);
      showBooksList();

      containerSub.add(panelSub);
      frameSub.pack();
      frameSub.revalidate();
      frameSub.repaint();

      frameSub.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent windowEvent) {
              frameSub.setVisible(false);
              frameSub.dispose();
          }
      });
    }

    public void openEditWindow(String type){
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.setDebug(DEBUG_VAL);
      bDebug.msgPrt("openEditWindow");
      frameSub = new JFrame("Basketball Books - Edit");
      iPass.setFrameSub(frameSub);

      containerSub = frameSub.getContentPane();
      gbc = new GridBagConstraints();
      panelSub = new JPanel();
      panelSub.setBackground(Color.blue);

      layout = new GridBagLayout();
      panelSub.setLayout(layout);

      //initsubListsFromDB();

      Dimension d = new Dimension(400, 300);
      bDebug.msgPrt("opening edit window");

      containerSub.setPreferredSize(d);

      BooksMenuBuilder bmb = new BooksMenuBuilder();
      menuBarSub = bmb.buildBooksMenuBar();
      frameSub.setJMenuBar(menuBarSub);
      //showsubList();
      bDebug.msgPrt("Adding nameLable");

      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.gridx = 0;
      gbc.gridy = 1;
      gbc.insets.left = 5;

      JLabel  nameLabel = new JLabel("Book Name: ", JLabel.CENTER);
      nameLabel.setBackground(Color.blue);
      nameLabel.setForeground(Color.white);
      panelSub.add(nameLabel,gbc);

      bDebug.msgPrt("Adding userText");

      gbc.gridx = 1;
      gbc.gridy = 1;
      gbc.insets.left = 5;

      userText = new JTextField(6);
      userText.setBackground(Color.blue);
      userText.setForeground(Color.white);
      panelSub.add(userText,gbc);

      bDebug.msgPrt("Adding statusLabel");

      gbc.gridx = 0;
      gbc.gridy = 3;
      gbc.insets.left = 5;
      statusLabel.setBackground(Color.blue);
      statusLabel.setForeground(Color.white);
      panelSub.add(statusLabel,gbc);

      if(type.equals("new")){
        showSaveNewButton(panelSub, currentSub);
      } else {
        showSaveButton(panelSub, currentSub);
      }

      containerSub.add(panelSub);
      frameSub.pack();
      frameSub.revalidate();
      frameSub.repaint();

      frameSub.setVisible(true);

      frameSub.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent windowEvent) {
              frameSub.setVisible(false);
              frameSub.dispose();
          }
      });
    }


    void showBooksList(){
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.setDebug(DEBUG_VAL);
      bDebug.msgPrt("bbooksWindow::showBooksList");

      //bDebug.msgPrt("showsubList: " + subNameList.getModel().getSize());

      subNameList.setBackground(Color.blue);
      subNameList.setForeground(Color.yellow);
      bDebug.msgPrt("set subNameList");

      gbc.ipady = 10;
      gbc.ipadx = 10;
      gbc.gridx = 0;
      gbc.gridy = 0;
      gbc.insets.left = 5;

      panelSub.add(subNameList,gbc);
      bDebug.msgPrt("set panelSub");

      subNameList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                 JList list = (JList)evt.getSource();

                 int index = list.locationToIndex(evt.getPoint());
                 //currentSub = subNameList.getModel().getElementAt(index);

                //set currency
                bDebug.msgPrt("Setting currency...");
                currentSub.setName(subListModel.getElementAt(index));
                currentSub.setId(subDBKeyListModel.getElementAt(index));
                String s = currentSub.getName();
                int i = currentSub.getId();
                bDebug.msgPrt("Current: [" + currentSub.getName() + "][" + currentSub.getId() + "]");
                if (evt.getClickCount() == 2){
                    index = list.locationToIndex(evt.getPoint());
                    bDebug.msgPrt("Clicked on: " + currentSub.getName() + " @ " + index);
                    //Object o = subNameList.getModel().getElementAt(index);
                    //System.out.println(index + "Double-clicked on: " + o.toString());
                }
            }
        });
    }

    void initBooksListsFromDB(){
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);
        bDebug.msgPrt("initBooksListsFromDB");

        DBTransSelect DBSel = new DBTransSelect();
        subList = DBSel.doBooksSelect();

        for(int i=0; i < subList.size(); i++){
             bDebug.msgPrt("LOOP: " + i);
             BBooks t = null;
             t = subList.get(i);
             subListModel.addElement(t.getName());
             subDBKeyListModel.addElement(t.getId());
           }
        //
        subNameList = new JList<>(subListModel);
        //   bDebug.msgPrt("subNameList: " + subNameList.getModel().getSize());
    }
  }
