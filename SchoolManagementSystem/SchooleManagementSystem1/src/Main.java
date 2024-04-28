

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Estudiante estudiante = new Estudiante(23501, "Mario", "Rocha", 30-10-2023, "Matriculado");
        Curso curso = new Curso(23500 ,"Matematicas", "El curso de matematicas tratará de ...." , 24, 2.0 );
        GestorAcademico gestorAcademico = new GestorAcademico();

        gestorAcademico.matriculaEstudiantes(new Estudiante(23501, "Mario", "Rocha", 30-10-2023, "Matriculado"));
        gestorAcademico.agregarCurso(new Curso(23500 ,"Matematicas", "El curso de matematicas tratará de ...." , 24, 2.0 ));
        gestorAcademico.inscribirEstudianteCurso(estudiante, 23501);



        System.out.println(gestorAcademico);



    }
}