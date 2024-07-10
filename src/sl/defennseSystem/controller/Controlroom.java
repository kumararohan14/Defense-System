
package sl.defennseSystem.controller;

import java.util.ArrayList;


public class Controlroom {
    private int value;
    private ArrayList<Observerbal> observerList = new ArrayList<>();
    
    public void addMainControllerObserverbal(Observerbal observer){
        observerList.add(observer);
        System.out.println("kkkk"+observerList.size());
    }
    
    public void setJsliderLevel(int value){
       if(this.value != value){
           this.value = value;
           System.out.println("Jslider "+ value);
           notifyObject();
           System.out.println("after Jslider ");
       }
    }
     public void notifyObject(){
		for(Observerbal ob : observerList){
			ob.update(value);
		}
	}
    }

   
