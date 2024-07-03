package com.literalura.practicando.principal;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
   // private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "TU-APIKEY-OMDB";
    //private ConvierteDatos conversor = new ConvierteDatos();

    public void muestraElMenu() {
        System.out.println("Elige una opción a traves de un número");
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    1 - Buscar Libro por titulo 
                    2 - Listar libros registrados 
                    3 - Listar autores registrados
                    4 - Listar autores vivos en un determinado año
                    5 - Listar libros por idioma
                                  
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                   // buscarSerieWeb();
                    break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

    }
}
