/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.lectores;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class RegistroLectores {
     //vector o array list de lectores

     ArrayList<Lectores> listaLectores;

     public RegistroLectores() {
         listaLectores = new ArrayList<>();
     }

     public boolean depurarLector(int cedula) {
         for (int i = 0; i < listaLectores.size(); i++) {
             if (listaLectores.get(i).getCedula() == cedula) {
                 listaLectores.remove(i);
                 return true; // Lector eliminado exitosamente
             }
         }
         return false; // Lector no encontrado
     }
     public boolean eliminarRegistro(String cedula) {
         for (int i = 0; i < listaLectores.size(); i++) {
             if (String.valueOf(listaLectores.get(i).getCedula()).equals(cedula)) {
                 listaLectores.remove(i);
                 return true; // Lector eliminado exitosamente
             }
         }
         return false; // Lector no encontrado
     }

     public Lectores buscarRegistros(int cedula) {
         for (int i = 0; i < listaLectores.size(); i++) {
             if (listaLectores.get(i).getCedula() == cedula) {
                 return listaLectores.get(i); // Lector encontrado
             }
         }
         return null; // Lector no encontrado
     }

     public Lectores buscarRegistro(String barrio) {
         for (int i = 0; i < listaLectores.size(); i++) {
             if (listaLectores.get(i).getBarrio().equalsIgnoreCase(barrio)) {
                 return listaLectores.get(i); // Lector encontrado
             }
         }
         return null; // Lector no encontrado
     }

     public int contarRegistros() {
         return listaLectores.size();   
     }

     public ArrayList<Lectores> listarRegistros() {
         return listaLectores;
     }
}

