
import java.util.Scanner;


public class TiendaLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Proporciona el nombre: ");
        Scanner scanner= new Scanner(System.in);
        String nombre=scanner.nextLine();
        System.out.println("Proporciona el id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("proporciona el precio");
        float precio = Float.parseFloat(scanner.nextLine());
        System.out.println("¿Envio gratuito?");
        boolean envio = Boolean.parseBoolean (scanner.nextLine());
        
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + precio);
        System.out.println("Envio gratuito: " + envio);
        
        
    }
    
}
