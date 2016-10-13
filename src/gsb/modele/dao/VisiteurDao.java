package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Visiteur;

public class VisiteurDao {
	public static Visiteur rechercher(String codeUnite){
		Visiteur uneVisiteur=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from UNITE where CODEUNITE='"+codeUnite+"'");
		try {
			if (reqSelection.next()) {
				uneVisiteur = new Visiteur(reqSelection.getString(1), reqSelection.getString(2));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from UNITE where CODEUNITE='"+codeUnite+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneVisiteur;
}
}