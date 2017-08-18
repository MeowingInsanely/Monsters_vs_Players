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
import org.cat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author MeowingInsanely
 */
public class Main extends JavaPlugin {

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

        this.getCommand("start").setExecutor(new Commands.Start());
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
            getLogger().info("player: " + counter);

            int randomNumber = Utils.rng.nextInt(roleList.size()); //A magical random number

            BaseRole newPlayerRole = new BaseRole(); //Create a new one

            playerRoles[counter] = roleList.get(randomNumber).cast(newPlayerRole); //Convert the player to some role...
            roleList.remove(randomNumber); //Role was already used
            counter++;
            
            getLogger().info("Game has woke up.");
          
        }


        //No duplicates
        //at least 1 of each

        new Day().runTaskTimer(Main.cat, 20, 20); //Starts the game
    }
}
