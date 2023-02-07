/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paqueteria;

import CuentasBancarias.Cuenta;

/**
 *
 * @author abi_h
 */
public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String mostrarDatosSucursal(){
        return "Número sucursal: "+numeroSucursal+
                "\nDirección: "+direccion+
                "\nCiudad: "+ciudad;
    }
    
    public double calcularPrecio(Paquete paquete){
        double precio;
        
        precio = paquete.getPeso();
        
        if(paquete.getPrioridad() == 1){
            precio+= 10;
        }
        
        if(paquete.getPrioridad() == 2){
            precio+= 20;
        }
       return precio;
    }
    
     public static int buscarSucursal(Sucursal sucursales[],int numeroSucursal, int contadorSucursal){
        int indice = -1;
        
        for(int i = 0; i < contadorSucursal; i++){
            if( sucursales[i].getNumeroSucursal()== numeroSucursal ){
                indice = i;
                break;
            }
        }
        
        return indice;
    }
}
