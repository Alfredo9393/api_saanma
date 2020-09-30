/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.service;

import com.saanma.api.entity.MeasUnitsEntity;
import com.saanma.api.model.MeasUnitsModel;
import com.saanma.api.repository.MeasUnitsRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alfre
 */
@Service
public class MeasUnitsService {
    
    @Autowired
    private MeasUnitsRepository measUnitsRepository;
    
    public Boolean save(MeasUnitsEntity measUnitsEntity) {
        try {
            measUnitsRepository.save(measUnitsEntity);
            return true;
        } catch (Exception e) {
             return false;
        }
    }  
    
    public Boolean update(MeasUnitsEntity measUnitsEntity) {
        try {
             measUnitsRepository.save(measUnitsEntity);
             return true;
        } catch (Exception e) {
             return false;
        }
    }
    
    public boolean delete(int idMeasUnits){
        try {
            MeasUnitsEntity measUnitsEntity = measUnitsRepository.findById(idMeasUnits);
            measUnitsRepository.delete(measUnitsEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public List<MeasUnitsModel> getAll(){
        List<MeasUnitsModel> measUnitsModel = new ArrayList<>();
        List<MeasUnitsEntity> measUnitsEntity = measUnitsRepository.findAll();
        measUnitsEntity.forEach((data) -> { 
            measUnitsModel.add(new MeasUnitsModel(data));//convierte entidad a modelo
        }); 
        return measUnitsModel;
    }

      
}
