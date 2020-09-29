/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.service;
import com.saanma.api.entity.SuppliersEntity;
import com.saanma.api.model.SuppliersModel;
import com.saanma.api.repository.SuppliersRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alfre
 */
@Service
public class SuppliersService {
 
    @Autowired
    private SuppliersRepository suppliersRepository;
    
    public Boolean save(SuppliersEntity suppliersEntity) {
        try {
            suppliersRepository.save(suppliersEntity);
            return true;
        } catch (Exception e) {
             return false;
        }
    }  
    
     public Boolean update(SuppliersEntity suppliersEntity) {
        try {
             suppliersRepository.save(suppliersEntity);
             return true;
        } catch (Exception e) {
             return false;
        }
    }
    
    public boolean delete(int idSuppliers){
        try {
            SuppliersEntity suppliersEntity = suppliersRepository.findById(idSuppliers);
            suppliersRepository.delete(suppliersEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public List<SuppliersModel> getAll(){
        List<SuppliersModel> suppliersModel = new ArrayList<>();
        List<SuppliersEntity> suppliersEntity = suppliersRepository.findAll();
        suppliersEntity.forEach((data) -> { 
            suppliersModel.add(new SuppliersModel(data));//convierte entidad a modelo
        }); 
        return suppliersModel;
    }   
    
}
