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
      //System.out.println("Something happened: " + e.getActionCommand());
      switch(e.getActionCommand()){
        case "Books":
                      FrontController FC = new FrontController();
                      FC.openBookFront();

                      // bballAccess bAccess = new bballAccess();
                      // ArrayList <SubModel> subList;
                      // // first get the books, then assign the translation
                      // bAccess.refreshBookList();
                      // subList = bAccess.getSubModeList();
                      // subWindow bBkW = new subWindow(subList);
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
