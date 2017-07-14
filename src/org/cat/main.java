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
public class main extends JavaPlugin {  
    @Override
    public void onEnable() {
        getLogger().info("onEnable haz beeen summoned!");
        
        this.getCommand("cat").setExecutor(new CatCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable haz beeen summoned!");
    }   
    
}
