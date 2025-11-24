/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author tribe
 */
public class Notificador {
    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "informacion", JOptionPane.INFORMATION_MESSAGE);
    }
}
