/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cat;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.cat.role.BaseRole;
import org.cat.role.monsters.IMonster;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author MeowingInsanely
 */
public class Main extends JavaPlugin {

    //A constant variable
    //It will always be 7
    //Used to make the code more readable
    public static final int MIN_PLAYERS = 7;

    //What's the current game state?
    //State is an enum, go check it out! (Ctrl+Click on State)
    public static State state = State.InGame;


    public static Main cat;
    public BaseRole[] playerRoles;

    @Override
    public void onEnable() {
        //Useful links:
        //https://bukkit.gamepedia.com/Main_Page
        //https://hub.spigotmc.org/javadocs/spigot/
        //https://www.spigotmc.org/wiki/spigot-plugin-development/
        //https://www.spigotmc.org/wiki/plugin-snippets/

/*
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage("It works!");
        }
*/

        cat = this;
        getLogger().info("onEnable haz beeen summoned!");

        this.getCommand("start").setExecutor(new org.cat.Commands.Start());
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable haz beeen summoned!");
    }

    public void end() {
      //this.cancel
      getLogger().info("Game has been put down.");
    }

    public void start() {
        int playerCount = Bukkit.getServer().getOnlinePlayers().size();
        if(playerCount < MIN_PLAYERS) {
            Bukkit.broadcastMessage("At least " + MIN_PLAYERS + " players are needed to start the game.");
            //return stops the function and replies with the return value
            //In this case, it replies with nothing (void)
            return;
        }

    //if ().getOnlinePlayersgetonli ().size < 7 {
    // Do not start game. Annonuce number of needed players
  // == 7 vote for start game fast paced.
  // > 7 Wait for 12 players. Allow vote of fast pace & allow for normal pace vote
  // == 12 start normal pace vote
  //}

        ArrayList<Class<BaseRole>> roleList = new ArrayList<Class<BaseRole>>(Arrays.asList(BaseRole.getRoles()));
        playerRoles = new BaseRole[playerCount];

        int counter = 0;
        while (counter < playerRoles.length) {
            int randomNumber = Utils.rng.nextInt(roleList.size()); //A magical random number

            playerRoles[counter] = roleList
                                    .get(randomNumber)
                                    .cast(new Object());

            roleList.remove(randomNumber); //Role has been used up

            getLogger().info("Player " + counter + " is a " + playerRoles[counter].getClass().getName());

            counter++;
        }

        getLogger().info("Game has woke up.");
        //No duplicates
        //at least 1 of each

        new Day().runTaskTimer(Main.cat, 20, 20); //Starts the game
    }

    
}

//Let's let the player's role do that? (Check out BaseRole.java)
//public void help() {
  // show player role info
//}