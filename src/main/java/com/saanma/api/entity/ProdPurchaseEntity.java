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
@Table(name = "[ProductsPurchase]", schema = "dbo")
public class ProdPurchaseEntity implements Serializable  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "IdProduct")
    private Integer idProduct;

    @Column(name = "Price")
    private Float price;

    @Column(name = "IdPackagingType")
    private Integer idPackagingType;

    @Column(name = "CountPriPacking")
    private Integer countPriPacking;

    @Column(name = "CountSecPacking")
    private Integer countSecPacking;

    @Column(name = "CountTerPacking")
    private Integer countTerPacking;

    @Column(name = "PricePriPacking")
    private Float pricePriPacking;

    @Column(name = "PriceSecPacking")
    private Float priceSecPacking;

    @Column(name = "PriceTerPacking")
    private Float priceTerPacking;

    @Column(name = "IdSupplier")
    private Integer idSupplier;

    @Column(name = "DatePurchase")
    private Date datePurchase;

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

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getIdPackagingType() {
        return idPackagingType;
    }

    public void setIdPackagingType(Integer idPackagingType) {
        this.idPackagingType = idPackagingType;
    }

    public Integer getCountPriPacking() {
        return countPriPacking;
    }

    public void setCountPriPacking(Integer countPriPacking) {
        this.countPriPacking = countPriPacking;
    }

    public Integer getCountSecPacking() {
        return countSecPacking;
    }

    public void setCountSecPacking(Integer countSecPacking) {
        this.countSecPacking = countSecPacking;
    }

    public Integer getCountTerPacking() {
        return countTerPacking;
    }

    public void setCountTerPacking(Integer countTerPacking) {
        this.countTerPacking = countTerPacking;
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

    public Integer getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }

    public Date getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(Date datePurchase) {
        this.datePurchase = datePurchase;
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