class RegistroPersona {
    private int cantidadPersonas;
    private Persona[] personas;

    // Constructor
    public RegistroPersona(int t) {
        cantidadPersonas = 0;
        personas = new Persona[t];
    }

    // Método para agregar una persona al registro
    public void agregarPersona(Persona persona) {
        if (cantidadPersonas < personas.length) {// Se compara si la cantidad de personas que se registran es menor a la cantidad del arreglo
            personas[cantidadPersonas] = persona;// agrega a la nueva persona al arreglo
            cantidadPersonas++;// eleva el contador de personas para tener un registro mas detallado
            System.out.println("Se agrego los datos correctamente");
        } else {
            System.out.println("No es posible agregar.");
        }
    }

    // Método para buscar persona por número de cédula
    public Persona buscarPorCedula(String cedula) {// tomamos de parametro a la variable cedula que es tipo string
        for (int i = 0; i < cantidadPersonas; i++) {// bucle para revisar a travez de todas las personas registradas
            if (personas[i].getCedula().equals(cedula)) {// equals se utiliza para comparar dos objetos
                return personas[i];// si encuentra que el objeto es el mismo devuelve el dato especifico de su contador (i)
            }
        }
        return null; // se devuelve null para indicar que no existe ningun objeto existente con esos datos
    }

    // Método para buscar persona por nombre
    public Persona buscarPorNombre(String nombre) {
        for (int i = 0; i < cantidadPersonas; i++) {
            if (personas[i].getNombre().equalsIgnoreCase(nombre)) {
                return personas[i];
            }
        }
        return null; //
    }

    // Método para buscar persona por fecha de nacimiento
    public Persona buscarPorFechaNacimiento(String fechaNacimiento) {
        for (int i = 0; i < cantidadPersonas; i++) {
            if (personas[i].getFechaNacimiento().equals(fechaNacimiento)) {
                return personas[i];
            }
        }
        return null;
    }
    // Método para mostrar todas las personas registradas
    public void mostrarPersonasRegistradas() {
        System.out.println("Personas registradas en el Registro Civil:");
        for (int i = 0; i < cantidadPersonas; i++) {
            personas[i].mostrarInformacion();
            System.out.println("--------------------");
        }
    }
}