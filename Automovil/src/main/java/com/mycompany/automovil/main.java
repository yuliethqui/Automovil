/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil;
//Yulieth Natalia Quiroga Alape
public class main  {
    public static void main(String[] args) {
        Automovil auto = new Automovil("raptor", "ford", 100);

        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Velocidad actual: " + auto.getVelocidadActual());

    }
}