package bballFront;

import bballDB.DBConnect;
import bballUtil.ballDEBUG;
import ballRun.indexPass;
import bballDB.DBDelete;

import javax.swing.*;

public class BooksMenuBuilder extends SubMenuBuilder {
    public BooksMenuBuilder(){
      super("Books", "Edit", "New");
    }

    public JMenuBar buildBooksMenuBar(){
      return super.buildSubMenuBar();
    }
}
