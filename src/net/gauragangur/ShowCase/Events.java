package net.gauragangur.ShowCase;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class Events implements Listener {
	ArrayList<ItemStack> test;
	@EventHandler
	public void PlayerInt(PlayerInteractEvent event) {
		if(event.hasBlock() && event.getClickedBlock().getType().equals(Material.STEP)) {
			if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) && event.getPlayer().isSneaking()) {
					Block block = event.getClickedBlock();
					Player player = event.getPlayer();
					Location loc = block.getLocation();
					ItemStack i = new ItemStack(player.getItemInHand());
					loc.getWorld().dropItem(loc.getBlock().getLocation().add(+0.5, +1, +0.5), i).setVelocity(new Vector(0, 0, 0));		        	
					return;
			}
		} 
	}
	@EventHandler
	public void PlaceBlock(BlockPlaceEvent event) {
			event.setCancelled(true);
			event.getPlayer().sendMessage("test");

	}
	@EventHandler
	public void PicUpItem(PlayerPickupItemEvent event) {
		event.setCancelled(true);
	}
	

}