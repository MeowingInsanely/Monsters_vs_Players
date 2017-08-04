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
import org.cat.Commands.Start;
import org.cat.role.BaseRole;

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

        this.getCommand("start").setExecutor(new Start());

           new Day().runTaskTimer(cat, 0, 20);
    }



    @Override
    public void onDisable() {
        getLogger().info("onDisable haz beeen summoned!");
    }


    public void start() {
        Class<BaseRole>[] roleList = BaseRole.getRoles();
        playerRoles = new BaseRole[Bukkit.getServer().getOnlinePlayers().size()];

        //No duplicates
        //at least 1 of each
        playerRoles[].setLastWill("I am a cat");




        Utils.rng.nextInt(roleList.length);//Gen a random number

        BaseRole newPlayer = new BaseRole();
        BaseRole b = roleList[0].cast(newPlayer); //Convert the player to some role...

        new Day().runTaskTimer(Main.cat, 20, 20);
        //TODO: Assign roles


        double random = Math.random(); //Generates a random number between 0 and 0.9999999999





        //4.000000000
        //3.9 v
        //... v
        //3.2 v
        //3.1 v
        //3.00000000000
    }
}
