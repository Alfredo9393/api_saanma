/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.repository;

import com.saanma.api.entity.MeasUnitsEntity;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alfre
 */
@Repository
public interface  MeasUnitsRepository extends JpaRepository<MeasUnitsEntity, Serializable>{
    MeasUnitsEntity findById(Integer Id);
}


