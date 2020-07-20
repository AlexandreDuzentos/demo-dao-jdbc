package Application;


import java.sql.Date;

import Db.Department;
import Db.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;



public class Program {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		
             Department obj=new Department(1,"Books");
             System.out.println(obj);
             
      Seller seller =  new Seller(21,"Bob","Bob@gmail.com",new Date(0),3000.0,obj);
       SellerDao sellerDao=DaoFactory.createSellerDao();//é uma forma de fazer com que o programa não conheça a implementação,somente a interface
      
             System.out.println(seller);
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}


}
