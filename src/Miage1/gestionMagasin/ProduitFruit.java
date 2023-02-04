package Miage1.gestionMagasin;


import java.util.Date;

public class ProduitFruit extends ProduiAgricole  {

	  public ProduitFruit(int id, String libelle, float prix, double quantite, String saison) {
	        super(id, libelle, prix, quantite, saison);
	    }


	    public ProduitFruit(int id, String libelle, String marque) {
	        super(id, libelle, marque);
	    }

	    public ProduitFruit(int id, String libelle, String marque, float prix, Date datefab) {
	        super(id, libelle, marque, prix, datefab);
	    }

	    public ProduitFruit(int id, String libelle, float prix) {
	        super(id, libelle, prix);
	    }

	    public ProduitFruit(int id, String libelle, String marque, double quantite) {
	        super(id, libelle, marque, quantite);
	    }

	    @Override
	    public String determinerTypeProduit() {
	        return "Fruit";
	    }


	    @Override
	    public boolean estFrais(String saison) {
	        return this.getSaison().equalsIgnoreCase(saison);
	    }
}