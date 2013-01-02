package net.gauragangur.ShowCase;

import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public class Util {
	HashMap<Location, ItemStack> test;

	public Util(Location loc, ItemStack item) {
		test.put(loc, item);
	}
	public Util(ItemStack item) {
		test.containsKey(item);
	}
	public Util(Location loc) {
		test.containsKey(loc);
	}
	public void addShowcase(int number, Location loc) {
		
	}
}
