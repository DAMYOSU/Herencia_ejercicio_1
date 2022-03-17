
package animal;

import animalEntidades.atributosAnimal;
import animalEntidades.*;

/**
 *
 * @author DAMY
 */
public class animal {

    public static void main(String[] args) {
        
        atributosAnimal perro = new perro("comidaPeruna", "perro", "mircko", "alimento", 3, "chiguagua");  
        perro.seAlimenta();
       atributosAnimal perro1 = new perro("comidaPeruna", "perro", "chiquito", "alimento", 2, "dogo");
       perro1.seAlimenta();
       
       atributosAnimal gato = new gato("comidaGatuna", "gato", "pelusa", "comidagatuna", 1, "siames");
       gato.seAlimenta();
       
       atributosAnimal caballo = new caballo("pasto", "caballo", "el guapo", "pasto", 6, "pura sangre");
       caballo.seAlimenta();
       
    }
    
}
