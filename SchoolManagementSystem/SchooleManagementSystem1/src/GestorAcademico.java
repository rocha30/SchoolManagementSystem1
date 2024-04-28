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
        listaCurso.add(curso);
        estudiantesPorCurso.put(curso, new ArrayList<>());
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
    public void inscribirEstudianteCurso(Estudiante estudiante, int idEstudiante) {
        if (listaEstudiantes.contains(estudiante)&& listaEstudiantes.contains(idEstudiante)){
            ArrayList<String> estudiantesInscritos = estudiantesPorCurso.get(idEstudiante);
            estudiantesInscritos.add(estudiante.toString());
            System.out.println("El estudiante" + estudiante + "ha sido inscrito ");
        }else {
            System.out.println("Estudiante o curso no encontrado ");
        }

    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) {
        if (listaEstudiantes.contains(idEstudiante)&& listaCurso.contains(idCurso)){
            ArrayList<String> estudiantesInscritos = estudiantesPorCurso.get(idCurso);
                if (estudiantesInscritos.contains(idEstudiante)){
                    estudiantesInscritos.remove(idEstudiante);
                    System.out.println("Estudiante" + idEstudiante + "ha sido desinscrito del curso " + idCurso);
                } else {
                    System.out.println("El estudiante " + "no esta inscrito en el curso " + idCurso);
                }

        } else {
            System.out.println("Estudiante no encontrado");
        }

    }



}