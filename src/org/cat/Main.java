/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cat;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author MeowingInsanely
 */
public class Main extends JavaPlugin {

    public static Main cat;

    @Override
    public void onEnable() {

        cat = cat = cat = this;

        getLogger().info("onEnable haz beeen summoned!");

        this.getCommand("cat").setExecutor(new CatCommand());

           new Day().runTaskTimer(cat, 0, 20);
    }



    @Override
    public void onDisable() {
        getLogger().info("onDisable haz beeen summoned!");
    }

}
