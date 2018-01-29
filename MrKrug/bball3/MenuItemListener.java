package bballFront;

import bballDB.DBConnect;
import bballUtil.ballDEBUG;
import ballRun.indexPass;
import bballDB.DBDelete;
import bballFront.bballFrontBook;
import DBAccess.bballAccess;

import bball.SubModel;
import bball.BBooks;

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

public class MenuItemListener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
      switch(e.getActionCommand()){
        case "Books":
                      FrontController FC = new FrontController();
                      FC.openBookFront();
                      break;
        case "Leagues": System.out.println("Leagues");
                      bballFrontLeague bfrontLeague = new bballFrontLeague();
                      bfrontLeague.createLeaguesWindow();
                      break;
        case "Teams": System.out.println("Teams");
                      bballFrontTeams bfrontTeams = new bballFrontTeams();
                      bfrontTeams.createTeamsWindow();
                      bfrontTeams.createTeamsWindow();
                      break;
        case "Games": System.out.println("Games");
                      break;
            default : System.out.println("Default");
                      break;

      }
   }
}
