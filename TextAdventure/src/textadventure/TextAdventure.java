/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import static java.lang.System.out;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class TextAdventure {

    static Room newRoom = new Room("This is a description");
    LinkedList roomChoices = new LinkedList();
    
    public static void main(String[] args) {
        
        TextPrint.roomTest(newRoom);
        TextPrint.openingText();
        Scanner keyboard = new Scanner(System.in);
        boolean good = false;
        do {
            //User input is sent to InputCheck.mainMenu, which knows the
            //accepted parameters are a 1 or 2. 
            int choice = InputCheck.mainMenu(keyboard.nextLine());
            switch (choice) {
                //if InputCheck determines that the input is good, it returns 
                //it to choice
                case 1:
                    GameVariables data = new GameVariables();
                    out.println("Starting a new game");
                    good = true;
                    break;
                case 2:
                    //To load a game, a text file will have to be loaded and the data
                    //passed on to the GameVariables() constructor with the data as
                    //arguments. 
                    out.println("Loading games is not implimented at this time.");
                    break;
                default:
                    out.println("Incorrect input");
                    break;
            }
        } while (!good);
        
        while (GameVariables.getPlayerHealth() > 0) {
            out.println("-------------------------------------------------------------------");
            TextPrint.currentRoom();            
        }       
    }
    
    public static void addChoice(String [] c){
        
    }
    
}
