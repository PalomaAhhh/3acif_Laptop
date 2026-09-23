public class Laptop
{
    
    private String hersteller;
    private int kosten;
    private boolean neu;

    public Laptop()
    {
        hersteller = "Lenovo";
        kosten = 1000;
        neu = true;
    }
    
    public Laptop(String neuHersteller, int neuKosten, boolean neuNeu)
    {
        hersteller = neuHersteller;
        kosten = neuKosten;
        neu = neuNeu; 
    }
    
    public Laptop(String neuHersteller, boolean neuNeu)
    {
        hersteller = neuHersteller;
        kosten = 1000;
        neu = neuNeu; 
    }
}