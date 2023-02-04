package Miage1.gestionMagasin;


public class PrixException extends  Exception{
    public PrixException(){
        super("le prix n'est pas dans l'interval [0,1000]");
    }
}