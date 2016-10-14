package gsb.service;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.Famille;

public class MedicamentService {

	public static Medicament rechercherMedicament(String unDepotLegal, Famille uneFamille){
		Medicament unMedicament = null;
		try{
			if(unDepotLegal==null){
				throw new Exception("Donne obligatoire : Depot legal");
			}
			unMedicament = MedicamentDao.rechercher(unDepotLegal, uneFamille);
			
		}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
		return unMedicament;
	}
}
