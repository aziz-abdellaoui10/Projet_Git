import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListVoitures {



    private List<Voiture> voitures;

    public ListVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }

    public ListVoitures() {
        this.voitures = new ArrayList<Voiture>();
    }

    public List<Voiture> getVoitures() {

        return voitures;
    }




    public void setVoitures(List<Voiture> voitures) {
        this.voitures = voitures;
    }

    public void ajoutVoiture(Voiture v)

            throws VoitureException{

        if (v == null) {
            throw new VoitureException("La voiture à ajouter ne peut pas être null");
        }

        voitures.add(v);
    }

    public void
    supprimeVoiture(Voiture v) throws

            VoitureException{
        if (v == null) {
            throw new VoitureException("La voiture à supprimer ne peut pas être null");
        }
        if (!voitures.contains(v)) {
            throw new VoitureException("La voiture à supprimer n'existe pas dans la liste");
        }

        voitures.remove(v);
    }

    public Iterator<Voiture>
    iterateur() {
        return voitures.iterator();
    }

    public int size() {
        return voitures.size();
    }




    public void affiche() {
        for (Voiture item : voitures) {
            System.out.println(item);
        }
    }

}