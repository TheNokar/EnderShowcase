package net.gauragangur.ShowCase;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Methods {
	public void add(test t, String name, Player player, Location location) {
		try {
			t.amount = 1;
			t.name = name;
			t.itemn = player.getItemInHand();
			t.location = location;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ArrayList<test> tmp = new ArrayList<test>();
        tmp.add(t);
        
	}
}
