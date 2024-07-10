/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl.defennseSystem.controller;


public class MainControllerViewController {
    
    Controlroom controlroom;
    
    public MainControllerViewController(Controlroom controlroom){
          this.controlroom = controlroom;
    }

    public void passJsValue(int value) {
       
       controlroom.setJsliderLevel(value);
       
     
    }
    
    
}
