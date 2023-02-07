/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author abi_h
 */
public class Main {
    public static void main(String[] args){
        Vehiculo vehiculos[] = new Vehiculo[4];
        
        vehiculos[0] = new Vehiculo("H456", "VW", "Jetta");
        vehiculos[1] = new VehiculoTurismo(4, "GDG", "Ford", "Carrera");
        vehiculos[2] = new VehiculoDeportivo(5, "HF5", "Ferrary", "a4");
        vehiculos[3] = new VehiculoFurgoneta(2, "FS5", "GM", "KJ8");
    
    
        for(Vehiculo vehiculo : vehiculos){
            vehiculo.mostrarDatos();
        }
        
        
        //Upcasting
        Vehiculo v1 = new VehiculoTurismo(4, "GDG", "Ford", "Carrera");
        System.out.println(v1);


        //Downcasting
        VehiculoTurismo vt = (VehiculoTurismo) v1;
        System.out.println(vt);
    }
}
