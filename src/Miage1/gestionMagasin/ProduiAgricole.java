package Miage1.gestionMagasin;


import java.util.Date;

public abstract class ProduiAgricole extends Produit implements ICritere  {

    private String saison;
    private double quantite;
    public ProduiAgricole(int id, String libelle, float prix,  double quantite, String saison ) {
        super(id, libelle, prix);
        this.quantite = quantite;
        this.saison = saison;
    }


    public ProduiAgricole(int id, String libelle, String marque, double quantite) {
        super(id, libelle, marque);
        this.quantite = quantite;
    }

    public ProduiAgricole(int id, String libelle, String marque) {
        super(id, libelle, marque);
    }

    public ProduiAgricole(int id, String libelle, String marque, float prix, Date datefab) {
        super(id, libelle, marque, prix, datefab);
    }

    public ProduiAgricole(int id, String libelle, float prix) {
        super(id, libelle, prix);
    }

    public abstract String determinerTypeProduit();

    @Override
    public String toString() {
        return "ProduiAgricole{" +
                "id=" + getId() +
                ", type='" + determinerTypeProduit() + '\'' +
                ", libelle='" + getLibellé() + '\'' +
                ", quatite='" + getQuantite() + '\'' +
                ", saision='" + getSaison() + '\'' +

                '}';
    }

    @Override
    public void affich() {
        System.out.println(toString());
    }

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }


    @Override
    public boolean est_expirer(){
        int  month = new Date().getMonth();
        return  this.estFrais(getmois(month));
    }


    private static String getmois(int month) {
        switch(month) {
            case 1: return "janvier";
            case 2 :return "fèvrier";
            case 3: return "mars";
            case 4: return "avril";
            case 5: return "mai";
            case 6 : return "juin";
            case 7: return "juillet";
            case 8: return "août";
            case 9: return  "septembre";
            case 10: return "octobre";
            case 11: return "novembre";
            case 12: return "decembre";
            default : return "";
        }
    }
}

