package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class bhaskaraServant extends UnicastRemoteObject implements bhaskaraService{
    
    public bhaskaraServant() throws RemoteException{
        super();
    }
    
    public String bhaskara(float a, float b, float c) throws RemoteException{
        ArrayList resultado = new ArrayList();
        float delta = b*b - 4*a*c;
        resultado.add((-b + Math.sqrt(delta))/(2 * a));
        resultado.add((-b - Math.sqrt(delta))/(2 * a));
        return "Resultados [x1, x2] = " + resultado.toString();
    }
}
