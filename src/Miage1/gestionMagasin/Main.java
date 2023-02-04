package Miage1.gestionMagasin;


import Miage1.gestionMagasin.Magasine;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {

	private static ListeProduits liste;
	private static ListeEmploye listeE;
	private static ArrayList<Magasine> ArrayMag;
	
	public static void main(String[] args) throws ParseException {
	
	       // creation des produit

        Produit p1 = new Produit(12,"banana","fruit",400,new Date(2000,8,12));
        Produit p2 = new Produit(3," voiture ","toyota",200000,new Date(2002,18,12));
        Produit p3 = new Produit(32,"shampo","clair",5000,new Date(2012,7,14));
        Produit p4 = new Produit(13,"boubou","getzner",90000,new Date(1997,8,13));
        Produit p5 = new Produit(10,"ordinateur","Macbook",350000,new Date(2022,1,12));
        
        // creation des employee

        Caissier c1 = new Caissier(1, "cheikh", "soukouk", 12, 17768);
		Caissier c2 = new Caissier(2, "Ahmed", "Ain taleh", 102, 17769);
		Caissier c3 = new Caissier(3, "peti", "NDB", 112, 1770);
		Vendeur v1 = new Vendeur(1, "Ali", "trarza", 24, 11.1);
		Vendeur v2 = new Vendeur(2, "sidi", "pique", 12, 10.1);
		Vendeur v3 = new Vendeur(3, "mohamed", "melah", 72, 13.1);
		Vendeur v4 = new Vendeur(4, "oumar", "ksar", 8, 20.1);
		Responsable r1 = new Responsable(1, "toutou", "soukouk", 24, 2000.0);
		Responsable r2 = new Responsable(1, "aicha", "dar el barka", 124, 1200.0);
        
		//creation des magasin
		Magasine m1 = new Magasine(1, "soukouk", 1200, liste,listeE);
		Magasine m2 = new Magasine(2, "teyart", 1000, liste,listeE);
		Magasine m3 = new Magasine(3, "ksar", 1200, liste,listeE);
		Magasine m4 = new Magasine(4, "melah", 1300, liste,listeE);
		
		
		
     // ajout des produit dans les magasin
        try {
            m1.ajouterDansMagasin(p1);
            m2.ajouterDansMagasin(p2);
            m2.ajouterDansMagasin(p3);
            m3.ajouterDansMagasin(p4);
            m3.ajouterDansMagasin(p5);

        }catch (Exception e){
            e.printStackTrace();

        }
        
     // ajouter les employer dans les magasin
        try {
            m1.ajouterEmployer(c1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            m1.ajouterEmployer(c2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            m1.ajouterEmployer(r1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            m1.ajouterEmployer(v1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            m2.ajouterEmployer(v2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            m2.ajouterEmployer(v3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            m2.ajouterEmployer(v4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            m2.ajouterEmployer(r2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            m2.ajouterEmployer(c3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
     // affichage des magasin

         m1.afficherMag(m1);
         m2.afficherMag(m2);
         System.out.println();
         System.out.println();
         
      // compareson des produit

         Produit p7 = new Produit(12,"banana","fruit",400,new Date(2020,12,12));
         Produit p6 = new Produit(11,"banana","fruit",400,new Date(2020,12,12));
         // affichon les deux produit
         p6.affich();
         p7.affich();
         System.out.println();
         System.out.println();
         
         System.out.println("les produit sont egaux? "+ p1.comparer(p6,p7));

         System.out.println();
         System.out.println();
		

         // methode getAllMax pour comparer les magasin
         Magasine.AjouterMagasin(m1);
         Magasine.AjouterMagasin(m2);
         Magasine.AjouterMagasin(m3);
         Magasine.AjouterMagasin(m4);
         System.out.println("la magasin la plus grande des magasins est :");
         System.out.println(" " + Magasine.getAllMax());
         
        // recherche des produits dans une magasin
         System.out.println("le produit est dans la magasin ? :" + m1.ChercherProduit(p1));//contraire p6
         System.out.println();
         System.out.println();
         
         //supprimer un produit d'une magasin
         System.out.println("magasin avant la supresion d'un produit");
         m2.afficherMag(m2);
         
         m1.delProduit(p2, m2);
         System.out.println("magasin apres la supresion d'un produit");
         m2.afficherMag(m2);
         
       // creation d'une liste chainnes des produits agricole
         ProduiAgricole pr1 =  new ProduitFruit(1254,"Fraise", 300,12.3,"Mars");
         ProduiAgricole pr2 =  new ProduitFruit(1224,"pasteque", 120,50,"Juin");
         ProduiAgricole pr3 =  new ProduitFruit(7896,"mandarine", 100,25.6,"Decembre");
         ProduiAgricole pr4 =  new ProduitLeguime(8521,"artichauts", 120,14,"janvier");
         
         
      // Ajout des produits precedent dans un magasin

         try {
             m1.ajouterDansMagasin(pr1);
             m1.ajouterDansMagasin(pr2);
             m1.ajouterDansMagasin(pr3);
             m1.ajouterDansMagasin(pr4);
         }catch (ProduitException e){
             e.printStackTrace();
         }
         
         // types des produit
          m1.afficherMag(m1);
          
          System.out.println();
          System.out.println();
          Produit prd1 = new ProduitAlimantaire(1021,"Lait", "Delice");
          Produit prd2 = new ProduitAlimantaire(2510,"Yaourt", "Vitalait");
          ProduitLeguime prd3 = new ProduitLeguime(3250,"Tomate", "Sicame",1200);
          
          prd1.affich();
          prd2.affich();
          prd3.affich();
         
         // modification des prix de lait
           try {
               System.out.println("\n Produit lait apres la modification ");
              prd1.setPrix(30);
           } catch (PrixException e) {
               e.printStackTrace();
           }

           prd1.affich();
           prd1.setFabrication(new Date(2022,12,12));
           prd2.setFabrication(new Date(2015,10,12));
           
           try {
               prd2.setPrix(120);
           } catch (PrixException e) {
               e.printStackTrace();
           }
           prd3.setSaison("Octobre");
           // appret la complemantation des information
           System.out.println("appret la complemantation des information");
           
            prd1.affich();
            prd2.affich();
            prd3.affich();
            System.out.println();
            System.out.println();
            
            try {
                m2.ajouterDansMagasin(prd1);
                m2.ajouterDansMagasin(prd2);
                m3.ajouterDansMagasin(prd3);
            } catch (ProduitException e) {
                e.printStackTrace();
            }

            System.out.println(prd1.toString());
            System.out.println(prd2.toString());
            System.out.println(prd3.toString());
            
          //les produits expires
            System.out.println("les produits expires sont : "+ p1.est_expirer());
            

            ProduiAgricole pr6 =  new ProduitLeguime(2,"BMN",2500,44,"mars");
            System.out.println("les produits frais sont : "+pr6.estFrais("Avril"));//retourn true si la saison mat5a6at 1 mois aprés saision li v paramétre
            System.out.println("les produits frais sont : "+pr2.estFrais("Juin"));//va retourné true si la date est identique et si non retourne false
            
            System.out.println("\n");
            /***********************Calcule du salaire ***********************/
    		System.out.println("le salaire de caissier 1 "+c1.CalculeSalaire());
    		System.out.println("le salaire de caissier 2 "+c2.CalculeSalaire());
    		System.out.println("le salaire de caissier 3 "+c3.CalculeSalaire());
    		System.out.println("le salaire de vendeur 1 "+v1.CalculeSalaire());
    		System.out.println("le salaire de vendeur 2 " +v2.CalculeSalaire());
    		System.out.println("le salaire de vendeur 3 "+v3.CalculeSalaire());
    		System.out.println("le salaire de responsable 1 "+r1.CalculeSalaire());
    		System.out.println("le salaire de responsable 2 "+r2.CalculeSalaire());
         
    		System.out.println("\n");
    		//methode trie verifier le avec prd3 en chanant les paramétre
    		try {
				m1.sorting();
			} catch (PrixException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
	}
}
