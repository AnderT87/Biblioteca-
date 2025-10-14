/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.libros;

/**
 *
 * @author Admin
 */
public class Estanterias {
   private Libros [] libros;
   private int total;
    public Estanterias(int dimension) {
        libros = new Libros[dimension];
        total = 0;
    }
   
    public boolean asignarLibro(Libros libro){   
        if(total == libros.length){
           return false;     
        }else{
            libros[total] = libro;
            total++;
            return true;
        }
    }
   
    public boolean consultarEstanteria(int codigo){
        for (int i = 0; i < libros.length; i++) {
            if(libros[i].getCodigo() == codigo){
                return true;
            }
        }
       return false;  
    }
    
    public Libros listarCompartimiento(Libros libroso){
        for (int i = 0; i < libros.length; i++) {
            System.out.println("Libro Numero:"+(i+1)+libros[i]);
        }
        return null;
    }
    
}
