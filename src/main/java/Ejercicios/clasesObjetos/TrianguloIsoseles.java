/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.clasesObjetos;

/**
 *
 * @author abi_h
 */
public class TrianguloIsoseles {

    public static TrianguloIsoseles mayorSuperficie(TrianguloIsoseles[] triangulos) {
        TrianguloIsoseles mayorSuperficieTriangulo = null;
        float mayorSuperficie = 0;
        for(int i = 0; i < triangulos.length; i++){
            
            if( i == 0 ){
                mayorSuperficie = triangulos[i].getArea();
                mayorSuperficieTriangulo = triangulos[i];
            }
            
            if( triangulos[i].getArea() > mayorSuperficie ){
                mayorSuperficie = triangulos[i].getArea();
                mayorSuperficieTriangulo = triangulos[i];
            }
        }
        
        return mayorSuperficieTriangulo;
    }
    private float base;
    private float lado;
    private float area;
    private float perimetro;
    
    public TrianguloIsoseles(float base, float lado) {
        this.base = base;
        this.lado = lado;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getArea() {
        area = (float) ((float) base*( Math.sqrt( (lado*lado) - ( ( base*base ) / 4 ) ) ))/2;
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        perimetro = lado+lado+base;
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
   
}
