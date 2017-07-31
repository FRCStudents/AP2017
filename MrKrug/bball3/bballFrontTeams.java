package bballFront;

import bballDB.DBConnect;
import bballUtil.ballDEBUG;
import ballRun.indexPass;
import bballDB.DBDelete;
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

public class bballFrontTeams {
  static JFrame frameB = new JFrame("Basketball Teams");

  void createPlayerList(DefaultListModel<String> listModel, int teamID, Container c){
    //System.out.println("Creating Player List");
    bballAccess bAccess = new bballAccess();
    ArrayList pl = bAccess.getPlayerList(teamID);

    JList<String> playerNameList;

    for(int i=0; i < pl.size(); i++){
        Player p = null;
        p = (Player)pl.get(i);
        System.out.println(p.getName());
        listModel.addElement(p.getName());
        }

     playerNameList = new JList<>(listModel);
     c.removeAll();
     c.add(playerNameList);

     playerNameList.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
             JList list = (JList)evt.getSource();
             if (evt.getClickCount() == 2) {
                 int index = list.locationToIndex(evt.getPoint());
                 Object o = playerNameList.getModel().getElementAt(index);
                 System.out.println("Double-clicked on: " + o.toString());
             } else if (evt.getClickCount() == 3) {
                 int index = list.locationToIndex(evt.getPoint());
             }
         }
     });
  }

  void createTeamList(DefaultListModel<String> listModel, ArrayList tl, Container c){
    JList<String> teamNameList;

    for(int i=0; i < tl.size(); i++){
        Team t = null;
        t = (Team)tl.get(i);
        listModel.addElement(t.getName());
        }

     teamNameList = new JList<>(listModel);
     c.add(teamNameList);

     teamNameList.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
             JList list = (JList)evt.getSource();
             if (evt.getClickCount() == 2) {
                 // Double-click detected
                 int index = list.locationToIndex(evt.getPoint());
                 //System.out.println(index);
                 Object o = teamNameList.getModel().getElementAt(index);
                 bballFrontPlayers bfrontPlayers = new bballFrontPlayers();
                 bfrontPlayers.createPlayersWindow(index);
                 System.out.println("Double-clicked on: " + o.toString());
             } else if (evt.getClickCount() == 3) {
                 // Triple-click detectx(evt.getPoint());
                 int index = list.locationToIndex(evt.getPoint());
                 //System.out.println(index);
             }
         }
     });
  }

  void createTeamsWindow() {
      bballAccess bAccess = new bballAccess();
      ArrayList tl = bAccess.getTeamList();

      JLabel label = new JLabel("Teams");
      Container c = frameB.getContentPane();
      c.add(label);

      DefaultListModel<String> listModel = new DefaultListModel<>();
      createTeamList(listModel, tl, c);
      Dimension d = new Dimension(400, 300);
      c.setPreferredSize(d);

      frameB.pack();
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
