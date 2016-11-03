package gsb.tests;

import gsb.modele.Unite;
import gsb.service.UniteService;

public class UniteServiceTest {

	public static void main(String[] args){
		Unite uneUnite = UniteService.rechercherUnite("SW");
		System.out.println(uneUnite.getCodeUnit());
		System.out.println(uneUnite.getNom());
	}
	
}
