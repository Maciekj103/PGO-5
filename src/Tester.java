public class Tester extends Pracownik{
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny(){
        return super.obliczKosztMiesieczny() - 300;
    }

    @Override
    public String przedstawSie(){
        return super.przedstawSie() + " Czy automatyzujący? " + czyAutomatyzujacy + " Liczba scenariuszy: " + liczbaScenariuszy;
    }

    public void uruchomRaportTestow(){
        System.out.println("Tester ma " + liczbaScenariuszy + " scenariuszy.\nTester " +
                (czyAutomatyzujacy ? "jest automatyzujący" : "nie jest automatyzujący"));
    }

    // Gettery
    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }
}