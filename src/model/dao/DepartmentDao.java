package model.dao;

import java.util.List;

import Db.Department;

public interface DepartmentDao {
   public void insert(Department obj);
   public void update(Department obj);
   public void deleteById(Integer id);
   Department findbYId(Integer id);
   List<Department>findAll();
}
