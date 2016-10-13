package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Famille;
import gsb.modele.Localite;
import gsb.modele.Medicament;

public class MedicamentDao {
	public static Medicament rechercher(String unDepotLegal){
		Medicament unMedicament=null;
		Famille uneFamille= null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from MEDICAMENT where DEPOTLEGAL ='"+unDepotLegal+"'");
		try {
			if (reqSelection.next()) {
				uneFamille = FamilleDao.rechercher(reqSelection.getString(5));
				unMedicament = new Medicament(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), reqSelection.getString(4), reqSelection.getString(5), reqSelection.getFloat(6), reqSelection.getString(7));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from MEDICAMENT where DEPOTLEGAL ='"+unDepotLegal+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unMedicament;
	}
}
