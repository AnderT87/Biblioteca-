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

    public boolean registrarLector(Lectores nuevoLector) {
        // Validar que no exista ya un lector con la misma cédula
        for (Lectores lector : listaLectores) {
            if (lector.getCedula().equals(nuevoLector.getCedula())) {
                return false; // Ya existe, no se puede registrar
            }
        }

        // Si no existe, se agrega
        listaLectores.add(nuevoLector);
        return true;
    }

    public boolean depurarLector(String cedula) {
    for (int i = 0; i < listaLectores.size(); i++) {
        if (String.valueOf(listaLectores.get(i).getCedula()).equals(cedula)) {
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

    public Lectores buscarRegistros(String cedula) {
    for (int i = 0; i < listaLectores.size(); i++) {
        if (listaLectores.get(i).getCedula().equals(cedula)) {
            return listaLectores.get(i);
        }
    }
    return null;
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
