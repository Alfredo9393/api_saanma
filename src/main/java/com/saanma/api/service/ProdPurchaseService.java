/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.service;

import com.saanma.api.entity.ProdPurchaseEntity;
import com.saanma.api.model.ProdPurchaseModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.saanma.api.repository.ProdPurchaseRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author alfre
 */
@Service
public class ProdPurchaseService {
    
    @Autowired
    private ProdPurchaseRepository prodPurchaseRepository;
    
    public Boolean save(ProdPurchaseEntity prodPurchaseEntity) {
        try {
            prodPurchaseRepository.save(prodPurchaseEntity);
            return true;
        } catch (Exception e) {
             return false;
        }
    }  
    
    public Boolean update(ProdPurchaseEntity prodPurchaseEntity) {
        try {
             prodPurchaseRepository.save(prodPurchaseEntity);
             return true;
        } catch (Exception e) {
             return false;
        }
    }
    
    public boolean delete(int idProductPurchase){
        try {
            ProdPurchaseEntity prodPurchaseEntity = prodPurchaseRepository.findById(idProductPurchase);
            prodPurchaseRepository.delete(prodPurchaseEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public List<ProdPurchaseModel> getAll(){
        List<ProdPurchaseModel> prodPurchaseModel = new ArrayList<>();
        List<ProdPurchaseEntity> prodPurchaseEntity = prodPurchaseRepository.findAll();
        prodPurchaseEntity.forEach((data) -> { 
            prodPurchaseModel.add(new ProdPurchaseModel(data));//convierte entidad a modelo
        }); 
        return prodPurchaseModel;
    }
    
}
