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
import static org.bukkit.Bukkit.getLogger;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Night extends BukkitRunnable {

    World world;

    int currentTime = 40;

    public Night() {
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

        //Night Start
        if (currentTime == 40) {
            getLogger().info("Awooo~");
        }

    // TODO:SpecialNightAbilities
    // TODO:Night Stop
    // TODO:Show events
    // TODO:Show counter events

    //TODO: pew pew!

        // Day Start
        if (currentTime >= 0) {
            this.cancel();
        new Day().runTaskTimer(Main.cat, 20, 20);
        }


        // Tell the time to everybody (Spectators???)
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.setLevel(currentTime);
        }



        // Countdown
        currentTime--;
    }
}
