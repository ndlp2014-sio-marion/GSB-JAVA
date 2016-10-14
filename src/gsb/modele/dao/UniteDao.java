package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Unite;

public class UniteDao {
	public static Unite rechercher(String codeUnite){
		Unite uneUnite=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from UNITE where CODEUNITE='"+codeUnite+"'");
		try {
			if (reqSelection.next()) {
				uneUnite = new Unite(reqSelection.getString(1), reqSelection.getString(2));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from UNITE where CODEUNITE='"+codeUnite+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneUnite;
}}