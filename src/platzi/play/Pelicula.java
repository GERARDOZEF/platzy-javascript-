package platzi.play;

import java.time.LocalDate;

public class Pelicula {
    public String titulo;
//    public  string descripcion;
    public int duracion;
    public String genero;
    public int anioEstreno;
    public LocalDate fechaEstreno;
    public  boolean disponible;
    public  double calificacion;

    public void reproducir() {
        System.out.println("reproduciendo");
    }

    public  String fichaTecnica(){
        return titulo + " + (" + anioEstreno +")\n"
                + "genero " + genero +
                "calificacion\n" + calificacion + "/5";


    }
    public  void  calificar ( double calificacion){
        if (calificacion >=0 && calificacion <=5){
            this.calificacion = calificacion;
        }
    }

    public  boolean esPopular (){
        return  calificacion >= 4;
    }
}
