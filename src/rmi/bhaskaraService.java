package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface bhaskaraService extends Remote{
    
    public String bhaskara(float a, float b, float c) throws RemoteException;

}
