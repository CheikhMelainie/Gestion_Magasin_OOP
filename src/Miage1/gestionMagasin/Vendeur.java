package Miage1.gestionMagasin;


public class Vendeur extends Employe{
private Double tauxDeVente;
	
	public Vendeur(int identifiant, String nom, String adresse, int nbr_heures, Double tauxDeVente) {
		super(identifiant, nom, adresse, nbr_heures);
		this.tauxDeVente = tauxDeVente;
	}

	public Double getTauxDeVente() {
		return tauxDeVente;
	}

	public void setTauxDeVente(Double tauxDeVente) {
		this.tauxDeVente = tauxDeVente;
	}

	@Override
	public String toString() {
		return "Vendeur "+super.toString()+" tauxDeVente=" + tauxDeVente + "";
	}

	@Override
	public Double CalculeSalaire() {
		// TODO Auto-generated method stub
		
			return 450*(tauxDeVente/100);
	}
	



}
