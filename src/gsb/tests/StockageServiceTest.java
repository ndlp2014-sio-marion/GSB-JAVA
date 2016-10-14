package gsb.tests;

import gsb.modele.Stockage;
import gsb.service.StockageService;

public class StockageServiceTest {
	public static void main(String[] args){
		Stockage unStockage = StockageService.rechercherStockage(102, null, null);
		System.out.println(unStockage.getQte());
		System.out.println(unStockage.getUnMedicament());
		System.out.println(unStockage.getUnVisiteur());
	}

}
