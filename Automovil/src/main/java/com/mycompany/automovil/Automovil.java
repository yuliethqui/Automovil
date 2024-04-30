/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automovil;
//Yulieth Natalia Quiroga Alape
public class Automovil {
    private String Modelo;
    private String Marca;
    private int velocidadActual;

    public Automovil(String modelo, String marca, int velocidadActual) {
        this.Modelo = modelo;
        this.Marca = marca;
        this.velocidadActual = velocidadActual;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

}
