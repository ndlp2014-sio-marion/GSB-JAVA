package gsb.service;

import gsb.modele.Stockage;
import gsb.modele.Medicament;
import gsb.modele.Visiteur;
import gsb.modele.dao.StockageDao;

public class StockageService {
	public static Stockage rechercherStockage( int qte, Visiteur unVisiteur, Medicament unMedicament){
		Stockage unStockage = null;
		  try{
		   if(qte == 0){
		    throw new Exception("Donne obligatoire : quantite");
		   }
		   unStockage = StockageDao.rechercher(unMedicament, unVisiteur, qte); 
		  }
		  catch(Exception e){
		   System.out.println(e.getMessage());
		  }
		  return unStockage;
		 } 

}
