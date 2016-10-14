package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Visiteur;
import gsb.modele.Unite;

public class VisiteurDao {
	public static Visiteur rechercher(String codeUnite, Unite uneUnite){
		Visiteur uneVisiteur=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from UNITE where CODEUNITE='"+codeUnite+"'");
		try {
			if (reqSelection.next()) {
				uneUnite = UniteDao.rechercher(codeUnite);
				uneVisiteur = new Visiteur(reqSelection.getString(1), reqSelection.getString(2),reqSelection.getString(3),reqSelection.getString(4),reqSelection.getString(5),reqSelection.getString(6),reqSelection.getString(7),reqSelection.getDate(8),reqSelection.getInt(9),uneUnite);	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from UNITE where CODEUNITE='"+codeUnite+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneVisiteur;
}
}