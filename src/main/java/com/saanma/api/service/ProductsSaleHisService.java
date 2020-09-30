/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.service;

import com.saanma.api.entity.ProductsSaleHisEntity;
import com.saanma.api.model.ProductsSaleHisModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.saanma.api.repository.ProductsSaleHisRepository;

/**
 *
 * @author alfre
 */
@Service
public class ProductsSaleHisService {
    
    @Autowired
    private ProductsSaleHisRepository productsSaleHisRepository;
    
    public Boolean save(ProductsSaleHisEntity productsSaleHisEntity) {
        try {
            productsSaleHisRepository.save(productsSaleHisEntity);
            return true;
        } catch (Exception e) {
             return false;
        }
    }  
    
    public Boolean update(ProductsSaleHisEntity productsSaleHisEntity) {
        try {
             productsSaleHisRepository.save(productsSaleHisEntity);
             return true;
        } catch (Exception e) {
             return false;
        }
    }
    
    public boolean delete(int idProductsSaleHis){
        try {
            ProductsSaleHisEntity productsSaleHisEntity = productsSaleHisRepository.findById(idProductsSaleHis);
            productsSaleHisRepository.delete(productsSaleHisEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public List<ProductsSaleHisModel> getAll(){
        List<ProductsSaleHisModel> productsSaleHisModel = new ArrayList<>();
        List<ProductsSaleHisEntity> productsSaleHisEntity = productsSaleHisRepository.findAll();
        productsSaleHisEntity.forEach((data) -> { 
            productsSaleHisModel.add(new ProductsSaleHisModel(data));//convierte entidad a modelo
        }); 
        return productsSaleHisModel;
    }

    
    
}
