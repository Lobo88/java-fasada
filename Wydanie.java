package Fasada;

public class Wydanie  implements WydanieZaplata{

    @Override
    public void WydaniePosilku() {
        System.out.println("Odbior posilku z kuchni i podanie go klientowi ");
    }

    @Override
    public void ZwrotGrzecznosciowy() {
        System.out.println("Oto Panskie zamowienie ,Zyczymy smacznego");
    }

    @Override
    public void ObserwacjaStolika() {
        System.out.println("Obserwacja stolika i podejscie po skonczonym posilku");
    }

    @Override
    public void Rachunek() {
        System.out.println("wydruk rachunku");
    }
}
