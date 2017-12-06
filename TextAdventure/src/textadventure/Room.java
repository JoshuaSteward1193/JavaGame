/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import java.util.LinkedList;

/**
 *
 * @author Joshua
 */
public class Room {
    int currentDescription;
    LinkedList descriptions = new LinkedList();
    LinkedList choices = new LinkedList();
    
    public Room(String d){
        currentDescription = 0;
        descriptions.add(d);
    }
    public String getDescription(){
        return (String) descriptions.get(currentDescription);
    }
    public void addChoice(String c){
        choices.add(c);
    }
}
