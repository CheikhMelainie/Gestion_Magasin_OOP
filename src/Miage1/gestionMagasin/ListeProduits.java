package Miage1.gestionMagasin;

import java.text.ParseException;

public class ListeProduits {

	private Produit contenu;
	public ListeProduits suiv;
	
	public ListeProduits(Produit p, ListeProduits l) {
		super();
		this.contenu = p;
		this.suiv = l;
	}
	
	static boolean ChercherProduit(Produit p, ListeProduits l){
		while(l != null){
			if(l.getContenu() == p){
				//l = l.suiv;
				return true;
				
			}
			
		}
		return false;
	}
	
	public static ListeProduits ajouproduit(Produit p, ListeProduits l){
		ListeProduits ls =l;
		int comp=0;
		while(ls!=null){
			ls=ls.suiv;
			comp++;
		}
		
		ListeProduits lis=l;
		int res=0;
		while(lis!=null){
			if(lis.getContenu().getId()==p.getId())
				res++;
			lis=lis.suiv;
		}
		if(comp<5 && res==0){
			return new ListeProduits(p, l);
		}else if(comp<5 && res!=0){
			System.out.println("le produit déja existe ");
			return l;
		}
		return l;
	}

	public Produit getContenu() {
		return contenu;
	}

	public void setContenu(Produit contenu) {
		this.contenu = contenu;
	}

	public ListeProduits getSuiv() {
		return suiv;
	}

	public void setSuiv(ListeProduits suiv) {
		this.suiv = suiv;
	}
	
	
}
