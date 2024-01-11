/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irfan.nilaimahasiswa.controller;

import com.irfan.nilaimahasiswa.entity.NilaiMahasiswa;
import com.irfan.nilaimahasiswa.service.NilaiMahasiswaService;
import com.irfan.nilaimahasiswa.vo.ResponseTemplate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author FANN
 */

@RestController
@RequestMapping("api/v1/nilai")
public class NilaiMahasiswaController {
    @Autowired
    public NilaiMahasiswaService nilaiService;
    
    @GetMapping
    public List<NilaiMahasiswa> getAll() {
        return nilaiService.getAll();
    }
    
    @PostMapping()
    public void insert(@RequestBody NilaiMahasiswa nilai) {
        nilaiService.insert(nilai);
    }
    
    @GetMapping(path = "{id}")
    public ResponseTemplate getMahasiswaById(@PathVariable("id") Long id){
        return nilaiService.getNilaiById(id);
    }
}