/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.HashSet;

/**
 *
 * @author HOÀNGQUANGHUY
 */
public class Lop {
    private int MaLop;
    private String TenLop;
    private HashSet<Hocsinh> Hocsinhs;
    /**
     * @return the MaLop
     */
    public int getMaLop() {
        return MaLop;
    }

    /**
     * @param MaLop the MaLop to set
     */
    public void setMaLop(int MaLop) {
        this.MaLop = MaLop;
    }

    /**
     * @return the TenLop
     */
    public String getTenLop() {
        return TenLop;
    }

    /**
     * @param TenLop the TenLop to set
     */
    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    /**
     * @return the Hocsinhs
     */
    public HashSet<Hocsinh> getHocsinh() {
        if (Hocsinhs ==null)
          Hocsinhs=new HashSet<Hocsinh>();
        return Hocsinhs;
    }

}
