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
    String description;
    LinkedList choices = new LinkedList();
    
    public Room(String d){
        description = d;
    }
    public String getDescription(){
        return description;
    }
    public void addChoice(String c){
        choices.add(c);
    }
}
