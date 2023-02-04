package Miage1.gestionMagasin;

import java.util.Date;

public class ProduitLeguime extends ProduiAgricole {
	  public ProduitLeguime(int id, String libelle, float prix, double quantite, String saison) {
	        super(id, libelle, prix, quantite, saison);
	    }

	    public ProduitLeguime(int id, String libelle, String marque) {
	        super(id, libelle, marque);
	    }

	    public ProduitLeguime(int id, String libelle, String marque, float prix, Date datefab) {
	        super(id, libelle, marque, prix, datefab);
	    }

	    public ProduitLeguime(int id, String libelle, String marque, double quantite) {
	        super(id, libelle, marque, quantite);
	    }

	    public ProduitLeguime(int id, String libelle, float prix) {
	        super(id, libelle, prix);
	    }

	    @Override
	    public String determinerTypeProduit() {
	        return "Legumes";
	    }


	    @Override
	    public boolean estFrais(String saison) {

	        int current_saison = getmois(saison.toLowerCase());
	        int recolt_mois = getmois(this.getSaison());
	        if(current_saison == recolt_mois || (recolt_mois +1)%12 == current_saison ){
	            return true;
	        }
	        return false;
	    }

	    private static int getmois(String mois) {
	        switch(mois) {
	            case "janvier": return 0;
	            case "fèvrier": return 1;
	            case "mars": return 2;
	            case "avril": return 3;
	            case "mai": return 4;
	            case "juin": return 5;
	            case "juillet": return 6;
	            case "août": return 7;
	            case "septembre": return 8;
	            case "octobre": return 9;
	            case "nouvembre": return 10;
	            case "decembre": return 11;
	            default : return -1;
	        }
	    }


	}