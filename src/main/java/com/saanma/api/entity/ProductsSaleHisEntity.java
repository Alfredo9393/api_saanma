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
@Table(name = "[ProductsSaleHistory]", schema = "dbo")
public class ProductsSaleHisEntity implements Serializable  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    
    @Column(name = "IdProductsPurchase")
    private Integer idProductsPurchase;

    @Column(name = "IdProduct")
    private Integer idProduct;
    
    @Column(name = "ProFitPriPacking")
    private Float proFitPriPacking;   
    
    @Column(name = "proFitSecPacking")
    private Float proFitSecPacking;   
 
    @Column(name = "ProFitTerPacking")
    private Float proFitTerPacking;  
    
    @Column(name = "PricePriPacking")
    private Float pricePriPacking;  
    
    @Column(name = "PriceSecPacking")
    private Float priceSecPacking;  
     
    @Column(name = "PriceTerPacking")
    private Float priceTerPacking;  
        
    @Column(name = "Comment")
    private String comment;  
        
    @Column(name = "LastUpdateDate")
    @Temporal(TemporalType.TIMESTAMP) //TIMESTAMP: Registrar la fecha y hora
    private Date lastUpdateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProductsPurchase() {
        return idProductsPurchase;
    }

    public void setIdProductsPurchase(Integer idProductsPurchase) {
        this.idProductsPurchase = idProductsPurchase;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Float getProFitPriPacking() {
        return proFitPriPacking;
    }

    public void setProFitPriPacking(Float proFitPriPacking) {
        this.proFitPriPacking = proFitPriPacking;
    }

    public Float getProFitSecPacking() {
        return proFitSecPacking;
    }

    public void setProFitSecPacking(Float proFitSecPacking) {
        this.proFitSecPacking = proFitSecPacking;
    }

    public Float getProFitTerPacking() {
        return proFitTerPacking;
    }

    public void setProFitTerPacking(Float proFitTerPacking) {
        this.proFitTerPacking = proFitTerPacking;
    }

    public Float getPricePriPacking() {
        return pricePriPacking;
    }

    public void setPricePriPacking(Float pricePriPacking) {
        this.pricePriPacking = pricePriPacking;
    }

    public Float getPriceSecPacking() {
        return priceSecPacking;
    }

    public void setPriceSecPacking(Float priceSecPacking) {
        this.priceSecPacking = priceSecPacking;
    }

    public Float getPriceTerPacking() {
        return priceTerPacking;
    }

    public void setPriceTerPacking(Float priceTerPacking) {
        this.priceTerPacking = priceTerPacking;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


        
}
