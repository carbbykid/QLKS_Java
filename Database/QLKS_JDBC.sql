CREATE DATABASE QLKS
GO
USE QLKS
GO
CREATE TABLE PHIEUTHUEPHONG(
	MaPhieu int identity(1,1) primary key not null,
	Ngaydatphong DATE,
	Ngaytraphong DATE,
	Songayo int,
	Soluongkhach int
)
GO
CREATE TABLE KHACHHANG(
	MaKH NVARCHAR(50) primary key not null,
	TenKH NVARCHAR(100) NOT NULL,
	CMND int,
	GioiTinh NVARCHAR(20),
	DiaChi NVARCHAR(100),
	SoDT int	
)
CREATE TABLE PHONG(
	MaPhong int primary key not null,
	TenPhong NVARCHAR(50) NOT NULL, 
	LoaiPhong NVARCHAR(50),
	GiaPhong int,
	TinhTrang NVARCHAR(100) NOT NULL,
	GhiChu NVARCHAR(100)
)
CREATE TABLE HOADON(
	MaHD int identity(1,1) primary key not null,
	MaPhieuThue int,
	TienDichVu money, 
	TienThuePhong money,
	NgayHD smalldatetime,
	TriGia MONEY
)
GO
CREATE TABLE DICHVU(
	MaDV VARCHAR(5) PRIMARY KEY NOT NULL,
	TenDV NVARCHAR(100),
	DonGia MONEY NOT NULL,
	TinhTrang NVARCHAR(100)
)