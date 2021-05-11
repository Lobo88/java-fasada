package Fasada;

public class realizacja implements Zamowienie {


    @Override
    public void ZgloszeniePosilku() {
        System.out.println("Kuchnia przyjmuje posilek do realizacji ");

    }

    @Override
    public void Realizacja() {
        System.out.println("Wydanie posilku po danym czasie ");

    }
}
