
import java.util.Scanner;

// mi primera clase

public class Libro {
    
       public static void main (String args[]){

            Scanner variable1=new Scanner(System.in);
            System.out.println("Proporciona el Titulo: ");
            var titulo= variable1.nextLine();

            Scanner variable2=new Scanner(System.in);
            System.out.println("Proporciona el Autor: ");
            var autor= variable2.nextLine();

            System.out.println(titulo+ " Escrito por: " + autor);

           
       }
}
