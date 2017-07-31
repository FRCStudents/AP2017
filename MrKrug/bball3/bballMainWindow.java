package bballFront;

import bballDB.DBConnect;
import bballUtil.ballDEBUG;
import ballRun.indexPass;
import bballDB.DBDelete;
import bballDB.DBTransInsert;
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

public class bballMainWindow {
    JFrame frameMain;
    Container containerMain;
    JMenuBar menuBarMain;

    public bballMainWindow() {
            frameMain = new JFrame("Basketball Books Now");
            frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            containerMain = frameMain.getContentPane();

            Dimension d = new Dimension(600, 500);
            containerMain.setPreferredSize(d);

            MenuBuilder mb = new MenuBuilder();
    	      menuBarMain = mb.buildMenuBar();
    	      frameMain.setJMenuBar(menuBarMain);

            frameMain.pack();
            frameMain.setVisible(true);
        }

    public JFrame getFrame(){
        return frameMain;
    }

    public JMenuBar getMenu(){
        return menuBarMain;
    }

    public Container getContainer(){
        return containerMain;
    }

    public void hideWindow(){
        frameMain.setVisible(false);
    }

    public void showWindow(){
        frameMain.setVisible(true);
    }

}
