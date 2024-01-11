/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irfan.warnet.repository;


import com.irfan.warnet.entity.Warnet;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author FANN
 */

@Repository
public interface WarnetRepository extends JpaRepository<Warnet, Long> {

    public Optional<Warnet> findWarnetByKode(String kode_pelanggan);
    
}