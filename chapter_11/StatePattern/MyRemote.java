import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    public String saysHello() throws RemoteException;
}