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
public class C1 extends JavaPlugin {  
    @Override
    public void onEnable() {
        getLogger().info("onEnable haz beeen summoned!");
        
        this.getCommand("c0at").setExecutor(new C2());
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable haz beeen summoned!");
    }   
    
}
