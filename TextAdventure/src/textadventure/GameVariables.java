/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

/**
 *
 * @author Joshua
 */
public class GameVariables {
    static private String playerName = "Nemo";
    static int playerHealth = 10;
    static private String playerLocation = "start";  
    
    public static void loadGame(String pName, int pHealth, String pLoc){
        playerName = pName;
        playerHealth = pHealth;
        playerLocation = pLoc;
    }
    
    public static String getPlayerName(){
        return playerName;
    }
    public static void setPlayerName(String n){
        playerName = n;
    }
    public static int getPlayerHealth(){
        return playerHealth;
    }
    public static void setPlayerHealth(int h){
        playerHealth = h;
    }
    public static String getPlayerLocation(){
        return playerLocation;
    }
    public static void setPlayerLocation(String l){
        playerLocation = l;
    }
    
}
