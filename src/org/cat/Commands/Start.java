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


        Main.cat.start();

        return true;
    }

}

