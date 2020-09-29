/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.controller;

import com.saanma.api.entity.SuppliersEntity;
import com.saanma.api.model.SuppliersModel;
import com.saanma.api.service.SuppliersService;
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
@RequestMapping("/saanma/api/suppliers")
public class SuppliersController {
        
    @Autowired
    private SuppliersService suppliersService;
    
    @RequestMapping(value="/save",method=RequestMethod.POST)
    public Boolean save(@RequestBody SuppliersEntity suppliersEntity){
        System.out.println("suppliers/save");             
        suppliersEntity.setLastUpdateDate(new Date());
        return suppliersService.save(suppliersEntity);
    }
    
    
    @RequestMapping(value="/update",method=RequestMethod.PUT)
    public Boolean update(@RequestBody SuppliersEntity suppliersEntity){
        System.out.println("suppliers/update");             
        suppliersEntity.setLastUpdateDate(new Date());
        return suppliersService.update(suppliersEntity);
    }
    
 
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE) //   HttpServletReponse response
    public Boolean delete(@PathVariable("id") int id, Model model ){
        System.out.println("suppliers/delete");             
        return suppliersService.delete(id);
    }
    
    @RequestMapping(value="/getAll",method=RequestMethod.GET)
    public List<SuppliersModel> getSuppliersAll(){
        System.out.println("suppliers/getAll");             
        return suppliersService.getAll();
    }
}
