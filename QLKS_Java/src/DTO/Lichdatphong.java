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
public class Lichdatphong {
    private int MaPhong;
    private String TenPhong;
    private String LoaiPhong;
    private double GiaPhong;
    public Lichdatphong(){
}
    
    public Lichdatphong(int MaPhongs,String TenPhongs,String LoaiPhongs,double GiaPhongs){
        this.MaPhong=MaPhongs;
        this.TenPhong=TenPhongs;
        this.LoaiPhong=LoaiPhongs;
        this.GiaPhong=GiaPhongs;
}

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
    public double getGiaPhong() {
        return GiaPhong;
    }

    /**
     * @param GiaPhong the GiaPhong to set
     */
    public void setGiaPhong(double GiaPhong) {
        this.GiaPhong = GiaPhong;
    }
    
}


