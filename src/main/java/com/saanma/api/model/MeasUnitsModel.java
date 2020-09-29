/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.model;
import com.saanma.api.entity.MeasUnitsEntity;
import java.util.Date;

/**
 *
 * @author alfre
 */
public class MeasUnitsModel {
    private Integer id;
    private String measurementUnits;
    private String description;
    private Date lastUpdateDate;
    
    public MeasUnitsModel(MeasUnitsEntity measUnitsEntity) {
        this.id = measUnitsEntity.getId();
        this.measurementUnits = measUnitsEntity.getMeasurementUnits();
        this.description = measUnitsEntity.getDescription();
        this.lastUpdateDate = measUnitsEntity.getLastUpdateDate();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeasurementUnits() {
        return measurementUnits;
    }

    public void setMeasurementUnits(String measurementUnits) {
        this.measurementUnits = measurementUnits;
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
