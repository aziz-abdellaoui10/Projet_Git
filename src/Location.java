import java.util.Date;
import java.util.Objects;

public class Location {

    private String matricule;
    private int clientCIN;
    private Date dateLocation;
    private int dureeLocation;
    private String varConflit;
    public Location(String matricule, int clientCIN, Date dateLocation, int dureeLocation) {
        this.matricule = matricule;
        this.clientCIN = clientCIN;
        this.dateLocation = dateLocation;
        this.dureeLocation = dureeLocation;
    }
    public Location(){};

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public int getClientCIN() {
        return clientCIN;
    }

    public void setClientCIN(int clientCIN) {
        this.clientCIN = clientCIN;
    }

    public Date getDateLocation() {
        return dateLocation;
    }

    public void setDateLocation(Date dateLocation) {
        this.dateLocation = dateLocation;
    }

    public int getDureeLocation() {
        return dureeLocation;
    }

    public void setDureeLocation(int dureeLocation) {
        this.dureeLocation = dureeLocation;
    }

    @Override
    public String toString() {
        return "Location{" +
                "matricule='" + matricule + '\'' +
                ", clientCIN=" + clientCIN +
                ", dateLocation=" + dateLocation +
                ", dureeLocation=" + dureeLocation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return clientCIN == location.clientCIN && dureeLocation == location.dureeLocation && Objects.equals(matricule, location.matricule) && Objects.equals(dateLocation, location.dateLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, clientCIN, dateLocation, dureeLocation);
    }
}
