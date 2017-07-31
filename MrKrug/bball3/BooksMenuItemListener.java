package bballFront;

import ballRun.indexPass;
import javax.swing.JFrame;

public class BooksMenuItemListener extends SubMenuItemListener {
  public BooksMenuItemListener(){
      indexPass iPass = getIndexPass();
  }

  public void doNew(){
    JFrame oldFrame = iPass.getFrameBook();
    oldFrame.dispose();
    bballBookWindow bBW = iPass.getCurrentBookWindow();
    bBW.openEditWindow("new");
  }

  public void doEdit(){
    JFrame oldFrameE = iPass.getFrameBook();
    oldFrameE.dispose();
    bballBookWindow bBWE = iPass.getCurrentBookWindow();
    bBWE.openEditWindow("old");
  }
}
