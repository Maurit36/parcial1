package co.edu.uniquindio.parcial1.model;

public class Atraccion {
    private String nombre;
    private String horario_operacion;
    private String descripcion;
    private int rango_edad;
    private String nivel_peligro;
    private int peso_max_permitido;
    private Atraccion atraccion1;
    private Atraccion atraccion2;
    private Atraccion atraccion3;
    private Atraccion atraccion4;
    private Atraccion atraccion5;
    private Atraccion atraccion6;
    private Atraccion atraccion7;
    private Atraccion atraccion8;
    private Atraccion atraccion9;
    private Atraccion atraccion10;

    public Atraccion(String nombre, String horario_operacion, String descripcion, int rango_edad, String nivel_peligro,
                     int peso_max_permitido, Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccion3,
                     Atraccion atraccion4, Atraccion atraccion5, Atraccion atraccion6, Atraccion atraccion7,
                     Atraccion atraccion8, Atraccion atraccion9, Atraccion atraccion10) {
        this.nombre = nombre;
        this.horario_operacion = horario_operacion;
        this.descripcion = descripcion;
        this.rango_edad = rango_edad;
        this.nivel_peligro = nivel_peligro;
        this.peso_max_permitido = peso_max_permitido;
        this.atraccion1 = atraccion1;
        this.atraccion2 = atraccion2;
        this.atraccion3 = atraccion3;
        this.atraccion4 = atraccion4;
        this.atraccion5 = atraccion5;
        this.atraccion6 = atraccion6;
        this.atraccion7 = atraccion7;
        this.atraccion8 = atraccion8;
        this.atraccion9 = atraccion9;
        this.atraccion10 = atraccion10;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario_operacion() {
        return horario_operacion;
    }

    public void setHorario_operacion(String horario_operacion) {
        this.horario_operacion = horario_operacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRango_edad() {
        return rango_edad;
    }

    public void setRango_edad(int rango_edad) {
        this.rango_edad = rango_edad;
    }

    public String getNivel_peligro() {
        return nivel_peligro;
    }

    public void setNivel_peligro(String nivel_peligro) {
        this.nivel_peligro = nivel_peligro;
    }

    public int getPeso_max_permitido() {
        return peso_max_permitido;
    }

    public void setPeso_max_permitido(int peso_max_permitido) {
        this.peso_max_permitido = peso_max_permitido;
    }

    public Atraccion getAtraccion1() {
        return atraccion1;
    }

    public void setAtraccion1(Atraccion atraccion1) {
        this.atraccion1 = atraccion1;
    }

    public Atraccion getAtraccion2() {
        return atraccion2;
    }

    public void setAtraccion2(Atraccion atraccion2) {
        this.atraccion2 = atraccion2;
    }

    public Atraccion getAtraccion3() {
        return atraccion3;
    }

    public void setAtraccion3(Atraccion atraccion3) {
        this.atraccion3 = atraccion3;
    }

    public Atraccion getAtraccion4() {
        return atraccion4;
    }

    public void setAtraccion4(Atraccion atraccion4) {
        this.atraccion4 = atraccion4;
    }

    public Atraccion getAtraccion5() {
        return atraccion5;
    }

    public void setAtraccion5(Atraccion atraccion5) {
        this.atraccion5 = atraccion5;
    }

    public Atraccion getAtraccion6() {
        return atraccion6;
    }

    public void setAtraccion6(Atraccion atraccion6) {
        this.atraccion6 = atraccion6;
    }

    public Atraccion getAtraccion7() {
        return atraccion7;
    }

    public void setAtraccion7(Atraccion atraccion7) {
        this.atraccion7 = atraccion7;
    }

    public Atraccion getAtraccion8() {
        return atraccion8;
    }

    public void setAtraccion8(Atraccion atraccion8) {
        this.atraccion8 = atraccion8;
    }

    public Atraccion getAtraccion9() {
        return atraccion9;
    }

    public void setAtraccion9(Atraccion atraccion9) {
        this.atraccion9 = atraccion9;
    }

    public Atraccion getAtraccion10() {
        return atraccion10;
    }

    public void setAtraccion10(Atraccion atraccion10) {
        this.atraccion10 = atraccion10;
    }

    public String obtenerInformacionAtraccion() {
        String informacionAtraccion = "";
        informacionAtraccion = informacionAtraccion +
                "nombre: " + getNombre() + "\n" +
                "horarioOperacion: " + getHorario_operacion() + "\n" +
                "descripcion: " + getDescripcion() + "\n" +
                "rangoedad: " + getRango_edad() + "\n" +
                "nivelPeligro: " + getNivel_peligro() + "\n" +
                "pesoMaximo: " + getPeso_max_permitido() + "\n";
        return informacionAtraccion;
    }
}