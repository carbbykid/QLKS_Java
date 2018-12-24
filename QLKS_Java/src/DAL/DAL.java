/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Lichdatphong;
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
        public boolean addLichdatphong(Lichdatphong s)
        {
            String sql="INSERT INTO tbLICHDATPHONG (MaPhong,TenPhong,LoaiPhong,GiaPhong,TinhTrangPhong,NgayBDThue,NgayKTThue)"
                    + "VALUE(?,?,?,?,?,?,?)";
            try {
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setInt(1,s.getMaPhong());
                ps.setString(2,s.getTenPhong());
                ps.setString(3,s.getLoaiPhong());
                ps.setDouble(4,s.getGiaPhong());
                ps.setString(5,s.getTinhTrang());
                ps.setDate(6,new Date(s.getNgaydat().getTime()));
                ps.setDate(7,new Date(s.getNgaytra().getTime()));
                return ps.executeUpdate()>0;
            } catch (Exception e) {
                e.printStackTrace();
            }
                    return false;
        }
        
        public ArrayList<Lichdatphong> GetLichdatphong()
        {
             ArrayList<Lichdatphong> list =new  ArrayList<Lichdatphong>();
             String sql="SELECT * FROM tbLICHDATPHONG";
             try {
                PreparedStatement ps=conn.prepareStatement(sql);
                ResultSet rs= ps.executeQuery();
                 while (rs.next())
                 {
                     Lichdatphong Beo=new Lichdatphong();
                     Beo.setMaPhong(rs.getInt("MaPhong"));
                     Beo.setTenPhong(rs.getString("TenPhong"));
                     Beo.setLoaiPhong(rs.getString("LoaiPhong"));
                     Beo.setGiaPhong(rs.getDouble("GiaPhong"));
                     Beo.setTinhTrang(rs.getString("TinhTrangPhong"));
                     Beo.setNgaydat(rs.getDate("NgayBDThue"));
                     Beo.setNgaytra(rs.getDate("NgayKTThue"));
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
