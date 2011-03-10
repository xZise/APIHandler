package net.altercon.apihandler.apis.helper;

import net.altercon.apihandler.apis.NoInterfaceException;

/**
 * Thrown when a plugin wants to make use of Helper while there is no
 * permissions plugin installed.
 * 
 * @author Fabian Neundorf
 */
public class NoHelperPluginException extends NoInterfaceException {

    public NoHelperPluginException() {
        super("helper");
    }

}
