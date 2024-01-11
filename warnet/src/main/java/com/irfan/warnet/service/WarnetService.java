/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irfan.warnet.service;

import com.irfan.warnet.entity.Warnet;
import com.irfan.warnet.repository.WarnetRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author FANN
 */
@Service
public class WarnetService {
    @Autowired
    private WarnetRepository warnetRepository;
    
    public void insert(Warnet warnet){
        Optional<Warnet> wrtOptional = warnetRepository.findWarnetByKode(warnet.getKode());
        if (wrtOptional.isPresent()) {
            throw new IllegalStateException("Kode Pelanggan sedang digunakan");
        }
        warnetRepository.save(warnet);
    }
    
    
    public List<Warnet> getAll(){
        return warnetRepository.findAll();
    }

    public Warnet getWarnetById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
