/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.model;

import com.saanma.api.entity.ProductsSaleEntity;
import java.util.Date;

/**
 * aplicar herencia aqui NO OLVIDA NO OLVIDA
 *
 * @author alfre
 */
public class ProductsSaleModel {
    private Integer id;
    private Integer idProductsPurchase;
    private Integer IdProduct;
    private Float proFitPriPacking;
    private Float proFitSecPacking;
    private Float proFitTerPacking;
    private Float pricePriPacking;
    private Float priceSecPacking;
    private Float priceTerPacking;
    private String comment;
    private Date lastUpdateDate;

    public ProductsSaleModel(ProductsSaleEntity dataEntity) {
        this.id = dataEntity.getId();
        this.idProductsPurchase = dataEntity.getIdProductsPurchase();
        this.IdProduct = dataEntity.getIdProduct();
        this.proFitPriPacking = dataEntity.getProFitPriPacking();
        this.proFitSecPacking = dataEntity.getProFitSecPacking();
        this.proFitTerPacking = dataEntity.getProFitTerPacking();
        this.pricePriPacking = dataEntity.getPricePriPacking();
        this.priceSecPacking = dataEntity.getPriceSecPacking();
        this.priceTerPacking= dataEntity.getPriceTerPacking();
        this.comment= dataEntity.getComment();
        this.lastUpdateDate= dataEntity.getLastUpdateDate();
    }

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
        return IdProduct;
    }

    public void setIdProduct(Integer IdProduct) {
        this.IdProduct = IdProduct;
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
