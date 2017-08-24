/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cat;

/**
 *
 * @author MeowingInsanely & Stefnotch
 */
import static org.bukkit.Bukkit.getLogger;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Day extends BukkitRunnable {

    World world;

    int currentTime = 40;

    public Day() {
        world = Bukkit.getWorlds().get(0);
        world.setTime(23000);
    }

    @Override
    public void run() {
        world.setTime(world.getTime() + 140);

        // Time change (24,000 is the same as 0);
        if (world.getTime() >= 24000) {
            world.setTime(world.getTime() - 24000);
        }

        // TODO: Show Deaths
        // TODO: Show Wills/Deathnotes/Roles
        // TODO: Check if Game has won

        //Day Start
        if (currentTime == 40) {
            getLogger().info("Good Meowning!");
        }

        //Vote Start
        if (currentTime == 25) {
            getLogger().info("Vote time has begun");
        }
        // TODO: Defense
        // TODO: Judgement
        // TODO: Last Words
        // TODO: Murder
          //Give player Event Flag: Dead
        // TODO: Send Graveyard
        // TODO: Will
        // TODO: Role
        // TODO: GameCheck
        // TODO: Repeat -> Vote <<-->
        // TODO: Night
        // TODO: pew pew!

        // Night Start
        if (currentTime >= 0) {
            this.cancel();
           new Night().runTaskTimer(Main.cat, 20, 20);
        }

        // Tell the time to everybody (Spectators???)
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.setLevel(currentTime);
        }
        // Countdown
        currentTime--;
    }
}


  //GameCheck.java
  // Check instance of Event Flag: Death, on players
  // Count Alive (does not have a death) members of affiliation
  //STANDARD CASES
  // If IMonster == 0 then IVillager win + NeturalIMobNetural 
  // If IVillager == 0 then IMonster win + IMobNeutral
  //SPECIAL CASES
  // If IMonster && IVillager == 0 -IMobEvil- Ocelot win + IMobNeutral
  
  
  
  