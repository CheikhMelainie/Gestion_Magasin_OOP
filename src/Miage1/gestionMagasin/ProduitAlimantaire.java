package Miage1.gestionMagasin;

import java.util.Date;

public class ProduitAlimantaire extends Produit {
	

    public ProduitAlimantaire(int id, String libelle, String marque, float prix, Date datefab) {
        super(id, libelle, marque, prix, datefab);
    }

    public ProduitAlimantaire(int id, String libelle, float prix) {
        super(id, libelle, prix);
    }

    public ProduitAlimantaire(int id, String libelle, String marque) {
        super(id, libelle, marque);
    }


    @Override
    public String toString() {
        return "ProduitAlimantaire{" +
                "id=" + getId() +
                ", libelle='" + getLibellé() + '\'' +
                ", marque='" + getMarque() + '\'' +
                ", prix=" + getPrix() +
                ", datefab=" + getFabrication() +
                '}';
    }

    public  void affich(){
        System.out.println(toString());
    }

}

