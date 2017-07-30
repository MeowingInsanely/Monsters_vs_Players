
package org.cat;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
//import org.bukkit.inventory.meta.ItemMeta;

//import org.bukkit.ChatColor;
//import org.bukkit.Material;
//import org.bukkit.inventory.ItemStack;
//
// https://bukkit.gamepedia.com/Main_Page
//import org.bukkit.inventory.meta.BookMeta;


public class BookData implements CommandExecutor {
    //https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/inventory/meta/BookMeta.html
    //https://bukkit.org/threads/book-meta.131816/
    //https://github.com/stefnotch/stefnotch.github.io/blob/master/TOS/src/main/java/io/github/stefnotch/tos/TOS.java#L194
    
    @Override
    public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
      if (arg0 instanceof Player) {
            Player meowPlayer = (Player) arg0;

            // Create a new ItemStack (type: brick)
            ItemStack book = new ItemStack(Material.BOOK);

            // Set the amount of the ItemStack
            book.setAmount(1);

            // Give the player our items (comma-seperated list of all ItemStack)
            meowPlayer.getInventory().addItem(book);
        }
      
         // Code for the Book -> setAuthor(String "Unknown");
          
         
        // If the player (or console) uses our command correct, we can return true
        return true;
    }
    
//    public interface BookMeta {
        
//    public Book(String urlpath) throws Exception {
//        super(Material.WRITTEN_BOOK);
//        url = urlpath;
//        json = JsonReader.read(url);
//        title = json.getString("Title");
//        author = json.getString("Author");
//        id = json.getInt("ID");
//        meta = (BookMeta) getItemMeta();
//        for (String s : delimit(json.getString("Content"), 256)) {
//            pages.add(ChatColor.translateAlternateColorCodes('$', s));
//        }
//        meta.setAuthor(author);
//        meta.setTitle(title);
//        meta.setPages(pages);
//        meta.setLore(lore);
//        setItemMeta(meta);
 
        
//    }

 }