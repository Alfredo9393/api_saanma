/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.service;

import com.saanma.api.entity.ProductsSaleEntity;
import com.saanma.api.model.ProductsSaleModel;
import com.saanma.api.repository.ProductsSaleRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author alfre
 */
@Service
public class ProductsSaleService {
 
    @Autowired
    private ProductsSaleRepository productsSaleRepository;
    
    public Boolean save(ProductsSaleEntity productsSaleEntity) {
        try {
            productsSaleRepository.save(productsSaleEntity);
            return true;
        } catch (Exception e) {
             return false;
        }
    }  
    
    public Boolean update(ProductsSaleEntity productsSaleEntity) {
        try {
             productsSaleRepository.save(productsSaleEntity);
             return true;
        } catch (Exception e) {
             return false;
        }
    }
    
    public boolean delete(int idProductsSale){
        try {
            ProductsSaleEntity productsSaleEntity = productsSaleRepository.findById(idProductsSale);
            productsSaleRepository.delete(productsSaleEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public List<ProductsSaleModel> getAll(){
        List<ProductsSaleModel> productsSaleModel = new ArrayList<>();
        List<ProductsSaleEntity> productsCalSaleEntity = productsSaleRepository.findAll();
        productsCalSaleEntity.forEach((data) -> { 
            productsSaleModel.add(new ProductsSaleModel(data));//convierte entidad a modelo
        }); 
        return productsSaleModel;
    }
}
