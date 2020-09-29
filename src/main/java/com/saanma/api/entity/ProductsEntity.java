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
@Table(name = "[Products]", schema = "dbo")
public class ProductsEntity implements Serializable  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    
    @Column(name = "Product")
    private String product;
    
    @Column(name = "Description")
    private String description;
    
    @Column(name = "LastUpdateDate")
    @Temporal(TemporalType.TIMESTAMP) //TIMESTAMP: Registrar la fecha y hora
    private Date lastUpdateDate;
   
    @Column(name = "IdCategoria")
    private Integer idCategoria;

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

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    
}
