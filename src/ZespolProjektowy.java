import java.util.ArrayList;

public class ZespolProjektowy{
    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy = new ArrayList<>();

    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
    }

    public void dodajPracownika(Pracownik pracownik){
        pracownicy.add(pracownik);
    }

    public void wypiszSkladZespolu(){
        for (Pracownik pracownik : pracownicy){
            pracownik.przedstawSie();
        }
    }

    public double policzLacznyKoszt(){
        double suma = 0;
        for (Pracownik pracownik : pracownicy){
            suma =+ pracownik.obliczKosztMiesieczny();
        }
        return suma;
    }

    public Pracownik znajdzPoId(String idPracownika){
        for (Pracownik pracownik : pracownicy){
            if (pracownik.getIdPracownika() == idPracownika) return pracownik;
        }
        return null;
    }

    public void wypiszProgramistow(){
        ArrayList<Pracownik> programisci = new ArrayList<>();

        for (Pracownik pracownik : pracownicy){
            if (pracownik instanceof  Programista) programisci.add(pracownik);
        }

        int i = 1;
        for (Pracownik programista : programisci){
            System.out.println(i + ") " +  programista.przedstawSie());
        }

    }
}