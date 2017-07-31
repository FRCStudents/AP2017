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

public class SubMenuItemListener implements ActionListener {
   indexPass iPass;
   public void doNew(){
     System.out.println("Doing new sub-menu item");
   }
   
   public void doEdit(){
     System.out.println("Doing edit sub-menu item");
   }

   public indexPass getIndexPass(){
     return iPass;
   }

   public void actionPerformed(ActionEvent e) {
      iPass = new indexPass();
      switch(e.getActionCommand()){
        case "New":   System.out.println("New");
                      doNew();
                      //JFrame oldFrame = iPass.getFrameBook();
                      //oldFrame.dispose();

                      //bballBookWindow bBW = iPass.getCurrentBookWindow();
                      //bfrontBook.openEditWindow("new");
                      //bBW.openEditWindow("new");
                      //iPass.setFrameBook(bfrontBook.getFrameBook());
                      break;
        case "Edit":  System.out.println("Edit");
                      doEdit();
                      //JFrame oldFrameE = iPass.getFrameBook();
                      //oldFrameE.dispose();
                      //bballBookWindow bBWE = iPass.getCurrentBookWindow();
                      //bBWE.openEditWindow("old");
                      break;
            default : System.out.println("Default");
                      break;

      }
   }
}
