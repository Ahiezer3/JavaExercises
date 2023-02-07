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
public class Ejercicio_5 {
    
    public void ejercicio5(){
        
        final int salario = 1000;
        int numeroCarrosVendidos;
        float costoCarro;
        float salarioTotal;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el total de carros vendidos:");
        numeroCarrosVendidos = entrada.nextInt();
        
        System.out.println("Ingresa el costo de los carros:");
        costoCarro = entrada.nextFloat();
        
        salarioTotal = salario + (numeroCarrosVendidos * 150) + (0.05f * costoCarro * numeroCarrosVendidos);
        
        System.out.println("El salario del empleado es: "+salarioTotal);
        
    }
    
    
    public void binomioCuadradoPerfecto(){
        
        double valorA, valorB, resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el valor para A: ");
        valorA = entrada.nextDouble();
        
        System.out.println("Ingresa el valor para B: ");
        valorB = entrada.nextDouble();
        
        resultado = (Math.pow(valorA, 2) + Math.pow(valorB, 2) + (2*(valorA * valorB)));
        
        System.out.println("El resultado es: "+resultado);
    }
    
    public void adivinarNumero(){
        
        int numeroAleatorio;
        double numeroUsuario;
        int contador = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        numeroAleatorio = ((int)Math.random())*100;
        System.out.println("Número aleatorio: "+numeroAleatorio);
                
        numeroUsuario = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un número."));
        
        while(numeroUsuario != numeroAleatorio){
            if(numeroUsuario < numeroAleatorio){
                JOptionPane.showMessageDialog(null, "El número aleatorio es mayor.");
            } else {
                JOptionPane.showMessageDialog(null, "El número aleatorio es menor.");
            }
            numeroUsuario = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un número."));
            contador++;
        }
        
        JOptionPane.showMessageDialog(null, "Total de intentos: "+contador+" para encontrar el número aleatorio: "+numeroAleatorio);
        
        
        
        
    }
    
    public void productoNumerosImpares(){
        long producto = 1;
        
        for(int i=1; i<= 20; i+=2){
            producto *= i;
        }
        
        System.out.println("El produto es: "+producto);
    }
}
