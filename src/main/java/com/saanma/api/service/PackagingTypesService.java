/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.service;

import com.saanma.api.entity.PackagingTypesEntity;
import com.saanma.api.model.PackagingTypesModel;
import com.saanma.api.repository.PackagingTypesRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alfre
 */
@Service
public class PackagingTypesService {
    
    @Autowired
    private PackagingTypesRepository packagingTypesRepository;
    
    public Boolean save(PackagingTypesEntity packagingTypesEntity) {
        try {
            packagingTypesRepository.save(packagingTypesEntity);
            return true;
        } catch (Exception e) {
             return false;
        }
    }  
    
    public Boolean update(PackagingTypesEntity packagingTypesEntity) {
        try {
             packagingTypesRepository.save(packagingTypesEntity);
             return true;
        } catch (Exception e) {
             return false;
        }
    }
 
    public boolean delete(int id){
        try {
            PackagingTypesEntity packagingTypesEntity = packagingTypesRepository.findById(id);
            packagingTypesRepository.delete(packagingTypesEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public List<PackagingTypesModel> getAll(){
        List<PackagingTypesModel> packagingTypesModel = new ArrayList<>();
        List<PackagingTypesEntity> measUnitsEntity = packagingTypesRepository.findAll();
        measUnitsEntity.forEach((data) -> { 
            packagingTypesModel.add(new PackagingTypesModel(data));//convierte entidad a modelo
        }); 
        return packagingTypesModel;
    }

}
