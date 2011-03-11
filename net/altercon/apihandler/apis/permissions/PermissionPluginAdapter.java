package net.altercon.apihandler.apis.permissions;

import org.bukkit.Server;
import org.bukkit.entity.Player;

import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;

public class PermissionPluginAdapter implements PermissionsInterface {

    private final PermissionHandler handler;
    private final Server server;
    
    public PermissionPluginAdapter(Permissions plugin, Server server) {
	this.handler = plugin.getHandler();
	this.server = server;
    }
    
    @Override
    public boolean hasPermission(String world, String playerName, String permission) {
	Player player = this.server.getPlayer(playerName);
	if (player == null) {
	    throw new IllegalArgumentException("The player name is invalid.");
	} else if (!player.getWorld().getName().equalsIgnoreCase(world)) {
	    throw new IllegalArgumentException("The world differ from the players world");
	} else {
	    return this.handler.has(player, permission);
	}
    }

    @Override
    public String[] getGroups(String world, String player) {
	return this.handler.getGroups(world, player);
    }

}
