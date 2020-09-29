/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.controller;

import com.saanma.api.entity.PackagingTypesEntity;
import com.saanma.api.model.PackagingTypesModel;
import com.saanma.api.service.PackagingTypesService;
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
@RequestMapping("/saanma/api/packagingtypes")
public class PackagingTypesController {
    
    @Autowired
    private PackagingTypesService packagingTypesService;

    @RequestMapping(value="/save",method=RequestMethod.POST)
    public Boolean save(@RequestBody PackagingTypesEntity packagingTypesEntity){
        System.out.println("packagingtypes/save");             
        packagingTypesEntity.setLastUpdateDate(new Date());
        return packagingTypesService.save(packagingTypesEntity);
    }
    
    @RequestMapping(value="/update",method=RequestMethod.PUT)
    public Boolean update(@RequestBody PackagingTypesEntity packagingTypesEntity){
        System.out.println("packagingtypes/update");             
        packagingTypesEntity.setLastUpdateDate(new Date());
        return packagingTypesService.update(packagingTypesEntity);
    }
    
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE) //   HttpServletReponse response
    public Boolean delete(@PathVariable("id") int id, Model model ){
        System.out.println("packagingtypes/delete");             
        return packagingTypesService.delete(id);
    }
    
    @RequestMapping(value="/getAll",method=RequestMethod.GET)
    public List<PackagingTypesModel> getAll(){
        System.out.println("packagingtypes/getAll");             
        return packagingTypesService.getAll();
    }
    
}
