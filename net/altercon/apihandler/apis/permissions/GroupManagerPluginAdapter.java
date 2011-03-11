package net.altercon.apihandler.apis.permissions;

import org.anjocaido.groupmanager.GroupManager;

public class GroupManagerPluginAdapter implements PermissionsInterface {

    private final GroupManager manager;
    
    public GroupManagerPluginAdapter(GroupManager manager) {
	this.manager = manager;
    }
    
    @Override
    public boolean hasPermission(String world, String player, String permission) {
	return this.manager.getWorldsHolder().getWorldData(world).getUser(player).hasSamePermissionNode(permission);
    }

    @Override
    public String[] getGroups(String world, String player) {
	return new String[] { this.manager.getWorldsHolder().getWorldData(world).getUser(player).getGroup().getName() };
    }

}
