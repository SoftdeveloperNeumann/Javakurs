/*
 * Created on 19.08.2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package de.wbs.myRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

/**
 * @author Frank Neumann
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Client {
		
	public static void main(String[] args) {
		InfoServerInterface info ;
//		System.setProperty("java.security.policy", "my.policy");
//		System.setSecurityManager(new RMISecurityManager());
		try {
			System.out.println(Naming.list("InfoServer")[0]);
			info = (InfoServerInterface)Naming.lookup(Naming.list("InfoServer")[0]);//"//127.0.0.1/InfoServer");
			System.out.println(info.sucheInfo("Eigenkapital"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
