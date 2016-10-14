package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Visite;
import gsb.modele.Medecin;
import gsb.modele.Visiteur;

public class VisiteDao {
	public static Visite rechercher(String reference, Medecin unMedecin, Visiteur unVisiteur){
		Visite uneVisite=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITE where REFERENCE='"+reference+"'");
		try {
			if (reqSelection.next()) {
				unMedecin = MedecinDao.rechercher(reqSelection.getString(4));
				unVisiteur = VisiteurDao.rechercher(reqSelection.getString(5), null);
				uneVisite = new Visite (reqSelection.getString(1),reqSelection.getString(2), reqSelection.getString(3), unMedecin, unVisiteur);
			}
		}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from VISITE where REFERENCE='"+reference+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneVisite;
}
}