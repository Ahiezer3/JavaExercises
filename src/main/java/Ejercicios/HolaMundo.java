
package Ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author abi_h
 */
public class HolaMundo {
    
    public static void main(String[] arg){
//        System.out.println("Hola Mundo");
        
        //HolaMundo varHolaMundo = new HolaMundo();
        //Operadores operadores = new Operadores();
        //operadores.claseMath();
        
        //Ejercicio_1 ejercicio1 = new Ejercicio_1();
        //ejercicio1.Ejercicio_1();
        
       //Ejercicio_2 ejercicio2 = new Ejercicio_2();
        //ejercicio2.Ejercicio_2();
        //Ejercicio_4 ejercicio4 = new Ejercicio_4();
        //ejercicio4.ejercicio4();
        
//        Ejercicio_5 ejercicio5 = new Ejercicio_5();
        //ejercicio5.binomioCuadradoPerfecto();
        
        //ejercicio5.adivinarNumero();
        //ejercicio5.productoNumerosImpares();
        //varHolaMundo.tiposDatosNoPrimitivos();
        //varHolaMundo.constantes();
        //varHolaMundo.EntradaSalidaDatos();
        //varHolaMundo.EntradaSalidaJoptionPane();
                
       //CalcularFactorial factorial = new CalcularFactorial();
       //factorial.factorial();
       
//       Arreglos arreglos = new Arreglos();
       //arreglos.arreglos();
       //arreglos.ejercicio4();
//       arreglos.ejercicio7();
//        arreglos.ejercicio8();
//        arreglos.ejercicio9();
//          arreglos.ejercicio10();
//        arreglos.ejercicio11();
//        arreglos.ejercicio12();
//          arreglos.ejercicio13(); 
//            arreglos.ejercicio14();
//        arreglos.ejercicio15();

//        Ordenamiento ord = new Ordenamiento();
//        ord.burbuja();1
//        ord.insercion();
//          ord.seleccion();

//            Busquedas search = new Busquedas();
//            search.secuencial();
//                search.binaria();
           Matrices matriz = new Matrices();
//           matriz.llenar();
//            matriz.matrizSimetrica();
//            matriz.sumaMatrices();
//            matriz.matrizTanspuesta();
//              matriz.matrizIdentidad();
            matriz.matrizMarco();
    }
    
    public void tiposDatosPrimitivos(){
    //TIPOS DE DATOS PRIMITIVOS
        byte entero;
        short enteroS;
        int enteroI;
        long enteroL;
        
        float flotante;
        double doble;
        
        char caracter  = 'a';
        boolean bandera = false;
        
        entero = 127;
        enteroS = 12345;
        enteroI = 123456;
        enteroL = 1234567849;
        
        flotante = 3.45f;
        doble = 123.123456789;
        
        System.out.println("Número:  "+doble);
        System.out.println("Texto:  "+caracter);
        System.out.println("Desición: "+bandera);
    }
    
    public void tiposDatosNoPrimitivos(){
        //TIPOS DE DATOS NO PRIMITIVOS
        //PERMITEN GUARDAR VALORES NULOS
        
        Integer numero = null;
        String cadena = "Hola que tal.";
        
        System.out.println("Numero: "+numero);
        System.out.println("Cadena: "+cadena);
            
    }
    
    public void constantes(){
        
        int numero = 10;
        final int constante = 12;
        
        System.out.println("Constante: "+constante);
    }
    
    public void EntradaSalidaDatos(){
        
        
        Scanner entrada = new Scanner(System.in);
        
        int entero;
        float flotante;
        double doble;
        String cadena;
        char letra;
        
        System.out.println("Ingresa un valor");
        //entero = entrada.nextInt();
        //flotante = entrada.nextFloat();
        //doble = entrada.nextDouble();
        //cadena = entrada.nextLine();
        letra = entrada.next().charAt(2);
        
        System.out.println("El valor es: "+letra);
        
    }
    
    public void EntradaSalidaJoptionPane(){
    
        int entero;
        double doble;
        String cadena;
        char letra;
        
        
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un entero: "));
        doble = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero double: "));
        cadena = JOptionPane.showInputDialog("Ingresa una cadena");
        letra = JOptionPane.showInputDialog("Ingresa una letra").charAt(0);
        
        JOptionPane.showMessageDialog(null, entero);
        JOptionPane.showMessageDialog(null, doble);
        JOptionPane.showMessageDialog(null, cadena);
        JOptionPane.showMessageDialog(null, letra);
                
    }
    
    
}
