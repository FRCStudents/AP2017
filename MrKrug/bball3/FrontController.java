package bballFront;

import bballFront.bballMainWindow;
import bballFront.subWindow;
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

public class FrontController {
   public static void openMain () {
       bballMainWindow bMW;

       javax.swing.SwingUtilities.invokeLater(new Runnable() {
           public void run() {
             System.out.println("FrontController::openMain");
             bballMainWindow bMW = new bballMainWindow();
           }
       });
   }

   public static void openSub () {
      System.out.println("FrontController::openSub");

          //bballAccess bAccess = new bballAccess();
          //              ArrayList <SubModel> subList;
                        // first get the books, then assign the translation
          //              bAccess.refreshBookLisont();
          //              subList = bAccess.getSubModeList();
                        subWindow bBkW = new subWindow();
          //              break;
   }

   public static void openBookFront () {
        System.out.println("Opening in openBookFront");
          bballAccess bAccess = new bballAccess();
          ArrayList <BBooks> subList;
          // first get the books, then assign the translation
          // bAccess.refreshBookList();
          // subList = bAccess.getBookList();
          //subList = bAccess.getSubModeList();
          bbooksWindow bBkW = new bbooksWindow();
   }


  //  public static void main (String[] args) {
  //    System.out.println("FrontController::main");
  //    openMain();
  //    System.out.println("OpenMain()");
  //    //openSub();
  //    openBookFront();
  //  }

}
