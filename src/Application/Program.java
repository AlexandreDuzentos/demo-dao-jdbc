package Application;


import java.util.List;

import Db.Department;
import Db.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;



public class Program {

	public static void main(String[] args) {
		try {
		
       SellerDao sellerDao=DaoFactory.createSellerDao();//é uma forma de fazer com que o programa não conheça a implementação,somente a interface
       System.out.println("=== TEST 1:seller findById ====");
        Seller seller=sellerDao.findById(3);
        System.out.println(seller);
        
        System.out.println("\n=== TEST 2:seller findByDepartment ====");
        Department dep=new Department(2,null);
        List<Seller> list=sellerDao.findByDepartment(dep);
        for(Seller obj:list) {
        	System.out.println(obj);
        }
        System.out.println(list);
        
        System.out.println("\n=== TEST 3:seller findAll ====");
        list=sellerDao.findAll();
        for(Seller obj : list) {
        	System.out.println(obj);
        }
        
        
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}


}
