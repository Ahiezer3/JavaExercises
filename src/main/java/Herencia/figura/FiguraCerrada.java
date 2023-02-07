/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia.figura;

/**
 *
 * @author abi_h
 */
public class FiguraCerrada extends Figura{
    private int nLados;

    public FiguraCerrada(int nLados, double tamano) {
        super(tamano);
        this.nLados = nLados;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }
    
    public final void dibujar(){
        System.out.println("Dibujando una figura cerrada.");
    }
}
