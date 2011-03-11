
package net.altercon.apihandler.apis.permissions;

import net.altercon.apihandler.apis.APIInterface;

/**
 *
 * @author Isa
 */
public interface PermissionsInterface extends APIInterface {

	boolean hasPermission(String world, String player, String permission);
	
	String[] getGroups(String world, String player);
	
}
