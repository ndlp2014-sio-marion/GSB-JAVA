package gsb.modele;

public class Stockage {
	
	protected Medicament unMedicament;
	protected Visiteur unVisiteur;
	protected int qte;
	
	
	
	public Stockage(Medicament unMedicament, Visiteur unVisiteur, int qte) {
		super();
		this.unMedicament = unMedicament;
		this.unVisiteur = unVisiteur;
		this.qte = qte;
	}



	public Medicament getUnMedicament() {
		return unMedicament;
	}



	public void setUnMedicament(Medicament unMedicament) {
		this.unMedicament = unMedicament;
	}



	public Visiteur getUnVisiteur() {
		return unVisiteur;
	}



	public void setUnVisiteur(Visiteur unVisiteur) {
		this.unVisiteur = unVisiteur;
	}



	public int getQte() {
		return qte;
	}



	public void setQte(int qte) {
		this.qte = qte;
	}
	
	
	
}


