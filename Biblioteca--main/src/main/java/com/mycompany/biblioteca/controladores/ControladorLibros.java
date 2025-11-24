/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.biblioteca.controladores;

import com.mycompany.biblioteca.libros.Estado;
import com.mycompany.biblioteca.libros.Estanterias;
import com.mycompany.biblioteca.libros.Libros;
import com.mycompany.biblioteca.vistas.VistaLibros;

/**
 *
 * @author tribe
 */
public class ControladorLibros {

    private Estanterias estanteria;
    private VistaLibros vistaLibros; 

    public ControladorLibros(VistaLibros vistaLibros) {
        this.vistaLibros = vistaLibros;
        this.estanteria = new Estanterias(30);
    }

    public void mostrarVista() {
        vistaLibros.setVisible(true);
    }

    public Estado identificarEstado(String estadoLibro) {

        Estado estado = Estado.Disponible; // valor por defecto

        if ("Prestado".equalsIgnoreCase(estadoLibro)) {
            estado = Estado.Prestado;
            System.out.println("Estado: Prestado");

        } else if ("Reservado".equalsIgnoreCase(estadoLibro)) {
            estado = Estado.Reservado;
            System.out.println("Estado: Reservado");

        } else if ("Disponible".equalsIgnoreCase(estadoLibro)) {
            estado = Estado.Disponible;
            System.out.println("Estado: Disponible");
        }

        return estado;
    }

    // Método para asignar un libro
    public void controladorAsignarLibro() {
        try {
            int codigo = Integer.parseInt(vistaLibros.getTxtCodigo());
            String titulo = vistaLibros.getTxtTitulo();
            String autor = vistaLibros.getTxtAutor();
            String genero = vistaLibros.getTxtGenero();
            String estadoLibros = vistaLibros.getTxtEstado();
            Estado estados = identificarEstado(estadoLibros);

            Libros nuevoLibro = new Libros(
                    codigo,
                    titulo,
                    autor,
                    genero,
                    estados
            );

            boolean asignado = estanteria.asignarLibro(nuevoLibro);

            if (asignado) {
                System.out.println("Libro asignado correctamente");
            } else {
                System.out.println("La estantería está llena, no se pudo asignar el libro");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para consultar si un libro existe según código
    public void controladorConsultarEstanteria() {
        try {
            int codigo = Integer.parseInt(vistaLibros.getTxtCodigo());
            boolean existe = estanteria.consultarEstanteria(codigo);

            if (existe) {
                System.out.println("El libro existe en la estantería.");
            } else {
                System.out.println("El libro NO se encuentra en la estantería.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para listar libros
    public void controladorListarCompartimientos() {
        try {
            estanteria.listarCompartimiento(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
