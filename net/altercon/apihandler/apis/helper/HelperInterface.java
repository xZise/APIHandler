
package net.altercon.apihandler.apis.helper;

import org.bukkit.plugin.Plugin;

/**
 * Interface for help support. Bases on the helper plugin by tkelly.
 *
 * @author Fabian Neundorf
 */
public interface HelperInterface {

	boolean registerCommand(String command, String shortDescription, String[] longDescription, boolean main, Plugin plugin);
	
}
