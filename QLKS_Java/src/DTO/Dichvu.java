/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author HOÀNGQUANGHUY
 */
public class Dichvu {
    private String MaDV; 
    private String TenDV;
    private double DonGia;
    private String TinhTrang;
    public Dichvu(){};
    public Dichvu( String MaDVs, String TenDVs,double DonGias,String TinhTrangs){}

    /**
     * @return the MaDV
     */
    public String getMaDV() {
        return MaDV;
    }

    /**
     * @param MaDV the MaDV to set
     */
    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    /**
     * @return the TenDV
     */
    public String getTenDV() {
        return TenDV;
    }

    /**
     * @param TenDV the TenDV to set
     */
    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    /**
     * @return the DonGia
     */
    public double getDonGia() {
        return DonGia;
    }

    /**
     * @param DonGia the DonGia to set
     */
    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    /**
     * @return the TinhTrang
     */
    public String getTinhTrang() {
        return TinhTrang;
    }

    /**
     * @param TinhTrang the TinhTrang to set
     */
    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
}

