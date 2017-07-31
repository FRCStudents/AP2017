package ballRun;

//game
import bballFront.bballBookWindow;
//import bballFront.bballGameWindow;

import javax.swing.JFrame;

public class indexPass {
  //sub
  static int subIndexHold = -1;
  static JFrame frameSub;

  //game
  static int gameIndexHold = -1;
  static JFrame frameGame;
  //static bballGameWindow currentGameWindow;

  //book
  static int bookIndexHold = -1;
  static JFrame frameBook;
  static bballBookWindow currentBookWindow;
  //sub
  public static JFrame getFrameSub(){
    return frameSub;
  }

  public static void setFrameSub(JFrame fSub){
    frameSub = fSub;
  }

  public static int getSubIndexHold(){
    return subIndexHold;
  }


  public static void setSubIndexHold(int iHold){
    subIndexHold = iHold;
  }

  // public static subWindow getCurrentSubWindow(){
  //    return currentSubWindow;
  // }
  //
  // public static void setCurrentSubWindow(bballSubWindow bSW){
  //   currentSubWindow = bSW;
  // }

  //game
  // public static bballGameWindow getCurrentGameWindow(){
  //   return currentGameWindow;
  // }
  //
  // public static void setCurrentGameWindow(bballGameWindow bGW){
  //   currentGameWindow = bGW;
  // }

  public static JFrame getFrameGame(){
    return frameGame;
  }

  public static void setFrameGame(JFrame fGame){
    frameGame = fGame;
  }

  public static int getGameIndexHold(){
    return gameIndexHold;
  }


  public static void setGameIndexHold(int iHold){
    gameIndexHold = iHold;
  }

  // book
  public static int getBookIndexHold(){
    return bookIndexHold;
  }


  public static void setBookIndexHold(int iHold){
    bookIndexHold = iHold;
  }

  public static JFrame getFrameBook(){
    return frameBook;
  }

  public static void setFrameBook(JFrame fBook){
    frameBook = fBook;
  }

  public static bballBookWindow getCurrentBookWindow(){
    return currentBookWindow;
  }

  public static void setCurrentBookWindow(bballBookWindow bGW){
    currentBookWindow = bGW;
  }


}
