public interface ServiciosAcademicos {

    //matriculaEstudiantes
    void matriculaEstudiantes(Estudiante estudiante);

    //agregarCurso
    void agregarCurso(Curso curso);

    //inscribirEstudianteCurso
    void inscribirEstudianteCurso(Estudiante estudiante, int idEstudiante);

    //desinscribirEstudianteCurso
    void desinscribirEstudianteCurso(int idEstudiante, int idCurso );
}
