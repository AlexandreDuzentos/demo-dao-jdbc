package model.dao;

import Db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	//Classe responsável por instanciar os Dao
 public static SellerDao createSellerDao() {
	 return new SellerDaoJDBC(DB.getConnection());
 }
}
