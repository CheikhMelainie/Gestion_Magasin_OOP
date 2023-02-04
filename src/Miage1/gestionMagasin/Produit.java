package Miage1.gestionMagasin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Produit {
    private int id;
    private String libell�;
    private String marque;
    private float prix;
    private Date fabrication;
    public static int nbproduit=0;
    
	//Constructeur
	public Produit(int id, String libell�, String marque, float prix, Date fabrication) {
		super();
		this.id = id;
		this.libell� = libell�;
		this.marque = marque;
		this.prix = prix;
		this.fabrication = fabrication;
		nbproduit++;
		
	}
	

    public Produit(int id, String libell�, String marque) {
        this.id = id;
        this.libell� = libell�;
        this.marque = marque;
    }
    
    public Produit(int id, String libell�, float prix) {
        this.id = id;
        this.libell� = libell�;
        this.prix = prix;
    }
    

    public void setPrix(float prix) throws PrixException {
        if (prix < 0 || prix > 1000){
            throw new PrixException();
        }
        this.prix = prix;
    }
    

	public boolean comparer(Produit p1, Produit p2) {
        if (p1.id == p2.id) {
            return true;
        }
        return false;
    }
	

    public static boolean est_expirerProduit(Produit p){

        return p.est_expirer();
    }

    @SuppressWarnings("deprecation")
	public boolean est_expirer(){
        return  new Date(
                getFabrication().getYear() +1,getFabrication().getMonth(),getFabrication().getDay()
        ).compareTo(new Date()) <0;
    }
    
    

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", libelle='" + libell� + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", datefab=" + fabrication +
                '}';
    }

    public  void affich(){
        System.out.println(toString());
    }
	
    // Constructeur et autres m�thodes de la classe Produit

    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLibell�() {
		return libell�;
	}


	public void setLibell�(String libell�) {
		this.libell� = libell�;
	}

	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public float getPrix() {
		return prix;
	}


	public Date getFabrication() {
		return fabrication;
	}


	public void setFabrication(Date datefab) throws ParseException {
		this.fabrication = datefab;
	}

}


