package gsb.modele.dao;

import java.sql.ResultSet;
import gsb.modele.Medicament;
import gsb.modele.Visiteur;
import gsb.modele.Offre;

public class OffreDao {
	public static Offre rechercher(String depotLegal, Medicament unMedicament, Visiteur unVisiteur){
		Offre uneOffre=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from OFFRE where ID_LEGAL='"+depotLegal+"'");
		try {
			if (reqSelection.next()) {
				unMedicament = MedicamentDao.rechercher(reqSelection.getString(1), null);
				unVisiteur = VisiteurDao.rechercher(reqSelection.getString(2), null);
				uneOffre = new Offre(unMedicament, unVisiteur, reqSelection.getInt(3));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from OFFRE where DEPOTLEGAL='"+depotLegal+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneOffre;
	}
}
