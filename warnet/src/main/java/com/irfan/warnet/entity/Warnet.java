/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irfan.warnet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author FANN
 */
@Entity
@Table
public class Warnet {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY)
    private Long id;
    private String kode_pelanggan;
    private String jenis;
    private String lama;
    private String tarif;
    private String total;

    public Warnet() {

    }

    public Warnet(Long id, String kode_pelanggan, String jenis, String lama, String tarif, String total) {
        this.id = id;
        this.kode_pelanggan = kode_pelanggan;
        this.jenis = jenis;
        this.lama = lama;
        this.tarif = tarif;
        this.total = total;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKode() {
        return kode_pelanggan;
    }

    public void setKode() {
        this.kode_pelanggan = kode_pelanggan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis() {
        this.jenis = jenis;
    }

    public String getLama() {
        return lama;
    }

    public void setlama() {
        this.lama = lama;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif() {
        this.tarif = tarif;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Warnet{" + "id=" + id + ", kode pelanggan=" + kode_pelanggan + ", jenis=" + jenis + ", lama=" + lama + ", tarif=" + tarif + ", total=" + total + '}';
    }

}
