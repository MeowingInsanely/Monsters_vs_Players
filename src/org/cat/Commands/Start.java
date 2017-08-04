package org.cat.Commands;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.cat.Day;
import org.cat.Main;
import org.cat.Utils;
import org.cat.role.BaseRole;
import sun.misc.BASE64Decoder;

import java.util.Random;

public class Start implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        start();

        return true;
    }

    public void start() {
        Class<BaseRole>[] roleList = BaseRole.getRoles();

        Utils.rng.nextInt(roleList.length);//Gen a random number

        BaseRole newPlayer = new BaseRole();
        BaseRole b = roleList[0].cast(newPlayer); //Convert the player to some role...

        Main.cat.players = new BaseRole[Bukkit.getServer().getOnlinePlayers().size()];



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

