package Miage1.gestionMagasin;
import Miage1.gestionMagasin.Magasine;

public abstract class Employe {
		
		private int identifiant;
		private String nom;
		private String adresse;
		private int nbr_heures;
		public static int compteur=0;

		public Employe(int identifiant, String nom, String adresse, int nbr_heures) {
				this.identifiant = identifiant;
				this.nom = nom;
				this.adresse = adresse;
				this.nbr_heures = nbr_heures;
				compteur++;
		}

		public int getIdentifiant() {
			return identifiant;
		}

		public void setIdentifiant(int identifiant) {
			this.identifiant = identifiant;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public int getNbr_heures() {
			return nbr_heures;
		}

		public void setNbr_heures(int nbr_heures) {
			this.nbr_heures = nbr_heures;
		}
		public static void AjouterEmploye(Employe emp,Magasine m) {
			ListeEmploye ls=m.listeEmployesMagasin;
			int comp=0;
			while(ls!=null) {
				ls=ls.getSuiv();
			comp++;}
			if(comp<5) {
				m.listeEmployesMagasin=ListeEmploye.ajouterEmploye(emp,m.listeEmployesMagasin);}
			else System.out.println(" Magasin contenu au maximum 5 employees");
			
		}

		@Override
		public String toString() {
			return "identifiant=" + identifiant + ", nom=" + nom + ", adresse=" + adresse + ", nbr_heures="
					+ nbr_heures ;
		}
		public abstract Double CalculeSalaire();
}