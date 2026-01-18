public class Alumno {
    protected int legajo;
    protected String nombre;
    protected String[] materias;
    protected int[] notas;

    public Alumno(int cantMaterias) {
        materias = new String[cantMaterias];
        notas = new int[cantMaterias];
    }

    public void cargar(String nombre, int legajo, String[] materias, int[] notas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materias = materias;
        this.notas = notas;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Materias:");
        for (int i = 0; i < materias.length; i++) {
            System.out.println("- " + materias[i] + ": " + notas[i]);
        }
    }

    public int promedio() {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public void materiasSobrePromedio() {
        int prom = promedio();
        System.out.println("Materias sobre el promedio de " + nombre + ":");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > prom) {
                System.out.println(materias[i] + " (" + notas[i] + ")");
            }
        }
    }
}
