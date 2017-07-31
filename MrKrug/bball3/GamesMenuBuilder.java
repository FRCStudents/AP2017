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

public class GamesMenuBuilder {
    JMenuBar buildGamessMenuBar(){
          JMenu menu, submenu;
          JMenuItem menuItem;
          JRadioButtonMenuItem rbMenuItem;
          JCheckBoxMenuItem cbMenuItem;

          JMenuBar menuBar = new JMenuBar();

          menu = new JMenu("Games");
          menu.setMnemonic(KeyEvent.VK_B);
          menu.getAccessibleContext().setAccessibleDescription("This lists sets of games");
          menuBar.add(menu);

          JMenuItem menuItemNewGames = new JMenuItem("New");
          menuItemNewGames.getAccessibleContext().setAccessibleDescription("New Game Properties");
          menu.add(menuItemNewGames);

          JMenuItem menuItemEditGames = new JMenuItem("Edit");
          menuItemEditGames.getAccessibleContext().setAccessibleDescription("Edit Game Properties");
          menu.add(menuItemEditGames);

          //JMenuItem menuItemDeleteBooks = new JMenuItem("Delete");
          //menuItemDeleteBooks.getAccessibleContext().setAccessibleDescription("Delete Book Properties");
          //menu.add(menuItemDeleteBooks);

          GamesMenuItemListener menuItemListener = new GamesMenuItemListener();

          menuItemNewGames.addActionListener(menuItemListener);
          menuItemEditGames.addActionListener(menuItemListener);
          //menuItemDeleteBooks.addActionListener(menuItemListener);

          menuBar.add(menu);
          return menuBar;
    }
}
