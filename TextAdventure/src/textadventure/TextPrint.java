/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import static java.lang.System.out;

public class TextPrint {
    //ROOM DATA BANK
    Room start1 = new Room("You are standing on a empty train platform. You think"
            + " you are waiting for a train, but you don't rememeber.");
    public static void openingText(){
        out.println("Welcome to the game.");
        out.println("Please enter a command:");
        out.println("1: Start a new game");
        out.println("2: Load a game from a file");        
    }
    public static void roomTest(Room r){
        out.println(r.getDescription());
    }
    public static void currentRoom(){
        
    }
}
