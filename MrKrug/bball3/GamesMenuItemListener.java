package bballFront;

import bballDB.DBConnect;
import bballUtil.ballDEBUG;
import ballRun.indexPass;
import bballDB.DBDelete;

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

public class GamesMenuItemListener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
      System.out.println("Game... Something happened: " + e.getActionCommand());
      indexPass iPass = new indexPass();
      switch(e.getActionCommand()){
        case "New":   System.out.println("New");
                      JFrame oldFrame = iPass.getFrameGame();
                      oldFrame.dispose();

                      bballGameWindow bBW = iPass.getCurrentGameWindow();
                      //bfrontBook.openEditWindow("new");
                      bBW.openEditWindow("new");
                      //iPass.setFrameBook(bfrontBook.getFrameBook());
                      break;
        case "Edit":  System.out.println("Edit");
                      JFrame oldFrameE = iPass.getFrameGame();
                      oldFrameE.dispose();
                      bballBookWindow bBWE = iPass.getCurrentGameWindow();
                      bBWE.openEditWindow("old");
                      break;
            default : System.out.println("Default");
                      break;

      }
   }
}
