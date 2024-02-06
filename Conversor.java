import java.rmi.*;

public interface Conversor extends Remote {
    public float euro_real(float valor) throws RemoteException;
    public float real_euro(float valor) throws RemoteException;
    public float dolar_real(float valor) throws RemoteException;
    public float real_dolar(float valor) throws RemoteException;

}    