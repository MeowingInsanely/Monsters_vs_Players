/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cat;

/**
 *
 * @author MeowingInsanely
 */
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Day extends BukkitRunnable {

    World world;

    int countdown = 40;

    public Day() {
        world = ???.getTheWorld();
        world.setTime(23000);
    }

    public void run() {
        world.setTime(world.getTime() + 140);

        // Time change (24,000 is the same as 0);
        if (world.getTime() >= 24000) {
            world.setTime(world.getTime() - 24000);
        }

        // TODO: Vote
        if (world.getTime() >= 4600) {
            getLogger().info("Vote time has begun")
        }
        // TODO: Defense
        // TODO: Judgement
        // TODO: Last Words
        // TODO: Murder
        // TODO: Send Graveyard
        // TODO: Will
        // TODO: Role
        // TODO: Repeat -> Vote
        // TODO: Night
        
        // Tell the time to everybody (Spectators???)
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.setLevel(countdown);
        }
        // Countdown
        countdown--;
    }
}
