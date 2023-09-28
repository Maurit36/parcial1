package co.edu.uniquindio.parcial1.ejercicio1;

import co.edu.uniquindio.parcial1.model.Curso;
import co.edu.uniquindio.parcial1.model.Docente;
import co.edu.uniquindio.parcial1.model.Estudiante;

public class MainEjercicio1{
    public static void main(String[] args) {
        Curso curso = inicializaDatosPrueba();
        curso.mostrarInformacionDocentes();
    }

    public static Curso inicializaDatosPrueba() {
        Estudiante estudiante1 = new Estudiante("Juan","Mora","20/06/2012",17,
                "juanmora@gmail.com",1,1.67,3.5, 2.5, 4.5, 5.0,
                4.5);
        Estudiante estudiante2 = new Estudiante("Pedro","Tevez","30/01/89",34,
                "pedrotevez@gmail.com",4,1.87, 4.5, 5.0, 3.9, 4.6,
                5.0);
        Estudiante estudiante3 = new Estudiante("Ana","Londoño","22/09/2001",28,
                "analondono@gmail.com",7,1.45, 1.5, 3.0, 2.8, 4.0,
                5.0);
        Docente docente = new Docente("Carlos", "Vanegas", 39, "carlosvanegas@gmail.com");
        Docente docenteAuxiliar = new Docente("Sofia", "Arciniegas", 29,
                "sofiaarciniegas@gmail.com");
        Curso curso = new Curso("Programacion1",2,"2N",3,"Nocturna",
                "Ingenierías", "Ingeniería de Sistemas y Computación"
                estudiante1, estudiante2, estudiante3,docente, docenteAuxiliar);
        curso.setEstudiante1(estudiante1);
        curso.setEstudiante2(estudiante2);
        curso.setEstudiante3(estudiante3);
        return curso;
    }

    private static Estudiante crearEstudiantePorConstructor(String nombre, String apellido, String fecha_nacimiento,
                                                            int edad, String correo, int semestre, double estatura,
                                                            double nota1, double nota2, double nota3, double nota4,
                                                            double nota5){
        Estudiante estudiante = new Estudiante(nombre, apellido, fecha_nacimiento, edad, correo, semestre, estatura,
                nota1, nota2, nota3, nota4, nota5);
        return estudiante;
    }
}