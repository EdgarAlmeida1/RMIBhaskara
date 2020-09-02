package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class client {
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        bhaskaraService BS = (bhaskaraService) Naming.lookup("rmi://localhost:1337/rmi");
        
        float a = 2;
        float b = -16;
        float c = -18;
        
        String text = "Função usada: (" + a + ")x² + (" + b + ")x +(" + c + ") = 0\n";
        
        System.out.println(text + BS.bhaskara(a, b, c));
    }
}
