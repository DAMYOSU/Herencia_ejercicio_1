/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalEntidades;

/**
 *
 * @author DAMY
 */
public class caballo extends atributosAnimal{
    public String pasto;
    public String caballo;

    public caballo(String heno, String caballo) {
        this.pasto = heno;
        this.caballo = caballo;
    }

    public caballo(String heno, String caballo, String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.pasto = heno;
        this.caballo = caballo;
    }
    
     public void seAlimenta(){
        System.out.println("El animal " + caballo +" " + nombre + " se alimenta de " + pasto);
    }
    
    
}
