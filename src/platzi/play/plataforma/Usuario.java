package platzi.play.plataforma;

import platzi.play.Pelicula;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Usuario{
    public String nombre;
    public String email;
    public LocalDateTime fechaRegistro;


    public void ver(Pelicula pelicula){
        System.out.println(nombre + " esta vieno... " + pelicula.titulo);
        pelicula.reproducir();
    }
}

