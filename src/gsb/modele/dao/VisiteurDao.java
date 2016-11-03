package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Visiteur;
import gsb.modele.Unite;

public class VisiteurDao {
	public static Visiteur rechercher(String matricule, Unite uneUnite){
		Visiteur uneVisiteur=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITEUR where MATRICULE='"+matricule+"'");
		try {
			if (reqSelection.next()) {
				uneUnite = UniteDao.rechercher(matricule);
				uneVisiteur = new Visiteur(reqSelection.getString(1), reqSelection.getString(2),reqSelection.getString(3),reqSelection.getString(4),reqSelection.getString(5),reqSelection.getString(6),reqSelection.getString(7),reqSelection.getDate(8),uneUnite);	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from VISITEUR where MATRICULE='"+matricule+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneVisiteur;
}
}