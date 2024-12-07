
package Modelo;

/**
 *
 * @author Juan Esteban
 */


public class Persona {
    //atributos de la Persona
    private int idPersona;
    protected String nombre1;
    protected String nombre2;
    protected String apellido1;
    protected String apellido2;
    protected String correo;
    private String telefono;

    // constructor que no recibe argumentos, pero que inicializa las variables

    public Persona() {
        idPersona = 0;
        nombre1 = "";
        nombre2 = "";
        apellido1 = "";
        apellido2 = "";
        correo = "";
        telefono = "";
    }

    
    
    //constructor que recibe todos los argumentos de una persona
    
    public Persona(int idPersona, String nombre1, String nombre2, String apellido1, String apellido2, String correo, String telefono) {
        this.idPersona = idPersona;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.correo = correo;
        this.telefono = telefono;
   
    }
    
    // constructo que vamos a utilizar para la clase hija Administrativo (ya que administrativo no tendra algunos argumentos que si tiene persona)

    public Persona(String nombre1, String nombre2, String apellido1, String apellido2, String correo) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.correo = correo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCorreo() {
        return correo;
    }

    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    
    
    
    
}
