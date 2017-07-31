package bballFront;

import bballDB.DBConnect;
import bballUtil.ballDEBUG;
import ballRun.indexPass;

import bballDB.DBDelete;
import bballDB.DBTransInsert;
import bballDB.DBTransUpdate;
import DBAccess.bballAccess;

import bball.SubModel;
// import bball.BBooks;
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

public class subWindow {
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
    ArrayList <SubModel> subList;
    SubModel currentSub;

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
    public subWindow(){
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);
        bDebug.msgPrt("subWindow");

        //frameSub.dispose();
        frameSub = new JFrame("Sub Frame");
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
        currentSub = new SubModel();

        openWindow();
        frameSub.pack();
        frameSub.setVisible(true);
    }

    private void openWindow(){
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.setDebug(DEBUG_VAL);
      bDebug.msgPrt("openWindow - with subList");

      initsubListsFromDB();

      Dimension d = new Dimension(400, 300);
      bDebug.msgPrt("about to set menu");

      containerSub.setPreferredSize(d);
      bDebug.msgPrt("set size...");

      SubMenuBuilder bmb = new SubMenuBuilder();
      menuBarSub = bmb.buildSubMenuBar();
      frameSub.setJMenuBar(menuBarSub);
      //showEditButton();
      //showDeleteButton();
      showsubList();
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

      SubMenuBuilder bmb = new SubMenuBuilder();
      menuBarSub = bmb.buildSubMenuBar();
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

    public SubModel getcurrentSub(){
        return currentSub;
    }

    public void setcurrentSub(String name, int id){
        currentSub.setName(name);
        currentSub.setId(id);
    }

    public ArrayList<SubModel> getsubList(){
        return subList;
    }

    public JFrame getframeSub(){
        return frameSub;
    }

    public Container getcontainerSub(){
        return containerSub;
    }

    public JList<String> getsubNameList(){
        return subNameList;
    }

    void showEditButton(JPanel jp, SubModel currentSub){
        editButton = new JButton("Edit");

        editButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            frameSub.dispose();
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
       jp.add(editButton, gbc);
    }

    void showDeleteButton(JPanel jp, SubModel currentSub){
      deleteButton = new JButton("Delete");
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.setDebug(DEBUG_VAL);
      deleteButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
              bDebug.msgPrt("Deleting type: " + currentSub.getType());
              currentSub.doDelete();
              frameSub.dispose();
         }
      });

      gbc.gridx = 1;
      gbc.gridy = 2;
      jp.add(deleteButton,gbc);
    }

    void showSaveButton(JPanel jp, SubModel currentSub){
        saveButton = new JButton("Save");
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);

        saveButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            bDebug.msgPrt("Saving...");
            currentSub.setName(userText.getText());
            currentSub.doUpdate();
            frameSub.dispose();
            openWindow();
         }
       });

       bDebug.msgPrt("Setting up save button");
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 1;
       gbc.gridy = 3;
       jp.add(saveButton, gbc);
    }


    void showSaveNewButton(JPanel jp, SubModel currentSub){
        saveButton = new JButton("Save New");
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);

        saveButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            bDebug.msgPrt("Saving...New ");
            currentSub.setName(userText.getText());
            currentSub.doInsert();
            frameSub.dispose();
            openWindow();
         }
       });

       bDebug.msgPrt("Setting up save new button");
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 1;
       gbc.gridy = 3;
       jp.add(saveButton, gbc);
    }


    void showsubList(){
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.setDebug(DEBUG_VAL);
      bDebug.msgPrt("subWindow::showsubList");

      // subNameList.setBackground(Color.blue);
      // subNameList.setForeground(Color.yellow);
      bDebug.msgPrt("set subNameList");

      gbc.ipady = 10;
      gbc.ipadx = 10;
      gbc.gridx = 0;
      gbc.gridy = 0;
      gbc.insets.left = 5;

      //panelSub.add(subNameList,gbc);
      bDebug.msgPrt("set panelSub");

      // subNameList.addMouseListener(new MouseAdapter() {
      //      public void mouseClicked(MouseEvent evt) {
      //           JList list = (JList)evt.getSource();
      //
      //           int index = list.locationToIndex(evt.getPoint());
      //           //currentSub = subNameList.getModel().getElementAt(index1);
      //
      //          //set currency
      //          bDebug.msgPrt("Setting currency...");
      //          currentSub.setName(subListModel.getElementAt(index));
      //          currentSub.setId(subDBKeyListModel.getElementAt(index));
      //          String s = currentSub.getName();
      //          int i = currentSub.getId();
      //          bDebug.msgPrt("Current: [" + currentSub.getName() + "][" + currentSub.getId() + "]");
      //          if (evt.getClickCount() == 2){
      //              index = list.locationToIndex(evt.getPoint());
      //              bDebug.msgPrt("Clicked on: " + currentSub.getName() + " @ " + index);
      //              //Object o = subNameList.getModel().getElementAt(index);
      //              //System.out.println(index + "Double-clicked on: " + o.toString());
      //          }
      //      }
      //  });
    }

    void initsubListsFromDB(){
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);
        bDebug.msgPrt("initsubListsFromDB");

        // for(int i=0; i < subList.size(); i++){
        //     bDebug.msgPrt("LOOP: " + i);
        //     SubModel t = null;
        //     t = subList.get(i);
        //     subListModel.addElement(t.getName());
        //     subDBKeyListModel.addElement(t.getId());
        //   }
        //
        //   subNameList = new JList<>(subListModel);
        //   bDebug.msgPrt("subNameList: " + subNameList.getModel().getSize());
    }
  }
