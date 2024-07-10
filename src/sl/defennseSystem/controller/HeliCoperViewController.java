/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl.defennseSystem.controller;

import sl.defenseSystem.View.HelicopterView;

/**
 *
 * @author My PC
 */
public class HeliCoperViewController implements Observerbal{
    public HelicopterView helicopter;
    
    public HeliCoperViewController(){
        helicopter = new HelicopterView();
        helicopter.setVisible(true);
        System.out.println("repeat?");
    }
    
    @Override
    public void update(int value){
       
            helicopter.disableButtons();
        
    }
    
    
}
