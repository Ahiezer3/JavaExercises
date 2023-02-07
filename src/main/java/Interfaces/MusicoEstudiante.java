/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author abi_h
 */
public class MusicoEstudiante implements Musico, Estudiante{

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    @Override
    public void hablar() {
        System.out.println("Hablando");
    }

    @Override
    public void estudiar() {
        System.out.println("Estudiando");
    }
    
}
