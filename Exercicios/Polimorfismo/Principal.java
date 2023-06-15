/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp3exercicios;

/**
 *
 * @author castr
 */
public class Principal {
     public static void main(String[] args) {
        Robo[] robos = new Robo[4];

        // Instanciando diferentes objetos nas posições do vetor1
        robos[0] = new Robo2D(2.0, 2.0, 3.0);
        robos[1] = new Robo3D(1.6, 2.0, 3.0, 5.5);
        robos[2] = new Robo2D(2.0, 2.0, 3.0);
        robos[3] = new Robo3D(1.6, 2.0, 3.0, 5.5);

       
        for (Robo r : robos) {
            double distancia = r.calcularTempoTrajetoria(2,3,4);
            System.out.println("Distancia " + distancia);
            r.verificarColisao(2,1, 2);
            r.moverX(2);
            r.moverY(3);
            r.moverZ(2);
        }
      
    }
}
