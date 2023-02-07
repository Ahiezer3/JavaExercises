/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.clasesObjetos;

/**
 *
 * @author abi_h
 */
public class Auto {
    
    private String modelo;
    private String marca;
    private float precio;

    public Auto(String modelo, String marca, float precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public static Auto masBarato(Auto autos[]){
        
        Auto masBarato = null;
        float ultimoPrecio = 0;
        for(int i = 0; i < autos.length; i++){
            
            if( i == 0 ){
                ultimoPrecio = autos[i].getPrecio();
                masBarato = autos[i];
            }
            
            if( autos[i].getPrecio() < ultimoPrecio ){
                ultimoPrecio = autos[i].getPrecio();
                masBarato = autos[i];
            }
        }
        
        return masBarato;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
   
}
