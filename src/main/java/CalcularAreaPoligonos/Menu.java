/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalcularAreaPoligonos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author abi_h
 */
public class Menu {
    
    static ArrayList<Poligono>poligonos = new ArrayList<Poligono>();
    
    public static void main(String[]args){
        llenarPoligono();
        mostrarDatos();
    }
    
    public static void llenarPoligono(){
     
        int opcion = -1;

        while( opcion != 0 ){
            
             opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción: "+
                "\n1 Triangulo"+
                "\n2 Rectangulo"+
                 "\n0 Salir"));
             
             switch(opcion){
                 case 1:
                        llenarTrinagulo();
                     break;
                     
                 case 2:
                        llenarRectangulo();
                     break;
             
             }
        }
    }
    
    public static void llenarTrinagulo(){
        
        double lado1 = 0;
        double lado2 = 0;
        double lado3 = 0;
        
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor para el lado 1: "));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor para el lado 2: "));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor para el lado 3: "));
    
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        
        poligonos.add(triangulo);
    }
    
    public static void llenarRectangulo(){
        
        double lado1 = 0;
        double lado2 = 0;
        
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor para el lado 1: "));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor para el lado 2: "));
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        poligonos.add(rectangulo);
    }
    
    public static void mostrarDatos(){
        for(Poligono poligono : poligonos){
            System.out.println(poligono.toString());
            System.out.println("\nÁrea: "+poligono.area());
            System.out.println("\n");
        }
    }
}
