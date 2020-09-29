/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.model;

import java.util.Date;

/**
 *
 * @author alfre
 */
public class ExpiraionDatesModel {
    private Integer id;
    private Integer idProductPurchase;
    private Date expiraionDate;
    private Integer count;
    private Boolean active;
    private Date lastUpdateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProductPurchase() {
        return idProductPurchase;
    }

    public void setIdProductPurchase(Integer idProductPurchase) {
        this.idProductPurchase = idProductPurchase;
    }

    public Date getExpiraionDate() {
        return expiraionDate;
    }

    public void setExpiraionDate(Date expiraionDate) {
        this.expiraionDate = expiraionDate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    
    
}
