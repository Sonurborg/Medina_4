package Code;

/**
 *
 * @author sonur
 */
public class Usuario {
    
    public static String name;
    public static String rut;
    public static String adress;
    
    public Usuario(String name,String rut, String adress,boolean show){
        this.name=name;
        this.rut=rut;
        this.adress=adress;
        if (show) {
            showUser();
            GestorCsv.addUser(this);
        }
    }
    
    public void showUser(){
        System.out.println(name+" RUT:"+rut+" Dirección: "+adress);
    }
}
