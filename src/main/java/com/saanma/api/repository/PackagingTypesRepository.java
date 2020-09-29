/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.repository;

import com.saanma.api.entity.PackagingTypesEntity;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alfre
 */
@Repository
public interface  PackagingTypesRepository extends JpaRepository<PackagingTypesEntity, Serializable>{
    PackagingTypesEntity findById(Integer Id);
}