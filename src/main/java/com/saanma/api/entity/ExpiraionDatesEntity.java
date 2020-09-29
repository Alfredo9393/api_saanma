/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author alfre
 */
@Entity // Esto le dice a Hibernate que haga una tabla de esta clase
@Table(name = "[ExpiraionDates]", schema = "dbo")
public class ExpiraionDatesEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    
    @Column(name = "IdProductPurchase")
    private Integer idProductPurchase;
    
    @Column(name = "ExpiraionDate")
    @Temporal(TemporalType.DATE) //TIMESTAMP: Registrar solo la fecha
    private Date expiraionDate;
    
    @Column(name = "Count")
    private Integer count;
    
    @Column(name = "Active")
    private Boolean active;
    
    @Column(name = "LastUpdateDate")
    @Temporal(TemporalType.TIMESTAMP) //TIMESTAMP: Registrar la fecha y hora
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
