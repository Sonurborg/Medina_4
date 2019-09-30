package Code;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sonur
 */
public class Main {
    
    public static List<Usuario> users= new ArrayList<>();
    
    public static void main(String[]Args){
        loadUsers();
        menu();
    }
    
    private static void loadUsers(){
        GestorCsv.readFile();
    }
    
    /**
     * Metodo menu ejecuta al metodo options mientras
     * @param selection sea diferente de 3.
     */
    private static void menu(){
        int selection;
        do {
           selection=optionSel();
           options(selection);
        }while (selection!=3);
    }
    
    /**
     * Metodo optionSel imprime las opciones para el menú y
     * @return input recibido de IntInputReader.
     */
    private static int optionSel() {
        System.out.println("Seleccione lo que desea realizar");
        System.out.println(" 1 - Crear un nuevo Usuario");
        System.out.println(" 2 - Mostrar Usuarios");
        System.out.println(" 3 - Salir");
        return IntInputReader.input(1, 3);
    }
    
    /**
     * Metodo options recibe el
     * @param o
     * ejecuta el metodo correspondiente a la opcion seleccionada.
     */
    private static void options(int o){
        if (o==1) createUser();
        if (o==2) showAll(); 
    }
    
    private static void createUser(){
        users.add(new Usuario(inputName(),inputRut(),inputAdress(),true));
        System.out.println("Usuario creado exitosamente");
    }
    
    private static String inputName(){
        return (Nombre.readName());
    }
    
    private static String inputRut(){
        return (Rut.readRut());
    }
    
    private static String inputAdress(){
        return (Direccion.read());
    }

    private static void showAll(){
        for (int i=0;i<users.size();i++) {
            users.get(i).showUser();
        }
    }
    
}