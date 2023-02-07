/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia.figura;

/**
 *
 * @author abi_h
 */
public class Cuadrado extends FiguraCerrada{
    private double area;

    public Cuadrado(double area, int nLados, double tamano) {
        super(nLados, tamano);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public void dibujarCuadrado(){
    
        System.out.println("Dibujando un cuadrado.");
    }
}
