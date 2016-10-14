package gsb.service;

import gsb.modele.Famille;
import gsb.modele.dao.FamilleDao;

public class FamilleService {
	public static Famille rechercherFamille(String unCodeFamille){
		Famille uneFamille = null;
		try{
		if (unCodeFamille==null) {
            throw new Exception("Donnée obligatoire : code");
        }
		uneFamille = FamilleDao.rechercher(unCodeFamille);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return uneFamille;
	}
	

}
