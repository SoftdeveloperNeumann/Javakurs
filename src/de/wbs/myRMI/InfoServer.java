/*
 * Created on 19.08.2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package de.wbs.myRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Frank Neumann
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class InfoServer extends UnicastRemoteObject implements
		InfoServerInterface {

	/**
	 * @throws RemoteException
	 */
	public InfoServer() throws RemoteException {
		super();
		
	}

	/* (non-Javadoc)
	 * @see myRMI.InfoServerInterface#sucheInfo(java.lang.String)
	 */
	public String sucheInfo(String wert) throws RemoteException {
		if(wert.equals("Anlageverm�gen")) return "100 EUR";
		if(wert.equals("Umlaufverm�gen")) return "200 EUR";
		if(wert.equals("Eigenkapital")) return "500 EUR";
		if(wert.equals("Fremdkapital")) return "700 EUR";
		return "keine Daten vorhanden";
	}

	public static void main(String[] args) {
//		System.setProperty("java.security.policy", "my.policy");
//		System.setSecurityManager(new RMISecurityManager());
		try {
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			Naming.rebind("InfoServer",new InfoServer());
			System.out.println("Server erzeugt und registriert");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
