import java.rmi.Naming;

public class ServidorRMI {
    
    public static void main(String[] args) throws Exception{
        // url del puerto por defecto
        String url = "rmi://localhost/matrices";
        // instancia del objeto remoto
        ClaseRMI obj = new ClaseRMI();
    
        // registra la instancia en el rmiregistry
        Naming.rebind(url,obj);
    
    // fin main
    }
// fin clase ServidorRMI
}
