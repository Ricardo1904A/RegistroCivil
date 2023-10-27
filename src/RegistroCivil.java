import java.util.Scanner;

class RegistroCivil {
    private RegistroPersona registro;


    // constructor
    public RegistroCivil(int t) {// llamamos a un contador
        registro = new RegistroPersona(t);// asignamos una instancia de tipo registro
    }

// metodo para mostrar el menu con todas las opciones
    private void mostrarMenu() {
        System.out.println("1. Registrar nueva persona");
        System.out.println("2. Buscar persona por cedula");
        System.out.println("3. Buscar persona por nombre");
        System.out.println("4. Buscar persona por fecha de nacimiento");
        System.out.println("5. Mostrar personas registradas");
        System.out.println("0. Salir");
    }
// metodo para ingresar y que quede registrado una nueva persona en el sistema
    private void registrarPersona(Scanner scanner) {// scanner scanner se utiliza para leer la entrada del usuario
        System.out.print("Ingrese la cedula: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento: ");
        String fechaNacimiento = scanner.nextLine();

        Persona nuevaPersona = new Persona(cedula, nombre, fechaNacimiento);// crea una nueva instancia de clase "Persona"
        registro.agregarPersona(nuevaPersona);// llama al metodo de RegistroPersona para agregar los nuevos datos instanciados en nuevaPersona
    }
    // metodo para imprimir los datos que se vayan a buscar dependiendo de la opcion elegida por el usuario
    private void mostrarResultadoBusqueda(Persona persona) {// toma a los parametros llamados persona que es la informacion que se mostrara
        if (persona != null) {// comprueba que se encuentre el objeto que se va a mostrar
            persona.mostrarInformacion();// si la condicion es verdadera llama al metodo mostrarInformacion
        } else {
            System.out.println("No existen esos datos registrados en el sistema");
        }
    }
// metodo para buscar los datos por su numero de cedula
    private void buscarPorCedula(Scanner scanner) {
        System.out.print("Ingrese la cedula a buscar: ");
        String cedulaBuscar = scanner.nextLine();// asigna una variable "cedulaBuscar" al dato que ingresa el usuario para mas adelante llamarlo y poder encontrar los datos
        Persona personaPorCedula = registro.buscarPorCedula(cedulaBuscar);// llama al metedo encontrado en RegistroPersona y se realiza la comparacion el dato obtenido se asigna a la variable personaPorCedula
        mostrarResultadoBusqueda(personaPorCedula);// llamamos al metodo para que se imprima los datos obtenidos anteriormente en personaPorCedula
    }
    // metodo para buscar los datos por su nombre
    private void buscarPorNombre(Scanner scanner) {
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscar = scanner.nextLine();
        Persona personaPorNombre = registro.buscarPorNombre(nombreBuscar);
        mostrarResultadoBusqueda(personaPorNombre);
    }
    // metodo para buscar los datos por su fecha de nacimiento
    private void buscarPorFechaNacimiento(Scanner scanner) {
        System.out.print("Ingrese la fecha de nacimiento a buscar: ");
        String fechaNacimientoBuscar = scanner.nextLine();
        Persona personaPorFechaNacimiento = registro.buscarPorFechaNacimiento(fechaNacimientoBuscar);
        mostrarResultadoBusqueda(personaPorFechaNacimiento);
    }
    // metodo para imprimir la informacion registrada en la clase Persona
    private void mostrarPersonasRegistradas() {
        registro.mostrarPersonasRegistradas();// llama al metodo para mostrar la informacion
    }
    //metodo para crear un menu para elegir la accion que se quiere realizar
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Ingrese la opcion que desea realizar: ");
            opcion = scanner.nextInt();
            scanner.nextLine();// se usa para limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarPersona(scanner);
                    break;

                case 2:
                    buscarPorCedula(scanner);
                    break;

                case 3:
                    buscarPorNombre(scanner);
                    break;

                case 4:
                    buscarPorFechaNacimiento(scanner);
                    break;

                case 5:
                    mostrarPersonasRegistradas();
                    break;

                case 0:
                    System.out.println("Gracias por su consulta.");
                    break;

                default:
                    System.out.println("Opcion invalida, ingresar una opcion entre 0 y 5");
            }
        } while (opcion != 0);

        scanner.close();
    }
}