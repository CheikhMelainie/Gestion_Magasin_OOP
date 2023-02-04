package Miage1.gestionMagasin;

public class ListeMagasin {
	private Magasine contenu;
	public ListeMagasin suiv;
	public ListeMagasin(Magasine contenu, ListeMagasin suiv) {
		super();
		this.contenu = contenu;
		this.suiv = suiv;
	}
	public Magasine getContenu() {
		return contenu;
	}
	public void setContenu(Magasine contenu) {
		this.contenu = contenu;
	}
	public ListeMagasin getSuiv() {
		return suiv;
	}
	public void setSuiv(ListeMagasin suiv) {
		this.suiv = suiv;
	}
	
	

}
