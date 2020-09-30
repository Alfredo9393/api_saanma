/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.controller;

import com.saanma.api.entity.ProdPurchaseEntity;
import com.saanma.api.model.ProdPurchaseModel;
import com.saanma.api.service.ProdPurchaseService;
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
@RequestMapping("/saanma/api/productspurchase")
public class ProdPurchaseController {
    
    @Autowired
    private ProdPurchaseService prodPurchaseService;
    
    @RequestMapping(value="/save",method=RequestMethod.POST)
    public Boolean save(@RequestBody ProdPurchaseEntity prodPurchaseEntity){
        System.out.println("productspurchase/save");             
        prodPurchaseEntity.setLastUpdateDate(new Date());
        return prodPurchaseService.save(prodPurchaseEntity);
    }
    
    @RequestMapping(value="/update",method=RequestMethod.PUT)
    public Boolean update(@RequestBody ProdPurchaseEntity prodPurchaseEntity){
        System.out.println("productspurchase/update");             
        prodPurchaseEntity.setLastUpdateDate(new Date());
        return prodPurchaseService.update(prodPurchaseEntity);
    }
    
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE) //   HttpServletReponse response
    public Boolean delete(@PathVariable("id") int id, Model model ){
        System.out.println("productspurchase/delete");             
        return prodPurchaseService.delete(id);
    }
    
    @RequestMapping(value="/getAll",method=RequestMethod.GET)
    public List<ProdPurchaseModel> getAll(){
        System.out.println("productspurchase/getAll");             
        return prodPurchaseService.getAll();
    }
    
}
