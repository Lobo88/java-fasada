package Fasada;

public class main {

    private PrzyjecieZamowienia PrzyjecieZamow = new PrzyjecieZamow();
    private  Zamowienie realizacja = new realizacja();
    private  WydanieZaplata wydanie = new Wydanie();

    public void przyjmujeZamowienie (){

        PrzyjecieZamow.Przywitaj();
        PrzyjecieZamow.PolecDanieDnia();
        PrzyjecieZamow.PrzyjmijZamowienie();
        PrzyjecieZamow.CzasOczekiwania();
    }

     public void realizujZamowienie(){

        realizacja.ZgloszeniePosilku();
        realizacja.Realizacja();

     }
    public void WydajZaplata(){
        wydanie.WydaniePosilku();
        wydanie.ZwrotGrzecznosciowy();
        wydanie.ObserwacjaStolika();
        wydanie.Rachunek();
    }

}
