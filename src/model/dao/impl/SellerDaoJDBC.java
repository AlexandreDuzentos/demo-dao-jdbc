package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Db.DB;
import Db.DbException;
import Db.Department;
import Db.Seller;
import model.dao.SellerDao;

public class SellerDaoJDBC implements SellerDao  {
	
	private Connection conn;
	
	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller findById(Integer id) {
      PreparedStatement st=null;
      ResultSet rs=null;
      try {
    	  st=conn.prepareStatement("SELECT seller.*,department.Name as DepName\r\n" + 
    	  		"FROM seller INNER JOIN department\r\n" + 
    	  		"ON seller.DepartmentId = department.Id\r\n" + 
    	  		"WHERE seller.Id = ?");
    	  st.setInt(1,id);
    	  rs=st.executeQuery();
    	  if(rs.next()) {
    		  Department dep= new Department();
    		  dep.setId(rs.getInt("DepartmentId"));
    		  dep.setName(rs.getString("DepName"));
    		  
    		  
    		  Seller obj=new Seller();
    		  obj.setId(rs.getInt("Id"));
    		  obj.setName(rs.getString("Name"));
    		  obj.setEmail(rs.getString("Email"));
    		  obj.setBaseSalary(rs.getDouble("BaseSalary"));
    		  obj.setBirthdate(rs.getDate("BirthDate"));
    		  obj.setDepartment(dep);
    		  return obj;
    		  
    	  }
      }
      catch(SQLException e) {
    	 throw new DbException(e.getMessage());
      }
      finally {
    	
    	  DB.closeResultSet(rs);
    	  //DB.closeConnection(); Não fechei porque o mesmo objecto Dao pode servir para fazer mais de uma operação
    	  
    	  
      }
	return null;
      
		
	}

}
