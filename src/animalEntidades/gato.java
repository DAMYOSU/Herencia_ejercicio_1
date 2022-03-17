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
public class gato extends atributosAnimal{
    
   public String comidaGatuna;
   public String gato;

    public gato(String comidaGatuna, String gato) {
        this.comidaGatuna = comidaGatuna;
        this.gato = gato;
    }

    public gato(String comidaGatuna, String gato, String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.comidaGatuna = comidaGatuna;
        this.gato = gato;
    }
   
    public void seAlimenta(){
        System.out.println("El animal " + gato + " " + nombre + " se alimenta de " + comidaGatuna);
    }
   
   
    
}
