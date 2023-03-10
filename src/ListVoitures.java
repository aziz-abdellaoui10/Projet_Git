import java.util.Iterator;
import java.util.List;

public class ListVoitures {
    private List<Voiture> voitures; public
    ListVoitures(List<Voiture> voitures) {
        //à compléter
    }
    public ListVoitures() {
        //à compléter
    }
    public List<Voiture> getVoitures() {
        //à compléter
    }
    public void setVoitures(List<Voiture>
                                    voitures) {
        //à compléter
    }

    public void ajoutVoiture(Voiture v)
            throws VoitureException{

        //à compléter
    }
    public void
    supprimeVoiture(Voiture v) throws
            VoitureException{
        // à compléter
    }
    public Iterator<Voiture>
    iterateur(){ return voitures.iterator();
    }
    public int size(){
        return voitures.size();
    }
    public void affiche(){
// à completer
    }

}