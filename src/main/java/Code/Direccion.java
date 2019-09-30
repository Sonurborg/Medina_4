package Code;

import java.util.Scanner;

/**
 *
 * @author sonur
 */
public class Direccion {
    
    static Scanner intro = new Scanner(System.in);
    
    public static String read(){
        System.out.println("A continuación deberá ingresar la Calle, Número, Ciudad y Región del usuario por separado");
        return validate();
    }
    
    private static String validate(){
        System.out.println("Ingrese la Calle del nuevo Usuario");
        String street=validString(intro.next());
        System.out.println("Ingrese el Número del nuevo Usuario");
        int number=IntInputReader.input(0,999999);
        System.out.println("Ingrese la Ciudad del nuevo Usuario");
        String city=validString(intro.next());
        System.out.println("Ingrese la Región del nuevo Usuario");
        String region=validString(intro.next());
        return (street+","+number+","+city+","+region);
    }
    
    private static String validString(String name){
        if ((name).matches("([a-z]|[A-Z]|\\s)+")) {
            return name;
        }else {
            System.out.println("Nombre de Usuario Inválido, favor intente nuevamente.");
            intro.next();
            name=validString(intro.nextLine());
        }
        return name;
    }
}
