package me.antwerpcraft.MineTownRP;



import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import me.antwerpcraft.MineTownRP.Events.EventsClass;

public class Minetownrp extends JavaPlugin {
    public void onEnable(){
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nMineTownRP has been enabled");
        getServer().getPluginManager().registerEvents(new EventsClass(),this);
    }
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nMineTownRP has been disabled");
        getServer().getPluginManager().registerEvents(new EventsClass(), this);
    }
}
