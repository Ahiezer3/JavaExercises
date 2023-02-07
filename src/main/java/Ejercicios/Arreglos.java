/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author abi_h
 */
public class Arreglos {
    
    public void arreglos(){
        int[] arregloDeEnteros = new int[3];
        int[] arregloDeEnteros2 = {1,2,3};
        char[] letras = new char[5];
        String[] nombres = {"Abidan","Ruben","Jose","Maria","Roberto"}; 
        
        arregloDeEnteros[0] = 7;
        arregloDeEnteros[1] = 10;
        arregloDeEnteros[2] = 13;
        
        for(int i = 0; i < arregloDeEnteros.length; i++){
            System.out.println("Valor: "+arregloDeEnteros[i]);
        }
                
        System.out.println("Arreglo2: "+arregloDeEnteros2);
    
        //FOREACH
        for(String elemento:nombres){
            System.out.println("Nombre: "+elemento);
        }
    
    }
    
    
    public void ejercicio4(){
        int[] numeros = new int[10];
        int numero, contador = 0;
        
        do{
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
            numeros[contador] = numero;
            contador++;
        }while(contador < 10);
        
        for(int i = 0; i<5; i++){
            System.out.println("Número: "+numeros[i]);
            System.out.println("Número: "+numeros[(numeros.length-1)-i]);
        }
    }
    
    public void ejercicio7(){
        int[] arreglo = new int[10];
        
        int numero, contadorAscendente = 0, contadorDescendente = 0, contadorMismoNumero = 0, contador = 0;
        
        do{
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
            arreglo[contador] = numero;
            contador++;
        }while(contador < 10);
        
        for(int i = 0; i<arreglo.length; i++){
            
            if(i+1 == arreglo.length){
                break;
            }
            
           //ASCENDENTE
           if(arreglo[i] <= arreglo[i+1]){
               contadorAscendente++;
           }
           
           //DESCENDENTE
           if(arreglo[i] >= arreglo[i+1]){
               contadorDescendente++;
           }
           
           //MISMO NUMERO
           if(arreglo[i] == arreglo[i+1]){
               contadorMismoNumero++;
           }
        }
        
        if(contadorAscendente == arreglo.length-1){
            System.out.println("El arreglo está ordenado de forma ASCENDENTE.");
        } else
        
        if(contadorDescendente == arreglo.length-1){
            System.out.println("El arreglo está ordenado de forma DESCENDENTE.");
        }
        
        if(contadorMismoNumero == arreglo.length-1){
            System.out.println("El arreglo tiene el mismo numero en todas sus posiciones.");
        }
        else {
             System.out.println("El arreglo está desordenado.");
        }
        
    }
    
    /**
     * Recorrer un arreglo.
     */
    public void ejercicio8(){
        
        int[] arreglo = new int[10];
        
        Scanner scaner = new Scanner(System.in);
        
        for(int i = 0; i < 7 ; i++){
            System.out.println("Ingresa un número");
            arreglo[i] = scaner.nextInt();
        }
        
        System.out.println("Números ingresados: ");
        for(int i = 0; i < arreglo.length ; i++){
            System.out.println("Posicion: "+i+", número: "+arreglo[i]);
        }
        
        System.out.println("Ingresa un número a insertar");
        int nuevoNumero = scaner.nextInt();
        
        System.out.println("Ingresa la posición a insertar");
        int posicion = scaner.nextInt();
        
        for(int i = posicion; i < arreglo.length-1; i++){
            int numeroPosicionActual = arreglo[i];
            arreglo[i] = nuevoNumero;
            nuevoNumero = numeroPosicionActual;
        }
        
       System.out.println("Números ingresados: ");
        for(int i = 0; i < arreglo.length ; i++){
            System.out.println("Posicion: "+i+", número: "+arreglo[i]);
        }
    }
    /**
     * Desplazar una posicion en el arreglo
     */
    public void ejercicio9(){
        int[] arreglo = new int[10];
        
        Scanner scaner = new Scanner(System.in);
        
        for(int i = 0; i < 9 ; i++){
            System.out.println("Ingresa un número");
            arreglo[i] = scaner.nextInt();
        }
        
        System.out.println("Números ingresados: ");
        for(int i = 0; i < arreglo.length ; i++){
            System.out.println("Posicion: "+i+", número: "+arreglo[i]);
        }
        
       
        int posicion = 0;
        int numeroPosicionActual = arreglo[posicion];
        int numeroSiguientePosicion;
        int numeroUltimaPosicion = arreglo[arreglo.length-1];
        int indiceAuxiliar;
        for(int i = posicion; i < arreglo.length-1; i++){
            indiceAuxiliar = i+1;
            if(indiceAuxiliar <= arreglo.length-1){
                
                numeroSiguientePosicion = arreglo[indiceAuxiliar];
                arreglo[indiceAuxiliar] = numeroPosicionActual;
                numeroPosicionActual = numeroSiguientePosicion;
            }
        }
        arreglo[posicion] = numeroUltimaPosicion;
        
       System.out.println("Arreglo desplazado: ");
        for(int i = 0; i < arreglo.length ; i++){
            System.out.println("Posicion: "+i+", número: "+arreglo[i]);
        }
    }
    
     /**
     * Desplazar N posiciones en el arreglo
     */
    public void ejercicio10(){
        int[] arreglo = new int[10];
        
        Scanner scaner = new Scanner(System.in);
        
        for(int i = 0; i < 9 ; i++){
            System.out.println("Ingresa un número");
            arreglo[i] = scaner.nextInt();
        }
        
        System.out.println("Números ingresados: ");
        for(int i = 0; i < arreglo.length ; i++){
            System.out.println("Posicion: "+i+", número: "+arreglo[i]);
        }
        
        System.out.println("Ingresa la cantidad de posiciones a recorrer:");
        int posicionesARecorrer = scaner.nextInt();
        
        for(var j = 0; j < posicionesARecorrer; j++){
            
            int posicion = j;
            int numeroPosicionActual = arreglo[posicion];
            int numeroSiguientePosicion;
            int numeroUltimaPosicion = arreglo[arreglo.length-1];
            int indiceAuxiliar;
            for(int i = posicion; i < arreglo.length-1; i++){
                indiceAuxiliar = i+1;
                if(indiceAuxiliar <= arreglo.length-1){

                    numeroSiguientePosicion = arreglo[indiceAuxiliar];
                    arreglo[indiceAuxiliar] = numeroPosicionActual;
                    numeroPosicionActual = numeroSiguientePosicion;
                }
            }
            arreglo[posicion] = numeroUltimaPosicion;
        }
        
       System.out.println("Arreglo desplazado: ");
        for(int i = 0; i < arreglo.length ; i++){
            System.out.println("Posicion: "+i+", número: "+arreglo[i]);
        }
    }
    
    public void ejercicio11(){
        
        int arreglo[] = new int[10];
        
        Boolean isAsc = false;
        Scanner scan = new Scanner(System.in);
        
        do {
            for(int i = 0 ; i < 5 ; i++){
                System.out.println("Introduce un número: ");
                arreglo[i] = scan.nextInt();
            }
            
            for(int i = 0 ; i < 5 ; i++){
                
                if (arreglo[i] > arreglo[i+1] && i+1 < 5) {
                    isAsc = false;
                    
                    System.out.println("El arreglo no está ordenado de forma Ascendente. "+arreglo[i]+", "+arreglo[i+1]);
                    break;
                }
                
                if (arreglo[i] < arreglo[i+1] && i+1 < 5) {
                    isAsc = true;
                }
            }
            
        } while(isAsc == false);
        
        System.out.println("Números ordenados:");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(arreglo[i]);
        }
        
        System.out.println("Ingresa un número a insertar: ");
        int numero = scan.nextInt();
        int posicionNumero = 0;
        int j = 0;
        
        while(arreglo[j] < numero && j < 5){
            posicionNumero++;
            j++;
//            System.out.println(j);
        }
        
        for(int i = 4; i >= posicionNumero ; i--){
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[posicionNumero] = numero;
        System.out.println("Posicion: "+posicionNumero+", número: "+numero);
//        
        System.out.println("Todos los números:");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(arreglo[i]);
        }
        
    }
    
    public void ejercicio12(){
        int arreglo[] = new int[10];
        
        Boolean numeroEncontrado = false;
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0 ; i < 9 ; i++){
            System.out.println("Introduce un número: ");
            arreglo[i] = scan.nextInt();
        }
        
        System.out.println("Números:");
        for(int i = 0 ; i < 9 ; i++){
            System.out.println(arreglo[i]);
        }
        
        
        System.out.println("Ingresa un número a eliminar: ");
        int numero = scan.nextInt();
        
        for(int i = 0 ; i < 9 ; i++){
            
            if(arreglo[i] == numero){
                numeroEncontrado = true;
            }
            
            if(numeroEncontrado && i+1 < arreglo.length-1){
                arreglo[i] = arreglo[i+1];
                arreglo[i+1] = 0;
            }

        }
            
        System.out.println("Todos los números:");
        for(int i = 0 ; i < 9 ; i++){
            System.out.println(arreglo[i]);
        }
    }
    
    public void ejercicio13(){
        int arreglo[] = new int[10];
        int pares = 0, impares = 0;
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0 ; i < 9 ; i++){
            System.out.println("Introduce un número: ");
            arreglo[i] = scan.nextInt();
            
            if(arreglo[i] % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }
        
        System.out.println("Números:");
        for(int i = 0 ; i < 9 ; i++){
            System.out.println(arreglo[i]);
        }
        
        int arregloPares[] = new int[pares];
        int arregloImpares[] = new int[impares];
        pares = 0;
        impares = 0;
        for(int i = 0 ; i < 9 ; i++){
            if(arreglo[i] % 2 == 0){
                arregloPares[pares] = arreglo[i];
                pares++;
            }else{
                arregloImpares[impares] = arreglo[i];
                impares++;
            }
        }
        
        for(int i = 0 ; i < arregloPares.length ; i++){
            System.out.println("Par: "+arregloPares[i]);
        }
        
         for(int i = 0 ; i < arregloImpares.length ; i++){
            System.out.println("Impar: "+arregloImpares[i]);
        }
        
    }
    
    public void ejercicio14(){
        int arregloA[] = new int[10];
        int arregloB[] = new int[10];
        int nuevoArreglo[] = new int[20];
        
        Scanner scan = new Scanner(System.in);
        
        boolean ascA = true;
        boolean ascB = true;
        
        int indexA = 0;
        int indexB = 0;
        int indexNuevo = 0;
        
        do {
            ascA = true;
            for(int i = 0; i < 10; i++){
                System.out.println("Ingresa un número para el arreglo A: ");
                arregloA[i] = scan.nextInt();
            }
            
            for(int i = 0; i < 10; i++){
                if((i+1)<10 && arregloA[i] > arregloA[i+1]){
                    ascA = false;
                    break;
                }
            }
            
            if(ascA == false){
                System.out.println("El arreglo A no está ordenado de forma Ascendente, llenalo de nuevo.");
            }
        } while(ascA == false);
        
        do {
            ascB = true;
            for(int i = 0; i < 10; i++){
                System.out.println("Ingresa un número para el arreglo B: ");
                arregloB[i] = scan.nextInt();
            }
      
            for(int i = 0; i < 10; i++){
                if((i+1)< 9 && arregloB[i] > arregloB[i+1]){
                    ascB = false;
                    break;
                }
            }
            
            if(ascB == false){
                System.out.println("El arreglo B no está ordenado de forma Ascendente, llenalo de nuevo.");
            }
        } while(ascB == false);
        
        while(indexA < 10 && indexB < 10){
            
            if(arregloA[indexA] < arregloB[indexB]){
                nuevoArreglo[indexNuevo] = arregloA[indexA];
                indexA++;
            } else {
                nuevoArreglo[indexNuevo] = arregloB[indexB];
                indexB++;
            }
              indexNuevo++;
        } 
             
        if(indexA == 10 ){

            while(indexB < 10){
                nuevoArreglo[indexNuevo] = arregloB[indexB];
                indexB++;
                indexNuevo++;
            }
        } else {

            while(indexA < 10){
                nuevoArreglo[indexNuevo] = arregloA[indexA];
                indexA++;   
                indexNuevo++;
            }
        }
            
           
        
        System.out.println("Arreglo nuevo: ");
        
        for(int i = 0; i < 20; i++){
            System.out.println(nuevoArreglo[i]);
        }
    }
    
    public void ejercicio15(){
    
        List<Integer> array = new ArrayList<>();
        int numero = 0;
        
        Scanner scaner = new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            
            System.out.println("Ingresa un número");
            array.add(scaner.nextInt());
        
        }
        
        System.out.println("Ingresa un número a buscar");
        numero = scaner.nextInt();
        
        if( array.contains(numero)){
            System.out.println("La posición del número es: "+array.indexOf(numero));
        } else{
            System.out.println("El número no se encuentra en el arreglo.");
        }
    
    }
}
