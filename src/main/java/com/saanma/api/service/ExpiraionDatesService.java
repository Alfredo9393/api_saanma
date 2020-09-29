/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.service;
import com.saanma.api.entity.ExpiraionDatesEntity;
import com.saanma.api.repository.ExpiraionDatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alfre
 */
@Service
public class ExpiraionDatesService {
    
    @Autowired
    private ExpiraionDatesRepository expiraionDatesRepository;
    
    public Boolean save(ExpiraionDatesEntity expiraionDatesEntity) {
        try {
            expiraionDatesRepository.save(expiraionDatesEntity);
            return true;
        } catch (Exception e) {
             return false;
        }
    }  
    
    
    public Boolean update(ExpiraionDatesEntity expiraionDatesEntity) {
        try {
             expiraionDatesRepository.save(expiraionDatesEntity);
             return true;
        } catch (Exception e) {
             return false;
        }
    }
    
    public boolean delete(int id){
        try {
            ExpiraionDatesEntity expiraionDatesEntity = expiraionDatesRepository.findById(id);
            expiraionDatesRepository.delete(expiraionDatesEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
