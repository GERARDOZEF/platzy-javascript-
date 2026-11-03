package platzi.play;

import platzi.play.plataforma.Usuario;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hola mundo ");

        Pelicula pelicula = new Pelicula();
        pelicula.titulo = " el señor de los anillos ";
        pelicula.fechaEstreno = LocalDate.of(2026,10,15);
        pelicula.genero = " fantasia " ;
        pelicula.calificar(4.5);


        System.out.println(pelicula.fichaTecnica());
        Usuario usuario = new Usuario();
                usuario.nombre =" juan";
 usuario.ver(pelicula);
//        Scanner scaner = new Scanner(System.in);
//        System.out.println(" cual es tu nombre: ");
//
//        String nombre = scaner.nextLine();
//        System.out.println("hola " + nombre + " este es un hola ");
//        System.out.println("dame tu edad ");
//        int edad = scaner.nextInt();
//        System.out.println("tu edad es : "+ edad    );
    }



}

