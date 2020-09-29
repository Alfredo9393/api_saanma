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

    public ProductsModel(ProductsEntity productsEntity) {
        this.id = productsEntity.getId();
        this.product = productsEntity.getProduct();
        this.description = productsEntity.getDescription();
        this.idCategoria = productsEntity.getIdCategoria();
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

}
