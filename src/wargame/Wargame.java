/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargame;

import javax.swing.UIManager;


/**
 *
 * @author chaitanya
 */
public class Wargame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            warUI game = new warUI();
            game.setSize(1000, 500);
            game.setVisible(true);            
    }
    
}
