
package animalEntidades;

/**
 *
 * @author DAMY
 */
public class perro extends atributosAnimal{
    public String comidaPeruna;
    public String perro;

    public perro(String comidaPeruna, String perro) {
        this.comidaPeruna = comidaPeruna;
        this.perro = perro;
    }

    public perro(String comidaPeruna, String perro, String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.comidaPeruna = comidaPeruna;
        this.perro = perro;
    }

    public perro(String chiquito, int i, String chiguagua) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
 public void seAlimenta(){
        System.out.println("El animal " + perro + " " + nombre + " se alimenta de " + comidaPeruna);
    }


    
    
    
    
}
