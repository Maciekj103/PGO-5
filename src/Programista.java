public class Programista extends Pracownik{
    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    @Override
    public double obliczKosztMiesieczny(){
        return super.obliczKosztMiesieczny() + 3000;
    }

    @Override
    public String przedstawSie(){
        return super.przedstawSie() + " Główny język programowania: " + getGlownyJezyk() + " Liczba repozytoriów: " + getLiczbaRepozytoriow();
    }

    public void wypiszTechnologie(){
        System.out.println("Jakieś technologie...");
    }

    @Override
    public String toString() {
        return "Programista{" +
                "idPracownika=" + pobierzIdPracownika() +
                "imie=" + getImie() +
                "nazwisko=" + getNazwisko() +
                "liczbaRepozytoriow=" + liczbaRepozytoriow +
                ", glownyJezyk='" + glownyJezyk + '\'' +
                '}';
    }

    // Gettery
    public String getGlownyJezyk() {
        return glownyJezyk;
    }

    public int getLiczbaRepozytoriow() {
        return liczbaRepozytoriow;
    }
}