/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cat;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;
import org.cat.Commands.Start;
import org.cat.role.BaseRole;

/**
 *
 * @author MeowingInsanely
 */
public class Main extends JavaPlugin {

    public static Main cat;
    public BaseRole[] players;

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

        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage("It works!");
        }

        cat = this;
        getLogger().info("onEnable haz beeen summoned!");

        this.getCommand("start").setExecutor(new Start());

           new Day().runTaskTimer(cat, 0, 20);
    }



    @Override
    public void onDisable() {
        getLogger().info("onDisable haz beeen summoned!");
    }

}
