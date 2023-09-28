package co.edu.uniquindio.parcial1.model;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    private int edad;
    private String correo;
    private int semestre;
    private double estatura;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;

    public Estudiante(String nombre, String apellido, String fecha_nacimiento, int edad, String correo, int semestre,
                      double estatura, double nota1, double nota2, double nota3, double nota4, double nota5) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
        this.estatura = estatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
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

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }

    public double calcularNotaDefinitiva(double nota1, double nota2, double nota3, double nota4, double nota5){
        double notaDefinitiva = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        return notaDefinitiva;
    }

    public double calcularNotaMayor(double nota1, double nota2, double nota3, double nota4, double nota5) {

        double notaMayor = nota1;
        if (nota2 > notaMayor) {
            notaMayor = nota2;
        }
        if(nota3 > notaMayor) {
            notaMayor = nota3;
        }
        return notaMayor;
    }
}