/*
 * Created on 19.08.2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package de.wbs.myRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Frank Neumann
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface InfoServerInterface extends Remote {

	String sucheInfo(String wert)throws RemoteException;
}
