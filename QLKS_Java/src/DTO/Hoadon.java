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
public class Hoadon {
        private String MaHD;
	private double TienDichVu;
	private double TienThuePhong;
	private double NgayHD;
	private double TriGia;  
        public Hoadon(){}
        public Hoadon(String MaHDs,double TienDichVus,double TienThuePhongs,double NgayHDs,double TriGias  ){}

    /**
     * @return the MaHD
     */
    public String getMaHD() {
        return MaHD;
    }

    /**
     * @param MaHD the MaHD to set
     */
    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    /**
     * @return the TienDichVu
     */
    public double getTienDichVu() {
        return TienDichVu;
    }

    /**
     * @param TienDichVu the TienDichVu to set
     */
    public void setTienDichVu(double TienDichVu) {
        this.TienDichVu = TienDichVu;
    }

    /**
     * @return the TienThuePhong
     */
    public double getTienThuePhong() {
        return TienThuePhong;
    }

    /**
     * @param TienThuePhong the TienThuePhong to set
     */
    public void setTienThuePhong(double TienThuePhong) {
        this.TienThuePhong = TienThuePhong;
    }

    /**
     * @return the NgayHD
     */
    public double getNgayHD() {
        return NgayHD;
    }

    /**
     * @param NgayHD the NgayHD to set
     */
    public void setNgayHD(double NgayHD) {
        this.NgayHD = NgayHD;
    }

    /**
     * @return the TriGia
     */
    public double getTriGia() {
        return TriGia;
    }

    /**
     * @param TriGia the TriGia to set
     */
    public void setTriGia(double TriGia) {
        this.TriGia = TriGia;
    }
}
