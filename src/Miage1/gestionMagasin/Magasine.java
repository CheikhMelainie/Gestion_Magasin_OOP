package Miage1.gestionMagasin;

import java.util.ArrayList;
import Miage1.gestionMagasin.Produit;;
public class Magasine {
	private int id;
	private String adresse;
	private int capacite;
	private ListeProduits listeProduitsMagasin;
	public ListeEmploye listeEmployesMagasin;
	private static ArrayList<Magasine> ArrayMag = new ArrayList<>();
	public static int nbmagasin=0;
	
	
	


		public Magasine(int id, String adresse, int capacite, ListeProduits listeProduitsMagasin,
			ListeEmploye listeEmployesMagasin) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.capacite = capacite;
		this.listeProduitsMagasin = listeProduitsMagasin;
		this.listeEmployesMagasin = listeEmployesMagasin;
	}

		public void ajouterDansMagasin(Produit p) throws ProduitException  {
			
			ListeProduits ls=listeProduitsMagasin;
			int comp=0;
			while(ls!=null) {
				ls=ls.suiv;
			    comp++;
			}
			if(comp<5) {
			listeProduitsMagasin=ListeProduits.ajouproduit(p,listeProduitsMagasin);}
			else { throw  new ProduitException();}
		}
		
		public void sorting() throws PrixException{
			int c=0;
			ListeProduits ls = listeProduitsMagasin;
			if(ls==null){
				ListeProduits temp = ls;
				while(temp!=null){
					temp=temp.suiv;
					c++;
				}
			}
			System.out.println("No ListeProduits "+c);
			
			for(int i=0;i<c;i++){
				for(int j=0;i<c-i-1;j++){
					ListeProduits temp=ls;
					ListeProduits temp1=temp.suiv;
					float d;
					if(temp.getContenu().getPrix()>temp1.getContenu().getPrix()){
						d=temp.getContenu().getPrix();
						temp1.getContenu().setPrix(temp.getContenu().getPrix());
						temp.getContenu().setPrix(d);
					}
					temp=temp1;
					temp1=temp1.suiv;
				}
			}
			System.out.println("les produits sont trié selon le prix !");
			
			ListeProduits temp2=ls;
			   while(temp2!=null){
				   System.out.println(temp2.getContenu().getPrix() +" ");
				   temp2=temp2.suiv;
			   }
		}
		
	public void ajouterEmployer(Employe e) throws EmployerException {
			
			ListeEmploye ls=listeEmployesMagasin;
			int comp=0;
			while(ls!=null) {
				ls=ls.getSuiv();
			    comp++;
			}
			if(comp<5) {
				listeEmployesMagasin=ListeEmploye.ajouterEmploye(e,listeEmployesMagasin);}
			else { throw  new EmployerException();}
		}
		
		
		public static int getTwoMax(Magasine m1,Magasine m2) {
			int comp1=0,comp2=0; 
			ListeProduits l1=m1.listeProduitsMagasin,l2=m2.listeProduitsMagasin;
			if(l1==null) comp1=0;
			if(l2==null) comp2=0;
			while(l2!=null) {
				l2=l2.suiv;
				comp2++;
			}
			while(l1!=null) {
				l1=l1.suiv;
				comp1++;
			}
			if(comp1==comp2) {
				return 0;}
			else if(comp1>comp2)
				return m1.getId();
			else return m2.getId();
			
		}
		
		
		public static String getAllMax() {
			int x = 0,y=0;
			int k; int max=ArrayMag.get(0).getId();
			int j=0;
			while(j<ArrayMag.size()) {
			for(int i=0; i<ArrayMag.size(); i++) {
				if(i!=j) {
				k=getTwoMax(ArrayMag.get(i),ArrayMag.get(j));
				if(k==0) {k=ArrayMag.get(i).getId(); y=ArrayMag.get(i).getId();x=ArrayMag.get(j).getId();}
				if(k!=max) max=k;
				}
				}
			j++;}
			if(max==y)
			return " Max sont "+max+" et"+x;
			else
			return " Max est "+max;
			
		}

		static boolean ChercherProduit(Produit p, Magasine m)
		{
			while (m.listeProduitsMagasin != null)
			{
				if ((m.listeProduitsMagasin).getContenu().getId() == p.getId())
				return true;
				m.listeProduitsMagasin = (m.listeProduitsMagasin).suiv;
			}
			return false;
		}
		
		public static int ChercherProduit(Produit p) {
			for(int i=0; i<ArrayMag.size(); i++) {
				ListeProduits l=ArrayMag.get(i).getListeProduitsMagasin();
				while(l!=null) {
			if(p.getId()==l.getContenu().getId()) 
				return  ArrayMag.get(i).getId();
			l=l.suiv;
			}}
			return -1;
				
		}
		
		

		static void afficherListeProduits(ListeProduits a) {
			System.out.println(" \n\n");
			System.out.println("*********LA LISTE DU PRODUITS*********");
			System.out.println(" \n\n");
			System.out.println("Identifiant      |Marque         |Libelle       |Prix        |Date");
			if(a == null) {
				System.out.println("La magasin est vide !");
				
			}
			while(a != null) {
				System.out.println((a.getContenu()).getId()+ " *************** " +(a.getContenu()).getMarque()+ " ******* " +(a.getContenu()).getLibellé()+ " ******** " +(a.getContenu()).getPrix()+ " ******** " +(a.getContenu()).getFabrication());
				a = a.suiv;
			}
		}
	  
		public static void afficherMag(Magasine m) {
			System.out.println("");
			System.out.println("*********LES CARACTERISTIQUES DU MAGASIN*********");
			System.out.println("Identifiant   |Adresse      |Capacite");
			System.out.println(m.id+" **********"+"   "+m.getAdresse()+"   "+"  "+ "***"+m.getCapacite());
			afficherListeProduits(m.listeProduitsMagasin);
			
		}
		
		
		
		public static void AjouterMagasin(Magasine m) {
			ArrayMag.add(m);
		}

		
		
		public static void delProduit(Produit p,Magasine m) {
			
			if(m.listeProduitsMagasin.getContenu()==null)
				System.out.println(" LA LISTE EST VIDE");
			if(m.listeProduitsMagasin.getContenu().getId()==p.getId()) {
				m.listeProduitsMagasin=m.listeProduitsMagasin.suiv;
				afficherMag(m);
				}
			ListeProduits b=m.listeProduitsMagasin, c=b.suiv;
			for(; c!=null; b=c,c=c.suiv)
				if(c.getContenu().getId()==p.getId()) {
					b.suiv=c.suiv;
					break;
				}
			afficherMag(m);
			
		}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public int getCapacite() {
		return capacite;
	}



	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}



	public ListeProduits getListeProduitsMagasin() {
		return listeProduitsMagasin;
	}



	public void setListeProduitsMagasin(ListeProduits listeProduitsMagasin) {
		this.listeProduitsMagasin = listeProduitsMagasin;
	}



	public static int getNbmagasin() {
		return nbmagasin;
	}



	public static void setNbmagasin(int nbmagasin) {
		Magasine.nbmagasin = nbmagasin;
	}

	


  
}
