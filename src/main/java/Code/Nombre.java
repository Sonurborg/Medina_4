package Code;

import java.util.Scanner;

/**
 *
 * @author sonur
 */
public class Nombre {
    
    static Scanner intro=new Scanner(System.in);
    
    public static String readName(){
        System.out.println("A continuación deberá ingresar el Nombre y el Apellido del usuario por separado,");
        System.out.println("todo lo que esté después de un espacio no será considerado.");
        return validate();
    }
    
    private static String validate(){
        System.out.println("Ingrese el Nombre del nuevo Usuario");
        String name=validName(intro.next());
        System.out.println("Ingrese el Apellido del nuevo Usuario");
        String surname=validSurname(intro.next());
        return validLength(name+" "+surname);
    }
    
    private static String validName(String name){
        if ((name).matches("([a-z]|[A-Z]|\\s)+")) {
            return name;
        }else {
            System.out.println("Nombre de Usuario Inválido, favor intente nuevamente.");
            name=validName(intro.next());
        }
        return name;
    }
    
    private static String validSurname(String name){
        
        if ((name).matches("([a-z]|[A-Z]|\\s)+")) {
            return name;
        }else {
            System.out.println("Nombre de Usuario Inválido, favor intente nuevamente.");
            name=validName(intro.nextLine());
        }
        return name;
    }
    
    private static String validLength(String name){
        if (name.length()<=20) {
            return name;
        }else {
            System.out.println("El Nombre de Usuario es muy largo, favor ingresar un Nombre mas corto");
            name=validate();
        }
        return name;
    }
}
