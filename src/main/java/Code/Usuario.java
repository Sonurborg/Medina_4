package Code;

/**
 *
 * @author sonur
 */
public class Usuario {
    
    public String name;
    public String rut;
    public String adress;
    
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
