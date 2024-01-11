/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irfan.warnet.controller;

import java.util.List;
import com.irfan.warnet.service.WarnetService;
import com.irfan.warnet.entity.Warnet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author FANN
 */
    @RestController
    @RequestMapping("api/v1/warnet")
    public class WarnetController {
        @Autowired
        private WarnetService warnetService;
    
    @GetMapping
    private List<Warnet> getAll() {
        return warnetService.getAll();
    }
    
    @PostMapping
    public void insert(@RequestBody Warnet warnet) {
        warnetService.insert(warnet);
    }
}
