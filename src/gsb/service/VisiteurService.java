package gsb.service;

import gsb.modele.Unite;
import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;

public class VisiteurService {
 public static Visiteur rechercherFamille(String unMatricule, Unite uneUnite){
  Visiteur unVisiteur = null;
  try{
  if (unMatricule==null) {
            throw new Exception("Donnée obligatoire : code");
        }
  unVisiteur = VisiteurDao.rechercher(unMatricule, uneUnite);
  }
  catch(Exception e){
   System.out.println( e.getMessage());
  }
  return unVisiteur;
 }

}