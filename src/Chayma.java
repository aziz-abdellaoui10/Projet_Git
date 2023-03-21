import java.util.Objects;

public class Chayma {
    private int cin ;
    private  int age ;
    private String nom;
    private String prenom;

    public Chayma()
    {

    }

    public Chayma(int cin, int age, String nom, String prenom) {
        this.cin = cin;
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
    }


    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chayma chayma = (Chayma) o;
        return cin == chayma.cin && age == chayma.age && Objects.equals(nom, chayma.nom) && Objects.equals(prenom, chayma.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cin, age, nom, prenom);
    }
}
