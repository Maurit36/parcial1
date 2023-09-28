package co.edu.uniquindio.parcial1.model;

public class Docente {
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;

    public static int CantidadEstudiantesNota5Mayor4 = 0;

    public Docente(String nombre, String apellido, int edad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double calcularNotaMayorDelCurso() {
        double notaMayorEst1 = 0.0;
        double notaMayorEst2 = 0.0;
        double notaMayorEst3 = 0.0;
        double notaMayorCurso = 0.0;
        notaMayorEst1 = getEstudiante1().calcularNotaMayor();
        notaMayorEst2 = getEstudiante2().calcularNotaMayor();
        notaMayorEst3 = getEstudiante3().calcularNotaMayor();
        notaMayorCurso = notaMayorEst1;

        if (notaMayorEst2 > notaMayorCurso) {
            notaMayorCurso = notaMayorEst2;
        }
        if(notaMayorEst3 > notaMayorCurso){
            notaMayorCurso = notaMayorEst3;
        }
        System.out.println("La nota mayor del curso es : " + notaMayorCurso);
    }

    private Estudiante getEstudiante1() {
    }

    private Estudiante getEstudiante2() {
    }

    private Estudiante getEstudiante3() {
    }

    public void calcularPromedioNotaMayorCurso(double notaMayorEst1, double notaMayorEst2, double notaMayorEst3){
        double promedioNotaMayorCurso = 0;
        promedioNotaMayorCurso = (notaMayorEst1 + notaMayorEst2 + notaMayorEst3) / 3;

        System.out.println("El promedio de la nota mayor del curso es : " + promedioNotaMayorCurso);
    }

    public void calcularMayorEstatura(String nombre, Estudiante estudiante1, Estudiante estudiante2,
                                       Estudiante estudiante3) {

        double mayorEstaturaEst1 = estudiante1.getEstatura();
        double mayorEstaturaEst2 = estudiante2.getEstatura();
        double mayorEstaturaEst3 = estudiante3.getEstatura();
        double mayorEstatura = mayorEstaturaEst1;

        if (mayorEstaturaEst2 < mayorEstatura) {
            mayorEstatura = mayorEstaturaEst2;
        }
        if(mayorEstaturaEst3 < mayorEstatura){
            mayorEstatura = mayorEstaturaEst3;
        }
        System.out.println("El estudiante " + nombre + "tiene la mayor estatura del curso es: " + mayorEstatura);
    }

    public void obtenerEstudianteNota5Mayor4(String nombre, Estudiante estudiante1, Estudiante estudiante2,
                                               Estudiante estudiante3){
        double nota5Mayor4Est1 = estudiante1.getNota5();
        double nota5Mayor4Est2 = estudiante2.getNota5();
        double nota5Mayor4Est3 = estudiante3.getNota5();
        double nota5Mayor = nota5Mayor4Est1;

        if (nota5Mayor4Est2 < nota5Mayor) {
            nota5Mayor = nota5Mayor4Est2;
        }
        if(nota5Mayor4Est3 < nota5Mayor){
            nota5Mayor = nota5Mayor4Est3;
        }
            System.out.println( "El estudiante " + nombre +"tiene la nota 5 mayor a 4.0");
    }

    public String obtenerInformacion() {
        String informacion = "";
        informacion = informacion +
                "nombre: "+getNombre() + "\n"+
                "apellido: "+getApellido() + "\n"+
                "edad: "+getEdad() + "\n"+
                "correo: "+getCorreo() + "\n";
        return informacion;
    }
}