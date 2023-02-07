/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.clasesObjetos;

/**
 *
 * @author abi_h
 */
public class Tablero {
    
    private int x;
    private int y;

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int validarMovimiento(int opcion, int valor){
        
        int retorno = opcion;
        
        switch( opcion ){
            case 0 :
                retorno = 0;
                break;
                
            case 4 :
                izquierda(valor);
                break;
                
            case 6 :
                derecha(valor);
                 break;
                
            case 8 :
                arriba(valor);
                 break;
                 
            case 2 :
                abajo(valor);
                 break;
                
        }
        
        return retorno;
    }
    
    public void arriba(int incremento){
        y = y + incremento;
    }
    
    public void abajo(int incremento){
        y = y - incremento;
    }
    
    public void izquierda(int incremento){
        x = x - incremento;
    }
    
    public void derecha(int incremento){
        x = x + incremento;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
