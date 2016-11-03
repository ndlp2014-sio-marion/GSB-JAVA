package gsb.tests;

import gsb.modele.Famille;
import gsb.service.FamilleService;

public class FamilleServiceTest {

	public static void main(String[] args){
		Famille uneFamille = FamilleService.rechercherFamille("CRT");
		System.out.println(uneFamille.getCodeFamille());
		System.out.println(uneFamille.getLibelleFamille());
	}
	
}
