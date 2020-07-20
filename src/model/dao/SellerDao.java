package model.dao;

import java.util.List;

import Db.Seller;

public interface SellerDao {
 public void insert(Seller obj);
 public void update(Seller obj);
 public void deleteById(Integer id);
 public List<Seller>findAll();
}
