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

public class SubMenuBuilder {
    JMenuBar subMenuBar;

    String menuTag = "Sub";
    String editTag = "";
    String newTag = "";

    public SubMenuBuilder(){
      subMenuBar = buildSubMenuBar();
    }

    public SubMenuBuilder(String mTag, String eTag, String nTag){
      menuTag = mTag;
      editTag = eTag;
      newTag = nTag;

      subMenuBar = buildSubMenuBar();
    }

    public JMenuBar getSubMenuBar(){
      return subMenuBar;
    }

    public JMenuBar buildSubMenuBar(){
          JMenu menu, submenu;
          JMenuItem menuItem;
          JRadioButtonMenuItem rbMenuItem;
          JCheckBoxMenuItem cbMenuItem;

          JMenuBar menuBar = new JMenuBar();

          menu = new JMenu(menuTag);
          menu.setMnemonic(KeyEvent.VK_B);
          menu.getAccessibleContext().setAccessibleDescription("This lists sets of subs");
          menuBar.add(menu);

          JMenuItem menuItemNewSubs = new JMenuItem(newTag);
          menuItemNewSubs.getAccessibleContext().setAccessibleDescription(newTag + "Sub Properties");
          menu.add(menuItemNewSubs);

          JMenuItem menuItemEditSubs = new JMenuItem(editTag);
          menuItemEditSubs.getAccessibleContext().setAccessibleDescription(editTag + "Sub Properties");
          menu.add(menuItemEditSubs);

          SubMenuItemListener menuItemListener = new SubMenuItemListener();

          menuItemNewSubs.addActionListener(menuItemListener);
          menuItemEditSubs.addActionListener(menuItemListener);

          menuBar.add(menu);
          return menuBar;
    }
}
