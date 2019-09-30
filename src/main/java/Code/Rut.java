package Code;

import java.util.Scanner;

/**
 *
 * @author sonur
 */
public class Rut {
    
    static Scanner intro = new Scanner(System.in);
    
    public static String readRut(){
        System.out.println("A continuación deberá ingresar el Rut y el Codigo Verificador del usuario por separado,");
        System.out.println("todo lo que esté después de un espacio no será considerado.");
        return validate();
    }
    
    private static String validate(){
        System.out.println("Ingrese el Rut del nuevo usuario SIN CODIGO VERIFICADOR");
        int number=IntInputReader.input(0,99999999);
        System.out.println("Ingrese el Codigo Verificador del Rut del nuevo usuario");
        System.out.println();
        char code=CharInputReader.CharInput();
        return (number+"-"+code);
    }
}
