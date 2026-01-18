public class Examen {
    private Alumno[] alumnos;
    private int notaAprobacion;

    public Examen(int cantAlumnos, int notaAprobacion) {
        alumnos = new Alumno[cantAlumnos];
        this.notaAprobacion = notaAprobacion;
    }

    public void agregarAlumno(Alumno alumno, int posicion) {
        alumnos[posicion] = alumno;
    }

    public void estadosMaterias() {
        for (Alumno a : alumnos) {
            System.out.println("Alumno: " + a.nombre);
            for (int i = 0; i < a.materias.length; i++) {
                if (a.notas[i] >= notaAprobacion) {
                    System.out.println(a.materias[i] + " - Aprobada");
                } else {
                    System.out.println(a.materias[i] + " - Reprobada");
                }
            }
            System.out.println();
        }
    }
}
