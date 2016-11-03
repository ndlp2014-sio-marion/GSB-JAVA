package gsb.modele;

import java.sql.Date;

public class Visiteur {
	protected String matricule ;
	protected String nom;
	protected String prenom;
	protected String login;
	protected String mdp;
	protected String adresse;
	protected String telephone;
	protected Date dateentree;
	protected Unite uneUnite;
	


	public Visiteur(String matricule, String nom, String prenom, String login, String mdp, String adresse,
			String telephone, Date dateentree, Unite uneUnite) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
		this.adresse = adresse;
		this.telephone = telephone;
		this.dateentree = dateentree;
		this.uneUnite = uneUnite;
	}



	public String getMatricule() {
		return matricule;
	}



	public void setMatricule(String matricule) {
		this.matricule = matricule;
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



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getMdp() {
		return mdp;
	}



	public void setMdp(String mdp) {
		this.mdp = mdp;
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



	public Date getDateentree() {
		return dateentree;
	}



	public void setDateentree(Date dateentree) {
		this.dateentree = dateentree;
	}



	public Unite getUneUnite() {
		return uneUnite;
	}



	public void setUneUnite(Unite uneUnite) {
		this.uneUnite = uneUnite;
	}



	
	
}



