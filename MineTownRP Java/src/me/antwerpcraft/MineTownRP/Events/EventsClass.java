package me.antwerpcraft.MineTownRP.Events;



import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventsClass implements Listener{
    public EventsClass(){

    }
    @EventHandler
    public void onInteract (PlayerInteractEvent event) {
        Action action = event.getAction();
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        if(action.equals(Action.LEFT_CLICK_BLOCK)) {
            if (block.getType().equals(Material.GOLD_BLOCK))
                player.sendMessage(ChatColor.YELLOW + "You are using the provider Telenet now!");
        }else{
            player.sendMessage(ChatColor.GOLD + "You clicked:" + ChatColor.RED + block.getType().toString().toUpperCase());
        }
    }
}