
package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class server {
    public static void main(String [] args) throws RemoteException{
        Registry reg = LocateRegistry.createRegistry((int) 1337);
        
        System.out.println("Server iniciado!");
        
        reg.rebind("rmi", new bhaskaraServant());
    }
}
