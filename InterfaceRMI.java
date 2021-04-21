import java.rmi.Remote;
import java.rmi.RemoteException;

/**La interface incluye los prototipos de los métodos a exportar */
public interface InterfaceRMI extends Remote{
    
    /**Declarado dentro de la Interface.
     * Método que multiplica 2 matrices de tamaño [N/2][N].
     * @param A
     * @param B
     * @return AxB[N/2][N/2]
     * @throws RemoteException
     */
    public float[][] multiplica_matrices(float[][] A, float[][] B) throws RemoteException;
    
// fin interfaceRMI
}