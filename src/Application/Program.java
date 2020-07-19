package Application;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

import Db.Department;
import Db.Seller;



public class Program {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		
             Department obj=new Department(1,"Books");
             System.out.println(obj);
             
      Seller seller =  new Seller(21,"Bob","Bob@gmail.com",new Date(0),3000.0,obj);

             System.out.println(seller);
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
	}


}
