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

    }

    public double obliczKosztMiesieczny(){

    }

    public String przedstawSie(){

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

    
}