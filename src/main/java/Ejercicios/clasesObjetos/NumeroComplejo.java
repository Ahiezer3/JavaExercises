/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.clasesObjetos;

/**
 *
 * @author abi_h
 */
public class NumeroComplejo {
    private double a;
    private double b;

    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public NumeroComplejo calcularSuma(NumeroComplejo c){
        NumeroComplejo suma = new NumeroComplejo(a+c.getA(), b+c.getB());
        return suma;
    }
    
    public NumeroComplejo calcularProducto(NumeroComplejo c){
        NumeroComplejo producto = new NumeroComplejo((a*c.getA()-(b*c.getB())), (a*c.getB()+b*c.getA()));
        return producto;
    }
    
    public boolean compararIgualdad(NumeroComplejo c){
        if( a==c.getA() && b==c.getB() ){
            return true;
        }
        
        return false;
    }
    
    public NumeroComplejo multiplicarPorEntero(int c){
        NumeroComplejo multiplicar = new NumeroComplejo(a*c, b*c);
        return multiplicar;
    }
    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
