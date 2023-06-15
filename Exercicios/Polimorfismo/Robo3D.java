/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp3exercicios;

/**
 *
 * @author castr
 */


public class Robo3D extends Robo {
    private double z;

    public Robo3D(double x, double y, double z, double velMedia) {
        super(x,y,velMedia);
      
    }

    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
  

    @Override
    public double calcularTempoTrajetoria(int dX, int dY, int dZ) {
        System.out.println("Construtor Classe Robo3D");
        double distancia = Math.sqrt(Math.pow(dX - getX(), 2) + Math.pow(dY - getY(), 2) + Math.pow(dZ - getZ(), 2));
        return distancia / getVelMedia();
    }


    @Override
    public void verificarColisao(double objetoX, double objetoY, double objetoZ) {
        if (x == objetoX && y == objetoY && z == objetoZ ) {
           System.out.println("Colisão detectada em (" + x + ", " + y + ", " + z + ")");
        } else {
            System.out.println("Sem colisão em (" + x + ", " + y + ", " + z + ")");
        }
    }
     @Override
    public void moverX(double movX){
         x += movX;
         System.out.println("Robô movido na direção X. Nova posição: (" + x + ", " + y + ")");
     }
    
     @Override 
     public void moverY(double movY){
         y += movY;
         System.out.println("Robô movido na direção Y. Nova posição: (" + x + ", " + y + ")");
     }

    @Override
    public void moverZ(double movZ) {
        z += movZ;
    System.out.println("Robô movido na direção Z. Nova posição: (" + x + ", " + y + ", " + z + ")");
    }
}

    

