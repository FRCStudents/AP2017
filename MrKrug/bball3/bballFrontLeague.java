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

public class bballFrontLeague {
  static JFrame frameB = new JFrame("Basketball Leagues");

  void createLeaguesWindow() {
      bballAccess bAccess = new bballAccess();
      ArrayList al = bAccess.getLeagueList();

      JLabel label = new JLabel("Leagues");
      Container c = frameB.getContentPane();
      c.add(label);


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
