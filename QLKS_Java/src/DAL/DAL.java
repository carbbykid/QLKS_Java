/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import DTO.Khachhang;
import DTO.Phong;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HOÀNGQUANGHUY
 */
public class DAL {
   
        private Connection conn;
        public DAL(){
            try {Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=QLKS;integratedSecurity=true");
            }catch(Exception e){
            e.printStackTrace();}     
            }
        public boolean addPhong(Phong s)
        {
            String sql="INSERT INTO Phong(MaPhong, TenPhong, LoaiPhong, GiaPhong, TinhTrang, GhiChu)"
                    + "VALUES(?,?,?,?,?,?)";
            try {
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setInt(1,s.getMaPhong());
                ps.setString(2,s.getTenPhong());
                ps.setString(3,s.getLoaiPhong());
                ps.setInt(4,s.getGiaPhong());
                ps.setString(5,s.getTinhTrang());
                ps.setString(6,s.getGhiChu());
               // ps.setDate(6,new Date(s.getNgaydat().getTime()));
               //ps.setDate(7,new Date(s.getNgaytra().getTime()));
                return ps.executeUpdate() >0;
            } catch (Exception e) {
                e.printStackTrace();
            }
                    return false;
        }
     
        public ArrayList<Phong> GetPhong()
        {
             ArrayList<Phong> list = new  ArrayList<Phong>();
             String sql="SELECT * FROM PHONG";
             try {
                PreparedStatement ps=conn.prepareStatement(sql);
                ResultSet rs= ps.executeQuery();
                 while (rs.next())
                 {
                     Phong Beo=new Phong();
                     Beo.setMaPhong(rs.getInt("MaPhong"));
                     Beo.setTenPhong(rs.getString("TenPhong"));
                     Beo.setLoaiPhong(rs.getString("LoaiPhong"));
                     Beo.setGiaPhong(rs.getInt("GiaPhong"));
                     Beo.setTinhTrang(rs.getString("TinhTrang"));
                     Beo.setGhiChu(rs.getString("GhiChu"));
                   list.add(Beo);
                     
                 }
            } catch (Exception e) {
            }
             return list;
        }
        public static void main(String[] args)
        {
            new DAL();
        }
           
    
}
