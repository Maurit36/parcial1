package co.edu.uniquindio.parcial1.model;

public class Visitante {
    private String nombres;
    private String apellidos;
    private int edad;
    private int numero_identificacion;
    private String tipo_visitante;
    private String sexo;
    private int peso;
    private Visitante visitante1;
    private Visitante visitante2;
    private Visitante visitante3;
    private Visitante visitante4;
    private Visitante visitante5;
    private Visitante visitante6;
    private Visitante visitante7;
    private Visitante visitante8;
    private Visitante visitante9;
    private Visitante visitante10;

    public Visitante(String nombres, String apellidos, int edad, int numero_identificacion, String tipo_visitante,
                     String sexo, int peso, Visitante visitante1, Visitante visitante2, Visitante visitante3,
                     Visitante visitante4, Visitante visitante5, Visitante visitante6, Visitante visitante7,
                     Visitante visitante8, Visitante visitante9, Visitante visitante10) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.numero_identificacion = numero_identificacion;
        this.tipo_visitante = tipo_visitante;
        this.sexo = sexo;
        this.peso = peso;
        this.visitante1 = visitante1;
        this.visitante2 = visitante2;
        this.visitante3 = visitante3;
        this.visitante4 = visitante4;
        this.visitante5 = visitante5;
        this.visitante6 = visitante6;
        this.visitante7 = visitante7;
        this.visitante8 = visitante8;
        this.visitante9 = visitante9;
        this.visitante10 = visitante10;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(int numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public String getTipo_visitante() {
        return tipo_visitante;
    }

    public void setTipo_visitante(String tipo_visitante) {
        this.tipo_visitante = tipo_visitante;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Visitante getVisitante1() {
        return visitante1;
    }

    public void setVisitante1(Visitante visitante1) {
        this.visitante1 = visitante1;
    }

    public Visitante getVisitante2() {
        return visitante2;
    }

    public void setVisitante2(Visitante visitante2) {
        this.visitante2 = visitante2;
    }

    public Visitante getVisitante3() {
        return visitante3;
    }

    public void setVisitante3(Visitante visitante3) {
        this.visitante3 = visitante3;
    }

    public Visitante getVisitante4() {
        return visitante4;
    }

    public void setVisitante4(Visitante visitante4) {
        this.visitante4 = visitante4;
    }

    public Visitante getVisitante5() {
        return visitante5;
    }

    public void setVisitante5(Visitante visitante5) {
        this.visitante5 = visitante5;
    }

    public Visitante getVisitante6() {
        return visitante6;
    }

    public void setVisitante6(Visitante visitante6) {
        this.visitante6 = visitante6;
    }

    public Visitante getVisitante7() {
        return visitante7;
    }

    public void setVisitante7(Visitante visitante7) {
        this.visitante7 = visitante7;
    }

    public Visitante getVisitante8() {
        return visitante8;
    }

    public void setVisitante8(Visitante visitante8) {
        this.visitante8 = visitante8;
    }

    public Visitante getVisitante9() {
        return visitante9;
    }

    public void setVisitante9(Visitante visitante9) {
        this.visitante9 = visitante9;
    }

    public Visitante getVisitante10() {
        return visitante10;
    }

    public void setVisitante10(Visitante visitante10) {
        this.visitante10 = visitante10;
    }

    public String obtenerInformacionVisitante() {
        String informacionVisitante = "";
        informacionVisitante = informacionVisitante +
                "nombres: " + getNombres() + "\n" +
                "apellidos: " + getApellidos() + "\n" +
                "edad: " + getEdad() + "\n" +
                "numeroIdentificacion: " + getNumero_identificacion() + "\n" +
                "tipovisitante: " + getTipo_visitante() + "\n" +
                "sexo: " + getSexo() + "\n" +
                "peso: " + getPeso() + "\n";
        return informacionVisitante;
    }
}