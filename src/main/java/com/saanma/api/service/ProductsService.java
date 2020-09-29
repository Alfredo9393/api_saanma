/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.service;

import com.saanma.api.entity.ProductsEntity;
import com.saanma.api.model.ProductsModel;
import com.saanma.api.repository.ProductsRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author alfre
 */
@Service
public class ProductsService {
  
    @Autowired
    private ProductsRepository productsRepository;
    
    public Boolean save(ProductsEntity productsEntity) {
        try {
            productsRepository.save(productsEntity);
            return true;
        } catch (Exception e) {
             return false;
        }
    }  
    
    public Boolean update(ProductsEntity productsEntity) {
        try {
             productsRepository.save(productsEntity);
             return true;
        } catch (Exception e) {
             return false;
        }
    }
    
    public boolean delete(int idProduct){
        try {
            ProductsEntity productsEntity = productsRepository.findById(idProduct);
            productsRepository.delete(productsEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public List<ProductsModel> getAll(){
        List<ProductsModel> productsModel = new ArrayList<>();
        List<ProductsEntity> productsEntity = productsRepository.findAll();
        productsEntity.forEach((data) -> { 
            productsModel.add(new ProductsModel(data));//convierte entidad a modelo
        }); 
        return productsModel;
    }

      
     
}
