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
public class Phong {
        private int MaPhong ;
	private String TenPhong ;
        private String LoaiPhong;
        private int GiaPhong;
	private String TinhTrang;
	private String GhiChu;
        public Phong(){};
        public Phong(String MaPhongs,String TenPhongs,String LoaiPhongs,Double GiaPhongs,String TinhTrangs,String GhiChus){};

    /**
     * @return the MaPhong
     */
    public int getMaPhong() {
        return MaPhong;
    }

    /**
     * @param MaPhong the MaPhong to set
     */
    public void setMaPhong(int MaPhong) {
        this.MaPhong = MaPhong;
    }

    /**
     * @return the TenPhong
     */
    public String getTenPhong() {
        return TenPhong;
    }

    /**
     * @param TenPhong the TenPhong to set
     */
    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    /**
     * @return the LoaiPhong
     */
    public String getLoaiPhong() {
        return LoaiPhong;
    }

    /**
     * @param LoaiPhong the LoaiPhong to set
     */
    public void setLoaiPhong(String LoaiPhong) {
        this.LoaiPhong = LoaiPhong;
    }

    /**
     * @return the GiaPhong
     */
    public int getGiaPhong() {
        return GiaPhong;
    }

    /**
     * @param GiaPhong the GiaPhong to set
     */
    public void setGiaPhong(int GiaPhong) {
        this.GiaPhong = GiaPhong;
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

    /**
     * @return the GhiChu
     */
    public String getGhiChu() {
        return GhiChu;
    }

    /**
     * @param GhiChu the GhiChu to set
     */
    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
}
