/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.model;

import com.saanma.api.entity.ProdPurchaseEntity;
import java.util.Date;

/**
 *
 * @author alfre
 */
public class ProdPurchaseModel {
    private Integer id;
    private Integer idProduct;
    private Float price;
    private Integer idPackagingType;
    private Integer countPriPacking;
    private Integer countSecPacking;
    private Integer countTerPacking;
    private Float pricePriPacking;
    private Float priceSecPacking;
    private Float priceTerPacking;
    private Integer idSupplier;
    private Date datePurchase;
    private String comment;
    private Date lastUpdateDate;

    public ProdPurchaseModel(ProdPurchaseEntity dataEntity) {
        this.id = dataEntity.getId();
        this.idProduct = dataEntity.getIdProduct();
        this.price = dataEntity.getPrice();
        this.idPackagingType = dataEntity.getIdPackagingType();
        this.countPriPacking= dataEntity.getCountPriPacking();
        this.countSecPacking = dataEntity.getCountSecPacking();
        this.countTerPacking = dataEntity.getCountTerPacking();
        this.pricePriPacking = dataEntity.getPricePriPacking();
        this.priceSecPacking = dataEntity.getPriceSecPacking();
        this.priceTerPacking = dataEntity.getPriceTerPacking();
        this.idSupplier = dataEntity.getIdSupplier();
        this.datePurchase = dataEntity.getDatePurchase();
        this.comment = dataEntity.getComment();
        this.lastUpdateDate = dataEntity.getLastUpdateDate();
    }
        
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
