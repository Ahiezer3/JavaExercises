/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentasBancarias;

import javax.swing.JOptionPane;

/**
 *
 * @author abi_h
 */
public class Menu {
    public static void main(String[] args){
        
        String nombre, apellido, dni;
        int numeroCuenta, nCuentas;
        double saldo;
        Cuenta cuentas[];
        Cliente cliente;
        
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente: ");
        dni = JOptionPane.showInputDialog("Ingrese el DNI del cliente: ");
        nCuentas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cuentas a registrar: "));
        
        cuentas = new Cuenta[nCuentas];
        
        for(int i = 0; i < cuentas.length; i++ ){
            numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta: "));
            saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo de la cuenta: "+numeroCuenta));
        
            cuentas[i] = new Cuenta(numeroCuenta, saldo);
        }
        
        cliente = new Cliente(nombre, apellido, dni, cuentas);
        
        int opcion = 0;
        
        while(opcion != 4){
            
             opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción a seleccionar: "+
                "\n 1 para ingresar dinero a la cuenta."+
                "\n 2 retirar dinero a la cuenta."+
                "\n 3 consultar saldo de la cuenta."+
                "\n 4 salir."));
             
            double cantidad = 0;
            int indiceCuenta = -1;
            
            switch(opcion){
                
                case 1:
                    numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta: "));
                    indiceCuenta = Cliente.buscarCuenta(cuentas, numeroCuenta);
                    if( indiceCuenta != -1 ){
                        cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a ingresar: "));
                        cliente.ingresar_dinero(indiceCuenta, cantidad);
                        JOptionPane.showConfirmDialog(null, "Nuevo saldo: "+cliente.consultarSaldo(indiceCuenta));
                    } else {
                        JOptionPane.showConfirmDialog(null, "Número de cuenta no encontrado.");
                    }
                    
                    break;
                    
                case 2:
                    numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta: "));
                    indiceCuenta = Cliente.buscarCuenta(cuentas, numeroCuenta);
                    if( indiceCuenta != -1 ){
                        
                        cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar: "));
                        
                        if( cantidad > cliente.consultarSaldo(indiceCuenta) ){
                            JOptionPane.showConfirmDialog(null, "Saldo insuficiente: "+cliente.consultarSaldo(indiceCuenta));
                        } else {
                            cliente.retirar_dinero(indiceCuenta, cantidad);
                            JOptionPane.showConfirmDialog(null, "Nuevo saldo: "+cliente.consultarSaldo(indiceCuenta));
                        }
                    
                    }  else {
                        JOptionPane.showConfirmDialog(null, "Número de cuenta no encontrado.");
                    }
                    
                    break;
                    
                case 3:
                    numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta a consultar: "));
                    indiceCuenta = Cliente.buscarCuenta(cuentas, numeroCuenta);
                    if( indiceCuenta != -1 ){
                        JOptionPane.showConfirmDialog(null,"Saldo disponible: "+cliente.consultarSaldo(indiceCuenta));
                    }  else {
                        JOptionPane.showConfirmDialog(null, "Número de cuenta no encontrado.");
                    }
                    
                    break;
                    
                default :
                    
                    break;
            }
        
        }
    }
}
