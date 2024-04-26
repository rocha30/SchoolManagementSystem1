import java.awt.*;
import java.util.*;

public class GestorAcademico implements ServiciosAcademicos {

    private ArrayList<String> listaEstudiantes;
    private ArrayList<String> listaCurso;
    private HashMap<String, ArrayList<String>> estudiantesPorCurso;

    public GestorAcademico (){
        listaEstudiantes = new ArrayList<>();
        listaCurso = new ArrayList<>();
        estudiantesPorCurso = new HashMap<>();
    }

    public void agregarEstudiante (String estudiante ){
        listaEstudiantes.add(estudiante);
    }

    public void agregarCurso(String curso) {
        listaCursos.add(curso);
        estudiantesPorCurso.put(curso, new ArrayList<>());
    }

    public void inscribirEstudianteEnCurso(String estudiante, String curso) {
        if (listaEstudiantes.contains(estudiante) && listaCursos.contains(curso)) {
            ArrayList<String> estudiantesInscritos = estudiantesPorCurso.get(curso);
            estudiantesInscritos.add(estudiante);
        } else {
            System.out.println("Estudiante o curso no encontrado.");
        }
    }

    public ArrayList<String> obtenerEstudiantesPorCurso(String curso){
        return estudiantesPorCurso.get(curso);
    }



    @Override
    public void matriculaEstudiantes(Estudiante estudiante) {
        System.out.println("Matriculando un estudiante" + estudiante);
    }

    @Override
    public  void agregarCurso(Curso curso){
        System.out.println("El curso " + curso + "ha sido añadido a la lista correctamente");
    }

    @Override
    public  void inscribirEstudianteCurso(Estudiante estudiante, int idEstudiante){
        System.out.println("Inscribiendo a un nuevo Estudiante" + "El nombre del estudiante es "+estudiante + "El id del estudiante es"+ idEstudiante);

    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) {


    }




}