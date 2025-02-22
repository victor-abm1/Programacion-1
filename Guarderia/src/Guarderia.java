import java.util.ArrayList;

public class Guarderia {
    private String nombre;
    private String nit;
    private ArrayList<Estudiante> listEstudiantes;

    public Guarderia(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public ArrayList<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }
    public void setListEstudiantes(ArrayList<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

    public void agregarEstudiante(Estudiante newEstudiante) {
        listEstudiantes.add(newEstudiante);
    }

    public void eliminarEstudiante(Estudiante estudianteEliminar) {
        listEstudiantes.remove(estudianteEliminar);
    }

    public void actualizarEstudiante(Estudiante estudianteActualizar) {
        for (Estudiante indexEstudiante : listEstudiantes) {
            if (indexEstudiante.getIdentificacion().equals(estudianteActualizar.getIdentificacion())) {
                indexEstudiante.setNombre(estudianteActualizar.getNombre());
                indexEstudiante.setEdad(estudianteActualizar.getEdad());
                indexEstudiante.setGenero(estudianteActualizar.getGenero());
                indexEstudiante.setAlergias(estudianteActualizar.getAlergias());
                indexEstudiante.setNombreAcudiente(estudianteActualizar.getNombreAcudiente());
                indexEstudiante.setNumeroContacto(estudianteActualizar.getNumeroContacto());
                break;
            }
        }
    }

    public void listarEstudiantes() {
        for (Estudiante estudiante : listEstudiantes) {
            System.out.println("Estudiante:" + listEstudiantes.indexOf(estudiante) + " "+ estudiante);
        }
    }
    public static ArrayList<Estudiante> filtrarMayoresDeCinco(ArrayList<Estudiante> listEstudiantes) {
        ArrayList<Estudiante> mayoresDeCinco = new ArrayList<>();

        for (Estudiante estudiante : listEstudiantes) {
            if (estudiante.getEdad() > 5) {
                mayoresDeCinco.add(estudiante);
            }
        }

        return mayoresDeCinco;
    }
}
