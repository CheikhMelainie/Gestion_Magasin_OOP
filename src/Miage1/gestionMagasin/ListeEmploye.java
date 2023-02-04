package Miage1.gestionMagasin;

public class ListeEmploye {
	
		
		private Employe contenu;
		private ListeEmploye suiv;

		public ListeEmploye(Employe emp, ListeEmploye listeEmp) {
			this.contenu = emp;
			this.suiv = listeEmp;
		}
		static ListeEmploye ajouterEmploye(Employe emp, ListeEmploye a)
		{
			return new ListeEmploye(emp, a);
		}
		public Employe getContenu() {
			return contenu;
		}
		public void setContenu(Employe contenu) {
			this.contenu = contenu;
		}
		public ListeEmploye getSuiv() {
			return suiv;
		}
		public void setSuiv(ListeEmploye suiv) {
			this.suiv = suiv;
		}


}
