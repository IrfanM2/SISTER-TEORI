/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.irfan.mahasiswa.repository;

import com.irfan.mahasiswa.entity.Matakuliah;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FANN
 */

@Repository
public interface MatakuliahRepository extends JpaRepository<Matakuliah, Long> {

    public Optional<Matakuliah> findMatakuliahByMatakuliah(String matakuliah);
    
}
