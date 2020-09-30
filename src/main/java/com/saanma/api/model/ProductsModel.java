/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.model;

import com.saanma.api.entity.ProductsEntity;
import java.util.Date;

/**
 *
 * @author alfre
 */
public class ProductsModel {
    private Integer id;
    private String product;
    private String description;
    private Integer idCategoria;
    private Integer idSupplier;
    private Integer idMeasUnitPriPacking;
    private Integer idMeasUnitSecPacking;
    private Integer idMeasUnitTerPacking;
    private String comment;
    private Date lastUpdateDate;

    public ProductsModel(ProductsEntity dataEntity) {
        this.id = dataEntity.getId();
        this.product = dataEntity.getProduct();
        this.description = dataEntity.getDescription();
        this.idCategoria = dataEntity.getIdCategoria();
        this.idSupplier = dataEntity.getIdSupplier();
        this.idMeasUnitPriPacking = dataEntity.getIdMeasUnitPriPacking();
        this.idMeasUnitSecPacking = dataEntity.getIdMeasUnitSecPacking();
        this.idMeasUnitTerPacking = dataEntity.getIdMeasUnitTerPacking();
        this.comment = dataEntity.getComment();
        this.lastUpdateDate = dataEntity.getLastUpdateDate();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }

    public Integer getIdMeasUnitPriPacking() {
        return idMeasUnitPriPacking;
    }

    public void setIdMeasUnitPriPacking(Integer idMeasUnitPriPacking) {
        this.idMeasUnitPriPacking = idMeasUnitPriPacking;
    }

    public Integer getIdMeasUnitSecPacking() {
        return idMeasUnitSecPacking;
    }

    public void setIdMeasUnitSecPacking(Integer idMeasUnitSecPacking) {
        this.idMeasUnitSecPacking = idMeasUnitSecPacking;
    }

    public Integer getIdMeasUnitTerPacking() {
        return idMeasUnitTerPacking;
    }

    public void setIdMeasUnitTerPacking(Integer idMeasUnitTerPacking) {
        this.idMeasUnitTerPacking = idMeasUnitTerPacking;
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
