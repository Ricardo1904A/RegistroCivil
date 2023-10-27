import java.util.Scanner;
public class Persona {
    // Hacemos las tres variables tipo string para que al momento de la digitacion no cree ningun error en el registro
    private String cedula;
    private String nombre;
    private String fechaNacimiento;

    // Constructor
    public Persona(String cedula, String nombre, String fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método para ingresar la cedula, el nombre y la fecha de nacimiento de las personas ingresadas
    public void mostrarInformacion() {
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
    }
    // Getter and setter
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}

