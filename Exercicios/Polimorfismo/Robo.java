/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lp3exercicios;

/**
 *
 * @author castr
 */
public abstract class Robo implements ObjetoIOT{
    protected double x, y;
    protected double velMedia;

    public Robo(double x, double y, double velMedia) {
        this.x = x;
        this.y = y;
        this.velMedia = velMedia;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getVelMedia() {
        return velMedia;
    }
    public void setVelMedia(double velMedia) {
        this.velMedia = velMedia;
    }
    /*
     public void moverX(double movX){
         x += movX;
         System.out.println("Robô movido na direção X. Nova posição: (" + x + ", " + y + ")");
     }
 
     public void moverY(double movY){
         y += movY;
         System.out.println("Robô movido na direção Y. Nova posição: (" + x + ", " + y + ")");
     }*/
    public abstract double calcularTempoTrajetoria(int dX, int dY, int dZ);
    public abstract void verificarColisao(double objetoX, double objetoY, double objetoZ);
}
