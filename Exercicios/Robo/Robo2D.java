/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lp3exercicios;


/**
 *
 * @author castr
 */
public class Robo2D extends Robo {
     public Robo2D(double x, double y, double velMedia) {
        super(x,y,velMedia);
    }
     
    @Override
    public double calcularTempoTrajetoria(int dX, int dY, int dZ) {
        System.out.println("Construtor Classe Robo2D");
        double distancia = Math.sqrt(Math.pow(dX - getX(), 2) + Math.pow(dY - getY(), 2));
        return distancia / velMedia;
    }
    
     @Override
    public void verificarColisao(double objetoX, double objetoY, double objetoZ) {
        
        if (x == objetoX && y == objetoY) {
            System.out.println("Colisão detectada em (" + x + ", " + y + ")");
        } else {
            System.out.println("Sem colisão em (" + x + ", " + y + ")");
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
       //implementação apenas no ROBO3D
    }


  

    
   
}
