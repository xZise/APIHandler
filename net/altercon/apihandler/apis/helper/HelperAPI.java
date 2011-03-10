package net.altercon.apihandler.apis.helper;

import org.bukkit.plugin.Plugin;

import net.altercon.apihandler.apis.UniqueAPI;

/**
 * Wraps the helper interface and stores a reference to the registered interface.
 * 
 * @author Fabian Neundorf
 */
public class HelperAPI extends UniqueAPI<HelperInterface> implements HelperInterface{

    @Override
    public boolean registerCommand(String command, String shortDescription,
	    String[] longDescription, boolean main, Plugin plugin) {
	return this.plugin.registerCommand(command, shortDescription, longDescription, main, plugin);
    }
    
    public boolean registerCommand(String command, String shortDescription,
	    String[] longDescription, Plugin plugin) {
	return this.registerCommand(command, shortDescription, longDescription, true, plugin);
    }

}
