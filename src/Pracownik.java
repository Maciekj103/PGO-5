import java.util.Objects;

public class Pracownik {

    private String idPracownika;
    private String imie;
    private String nazwisko;
    private double stawkaBazowa;

    public Pracownik(String idPracownika, String imie, String nazwisko, double stawkaBazowa) {
        this.idPracownika = idPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawkaBazowa = stawkaBazowa;
    }

    public final String pobierzIdPracownika(){
        return idPracownika;
    }

    public double obliczKosztMiesieczny(){
        return stawkaBazowa * 0.125;
    }

    public String przedstawSie(){
        return "Pracownik: " + imie + " " + nazwisko + " ID: " + idPracownika;
    }

    @Override
    public java.lang.String toString() {
        return "Pracownik{" +
                "idPracownika='" + idPracownika + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stawkaBazowa=" + stawkaBazowa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pracownik pracownik = (Pracownik) o;
        return Objects.equals(idPracownika, pracownik.idPracownika);
    }

    // Gettery
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getIdPracownika() {
        return idPracownika;
    }

    public double getStawkaBazowa() {
        return stawkaBazowa;
    }
}