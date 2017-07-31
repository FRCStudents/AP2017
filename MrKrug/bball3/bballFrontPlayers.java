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

public class bballFrontPlayers {
  static JFrame frameB = new JFrame("Basketball Players");

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

  void createPlayersWindow(int teamID) {
      bballAccess bAccess = new bballAccess();
      ArrayList tl = bAccess.getTeamList();

      JLabel label = new JLabel("Players");
      Container c = frameB.getContentPane();
      c.add(label);

      DefaultListModel<String> listModel = new DefaultListModel<>();
      createPlayerList(listModel, teamID, c);
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
