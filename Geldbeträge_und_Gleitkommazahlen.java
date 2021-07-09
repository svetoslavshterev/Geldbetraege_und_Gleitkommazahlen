class TicketAutomat
{
    private float _betrag = 0;

    public float gibBetrag()
    {
        return _betrag;
    }

    public void zahleMuenzenEin(int muenzen)
    {
        for (int i = 0; i < muenzen; i++)
        {
            zahleEineMuenzeEin();
        }
    }

    public int berechneRueckgeldInMuenzen(float preis)
    {
        float differenz = _betrag - preis;
        int muenzen = (int) Math.floor(differenz * 100);
        return muenzen;
    }

    private void zahleEineMuenzeEin()
    {
        _betrag += 0.01;
    }

    //Lösung 

    //TicketAutomat automat = new TicketAutomat();
    //automat.zahleMuenzenEin(20004);
}
