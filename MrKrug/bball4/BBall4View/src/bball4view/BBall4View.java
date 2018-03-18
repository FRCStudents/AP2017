/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bball4view;

/**
 *
 * @author efraim
 */
public class BBall4View {
    /**
     * @param args the command line arguments
     */
    public static void showBookView(String[] bookList){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookView(bookList).setVisible(true);
            }
        });        
    }

    public static void showLeagueView(String[] leagueList){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeagueView(leagueList).setVisible(true);
            }
        });        
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        String[] bList = {"First", "Second", "Third", "Fourth"};
        showBookView(bList);
    }
    
}
