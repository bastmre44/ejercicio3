//Universidad del Vallle de Guatemala
//POO ejercicio 3 
//Mishell Ciprian 231169

public class Programa {

    //Areglos que almacenan los objetos de las clases estudiante, examen y sede
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();	
    private static ArrayList<Examen> examenes = new ArrayList<Examen>();
    private static ArrayList<Sede>sedes =new ArrayList<Sede>();
    ();
    

    //objeto scanner para leer los datos de entrada por teclado 

    private static Scanner sc =new Scanner (System.in);

    //metodo main que ejecuta el programa 
    
}
public static void mostrarMenu(){
    int opcion;
    do {
        System.out.println("Bienvenido al programa de registro de exámenes de orientación");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Registrar estudiantes");
        System.out.println("2. Registrar exámenes");
        System.out.println("3. Mostrar estadísticas");
        System.out.println("4. Salir");  

        opcion = leerEntero(1,4);


        switch (opcion) {
            case 1:
              // Llamada al método que permite registrar estudiantes
              registrarEstudiantes();
              break;
            case 2:
              // Llamada al método que permite registrar exámenes
              registrarExamenes();
              break;
            case 3:
              // Llamada al método que permite mostrar estadísticas
              mostrarEstadisticas();
              break;
            case 4:
              // Mostrar un mensaje de despedida y salir del programa
              System.out.println("Gracias por usar el programa. Hasta pronto.");
              break;
          }
        } while (opcion != 4);
      }
    
    // Método que permite registrar estudiantes manualmente
    public static void registrarEstudiantes() {
    // Variable que almacena la opción elegida por el usuario
    int opcion;
    
   
    System.out.println("1. Registrar estudiantes manualmente");
    
    // Leer la opción elegida por el usuario y validar que sea un número 1
    opcion = leerEntero(1);
    // Ejecutar la acción correspondiente a la opción elegida
    switch (opcion) {
    case 1:
    // Llamada al método que permite registrar estudiantes manualmente
    registrarEstudiantesManualmente();
    break;
  
    }
    
    

    
   
    
 // Método que permite registrar un estudiante de forma manual
public static void registrarEstudianteManualmente() {
    // Variables que almacenan los datos del estudiante
    String nombre;
    String apellido;
    String codigo;
    LocalDate fechaNacimiento;
    String correo;
    // Mostrar un mensaje solicitando el nombre del estudiante y validar que no esté vacío
    System.out.println("Ingrese el nombre del estudiante:");
    nombre = leerString();
    // Mostrar un mensaje solicitando el apellido del estudiante y validar que no esté vacío
    System.out.println("Ingrese el apellido del estudiante:");
    apellido = leerString();
    // Mostrar un mensaje solicitando el código del estudiante y validar que no esté vacío ni repetido
    System.out.println("Ingrese el código del estudiante:");
    codigo = leerString();
    while (!validarCodigo(codigo)) {
    mostrarError("El código ya existe o es inválido. Ingrese otro código:");
    codigo = leerString();
    }
    // Mostrar un mensaje solicitando la fecha de nacimiento del estudiante y validar que tenga un formato válido
    System.out.println("Ingrese la fecha de nacimiento del estudiante (dd/mm/aaaa):");
    fechaNacimiento = leerFecha();
    // Mostrar un mensaje solicitando el correo electrónico del estudiante y validar que tenga un formato válido
    System.out.println("Ingrese el correo electrónico del estudiante:");
    correo = leerCorreo();
    // Crear un objeto de la clase Estudiante con los datos ingresados
    Estudiante estudiante = new Estudiante(nombre, apellido, codigo, fechaNacimiento, correo);
    // Agregar el objeto estudiante al arreglo dinámico de estudiantes
    estudiantes.add(estudiante);
    // Llamada al método que permite agregar el estudiante a la sede correspondiente
    agregarEstudianteASede(estudiante);
    // Mostrar un mensaje de éxito
    mostrarExito("El estudiante ha sido registrado correctamente.");
    }
    