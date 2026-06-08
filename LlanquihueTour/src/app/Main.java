
package app;
import model.Direccion;
import model.Empleado;
import model.Rut;
import util.RutInvalidoException;


public class Main {

  
    public static void main(String[] args) {
         
    System.out.println("===== SISTEMA LLANQUIHUE TOUR =====");
    System.out.println();

    try {

        // Se crea un RUT válido para el primer empleado
        Rut rutEmpleado = new Rut("17.604.801-0");

        // Se crea una dirección para el primer empleado
        Direccion direccionEmpleado = new Direccion(
                "Del Solar",
                698,
                "Llanquihue",
                "Los Lagos"
        );

        // Se crea un empleado usando herencia y composición:
        // Empleado hereda de Persona y tiene una Dirección
        Empleado empleado1 = new Empleado(
                "Guia Turistico",
                "Excursiones",
                "Llanquihue Tour",
                "Yessica Reyes",
                rutEmpleado,
                "y.reyes@llanquihuetour.cl",
                direccionEmpleado
        );

        // Se muestra la información del primer empleado
        System.out.println(empleado1);

        System.out.println();

        // Se crea un RUT para el segundo empleado
        Rut rutEmpleado2 = new Rut("15.987.654-3");

        // Se crea una dirección para el segundo empleado
        Direccion direccionEmpleado2 = new Direccion(
                "Las Golondrinas",
                1521,
                "Puerto Varas",
                "Los Lagos"
        );

        // Se crea un segundo empleado usando herencia y composición:
        // La empresa asociada permite distinguir si trabaja directamente
        // para Llanquihue Tour o si es un colaborador externo.
        Empleado empleado2 = new Empleado(
                "Conductor",
                "Transporte Turistico",
                "Transportes Puerto Varas",
                "Guillermo Salas",
                rutEmpleado2,
                "g.salas@transportespv.cl",
                direccionEmpleado2
        );

        // Se muestra la información del segundo empleado
        System.out.println(empleado2);
        System.out.println();
        
        
        // Se crea un RUT para el tercer empleado
        Rut rutEmpleado3 = new Rut("18.126.794-5");

        // Se crea una dirección para el tercer empleado
        Direccion direccionEmpleado3 = new Direccion(
        "Pasaje El Bosque",
        845,
        "Llanquihue",
        "Los Lagos"
        );

        // Se crea un tercer empleado usando herencia y composición:
        // Este empleado trabaja directamente para Llanquihue Tour.
        Empleado empleado3 = new Empleado(
        "Coordinadora de Reservas",
        "Atenciomainn al Cliente",
        "Llanquihue Tour",
        "Natalia Jara",
        rutEmpleado3,
        "n.jara@llanquihuetour.cl",
        direccionEmpleado3
        );

        // Se muestra la información del tercer empleado
        System.out.println();
        System.out.println(empleado3);

   } catch (RutInvalidoException e) {

        System.out.println("Error al crear el empleado:");
        System.out.println(e.getMessage());    
        
        
        
        
        }
    }
}

        
        
        
    
    

