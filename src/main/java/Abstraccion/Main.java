/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

/**
 *
 * @author abi_h
 */
public class Main {
    public static void main(String[] args){
        Planta planta = new Planta();
        planta.alimentarse();
        
        AnimalCarnivoro animalCarnivoro = new AnimalCarnivoro();
        animalCarnivoro.alimentarse();
        
        AnimalHervivoro animalHervivoro = new AnimalHervivoro();
        animalHervivoro.alimentarse();
    }
}
