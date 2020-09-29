/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.model;

import com.saanma.api.entity.SuppliersEntity;
import java.util.Date;

/**
 *
 * @author alfre
 */
public class SuppliersModel {
    private Integer id;
    private String supplier;
    private String description;
    private Date lastUpdateDate;

    public SuppliersModel(SuppliersEntity suppliersEntity) {
        this.id = suppliersEntity.getId();
        this.supplier = suppliersEntity.getSupplier();
        this.description = suppliersEntity.getDescription();
        this.lastUpdateDate = suppliersEntity.getLastUpdateDate();
    }
        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
    

}
