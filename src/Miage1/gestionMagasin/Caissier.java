package Miage1.gestionMagasin;


public class Caissier extends Employe{
private int numeroDeCaisse;
	
	public Caissier(int identifiant, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
		super(identifiant, nom, adresse, nbr_heures);
		this.numeroDeCaisse = numeroDeCaisse;
	}

	public int getNumeroDeCaisse() {
		return numeroDeCaisse;
	}

	public void setNumeroDeCaisse(int numeroDeCaisse) {
		this.numeroDeCaisse = numeroDeCaisse;
	}

	@Override
	public String toString() {
		return "Caissier "+super.toString()+" numeroDeCaisse=" + numeroDeCaisse + "";
	}

	@Override
	public Double CalculeSalaire() {
		// TODO Auto-generated method stub
		if(this.getNbr_heures()<25) 
			return this.getNbr_heures()*5.0;
		return this.getNbr_heures()*5.0+(this.getNbr_heures()*5.0)*(15/100);
	}
	


}
