package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Famille;
import gsb.modele.Medicament;

public class MedicamentDao2 {
	public static Medicament rechercher(String unDepotLegal, Famille uneFamille){
		Medicament unMedicament=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from MEDICAMENT where MED_DEPOTLEGAL ='"+unDepotLegal+"'");
		try {
			if (reqSelection.next()) {
				unMedicament = new Medicament(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), reqSelection.getString(4), reqSelection.getString(5), reqSelection.getFloat(6), uneFamille);	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from MEDICAMENT where DEPOTLEGAL ='"+unDepotLegal+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unMedicament;
	}
}