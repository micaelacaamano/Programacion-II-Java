import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        Alumno alum1 = new Alumno(3);
        Alumno alum2 = new Alumno(3);
        Alumno alum3 = new Alumno(3);

        alum1.cargar("Analia", 5696,new String[]{"Filosofia", "Lengua", "Matematicas"}, new int[]{8, 9, 10});

        alum2.cargar("Agustin", 1707,new String[]{"Fisica", "Tecnologia", "Musica"}, new int[]{7, 5, 9});

        alum3.cargar("Naara", 9673,new String[]{"ASI", "Historia", "Derecho"}, new int[]{8, 9, 6});

        Examen examen = new Examen(3, 6);

        examen.agregarAlumno(alum1, 0);
        examen.agregarAlumno(alum2, 1);
        examen.agregarAlumno(alum3, 2);

        Scanner scanner = new Scanner(System.in);

        int seleccion;

        do {
            System.out.println("---------- Sistema de gestión ----------");
            System.out.println("1 - Mostrar alumnos");
            System.out.println("2 - Estado de materias");
            System.out.println("3 - Promedio por alumno");
            System.out.println("4 - Materias sobre el promedio");
            System.out.println("5 - Salir");
            System.out.println("----------------------------------------");

            seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    alum1.imprimir();
                    System.out.println();
                    alum2.imprimir();
                    System.out.println();
                    alum3.imprimir();
                    break;

                case 2:
                    examen.estadosMaterias();
                    break;

                case 3:
                    System.out.println("Promedio Analia: " + alum1.promedio());
                    System.out.println("Promedio Agustin: " + alum2.promedio());
                    System.out.println("Promedio Naara: " + alum3.promedio());
                    break;

                case 4:
                    alum1.materiasSobrePromedio();
                    System.out.println();
                    alum2.materiasSobrePromedio();
                    System.out.println();
                    alum3.materiasSobrePromedio();
                    break;

                case 5:
                    System.out.println("¡Gracias por usar el sistema!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (seleccion != 5);
    }
}