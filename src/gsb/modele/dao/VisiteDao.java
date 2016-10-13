package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Visite;

public class VisiteDao {
	public static Visite rechercher(String reference){
		Visite uneVisite=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITE where REFERENCE='"+reference+"'");
		try {
			if (reqSelection.next()) {
				uneVisite = new Visite(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), reqSelection.getString(4));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from VISITE where REFERENCE='"+reference+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneVisite;
}
}