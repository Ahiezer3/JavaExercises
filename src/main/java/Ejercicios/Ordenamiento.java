/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author abi_h
 */
public class Ordenamiento {
    
    public void burbuja(){
        
        Scanner scan = new Scanner(System.in);
        int array[] = new int[10];
        
        for(int i= 0; i<10;i++){
            System.out.println("Ingresa un número.");
            array[i] = scan.nextInt();
        }
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int aux = array[j+1];
                
                if(aux<array[j]){
                    array[j+1] = array[j];
                    array[j] = aux;
                }
            }
        }
        
        System.out.println("Numeros ordenados:");
        for(int i= 0; i<10;i++){
            System.out.println(array[i]);
        }
    }
    
    public void insercion(){
        int array[], elementos, elemento;
        
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de numeros a ordenar."));
        array = new int[elementos];
        
        for(int i=0;i<elementos-1;i++){
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
        }
        
        for(int i=0;i<elementos;i++){
            
            int pos = i;
            int aux = array[i];
            
            while(pos>0 && aux<array[pos-1]){
               array[pos] = array[pos-1];
                
                pos--;
            }
        
            array[pos] = aux;
        }
        
        System.out.println("Números ordenados:");
        for(int i=0;i<elementos;i++){
            System.out.println(array[i]);
        }
    }
    
    public void seleccion(){
    
        int array[], elementos, elemento;
        
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de numeros a ordenar."));
        array = new int[elementos];
        
        for(int i=0;i<elementos-1;i++){
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
        }
        
        for(int i=0;i<elementos;i++){
            
            int minimo = i;
            
            for(int j=i+1;j<elementos;j++){
                
                if(array[j]<array[minimo]){
                    minimo = j;
                }
            }
            int aux = array[i];
            array[i] = array[minimo];
            array[minimo] = aux;
           
        }
        
         System.out.println("Números ordenados:");
        for(int i=0;i<elementos;i++){
            System.out.println(array[i]);
        }
    }
}
