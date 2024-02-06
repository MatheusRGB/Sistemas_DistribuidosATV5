import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversorServer extends UnicastRemoteObject implements Conversor{
    public ConversorServer() throws RemoteException{
        super();
    }

    @Override
    public float euro_real(float valor) throws RemoteException{
        float resultado = valor * 5.3f;
        return resultado;
    }

    @Override
    public float real_euro(float valor) throws RemoteException{
        float resultado = valor/5.3f;
        return resultado;
    }

    @Override
    public float dolar_real(float valor) throws RemoteException{
        float resultado = valor * 4.9f;
        return resultado;
    }

    @Override
    public float real_dolar(float valor) throws RemoteException{
        float resultado = valor / 4.9f;
        return resultado;
    }
    
    public static void main(String[] args) {
        try {
            ConversorServer server = new ConversorServer();
            System.out.println("Conversor Online!");
            Naming.rebind("rmi://10.0.2.15:11099/RMIInterface", new ConversorServer());
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }
}