/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cat;

import static org.bukkit.Bukkit.getLogger;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


/**
 *
 * @author MeowingInsanely
 */
public class CatCommand implements CommandExecutor  {

    @Override
    public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
      if (arg0 instanceof Player) {
            Player meowPlayer = (Player) arg0;

            // Create a new ItemStack (type: diamond)
            ItemStack rawFish = new ItemStack(Material.RAW_FISH);

            // Create a new ItemStack (type: brick)
            ItemStack book = new ItemStack(Material.BOOK);

            // Set the amount of the ItemStack
            book.setAmount(20);

            // Give the player our items (comma-seperated list of all ItemStack)
            meowPlayer.getInventory().addItem(book, rawFish);
        } else { 
          getLogger().info("hai nun human!");
      }
          
        // If the player (or console) uses our command correct, we can return true
        return true;
    }

}
