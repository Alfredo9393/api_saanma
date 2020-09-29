/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.controller;

import com.saanma.api.entity.ProductsEntity;
import com.saanma.api.model.ProductsModel;
import com.saanma.api.service.ProductsService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author alfre
 */
@RestController
@RequestMapping("/saanma/api/products")
public class ProductsController {
    
    @Autowired
    private ProductsService productsService;
    
    @RequestMapping(value="/save",method=RequestMethod.POST)
    public Boolean save(@RequestBody ProductsEntity productsEntity){
        System.out.println("products/save");             
        productsEntity.setLastUpdateDate(new Date());
        return productsService.save(productsEntity);
    }
    
    @RequestMapping(value="/update",method=RequestMethod.PUT)
    public Boolean update(@RequestBody ProductsEntity productsEntity){
        System.out.println("products/update");             
        productsEntity.setLastUpdateDate(new Date());
        return productsService.update(productsEntity);
    }
    
 
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE) //   HttpServletReponse response
    public Boolean delete(@PathVariable("id") int id, Model model ){
        System.out.println("products/delete");             
        return productsService.delete(id);
    }
    
    @RequestMapping(value="/getAll",method=RequestMethod.GET)
    public List<ProductsModel> getAll(){
        System.out.println("products/getAll");             
        return productsService.getAll();
    }
    
}
