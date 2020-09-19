import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;

    public MyRemoteImpl() throws RemoteException { };

    public String saysHello() {
        return "Server says hello.";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            
        }
    }
}