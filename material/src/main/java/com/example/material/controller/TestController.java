package com.example.material.controller;

import com.example.material.dao.MaterialDao;
import com.example.material.entity.MaterialOutSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class TestController {
    @Autowired
    MaterialDao materialDao;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        Optional<MaterialOutSheet> materialOutSheet = materialDao.getMaterialOutSheetById("201811113070");
        return materialOutSheet.get().getOutSheetNo();
    }
}
