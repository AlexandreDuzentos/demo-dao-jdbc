package Application;


import java.sql.Date;

import Db.Department;
import Db.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;



public class Program {

	public static void main(String[] args) {
		try {
		
       SellerDao sellerDao=DaoFactory.createSellerDao();//� uma forma de fazer com que o programa n�o conhe�a a implementa��o,somente a interface
        Seller seller=sellerDao.findById(3);
        System.out.println(seller);
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}


}
