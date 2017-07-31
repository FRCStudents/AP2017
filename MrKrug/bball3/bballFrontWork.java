import bball.BBooks;
import bball.League;
import bball.Team;
import bball.TeamStat;
import bball.Game;
import bball.GameStat;
import bball.Player;
import bball.PlayerStat;

import bballDB.DBConnect;
import bballUtil.ballDEBUG;
//import DBAccess.bballAccess;

import bballFront.MenuBuilder;
import bballFront.bballFrontBook;

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

class bballFront {
    void createWindow() {
        //Create and set up the window.rep
        JFrame frame = new JFrame("Basketball Now");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JLabel label = new JLabel("Hello World");
        Container c = frame.getContentPane();
        //c.add(label);

        Dimension d = new Dimension(600, 500);
        c.setPreferredSize(d);

        MenuBuilder mb = new MenuBuilder();
	      JMenuBar menuBar = mb.buildMenuBar();
	      frame.setJMenuBar(menuBar);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}


class bballFrontWork {
  public static void main(String[] args) {
      //bballFrontBook bfrontBook = new bballFrontBook();
      bballFront bfront = new bballFront();

      javax.swing.SwingUtilities.invokeLater(new Runnable() {
          public void run() {
              bfront.createWindow();
          }
      });
  }
}
