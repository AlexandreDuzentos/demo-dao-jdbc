package Application;


import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import Db.Department;
import Db.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;



public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		
       SellerDao sellerDao=DaoFactory.createSellerDao();//� uma forma de fazer com que o programa n�o conhe�a a implementa��o,somente a interface
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
        
        System.out.println("\n=== TEST 4:seller insert ====");
        Seller newSeller = new Seller(null,"Greg", "greg@gmail.com", new Date(0), 4000.0, dep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id ="+newSeller.getId());
        
        System.out.println("\n=== TEST 5:seller update ====");
        seller=sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");
        
        System.out.println("\n=== TEST 5:seller delete ====");
        System.out.println("Enter id for delete test: ");
        int id=sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");
        
        sc.close();
   
        
        
        
        
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}


}
