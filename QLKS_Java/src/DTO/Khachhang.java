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
public class Khachhang {
    private String MaKH;
    private String TenKH ;
    private String GioiTinh;
    private int CMND;
    private String DiaChi; 
    private int SoDienThoai;
    public Khachhang(){};
    public Khachhang(String MaKHs,String TenKHs,String GioiTinhs,int CMNDs,String DiaChis ){};

    /**
     * @return the MaKH
     */
    public String getMaKH() {
        return MaKH;
    }

    /**
     * @param MaKH the MaKH to set
     */
    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    /**
     * @return the TenKH
     */
    public String getTenKH() {
        return TenKH;
    }

    /**
     * @param TenKH the TenKH to set
     */
    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    /**
     * @return the GioiTinh
     */
    public String getGioiTinh() {
        return GioiTinh;
    }

    /**
     * @param GioiTinh the GioiTinh to set
     */
    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    /**
     * @return the CMND
     */
    public int getCMND() {
        return CMND;
    }

    /**
     * @param CMND the CMND to set
     */
    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    /**
     * @return the DiaChi
     */
    public String getDiaChi() {
        return DiaChi;
    }

    /**
     * @param DiaChi the DiaChi to set
     */
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    /**
     * @return the SoDienThoai
     */
    public int getSoDienThoai() {
        return SoDienThoai;
    }

    /**
     * @param SoDienThoai the SoDienThoai to set
     */
    public void setSoDienThoai(int SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }
}
