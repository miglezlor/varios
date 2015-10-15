
package proyectoalfa;
import java.util.Scanner;


/**
 *
 * @author mgonzalezlorenzo modified by jbarrosgarcia
 */
public class Proyectoalfa {


    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String hola,adios;
        System.out.println("Introduzca una frase");
        hola=teclado.nextLine();
        System.out.println("Introduzca otra frase");
        adios=teclado.nextLine();
        System.out.println(hola);
        System.out.println(adios);
    }
    
}
