/*
 * Créé le 22 févr. 2015
 *
 * TODO Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
package gsb.modele;

/**
 * @author Isabelle
 * 22 févr. 2015
 * TODO Pour changer le modèle de ce commentaire de type généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
public class Medecin {
	protected String codeMed ;
	protected String nom;
	protected String prenom;
	protected String adresse;
	protected String telephone;
	protected String potentiel;
	protected String specialite;
	protected Localite uneLocalite;
	/**
	 * @param codeMed
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param laLocalite
	 * @param telephone
	 * @param potentiel
	 * @param specialite
	 */
	
	/**
	 * @return Renvoie codeMed.
	 */

	public Medecin(String codeMed, String nom, String prenom, String adresse, String telephone, String potentiel,
			String specialite, Localite uneLocalite) {
		super();
		this.codeMed = codeMed;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.potentiel = potentiel;
		this.specialite = specialite;
		this.uneLocalite = uneLocalite;
	}
	/**
	 * @param codeMed codeMed à définir.
	 */

	public String getCodeMed() {
		return codeMed;
	}

	public void setCodeMed(String codeMed) {
		this.codeMed = codeMed;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPotentiel() {
		return potentiel;
	}

	public void setPotentiel(String potentiel) {
		this.potentiel = potentiel;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Localite getUneLocalite() {
		return uneLocalite;
	}

	public void setUneLocalite(Localite uneLocalite) {
		this.uneLocalite = uneLocalite;
	}
	
	

}
