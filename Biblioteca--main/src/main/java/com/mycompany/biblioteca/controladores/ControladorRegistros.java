/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.controladores;

import com.mycompany.biblioteca.lectores.Lectores;
import com.mycompany.biblioteca.lectores.RegistroLectores;
import com.mycompany.biblioteca.tarjeta.TipoTarjetas;
import com.mycompany.biblioteca.vistas.Notificador;
import com.mycompany.biblioteca.vistas.VistaRegistro;
import java.util.ArrayList;

/**
 *
 * @author tribe
 */
public class ControladorRegistros {

    private VistaRegistro VRegistro;
    private RegistroLectores RLectores;
    private Notificador notificador;

    public ControladorRegistros(VistaRegistro VRegistro) {
        this.VRegistro = VRegistro;
        this.RLectores = new RegistroLectores();
        this.notificador = new Notificador();
    }

    public TipoTarjetas identificarTarjeta(String tipoTarjetas) {
        TipoTarjetas tipo = TipoTarjetas.Lector;
        if ("Voluntario".equals(tipoTarjetas)) {
            tipo = TipoTarjetas.Voluntario;
            System.out.println("Echo");

        } else if ("Coordinador".equals(tipoTarjetas)) {
            tipo = TipoTarjetas.Coordinador;
            System.out.println("Echos");

        } else if ("Lector".equals(tipoTarjetas)) {
            tipo = TipoTarjetas.Lector;
            System.out.println("Echoss");
        }

        return tipo;

    }

    public void controladorRegistar() {

        try {
            String horaLLegada = VRegistro.getHoraLlegada();
            String cedula = VRegistro.getCedula();
            String barrio = VRegistro.getBarrio();
            String tipoTarjeta = VRegistro.getTxtTipoTarjeta();
            TipoTarjetas tipoLectores = identificarTarjeta(tipoTarjeta);
            Lectores nuevoLector = new Lectores(
                    horaLLegada,
                    cedula,
                    barrio,
                    tipoLectores);
            boolean agregar = RLectores.registrarLector(nuevoLector);
            if (agregar == true) {
                notificador.mostrarMensaje("Lector registrado con exito");
                System.out.println("Agregado");
            } else {
                notificador.mostrarMensaje("Error al registrar el lector");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void buscarLector() {
        try {
            String Ced = VRegistro.getCedula();
            Lectores lectorBuscado = RLectores.buscarRegistros(Ced);
            if (lectorBuscado != null) {
                notificador.mostrarMensaje("Lector encontrado");
            } else {
                notificador.mostrarMensaje("Lector no encontrado");
            }

        } catch (Exception e) {
        }
    }

    public void depurarLector() {
        try {
            String Ced = VRegistro.getCedula();
            Lectores lectorBuscado = RLectores.buscarRegistros(Ced);
            if (lectorBuscado != null) {
                RLectores.depurarLector(Ced);
                notificador.mostrarMensaje("Lector eliminado");
            } else {
                notificador.mostrarMensaje("No existe");
            }
        } catch (Exception e) {
        }
    }

    public void contarRegistro() {
        int numero = RLectores.contarRegistros();
        notificador.mostrarMensaje("Número de registros: " + numero);
        System.out.println("Número de registros: " + numero);
    }

    public void listarRegistro() {
        try {
            ArrayList<Lectores> lista = RLectores.listarRegistros();

            for (Lectores lector : lista) {
                System.out.println("Cédula: " + lector.getCedula()
                        + ", Hora: " + lector.getHoraLLegada()
                        + ", Barrio: " + lector.getBarrio()
                        + ", Tipo: " + lector.getTipoTarjetas());
            }

            notificador.mostrarMensaje("Se listaron " + lista.size() + " lectores.");

        } catch (Exception e) {
            notificador.mostrarMensaje("Error al listar registros");
            e.printStackTrace();
        }
    }

}
