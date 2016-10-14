package gsb.modele.dao;
import gsb.modele.Famille;

import java.sql.ResultSet;


public class FamilleDao {
	public static Famille rechercher(String codeFamille){
		Famille uneFamille=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from FAMILLE where CODEFAMILLE='"+codeFamille+"'");
		try {
			if (reqSelection.next()) {
				uneFamille = new Famille(reqSelection.getString(1), reqSelection.getString(2));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from FAMILLE where CODEFAMILLE='"+codeFamille+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneFamille;
}}