package subasta;

import java.util.HashSet;
import java.util.Set;

public class Subasta {
    private String id;
    private String dia;
    private Set<Lote> lotes;

    public Subasta(String id, String dia) {
        this.id = id;
        this.dia = dia;
        this.lotes = new HashSet<>();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public Set<Lote> getLotes() {
        return lotes;
    }
    public void setLotes(Set<Lote> lotes) {
        this.lotes = lotes;
    }
    public void addLotes(Lote lotes) {
        this.lotes.add(lotes);
    }

    public void cerrarSubasta(Subasta this){
        Puja pujaGanadora = null;
        for (Lote l:this.getLotes()) {
            for (Puja p:l.getPujas()) {
                if (pujaGanadora==null){
                    pujaGanadora=p;
                } else {
                    if (p.getPrecioPuja()>pujaGanadora.getPrecioPuja()){
                        pujaGanadora=p;
                    }
                }
            }
        }
        System.out.println("Lote: " + pujaGanadora.getLote() +" adjudicado a " + pujaGanadora.getPujador() + " por: " + pujaGanadora.getPrecioPuja());
    }

    @Override
    public String toString() {
        return "ID= " + id + " Dia:" + dia;
    }
}
