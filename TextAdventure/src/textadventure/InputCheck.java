/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import static java.lang.System.out;

/**
 *
 * @author Joshua
 */
public class InputCheck {
    
    public static int mainMenu(String input) {
        int returnValue = 0;
        //If the user entered an int, that value can be returned. If it is out
        //of bounds the switch statement knows how to deal with it. \
        try {
           returnValue = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            //If the user did not enter an int, we should check first to see
            //if they entered a command in the dictionary. If not, return an 
            //out of bounds int so the switch can deal with it.
            boolean inDict = dictionary(input);
            if (!inDict) {
                return 999;
            }          
        }
        return returnValue;
    }
    private static boolean dictionary(String input) {
        switch (input.toLowerCase()) {
            case "help":
                //MAKE SURE THIS LIST STAYS UPDATED TO CONTAIN ALL COMMANDS
                out.println("Enter a number corresponding to your choice or one "
                        + "of the following commands:");
                out.println("HELP - Shows a list of commands.");
                out.println("EXIT - Terminates the program without saving!");
                return true;
            case "exit":
                System.exit(0);
                return true;
            default:
                return false;                
        }
    }
}
