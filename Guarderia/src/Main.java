import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia("Guarderia Infantil", "123456");

        Estudiante estudiante1 = new Estudiante("Juan", 4, "123", "Masculino", "Ninguna", "María", "987654321");
        Estudiante estudiante2 = new Estudiante("María", 6, "124", "Femenino", "Ninguna", "José", "123456789");
        Estudiante estudiante3 = new Estudiante("Ana", 8, "125", "Femenino", "Gluten", "Carlos", "987654321");
        Estudiante estudiante4 = new Estudiante("Carlos", 5, "126", "Masculino", "Ninguna", "Lucía", "123456789");

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        estudiantes.add(estudiante4);

        guarderia.setListEstudiantes(estudiantes);

        guarderia.listarEstudiantes();

        Estudiante nuevoEstudiante = new Estudiante("Luis", 7, "127", "Masculino", "Ninguna", "Ana", "987654321");
        guarderia.agregarEstudiante(nuevoEstudiante);

        guarderia.listarEstudiantes();

        System.out.println("Estudiante agregado correctamente");

        guarderia.eliminarEstudiante(estudiante4);

        guarderia.listarEstudiantes();

        System.out.println("Estudiante eliminado correctamente");

        Estudiante estudianteActualizado = new Estudiante("Ana", 9, "125", "Femenino", "Gluten y Lácteos", "Carlos", "987654321");
        guarderia.actualizarEstudiante(estudianteActualizado);

        guarderia.listarEstudiantes();

        System.out.println("Estudiante actualizado correctamente");

        ArrayList<Estudiante> mayoresDeCinco = Guarderia.filtrarMayoresDeCinco(guarderia.getListEstudiantes());

        System.out.println("\nEstudiantes mayores de cinco años:");
        for (Estudiante estudiante : mayoresDeCinco) {
            System.out.println(estudiante);
        }
    }
}