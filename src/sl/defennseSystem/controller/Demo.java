/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl.defennseSystem.controller;

import sl.defenseSystem.View.MainControllerView;

/**
 *
 * @author My PC
 */
public class Demo {
    
    public static void main(String args[]){
        Controlroom controlroomObj = new Controlroom();
        controlroomObj.addMainControllerObserverbal(new HeliCoperViewController());
        new MainControllerView(new MainControllerViewController(controlroomObj)).setVisible(true);
    }
}
