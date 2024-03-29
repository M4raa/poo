package subasta;

import java.util.HashSet;
import java.util.Set;

public class Pujador {
    private String nombre;
    private Set<Puja> pujas;

    public Pujador(String nombre) {
        this.nombre = nombre;
        this.pujas = new HashSet<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Puja> getPujas() {
        return pujas;
    }
    public void setPujas(Set<Puja> pujas) {
        this.pujas = pujas;
    }
    public void addPujas(Puja pujas) {
        this.pujas.add(pujas);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
