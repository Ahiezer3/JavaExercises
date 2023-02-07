/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author abi_h
 */
public class Matrices {
    
    public void llenar(){
        int rows = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de filas de la matriz: "));
        int cols = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de columnas de la matriz: "));
        int matriz[][] = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int number = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número para la fila: '"+i+"' y columna: '"+j+"': "));
                matriz[i][j] = number;
            }
        }
        
        System.out.println("Matriz: ");
        for(int i = 0; i < rows; i++){

            for(int j = 0; j < cols; j++){
                int number = matriz[i][j];
//                System.out.print("Número para la fila: '"+i+"' y columna: '"+j+"': '"+number+"'");
                System.out.print(+number+" ");
            }
            
            System.out.println(" ");
        }
        
        for(int i = 0; i < rows; i++){
            int sumRows = 0;
            for(int j = 0; j < cols; j++){
                int number = matriz[i][j];
                sumRows = sumRows + number;
            }
            
            System.out.println(" Suma de fila: "+i+": "+sumRows);
        }
        
        for(int j = 0; j < cols; j++){
            int sumCols = 0;
            for(int i = 0; i < rows; i++){
                sumCols = sumCols + matriz[i][j];
            }
            
            System.out.println(" Suma de columna: "+j+": "+sumCols);
        }
    }
    
    public void matrizSimetrica(){
        
        int rows = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de filas de la matriz: "));
        int cols = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de columnas de la matriz: "));
        int matriz[][] = new int[rows][cols];
        boolean simetrica = false;
        int indexRows = 0;
        int indexColumns = 0;
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int number = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número para la fila: '"+i+"' y columna: '"+j+"': "));
                matriz[i][j] = number;
            }
        }
        
        System.out.println("Matriz: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int number = matriz[i][j];
                
                System.out.print(+number+" ");
            }
            
            System.out.println(" ");
        }
        
        System.out.println("Matriz interpuesta: ");
        for(int j = 0; j < cols; j++){
            for(int i = 0; i < rows; i++){
                int number = matriz[i][j];
                
                System.out.print(+number+" ");
            }
            
            System.out.println(" ");
        }
        
        if( rows == cols ){
            
            simetrica = true;
            
            while( simetrica && indexRows < rows){
                
                while( simetrica && indexColumns < cols ){
                    
                    if( matriz[indexRows][indexColumns] != matriz[indexColumns][indexRows] ){
                        simetrica = false;
                    }
                    
                    indexColumns++;
                }
                
                indexRows++;
            }
            
            if( simetrica ){
                JOptionPane.showConfirmDialog(null,"La matriz es simétrica.");
            } else {
             JOptionPane.showConfirmDialog(null,"La matriz no es simétrica.");
            }
        } else {
            JOptionPane.showConfirmDialog(null,"La matriz no es simétrica.");
        }
    }
    
    public void sumaMatrices(){
        int rows = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de filas de la matriz: "));
        int cols = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de columnas de la matriz: "));
        int matriz[][] = new int[rows][cols];

        int matriz2[][] = new int[rows][cols];
        int matriz3[][] = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int number = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número para la fila: '"+i+"' y columna: '"+j+", de la matriz 1': "));
                matriz[i][j] = number;
            }
        }
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int number = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número para la fila: '"+i+"' y columna: '"+j+"', de la matriz 2"));
                matriz2[i][j] = number;
            }
        }
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){

                matriz3[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }
        
        System.out.println("Resultado de suma de matricez 1 y 2: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int number = matriz3[i][j];
                System.out.print(+number+" ");
            }
             System.out.println(" ");
        }
    }
    
    public void matrizTanspuesta(){
        
        int rows = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de filas de la matriz: "));
        int cols = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de columnas de la matriz: "));
        int matriz[][] = new int[rows][cols];
        int matrizTranspuesta[][] = new int[cols][rows];
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int number = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número para la fila: '"+i+"' y columna: '"+j+", de la matriz 1': "));
                matriz[i][j] = number;
            }
        }
        
        //If the numbers of rows and cols are the same.
        if( rows == cols ){
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    matrizTranspuesta[j][i] = matriz[i][j];
                }
            }
        } else {
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    matrizTranspuesta[j][i] = matriz[i][j];
                }
            }
        }
         System.out.println("Matriz transpuesta: ");
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                int number = matrizTranspuesta[i][j];
                System.out.print(+number+" ");
            }
             System.out.println(" ");
        }
    }
    
    public void matrizIdentidad(){
        int matriz[][] = new int[7][7];
        
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                if(i==j){
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        
        System.out.println("Matriz identidad: ");
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                int number = matriz[i][j];
                System.out.print(+number+" ");
            }
             System.out.println(" ");
        }
    }
    
    public void matrizMarco(){
        int matriz[][] = new int[7][7];
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i==0 || i == 4 || j == 0 || j == 4){
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        
        System.out.println("Matriz marco: ");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                int number = matriz[i][j];
                System.out.print(+number+" ");
            }
             System.out.println(" ");
        }
    }
}
