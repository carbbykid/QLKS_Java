/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author HOÀNGQUANGHUY
 */
public class Phieudatphong {
        private int MaPhieu;
	private Date NgayBDThue;
	private Date NgayKTThue;
        private int Songayo;
	private int SoLuongKH;
      
     public Phieudatphong(){};
     public Phieudatphong(int Maphieus,Date NgayBDThues,Date NgayKTThues,int Songayos,int SoLuongKHs)
     {
         this.MaPhieu=Maphieus;
         this.NgayBDThue=NgayKTThues;
         this.NgayKTThue=NgayKTThues;
         this.SoLuongKH=SoLuongKHs;
         this.Songayo=Songayos;
     }

    /**
     * @return the MaPhieu
     */
    public int getMaPhieu() {
        return MaPhieu;
    }

    /**
     * @param MaPhieu the MaPhieu to set
     */
    public void setMaPhieu(int MaPhieu) {
        this.MaPhieu = MaPhieu;
    }

    /**
     * @return the NgayBDThue
     */
    public Date getNgayBDThue() {
        return NgayBDThue;
    }

    /**
     * @param NgayBDThue the NgayBDThue to set
     */
    public void setNgayBDThue(Date NgayBDThue) {
        this.NgayBDThue = NgayBDThue;
    }

    /**
     * @return the NgayKTThue
     */
    public Date getNgayKTThue() {
        return NgayKTThue;
    }

    /**
     * @param NgayKTThue the NgayKTThue to set
     */
    public void setNgayKTThue(Date NgayKTThue) {
        this.NgayKTThue = NgayKTThue;
    }

    /**
     * @return the Songayo
     */
    public int getSongayo() {
        return Songayo;
    }

    /**
     * @param Songayo the Songayo to set
     */
    public void setSongayo(int Songayo) {
        this.Songayo = Songayo;
    }

    /**
     * @return the SoLuongKH
     */
    public int getSoLuongKH() {
        return SoLuongKH;
    }

    /**
     * @param SoLuongKH the SoLuongKH to set
     */
    public void setSoLuongKH(int SoLuongKH) {
        this.SoLuongKH = SoLuongKH;
    }
   
}
