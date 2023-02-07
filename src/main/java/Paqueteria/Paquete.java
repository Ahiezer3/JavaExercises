/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paqueteria;

/**
 *
 * @author abi_h
 */
public class Paquete {
    private int numeroPaquete;
    private String dni;
    private double peso;
    private int prioridad; //0 = normal, 1 = media, 2 = alta.

    public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public String mostarDatosPaquete(){
        return "Número de paquete: "+numeroPaquete+
                "\nPeso: "+peso+
                "\nPrioridad: "+prioridad;
    }
    
    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public void setNumeroPaquete(int numeroPaquete) {
        this.numeroPaquete = numeroPaquete;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    public static int buscarPaquete(Paquete paquetes[],int numeroPaquete, int contadorPaquete){
        int indice = -1;
        
        for(int i = 0; i < contadorPaquete; i++){
            if( paquetes[i].getNumeroPaquete()== numeroPaquete ){
                indice = i;
                break;
            }
        }
        
        return indice;
    }
}
