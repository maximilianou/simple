package simple.crearjavaprogramador.test;

import simple.crearjavaprogramador.entidades.Product;

public class TestCrearJavaProgramador {

    public static void main(String[] args) {
        System.out.println("Crear Buenos Aires. CrearJavaProgramador");

// Java Core Objets I
//TODO: Objets ( Source code y just text file. Mercurial )

        Product tabletpcA = new Product();
        Product tabletpcB = new Product();

//TODO: Atribute ( basic types )

        tabletpcA.name = "Samsung Galaxy Tab 10";
        tabletpcA.description = "1GHz dual-core NVIDIA Tegra 2 processor, 10.1inch widescreen 1280x800 149ppi";
        tabletpcA.amount = 500;
        
        tabletpcB.name = "IPad2";
        tabletpcB.description = "1GHz Apple A5 SoC, 9.7inch 1024×768 132ppi";
        tabletpcB.amount = 500;
        
//TODO: Method ( what a class can do? , return )

        tabletpcA.print();
        tabletpcB.print();
        
// package, import, public
        

//TODO: Encapsulate  ( preparing to change )

        
// Java Core Objets Validaciones
//TODO: Excepciones ( The system never halt whithout saying why. )

// Java Core Objetos II
//TODO: Herencia ( reutilizando codigo, familia )

//TODO: Abstracto ( luchando contra la inconsistencia )

//TODO: Interface, web, html ( toString(), toHtml(), toJson()  )
        
// Java Api I Memoria
//TODO: Collections

// Java Api II Comunicacion
//TODO: Streams	( File, FileReader, BufferedReader, Traductor, URL, HTTPConnection, Properties )

// Java Api III SQL
//TODO: JDBC ( hsqldb )

// Java Design Patterns I
//TODO: Configuration ( Singleton, Cache )

//TODO: Object Pool, Resource

        System.out.println("Crear Buenos Aires. CrearJavaProgramador Exito!!");
    }
}
