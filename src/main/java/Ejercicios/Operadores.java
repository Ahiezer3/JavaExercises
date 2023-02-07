/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author abi_h
 */
public class Operadores {
    public void Aritmeticos(){
        //OPERADORES ARITMETICOS
        /*
        SUMA: +
        RESTA: -
        MULTIPLICACION: *
        DIVISION: /
        MODULO: %
        */
        
       
        //COMBINACIÓN DE OPERADORES Y ASIGNACION:
        int numero = 1, y;
            numero += 5;
            numero++;
            numero--;
        
            y = ++numero; //USAR ++ COMO PREFIJO PARA INCREMENTAR Y ASIGNAR, EN LUGAR DE ASIGNAR E INCREMENTAR
    }
    
    public void claseMath(){
        double raiz = Math.sqrt(9);
        double numero = 4.56, base = 5, exponente = 2, resultado;
        double numeroAleatorio;
        
        resultado = Math.pow(base, exponente);
        
        
        System.out.println("Raiz: "+raiz);
        System.out.println("Potencia: "+resultado);
        
        resultado = Math.round(numero);
        
        System.out.println("Redondeo: "+resultado);
        
        numeroAleatorio = Math.random();
        
        System.out.println("Random: "+numeroAleatorio);
    }
}
