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
public class GameVariables {
    private String playerName;
    private String playerLocation;
    
    //Default constructor called when new game is started
    public GameVariables(){
        out.println("Starting a new game!");
        playerName = "";
        playerLocation = "start";
    }
    public GameVariables(String pName, String pLoc){
        playerName = pName;
        playerLocation = pLoc;
    }
    
    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerName(String n){
        playerName = n;
    }
    public String getPlayerLocation(){
        return playerLocation;
    }
    public void setPlayerLocation(String l){
        playerLocation = l;
    }
    
}
