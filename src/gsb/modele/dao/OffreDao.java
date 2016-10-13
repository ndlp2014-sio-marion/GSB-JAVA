package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Offre;

public class OffreDao {
	public static Offre rechercher(String depotLegal){
		Offre uneOffre=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from OFFRE where DEPOTLEGAL='"+depotLegal+"'");
		try {
			if (reqSelection.next()) {
				uneOffre = new Offre(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getInt(3));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from OFFRE where DEPOTLEGAL='"+depotLegal+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneOffre;
	}
}
