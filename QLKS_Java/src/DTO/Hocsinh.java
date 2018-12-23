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
public class Hocsinh {
    private int MHS;
    private String TenHS;
    private int MaLop=0;
    private Lop LOP;
    Date DOB;

    /**
     * @return the MHS
     */
    public int getMHS() {
        return MHS;
    }

    /**
     * @param MHS the MHS to set
     */
    public void setMHS(int MHS) {
        this.MHS = MHS;
    }

    /**
     * @return the TenHS
     */
    public String getTenHS() {
        return TenHS;
    }

    /**
     * @param TenHS the TenHS to set
     */
    public void setTenHS(String TenHS) {
        this.TenHS = TenHS;
    }

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
     * @return the LOP
     */
    public Lop getLOP() {
        return LOP;
    }
                    
    
}
