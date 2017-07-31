package org.cat.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.cat.Day;
import org.cat.Main;

public class Start implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        new Day().runTaskTimer(Main.cat, 20, 20);
        //TODO: Assign roles


        double random = Math.random(); //Generates a random number between 0 and 0.9999999999

        int roleNumber = (int) Math.ceil(random * 4);



        //4.000000000
        //3.9 v
        //... v
        //3.2 v
        //3.1 v
        //3.00000000000



        //Java is verbose (wordy)

        String[] roleList = new String[]{
                "creeper", // 0
                "ocelot",  // 1
                "Farmer",  // 2
                "ninja"    // 3

        };

        String someRole = roleList[roleNumber];

        if (roleNumber == 0) { //creeper


            //https://bukkit.gamepedia.com/Plugin_Tutorial#Metadata
        }
    }
}

