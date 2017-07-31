package bballFront;

import bballDB.DBConnect;
import bballUtil.ballDEBUG;
import ballRun.indexPass;
import bballDB.DBDelete;
import bballDB.DBTransInsert;
import bballDB.DBTransUpdate;
import DBAccess.bballAccess;

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

public class bballGameWindow {
    boolean DEBUG_VAL = true;
    indexPass iPass = new indexPass();

// windows building and displaying
    JFrame frameGame;
    JPanel panelGame;
    Container containerGame;
    GridBagLayout layout;
    GridBagConstraints gbc;
    JMenuBar menuBarGame;

// data structures if necessary
    JList<String> GameNameList;
    DefaultListModel<String> GameListModel;
    DefaultListModel<Integer> GameDBKeyListModel;
    ArrayList <Game> GameList;
    Game currentGame;

// extra labels
    JLabel headerLabel;
    JLabel statusLabel;

// buttons
    JButton editButton;
    JButton deleteButton;
    JButton saveButton;

// edit fields
    JTextField userText;

    public bballGameWindow(){
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);
        bDebug.msgPrt("bballGameWindow");

        //frameGame.dispose();
        frameGame = new JFrame("Basketball Games");
        iPass.setFrameGame(frameGame);
        //iPass.setCurrentGameWindow(this);

        headerLabel = new JLabel("***header***", JLabel.CENTER);
        statusLabel = new JLabel("***status***",JLabel.CENTER);
        statusLabel.setSize(350,100);

        gbc = new GridBagConstraints();

        panelGame = new JPanel();
        panelGame.setBackground(Color.darkGray);
        panelGame.setSize(300,300);

        layout = new GridBagLayout();
        panelGame.setLayout(layout);

        GameListModel = new DefaultListModel<>();
        GameDBKeyListModel = new DefaultListModel<>();

        containerGame = frameGame.getContentPane();
        currentGame = new Game();

        openWindow();
        frameGame.pack();
        frameGame.setVisible(true);
    }

    private void openWindow(){
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.setDebug(DEBUG_VAL);
      bDebug.msgPrt("openWindow");

      initGameListsFromDB();

      Dimension d = new Dimension(400, 300);
      bDebug.msgPrt("about to set menu");

      containerGame.setPreferredSize(d);
      bDebug.msgPrt("set size...");

      GamesMenuBuilder bmb = new GamesMenuBuilder();
      //menuBarGame = bmb.buildGamesMenuBar();
      frameGame.setJMenuBar(menuBarGame);
      showEditButton();
      showDeleteButton();
      showGameList();

      //
      // gbc.fill = GridBagConstraints.HORIZONTAL;
      // gbc.gridx = 0;
      // gbc.gridy = 1;
      // gbc.insets.left = 5;
      // statusLabel.setBackground(Color.yellow);
      // statusLabel.setForeground(Color.white);
      // panelGame.add(statusLabel,gbc);
      //
      containerGame.add(panelGame);
      frameGame.pack();
      frameGame.revalidate();
      frameGame.repaint();

      //frameGame.setVisible(true);

      frameGame.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent windowEvent) {
              frameGame.setVisible(false);
              frameGame.dispose();
          }
      });
    }

    public void openEditWindow(String type){
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.setDebug(DEBUG_VAL);
      bDebug.msgPrt("openEditWindow");
      frameGame = new JFrame("Basketball Games - Edit");
      iPass.setFrameGame(frameGame);

      containerGame = frameGame.getContentPane();
      gbc = new GridBagConstraints();
      panelGame = new JPanel();
      panelGame.setBackground(Color.blue);

      layout = new GridBagLayout();
      panelGame.setLayout(layout);

      initGameListsFromDB();

      Dimension d = new Dimension(400, 300);
      bDebug.msgPrt("opening edit window");

      containerGame.setPreferredSize(d);

      GamesMenuBuilder bmb = new GamesMenuBuilder();
      menuBarGame = bmb.buildGamesMenuBar();
      frameGame.setJMenuBar(menuBarGame);
      //showGameList();
      bDebug.msgPrt("Adding nameLable");

      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.gridx = 0;
      gbc.gridy = 1;
      gbc.insets.left = 5;

      JLabel  nameLabel = new JLabel("Game Name: ", JLabel.CENTER);
      nameLabel.setBackground(Color.blue);
      nameLabel.setForeground(Color.white);
      panelGame.add(nameLabel,gbc);

      bDebug.msgPrt("Adding userText");

      gbc.gridx = 1;
      gbc.gridy = 1;
      gbc.insets.left = 5;

      userText = new JTextField(6);
      userText.setBackground(Color.blue);
      userText.setForeground(Color.white);
      panelGame.add(userText,gbc);

      bDebug.msgPrt("Adding statusLabel");

      gbc.gridx = 0;
      gbc.gridy = 3;
      gbc.insets.left = 5;
      statusLabel.setBackground(Color.blue);
      statusLabel.setForeground(Color.white);
      panelGame.add(statusLabel,gbc);

      if(type.equals("new")){
        showSaveNewButton();
      } else {
        showSaveButton();
      }

      containerGame.add(panelGame);
      frameGame.pack();
      frameGame.revalidate();
      frameGame.repaint();

      frameGame.setVisible(true);

      frameGame.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent windowEvent) {
              frameGame.setVisible(false);
              frameGame.dispose();
          }
      });
    }

    public Game getCurrentGame(){
        return currentGame;
    }

    public void setCurrentGame(String name, int id){
        currentGame.setName(name);
        currentGame.setId(id);
    }

    public ArrayList<Game> getGameList(){
        return GameList;
    }

    public JFrame getFrameGame(){
        return frameGame;
    }

    public Container getContainerGame(){
        return containerGame;
    }

    public JList<String> getGameNameList(){
        return GameNameList;
    }

    void showEditButton(){
        editButton = new JButton("Edit");

        editButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            frameGame.dispose();
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
       panelGame.add(editButton, gbc);
    }



    void showDeleteButton(){
      deleteButton = new JButton("Delete");

      deleteButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
              DBDelete DBConn = new DBDelete();
              int r = currentGame.getId();
              DBConn.doGamesDelete(r);
              frameGame.dispose();
         }
      });

      gbc.gridx = 1;
      gbc.gridy = 2;
      panelGame.add(deleteButton,gbc);
    }

    void showSaveButton(){
        saveButton = new JButton("Save");
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);

        saveButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            bDebug.msgPrt("Saving...");
            DBTransUpdate dbTUpdate = new DBTransUpdate();
            currentGame.setName(userText.getText());
            dbTUpdate.doGamesUpdate(currentGame);
            frameGame.dispose();
            openWindow();
         }
       });

       bDebug.msgPrt("Setting up save button");
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 1;
       gbc.gridy = 3;
       panelGame.add(saveButton, gbc);
    }


    void showSaveNewButton(){
        saveButton = new JButton("Save New");
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);

        saveButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            bDebug.msgPrt("Saving...New ");
            DBTransInsert dbTInsert = new DBTransInsert();
            currentGame.setName(userText.getText());
            dbTInsert.doGamesInsert(currentGame.getName());
            frameGame.dispose();
            openWindow();
         }
       });

       bDebug.msgPrt("Setting up save new button");
       gbc.fill = GridBagConstraints.HORIZONTAL;
       gbc.gridx = 1;
       gbc.gridy = 3;
       panelGame.add(saveButton, gbc);
    }


    void showGameList(){
      ballDEBUG bDebug = new ballDEBUG();
      bDebug.setDebug(DEBUG_VAL);
      //bDebug.msgPrt("showGameList: " + GameNameList.getModel().getSize());

      GameNameList.setBackground(Color.blue);
      GameNameList.setForeground(Color.yellow);
      bDebug.msgPrt("set GameNameList");

      gbc.ipady = 10;
      gbc.ipadx = 10;
      gbc.gridx = 0;
      gbc.gridy = 0;
      gbc.insets.left = 5;

      panelGame.add(GameNameList,gbc);
      bDebug.msgPrt("set panelGame");

      GameNameList.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();

                int index = list.locationToIndex(evt.getPoint());
                //currentGame = GameNameList.getModel().getElementAt(index1);

               //set currency
               currentGame.setName(GameListModel.getElementAt(index));
               currentGame.setId(GameDBKeyListModel.getElementAt(index));
               String s = currentGame.getName();
               int i = currentGame.getId();
               bDebug.msgPrt("Current: [" + currentGame.getName() + "][" + currentGame.getId() + "]");
               if (evt.getClickCount() == 2){
                   index = list.locationToIndex(evt.getPoint());
                   bDebug.msgPrt("Clicked on: " + currentGame.getName() + " @ " + index);
                   //Object o = GameNameList.getModel().getElementAt(index);
                   //System.out.println(index + "Double-clicked on: " + o.toString());
               }
           }
       });
    }

    void initGameListsFromDB(){
        ballDEBUG bDebug = new ballDEBUG();
        bDebug.setDebug(DEBUG_VAL);
        bDebug.msgPrt("initGameListsFromDB");

        bballAccess bAccess = new bballAccess();
        GameList = bAccess.getGameList();
        bDebug.msgPrt("got DB: " + GameList.size());

        for(int i=0; i < GameList.size(); i++){
            bDebug.msgPrt("LOOP: " + i);
            Game t = null;
            t = GameList.get(i);
            GameListModel.addElement(t.getName());
            GameDBKeyListModel.addElement(t.getId());
          }

          GameNameList = new JList<>(GameListModel);
          bDebug.msgPrt("GameNameList: " + GameNameList.getModel().getSize());
          bDebug.msgPrt("got DB - DONE");
    }

  }
