/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentasBancarias;

/**
 *
 * @author abi_h
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }
    
    public double consultarSaldo(int n){
        double saldo = cuentas[n].getSaldo();
        
        return saldo;
    }
    
    public void ingresar_dinero(int n,double cantidad){
        cuentas[n].ingresarDinero(cantidad);
    }
    
    public void retirar_dinero(int n, double cantidad){
    cuentas[n].retirarDinero(cantidad);
    }
    
    public static int buscarCuenta(Cuenta cuentas[],int numeroCuenta){
        int indice = -1;
        
        for(int i = 0; i < cuentas.length; i++){
            if( cuentas[i].getNumeroCuenta() == numeroCuenta ){
                indice = i;
                break;
            }
        }
        
        return indice;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }
    
    
    
}
