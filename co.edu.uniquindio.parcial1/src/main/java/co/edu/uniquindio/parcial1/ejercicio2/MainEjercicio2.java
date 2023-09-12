package co.edu.uniquindio.parcial1.ejercicio2;

import co.edu.uniquindio.parcial1.model.Atraccion;
import co.edu.uniquindio.parcial1.model.Visitante;

public class MainEjercicio2 {

    public static void main(String[] args) {
        inicializarDatosPrueba();
    }
    public static void inicializarDatosPrueba() {
        Atraccion atraccion1 = crearAtraccion("The Hulk","11 a.m. - 4 p.m.",
                "Montaña rusa extrema para adultos",17,"alto",
                1000);
        Atraccion atraccion2 = crearAtraccion("Piraticas","9 a.m. - 6 p.m.",
                "Barcos girando en ondas con música infantil",4,"bajo",
                85);
        Atraccion atraccion3 = crearAtraccion("Splash","11 a.m. - 3 p.m.",
                "Montaña rusa acuática",14,"medio",
                600);
        Atraccion atraccion4 = crearAtraccion("Baron Rojo","9 a.m. - 6 p.m.",
                "Aviones para niños que realizan giros y movimientos arriba y abajo",11,
                "bajo",
                250);
        Atraccion atraccion5 = crearAtraccion("Mini Chocones","9 a.m. - 6 p.m.",
                "Carros chocones para niños donde pueden conducir y chocar a sus compañeros",8,
                "bajo",200);
        Atraccion atraccion6 = crearAtraccion("Montaña Rusa Krater","11 a.m. - 6 p.m.",
                "Montaña rusa para adultos que realiza giros de 90°, 180° y 360°",18,
                "alto",550);
        Atraccion atraccion7 = crearAtraccion("Torre Cumbre","11 a.m. - 6 p.m.",
                "Torre que asciende 38 mts, al llegar a su punto más alto se genera una caída libre",
                16, "alto",350);
        Atraccion atraccion8 = crearAtraccion("Rueda Chicago","10 a.m. - 5 p.m.",
                "Al subirse a la rueda de chicago puede disfrutar de una espectacular vista en gondolas " +
                        "con capacidad hasta de 2 acompañantes",14,"medio",890);
        Atraccion atraccion9 = crearAtraccion("Carros Chocones","10 a.m. - 3 p.m.",
                "Carros chocones donde pueden conducir y chocar a sus compañeros",13,
                "medio",790);
        Atraccion atraccion10 = crearAtraccion("Carrusel Mundo de los Niños","9 a.m. - 6 p.m.",
                "Carrusel para niños con caballos los cuales suben y bajan en una plataforma giratoria",
                3,"bajo",200);
        Visitante visitante1 = crearVisitante("Maria Josefina","Obdulia Castro",
                25,1066349826,"adulto",
                "Femenino", 60);
        Visitante visitante2 = crearVisitante("Daniel Esteban","Londoño Burgos",
                16,1126408744,"adolescente",
                "Masculino", 65);
        Visitante visitante3 = crearVisitante("Camilo Neftaly","Pastrany Liedro",
                6,1145099123,"niño",
                "Masculino", 45);
        Visitante visitante4 = crearVisitante("Diana Maria","Cortes Flores",
                3,1128545309,"niño",
                "Femenino", 31);
        Visitante visitante5 = crearVisitante("Luz Sarita","Saavedra Rios",
                14,1045765108,"adolescente",
                "Femenino", 52);
        Visitante visitante6 = crearVisitante("Victor David","Tabares Hidalgo",
                16,1081345825,"adolescente",
                "Masculino", 64);
        Visitante visitante7 = crearVisitante("Diego Santiago","Sanabria Nieto",
                18,1036891260,"adulto",
                "Masculino", 78);
        Visitante visitante8 = crearVisitante("Laura Alejandra","Grajales Pretel",
                48,54768015,"adulto",
                "Femenino", 67);
        Visitante visitante9 = crearVisitante("Margy","Acosta Torres",
                9,1309713450,"niño",
                "Femenino", 34);
        Visitante visitante10 = crearVisitante("Kevin","Quintero Tulcan",
                13,1006876102,"adolescente",
                "Masculino", 49);
    }

    private static Atraccion crearAtraccion(String nombre, String horario_operacion, String descripcion,
                                            int rango_edad, String nivel_peligro, int peso_max_permitido){
        Atraccion atraccion = new Atraccion(nombre, horario_operacion, descripcion,
        rango_edad, nivel_peligro, peso_max_permitido);
        return atraccion;
    }

    private static Visitante crearVisitante(String nombres, String apellidos, int edad, int numero_identificacion,
                                            String tipo_visitante, String sexo, int peso) {
        Visitante visitante = new Visitante(nombres, apellidos, edad, numero_identificacion, tipo_visitante, sexo,
                peso);
        return visitante;
    }

    public static void subirAtraccionesEdad(Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccion3,
                                            Atraccion atraccion4, Atraccion atraccion5, Atraccion atraccion6,
                                            Atraccion atraccion7, Atraccion atraccion8, Atraccion atraccion9,
                                            Atraccion atraccion10, visitante4.getEdad()){
        String atraccionesEdad = obtenerSubirAtraccionesEdad(atraccion1, atraccion2, atraccion3, atraccion4, atraccion5,
                atraccion6, atraccion7, atraccion8, atraccion9, atraccion10, visitante4, edad);
        System.out.println ("Según la edad del visitante # 4, se puede subir a la atracción: " + atraccionesEdad);
    }

    private static String obtenerSubirAtraccionesEdad (Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccion3,
                                                       Atraccion atraccion4, Atraccion atraccion5, Atraccion atraccion6,
                                                       Atraccion atraccion7, Atraccion atraccion8, Atraccion atraccion9,
                                                       Atraccion atraccion10, Visitante visitante4, int edad){
        String subirAtraccionesEdad = "";
        if (edad >= 3 && <= 10){
            subirAtraccionesEdad = atraccion2 + atraccion5 + atraccion10;
        } else if (edad >= 11 && edad <= 17){
            subirAtraccionesEdad = atraccion2 + atraccion5 + atraccion10 + atraccion1 + atraccion3 + atraccion4 +
                    atraccion7 + atraccion8 + atraccion9;
        }
        else
            subirAtraccionesEdad = atraccion1 + atraccion3 + atraccion4 + atraccion7 + atraccion8 + atraccion9 +
                    atraccion6;
        return subirAtraccionesEdad;
    }
}