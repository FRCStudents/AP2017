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

public class MenuBuilder {
    public JMenuBar buildMenuBar(){
          JMenu menu, submenu;
          JMenuItem menuItem;
          JRadioButtonMenuItem rbMenuItem;
          JCheckBoxMenuItem cbMenuItem;

          JMenuBar menuBar = new JMenuBar();

          menu = new JMenu("Books");
          menu.setMnemonic(KeyEvent.VK_B);
          menu.getAccessibleContext().setAccessibleDescription("This lists sets of books");
          menuBar.add(menu);

          JMenuItem menuItemBooks = new JMenuItem("Books");
          menuItemBooks.getAccessibleContext().setAccessibleDescription("This will list leagues");
          menu.add(menuItemBooks);

          JMenuItem menuItemLeagues = new JMenuItem("Leagues",KeyEvent.VK_L);
          menuItemLeagues.getAccessibleContext().setAccessibleDescription("This will list leagues");
          menu.add(menuItemLeagues);

          JMenuItem menuItemGames = new JMenuItem("Games", new ImageIcon("images/middle.gif"));
          menuItemGames.setMnemonic(KeyEvent.VK_G);
          menu.add(menuItemGames);

          menu = new JMenu("Teams");
          menu.setMnemonic(KeyEvent.VK_R);
          menu.getAccessibleContext().setAccessibleDescription("This lists teams");
          menuBar.add(menu);

          JMenuItem menuItemSchools = new JMenuItem("Schools", new ImageIcon("images/middle.gif"));
          menuItemSchools.setMnemonic(KeyEvent.VK_S);
          menu.add(menuItemSchools);

          JMenuItem menuItemTeams = new JMenuItem("Teams", new ImageIcon("images/middle.gif"));
          menuItemTeams.setMnemonic(KeyEvent.VK_T);
          menu.add(menuItemTeams);

          JMenuItem menuItemPlayers = new JMenuItem("Players", new ImageIcon("images/middle.gif"));
          menuItemPlayers.setMnemonic(KeyEvent.VK_P);
          menu.add(menuItemPlayers);

          MenuItemListener menuItemListener = new MenuItemListener();

          menuItemBooks.addActionListener(menuItemListener);
          menuItemLeagues.addActionListener(menuItemListener);
          menuItemSchools.addActionListener(menuItemListener);
          menuItemTeams.addActionListener(menuItemListener);
          menuItemPlayers.addActionListener(menuItemListener);
          menuItemGames.addActionListener(menuItemListener);

          menuBar.add(menu);
          return menuBar;
    }
}
