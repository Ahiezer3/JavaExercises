
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author abi_h
 */
public class Ejercicio_1 {
    
    public void Ejercicio_1(){
        float nota1, nota2, nota3, resultado;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tres calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        resultado = nota1+nota2+nota3;
        
        System.out.println("Resultado: "+resultado);
    }
            
}
