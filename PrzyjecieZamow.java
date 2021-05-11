package Fasada;

class PrzyjecieZamow implements PrzyjecieZamowienia {

    @Override
    public void Przywitaj (){
        System.out.println("Witam serdecznie w restauracji Kotlecik");
    }

    @Override
    public void PolecDanieDnia() {
        System.out.println("W dzisiejszym dniu polecamy Schabowego w sosie grzybowym oraz z bukietem sałatek");
    }

    @Override
    public void PrzyjmijZamowienie() {
        System.out.println("Przyjecie zamowienia ");
    }

    @Override
    public void CzasOczekiwania() {
        System.out.println("Czas oczekiwania to 20 min ");
    }
}
