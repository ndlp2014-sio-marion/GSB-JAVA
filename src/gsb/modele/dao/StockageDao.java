package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Medicament;
import gsb.modele.Stockage;
import gsb.modele.Visiteur;

public class StockageDao {
 public static Stockage rechercherStockage(Medicament unMedicament, Visiteur unVisiteur, int qte){
  Stockage unStockage=null;
  ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from STOCKAGE where REFERENCE='"+qte+"'");
  try {
   if (reqSelection.next()) {
    unMedicament = MedicamentDao.rechercher(reqSelection.getString(1), null);
    unVisiteur = VisiteurDao.rechercher(reqSelection.getString(2), null);
    unStockage = new Stockage (unMedicament, unVisiteur,reqSelection.getInt(3));
   }
  }
  catch(Exception e) {
   System.out.println("erreur reqSelection.next() pour la requete - select * from STOCKAGE where REFERENCE='"+qte+"'");
   e.printStackTrace();
   }
  ConnexionMySql.fermerConnexionBd();
  return unStockage;
}

}