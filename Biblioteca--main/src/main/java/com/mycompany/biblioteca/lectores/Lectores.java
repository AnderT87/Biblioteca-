/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.lectores;

import com.mycompany.biblioteca.tarjeta.TipoTarjetas;

/**
 *
 * @author Admin
 */
public class Lectores {
    String horaLLegada;
    String cedula;
    TipoTarjetas tipoTarjetas;
    String barrio;

    public Lectores(String horaLLegada, String cedula, String barrio,TipoTarjetas tipoTarjetas) {
        this.horaLLegada = horaLLegada;
        this.cedula = cedula;
        this.barrio = barrio;
        this.tipoTarjetas = tipoTarjetas;
    }

    public String getHoraLLegada() {
        return horaLLegada;
    }

    public void setHoraLLegada(String horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public TipoTarjetas getTipoTarjetas() {
        return tipoTarjetas;
    }

    public void setTipoTarjetas(TipoTarjetas tipoTarjetas) {
        this.tipoTarjetas = tipoTarjetas;
    }
    
    

    public boolean LectoresEntrada(TipoTarjetas tipoTarjetas){
      return true;  
    }
    @Override
    public String toString() {
        return "Lectores{" + "horaLLegada=" + horaLLegada + ", cedula=" + cedula + ", barrio=" + barrio + '}';
    }
    
    
}
