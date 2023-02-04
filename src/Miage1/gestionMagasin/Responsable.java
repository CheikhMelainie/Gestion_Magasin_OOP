package Miage1.gestionMagasin;

public class Responsable extends Employe{
	private Double prime;

	public Responsable(int identifiant, String nom, String adresse, int nbr_heures, Double prime) {
		super(identifiant, nom, adresse, nbr_heures);
		this.prime = prime;
	}

	public Double getPrime() {
		return prime;
	}

	public void setPrime(Double prime) {
		this.prime = prime;
	}

	@Override
	public String toString() {
		return " Responsable "+super.toString()+" prime=" + prime + "";
	}

	@Override
	public Double CalculeSalaire() {
		// TODO Auto-generated method stub
	if(this.getNbr_heures()<20) 
		return this.getNbr_heures()*10+prime;
	return this.getNbr_heures()*10+prime+(this.getNbr_heures()*10)*(20/100);
	}
}
