/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketingKereta;

/**
 *
 * @author Rizza
 */
public class Gerbong {
    private int kapasitas, tipeGerbong, idGerbong;
    private String jenisGerbong;
    private int nGerbong = 1000;
    
    public Gerbong (int tipe) {
        tipeGerbong = tipe;
        if (tipeGerbong == 1) {
            jenisGerbong = "Eksekutif";
        } else if (tipeGerbong == 2) {
            jenisGerbong = "Bisnis";
        } else {
            jenisGerbong = "Ekonomi";
        }
        idGerbong = nGerbong;
        nGerbong++;
    }

    /**
     * @return the kapasitas
     */
    public int getKapasitas() {
        return kapasitas;
    }

    /**
     * @param kapasitas the kapasitas to set
     */
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    /**
     * @return the tipeGerbong
     */
    public int getTipeGerbong() {
        return tipeGerbong;
    }

    /**
     * @param tipeGerbong the tipeGerbong to set
     */
    public void setTipeGerbong(int tipeGerbong) {
        this.tipeGerbong = tipeGerbong;
        if (tipeGerbong == 1) {
            jenisGerbong = "Eksekutif";
        } else if (tipeGerbong == 2) {
            jenisGerbong = "Bisnis";
        } else {
            jenisGerbong = "Ekonomi";
        }
    }

    /**
     * @return the jenisGerbong
     */
    public String getJenisGerbong() {
        return jenisGerbong;
    }

    /**
     * @return the idGerbong
     */
    public int getIdGerbong() {
        return idGerbong;
    }

    /**
     * @set the idGerbong with the amount of nGerbong and increment nGerbong
     */
    public void setIdGerbong() {
        this.idGerbong = nGerbong;
        nGerbong++;
    }
}
