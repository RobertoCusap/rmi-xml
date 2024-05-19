import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ProductInterface extends Remote {
    String getName() throws RemoteException;

    String getDescription() throws RemoteException;

    double getPrice() throws RemoteException;
}
