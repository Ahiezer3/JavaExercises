/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.clasesObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author abi_h
 */
public class MainTrianguloIsoseles {
    public static void main(String[] args){
        
        int numeroTriangulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de triángulos a registrar: "));
        int numeroTriangulo = 1;
        TrianguloIsoseles triangulos[] = new TrianguloIsoseles[numeroTriangulos];
        
        while( numeroTriangulo-1 < numeroTriangulos){
            
            float base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base del triángulo: "+numeroTriangulo));
            float lado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado del triángulo: "+numeroTriangulo));
 
            
            TrianguloIsoseles nuevoTriangulo = new TrianguloIsoseles(base,lado);
            
            triangulos[numeroTriangulo-1] = nuevoTriangulo;
            numeroTriangulo++;
            
            System.out.println("El área para el triángulo es: "+nuevoTriangulo.getArea()+", su perímetro es: "+nuevoTriangulo.getPerimetro());
        }
        
        TrianguloIsoseles mayorSuperficie = TrianguloIsoseles.mayorSuperficie(triangulos);
        
        if( mayorSuperficie != null ){
             JOptionPane.showConfirmDialog(null, "El triángulo con mayor suérficie es: "+mayorSuperficie.getArea());
            
        }else{
            JOptionPane.showConfirmDialog(null, "No se encontraron triángulos.");
        }
    }
}
