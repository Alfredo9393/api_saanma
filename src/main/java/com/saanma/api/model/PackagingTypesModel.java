/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.model;

import com.saanma.api.entity.PackagingTypesEntity;
import java.util.Date;

/**
 *
 * @author alfre
 */
public class PackagingTypesModel {
    private Integer id;
    private String packaging;
    private String description;
    private Date lastUpdateDate;

    public PackagingTypesModel(PackagingTypesEntity dataEntity) {
        this.id = dataEntity.getId();
        this.packaging = dataEntity.getPackaging();
        this.description = dataEntity.getDescription();
        this.lastUpdateDate = dataEntity.getLastUpdateDate();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
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
