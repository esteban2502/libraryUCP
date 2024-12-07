
package Modelo;


public class Administrativo extends Persona{
    // atributos del administrativo
    private int idAdministrativo;
    private String usuario;
    private String contraseña;
    
    // constructor que no recibe argumentos, pero que inicializa las variables
     public Administrativo() {
         super();
        idAdministrativo = 0;
        usuario = "";
        contraseña = "";
                
        
    }
    
    
    public Administrativo(int idAdministrativo, String usuario, String contraseña, String nombre1, String nombre2, String apellido1, String apellido2, String correo) {
        super(nombre1, nombre2, apellido1, apellido2, correo);
        this.idAdministrativo = idAdministrativo;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

   
    

    
    //metodos accesores 
    public int getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(int idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   
    
    
}
