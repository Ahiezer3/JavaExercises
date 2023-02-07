/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paqueteria;

import javax.swing.JOptionPane;

/**
 *
 * @author abi_h
 */
public class Menu {
    public static void main(String[] args){
        int numeroSucursal, numeroPaquete;
        String direccion, ciudad, dni;
        double peso,precioPaquete;
        Sucursal sucursales[] = new Sucursal[50];
        int numeroSucursales =0;
        Paquete paquetes[] = new Paquete[100];
        int contadorSucursal = 0, contadorPaquete = 0;
        int opcion = -1;
        int indiceSucursal = -1;
        int indicePaquete = -1;
        int prioridad = 0;
        
        while( opcion != 0){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu"+
                    "\n 1 Ingrese la opción seleccionada: "+
                    "\n 1 Crear una nueva sucursal."+
                    "\n 2 Enviar paquete."+
                    "\n 3 Consultar sucursal."+
                    "\n 4 Consultar paquete."+
                    "\n 5 Mostrar todas las sucursales."+
                    "\n 6 Mostrar todos los paquetes."+
                    "\n 0 Salir."
                    ));
            
            switch(opcion){
                case 1:
                    numeroSucursal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la sucursal: "));
                    direccion = JOptionPane.showInputDialog("Ingrese la dirección de la sucursal: ");
                    ciudad = JOptionPane.showInputDialog("Ingrese la ciudad de la sucursal: ");
                    
                    sucursales[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
                    contadorSucursal++;
                    break;
                    
                case 2:
                    numeroSucursal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la sucursal: "));
                    indiceSucursal = Sucursal.buscarSucursal(sucursales, numeroSucursal,contadorSucursal);
                    
                    if( indiceSucursal != -1 ){
                        numeroPaquete = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del paquete: "));
                        dni = JOptionPane.showInputDialog("Ingrese el DNI del cliente: ");
                        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del paquete: "));
                        prioridad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la prioridad"));
                        
                        paquetes[contadorPaquete] = new Paquete(numeroPaquete, dni, peso, prioridad);
                        
                        precioPaquete = sucursales[indiceSucursal].calcularPrecio(paquetes[contadorPaquete]);
                    
                        JOptionPane.showConfirmDialog(null,"El precio del paquete es: "+precioPaquete);
                        
                        contadorPaquete++;
                    } else {
                        JOptionPane.showConfirmDialog(null, "La sucursal no existe.");
                    }
                    
                    break;
 
                case 3:
                    numeroSucursal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la sucursal: "));
                    indiceSucursal = Sucursal.buscarSucursal(sucursales, numeroSucursal,contadorSucursal);
                    
                    if( indiceSucursal != -1 ){
                        JOptionPane.showConfirmDialog(null, sucursales[indiceSucursal].mostrarDatosSucursal());
                    } else {
                        JOptionPane.showConfirmDialog(null, "La sucursal no existe.");
                    }
                    
                    break;
                    
                case 4:
                    numeroPaquete = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de paquete: "));
                    indicePaquete = Paquete.buscarPaquete(paquetes, numeroPaquete,contadorPaquete);
                    
                    if( indicePaquete != -1 ){
                        JOptionPane.showConfirmDialog(null, paquetes[indicePaquete].mostarDatosPaquete());
                    } else {
                        JOptionPane.showConfirmDialog(null, "El paquete no existe.");
                    }
                    
                    break;
                    
                case 5:
                    
                    String suc = "";
                    for(int i = 0; i < contadorSucursal; i++){
                    
                         suc += "\n\n"+ sucursales[i].mostrarDatosSucursal();
                    }
                    
                    JOptionPane.showConfirmDialog(null, suc);
                    break;
                    
                case 6:
                    
                    String paq = "";
                    for(int i = 0; i < contadorPaquete; i++){
                    
                         paq += "\n\n"+ paquetes[i].mostarDatosPaquete();
                    }
                    
                    JOptionPane.showConfirmDialog(null, paq);
                    break;
                    
                default : break;
            }
        }
    }
}
