/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saanma.api.controller;

import com.saanma.api.entity.MeasUnitsEntity;
import com.saanma.api.model.MeasUnitsModel;
import com.saanma.api.service.MeasUnitsService;
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
@RequestMapping("/saanma/api/measunits")
public class MeasUnitsController {
    
    @Autowired
    private MeasUnitsService measUnitsService;


    @RequestMapping(value="/save",method=RequestMethod.POST)
    public Boolean save(@RequestBody MeasUnitsEntity measUnitsEntity){
        System.out.println("measunits/save");             
        measUnitsEntity.setLastUpdateDate(new Date());
        return measUnitsService.save(measUnitsEntity);
    }
    
    @RequestMapping(value="/update",method=RequestMethod.PUT)
    public Boolean update(@RequestBody MeasUnitsEntity measUnitsEntity){
        System.out.println("measunits/update");             
        measUnitsEntity.setLastUpdateDate(new Date());
        return measUnitsService.update(measUnitsEntity);
    }
    
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE) //   HttpServletReponse response
    public Boolean delete(@PathVariable("id") int id, Model model ){
        System.out.println("measunits/delete");             
        return measUnitsService.delete(id);
    }
    
    @RequestMapping(value="/getAll",method=RequestMethod.GET)
    public List<MeasUnitsModel> getAll(){
        System.out.println("measunits/getAll");             
        return measUnitsService.getAll();
    }
    
}
