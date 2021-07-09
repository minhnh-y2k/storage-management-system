﻿CREATE DATABASE STORAGEMS
GO
USE STORAGEMS
GO
--DROP DATABASE STORAGEMS

--------------------------------------------------------
-- TAO BANG --

CREATE TABLE LOAIHANGHOA (
	MALHH INT IDENTITY(1,1) PRIMARY KEY,
	TENLHH NVARCHAR(50) NOT NULL,
)
GO

CREATE TABLE HANGHOA (
	MAHH VARCHAR(10) PRIMARY KEY NOT NULL,
	TENHH NVARCHAR(100) NOT NULL,
	DONGIA FLOAT DEFAULT 0,
	DONVITINH NVARCHAR(10) NOT NULL,
	MALHH INT NULL,
	
	CONSTRAINT CHK_HANGHOA CHECK (DONGIA>=0)
)
GO

CREATE TABLE LOAIDOITAC(
	MALDT INT IDENTITY(1,1) PRIMARY KEY,
	TENLDT VARCHAR(50) NOT NULL,
)
GO

CREATE TABLE DOITAC(
	MADT INT IDENTITY(1,1) PRIMARY KEY,
	TENDT NVARCHAR(100) NOT NULL,
	DIACHI NVARCHAR(100) NOT NULL,
	EMAIL VARCHAR(50) NULL,
	SODT VARCHAR(15) NOT NULL,
	VAITRO BIT DEFAULT 1,
	MALDT INT NULL
)
GO

CREATE TABLE KHO(
	MAKHO INT PRIMARY KEY NOT NULL,
	DIACHI NVARCHAR(100) NOT NULL,
	MATK VARCHAR(10) NULL
)
GO

CREATE TABLE LUUTRU(
	MALT INT IDENTITY(1,1) PRIMARY KEY,
	MAKHO INT NOT NULL,
	MAHH VARCHAR(10) NOT NULL,
	SOLUONG FLOAT DEFAULT 0,

	CHECK (SOLUONG>=0)
)
GO

CREATE TABLE CHITIETPHIEU(
	MACTP INT IDENTITY(1,1) PRIMARY KEY,
	MAPHIEU INT NOT NULL,
	MALT INT NOT NULL,
	SOLUONG FLOAT DEFAULT 0,
	DONGIA FLOAT DEFAULT 0,

	CONSTRAINT chk_CHITIETPHIEU CHECK (SOLUONG>=0 AND DONGIA>=0)
)	
GO

CREATE TABLE PHIEU (
	MAPHIEU INT IDENTITY(1,1) PRIMARY KEY,
	NGAYLAP DATETIME DEFAULT GETDATE(),
	LOAI BIT NULL,
	TRANGTHAI BIT DEFAULT 0,
	NGTHUCHIEN DATE NOT NULL,
	NGHOANTHANH DATE NULL,
	MADT INT NOT NULL,
	MANV VARCHAR(10) NOT NULL,

	CONSTRAINT CHK_PHIEU CHECK ((NGHOANTHANH IS NULL) OR (NGHOANTHANH>NGTHUCHIEN))
)
GO

CREATE TABLE CHITIETKIEMKHO(
	MACTKK INT IDENTITY(1,1) PRIMARY KEY,
	SOLUONGTON FLOAT DEFAULT 0 NOT NULL,
	SOLUONGTHUC FLOAT DEFAULT 0 NOT NULL,
	GHICHU NVARCHAR(225) NULL,
	MAKK INT NOT NULL,
	MALT INT NOT NULL,

	CONSTRAINT CHK_CHITIETKIEMKHO CHECK (SOLUONGTON>=0 AND SOLUONGTHUC>=0)
)
GO

CREATE TABLE PHIEUKIEMKHO(
	MAKK INT IDENTITY(1,1) PRIMARY KEY,
	NGAYLAP DATETIME DEFAULT GETDATE(),
	NGAYKIEM DATE NOT NULL,
	TRANGTHAI BIT DEFAULT 0,
	MANV VARCHAR(10) NOT NULL
)
GO

CREATE TABLE NHANVIEN(
	MANV VARCHAR(10) PRIMARY KEY NOT NULL,
	TENNV VARCHAR(50) NOT NULL,
	VAITRO BIT NOT NULL DEFAULT 0,
	MATKHAU VARCHAR(15) NOT NULL,
	MUOI VARCHAR(15) NOT NULL,
)
GO
	
--------------------------------------------------------
-- KET NOI CAC BANG --
--
ALTER TABLE HANGHOA
ADD CONSTRAINT FK_HANGHOA_LOAIHANGHOA
FOREIGN KEY (MALHH) REFERENCES LOAIHANGHOA(MALHH);
GO

--
ALTER TABLE DOITAC
ADD CONSTRAINT FK_DOITAC_LOAIDOITAC
FOREIGN KEY (MALDT) REFERENCES LOAIDOITAC(MALDT);
GO

--
ALTER TABLE PHIEU
ADD CONSTRAINT FK_PHIEU_DOITAC
FOREIGN KEY (MADT) REFERENCES DOITAC(MADT);

ALTER TABLE PHIEU
ADD CONSTRAINT FK_PHIEU_NHANVIEN
FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV);
GO

--
ALTER TABLE CHITIETPHIEU
ADD CONSTRAINT FK_CHITIETPHIEU_PHIEU
FOREIGN KEY (MAPHIEU) REFERENCES PHIEU(MAPHIEU);

ALTER TABLE CHITIETPHIEU
ADD CONSTRAINT FK_CHITIETPHIEU_LUUTRU
FOREIGN KEY (MALT) REFERENCES LUUTRU(MALT);
GO

--
ALTER TABLE LUUTRU
ADD CONSTRAINT FK_LUUTRU_KHO
FOREIGN KEY (MAKHO) REFERENCES KHO(MAKHO);
GO
ALTER TABLE LUUTRU
ADD CONSTRAINT FK_LUUTRU_HANGHOA
FOREIGN KEY (MAHH) REFERENCES HANGHOA(MAHH);
GO

--
ALTER TABLE KHO
ADD CONSTRAINT FK_KHO_NHANVIEN
FOREIGN KEY (MATK) REFERENCES NHANVIEN(MANV);
GO

--
ALTER TABLE PHIEUKIEMKHO
ADD CONSTRAINT FK_PHIEUKIEMKHO_NHANVIEN
FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV);
GO

--
ALTER TABLE CHITIETKIEMKHO
ADD CONSTRAINT FK_CHITIETKIEMKHO_PHIEUKIEMKHO
FOREIGN KEY (MAKK) REFERENCES PHIEUKIEMKHO(MAKK);
GO
ALTER TABLE CHITIETKIEMKHO
ADD CONSTRAINT FK_CHITIETKIEMKHO_LUUTRU
FOREIGN KEY (MALT) REFERENCES LUUTRU(MALT);
GO

--------------------------------------------------------
-- NHAP LIEU --
--
INSERT INTO LOAIHANGHOA(TENLHH)
VALUES 
	( N'Khác'),
	( N'Laptop'),
	( N'Màn hình'),
	( N'CPU - Bộ vi xử lí'),
	( N'MainBoard - Bo mạch chủ'),
	( N'GPU - Card đồ hoạ'),
	( N'RAM - Bộ nhớ trong'),
	( N'PSU - Nguồn máy tính'),
	( N'Phụ kiện'),
	( N'Thiết bị mạng');
-- ----------------
INSERT INTO HANGHOA(MAHH, TENHH, DONGIA, DONVITINH, MALHH)
VALUES
	( 'PS5', N'Máy chơi Game Sony Playstation 5 Standard Edition', 875, N'Bộ', 1),
	( 'PS4', N'Máy chơi game Sony Playstation 4 Pro 1TB', 565, N'Bộ', 1),
	( 'LapF13', N'Laptop ASUS XFlow 13', 3499, N'Cái', 2),
	( 'LapX17', N'Laptop Dell AlienWare X17-R1', 3820, N'Cái', 2),
	( 'AFV43U', N'Màn hình AORUS FV43U', 1799, N'Cái', 3),
	( 'LG38L', N'Màn hình LG 38L-950', 1820, N'Cái', 3),
	( 'I911900K', N'Vi xử lí Intel Core I9-11900K', 949, N'Cái', 4),
	( 'TP3995WX', N'Vi xử lí AMD Threadriper PRO 3995WX', 7200, N'Cái', 4),
	( '590GLACIAL', N'Bo mạch chủ Asus Z590 ROG MAXIMUS XIII GLACIAL', 1749, N'Cái', 5),
	( '570AQUA', N'Bo mạch chủ Asrock X570 AQUA (AMD Socket AM4)', 1349, N'Cái', 5),
	( '3090XTREME', N'Card màn hình GIGABYTE AORUS GeForce RTX 3090 XTREME 24GD', 3650, N'Cái', 6),
	( '3080VISION', N'Card màn hình GIGABYTE GeForce RTX 3080 Ti VISION OC 12G', 2749, N'Cái', 6),
	( 'TridentZ', N'RAM 32GB G.SKILL Trident Z Neo DDR4', 472, N'Bộ', 7),
	( 'DESIGNARE', N'RAM 64GB Gigabyte DESIGNARE', 540, N'Bộ', 7),
	( 'AX1600i', N'Nguồn Corsair AX1600i - 1600 Watt - 80 Plus Titanium', 800, N'Cái', 8),
	( 'ST1000', N'Nguồn Antec Signature Titanium ST1000 - 80 Plus Titanium', 450, N'Cái', 8),
	( 'ApexPRO', N'Bàn phím Steelseries Apex PRO', 210, N'Cái', 9),
	( 'OpusBlack', N'Tai nghe Razer Opus Black', 479, N'Cái', 9),
	( 'AX200', N'Card mạng WiFi 6 Intel Desktop Kit AX200', 29, N'Bộ', 10),
	( 'AX6000', N'Bộ định tuyến WiFi 6 TP-Link Archer AX6000', 599, N'Cái', 10);
--

--
INSERT INTO LOAIDOITAC(TENLDT)
VALUES
	( N'Doanh nghiệp'),
	( N'Cá nhân'),
	( N'Xưởng sản xuất'),
	( N'Cửa hàng bán lẻ');
--
INSERT INTO DOITAC( TENDT, DIACHI, EMAIL, SODT, VAITRO, MALDT)
VALUES
	( N'Công ty cổ phần Thế Giới Di Động', N'128 Trần Quang Khải, P. Tân Định, Q.1, TP.Hồ Chí Minh', N'cskh@thegioididong.com', '028 38125960', 0, 1),
	( N'Công Ty Cổ Phần Bán Lẻ Kỹ Thuật Số FPT', N'261 - 263 Khánh Hội, P. 5, Q.4, TP.Hồ Chí Minh', N'fptshop@fpt.com.vn', '(028)73023456', 0, 1),
	( N'Xưởng mod PC Nhện Hổ Phách', N'2 Hải Triều, P. Bến Nghé, Q.1, TP.Hồ Chí Minh', N'nhenhophach@gmail.com', '093 906 66 99', 0, 3),
	( N'Công ty ASUS', N'Tòa nhà Viettel, Hẻm 285 Cách Mạng Tháng Tám, P. 12, Q. 10, TP. Hồ Chí Minh', N'cskhasusvn@asus.com.vn', '1800 6588', 1, 1),
	( N'Cửa hàng GEARVN', N'189 Cống Quỳnh, P. Nguyễn Cư Trinh, Q. 1, TP. Hồ Chí Minh', N'CSKH@GEARVN.COM', '1800 6975', 0, 4),
	( N'Đặng Hữu Đăng Khoa', N'199 Nguyễn Văn Thủ, P. ĐA KAO, Q. 1, TP.HCM', N'CSKH@GEARVN.COM', '090 000 102', 1, 2);
--
INSERT INTO NHANVIEN(MANV, TENNV, VAITRO, MATKHAU, MUOI) 
VALUES 
	('khoalhd', N'Lê Hữu Đăng Khoa', 1, '12345','12345'),
	('minhnh', N'Nguyễn Hoài Minh', 1, '12345','12345'),
	('huynq', N'Nguyễn Quang Huy', 1, '12345','12345'),
	('huydq', N'Đỗ Quang Huy', 0, '12345','12345');
--
INSERT INTO KHO(MAKHO, DIACHI, MATK) 
VALUES
	(1, N'Đường M14, Bình Hưng Hoà, Bình Tân, Thành phố Hồ Chí Minh', 'khoalhd'),
	(2, N'36/6c Hiệp Thành 10, Tân Chánh Hiệp, Quận 12, Thành phố Hồ Chí Minh', 'minhnh'),
	(3, N'262 Quang Trung, Phường 10, Gò Vấp, Thành phố Hồ Chí Minh', 'huynq');
--
INSERT INTO LUUTRU( MAKHO, MAHH, SOLUONG)
VALUES
	(1, 'PS5', 250),
	(2, 'PS4', 450),
	(3, 'PS5', 1000),
	(1, 'LapF13', 356),
	(2, 'LapF13', 780),
	(3, 'LapX17', 100),
	(1, 'LG38L', 50),
	(2, 'LG38L', 250),
	(3, 'LG38L', 435),
	(1, 'TP3995WX', 810),
	(2, 'TP3995WX', 730),
	(3, 'TP3995WX', 600),
	(1, '570AQUA', 630),
	(2, '570AQUA', 590),
	(3, '590GLACIAL', 400),
	(1, '3090XTREME', 1000),
	(2, '3090XTREME', 1000),
	(3, '3080VISION', 970),
	(1, 'TridentZ', 800),
	(2, 'DESIGNARE', 400),
	(3, 'TridentZ', 800),
	(1, 'ST1000', 750),
	(2, 'ST1000', 780),
	(3, 'ST1000', 600),
	(1, 'ApexPRO', 150),
	(2, 'ApexPRO', 250),
	(3, 'OpusBlack', 435),
	(1, 'AX200', 765),
	(2, 'AX200', 750),
	(3, 'AX6000', 765);
--
INSERT INTO PHIEU( LOAI, TRANGTHAI, NGTHUCHIEN, NGHOANTHANH, MADT, MANV)
VALUES
	( 0, 1, '20210510', '20210511', 2, 'khoalhd'), 
	( 0, 1, '20210520', '20210521', 1, 'minhnh'),
	( 0, 1, '20210520', '20210521', 3, 'minhnh'),
	( 0, 1, '20210521', '20210522', 2, 'khoalhd'),
	( 1, 0, '20210603', '20210707', 6, 'huynq'),
	( 1, 1, '20210604', '20210606', 4, 'minhnh'),
	( 0, 0, '20210707', '20210708', 5, 'huynq'),
	( 1, 1, '20210707', '20210708', 6, 'huynq'),
	( 0, 0, '20210708', '20210809', 2, 'huynq'),
	( 0, 0, '20210709', '20210710', 1, 'khoalhd');
--
INSERT INTO CHITIETPHIEU( MAPHIEU, MALT, SOLUONG, DONGIA)
VALUES
	( 1, 1, 50, 40000),
	( 1, 2, 50, 40000),
	( 1, 3, 50, 40000),
	( 2, 4, 50, 40000),
	( 2, 5, 50, 40000),
	( 2, 6, 50, 40000),
	( 3, 7, 50, 40000),
	( 3, 8, 50, 40000),
	( 3, 9, 50, 40000),
	( 4, 10, 50, 40000),
	( 4, 11, 50, 40000),
	( 4, 12, 50, 40000),
	( 5, 13, 50, 40000),
	( 5, 14, 50, 40000),
	( 5, 15, 50, 40000),
	( 6, 16, 50, 40000),
	( 6, 17, 50, 40000),
	( 6, 18, 50, 40000),
	( 7, 19, 50, 40000),
	( 7, 20, 50, 40000),
	( 7, 21, 50, 40000),
	( 8, 22, 50, 40000),
	( 8, 23, 50, 40000),
	( 8, 24, 50, 40000),
	( 9, 25, 50, 40000),
	( 9, 26, 50, 40000),
	( 9, 27, 50, 40000),
	( 10, 28, 50, 40000),
	( 10, 29, 50, 40000),
	( 10, 30, 50, 40000);
--
INSERT INTO PHIEUKIEMKHO( NGAYLAP, NGAYKIEM, TRANGTHAI, MANV)
VALUES
	(	'20210404', '20210404', 1, 'minhnh'),
	(	'20210418', '20210419', 1, 'huydq'),
	(	'20210503', '20210504', 1, 'huydq'),
	(	'20210518', '20210519', 1, 'minhnh'),
	(	'20210529', '20210529', 1, 'khoalhd'),
	(	'20210604', '20210604', 1, 'huynq'),
	(	'20210620', '20210620', 1, 'huynq'),
	(	'20210707', '20210708', 0, 'khoalhd');
--
INSERT INTO CHITIETKIEMKHO( SOLUONGTON, SOLUONGTHUC, GHICHU, MALT, MAKK)
VALUES
	( 250, 250, '', 1, 1),
	( 450, 450, '', 2, 2),
	( 100, 999, '', 3, 3),
	( 356, 354, '', 4, 4),
	( 780, 777, '', 5, 5),
	( 100, 99, '', 6, 6),
	( 50, 50, '', 7, 7),
	( 250, 250, '', 8, 8);
GO
--------------------------------------------------------
-- TAO STORE PROCEDURE --
--
DROP PROC SP_NHAPCHITIETPHIEUNHAP
GO
CREATE PROC SP_NHAPCHITIETPHIEUNHAP(@MAPHIEU INT,
									@MAKHO INT,
									@MAHH VARCHAR(10),
									@SOLUONG FLOAT,
									@DONGIA FLOAT)
AS
	BEGIN
		DECLARE @MALT INT;
		SELECT @MALT = MALT FROM LUUTRU WHERE MAKHO = @MAKHO AND MAHH = @MAHH;
		IF (@MALT IS NULL)
			BEGIN
				INSERT INTO LUUTRU VALUES(@MAKHO, @MAHH, @SOLUONG)
				SELECT @MALT = MALT FROM LUUTRU WHERE MAKHO = @MAKHO AND MAHH = @MAHH;
				INSERT INTO CHITIETPHIEU VALUES (@MAPHIEU, @MALT, @SOLUONG, @DONGIA);
			END
		ELSE
			BEGIN
				INSERT INTO CHITIETPHIEU VALUES (@MAPHIEU, @MALT, @SOLUONG, @DONGIA);
				UPDATE LUUTRU SET SOLUONG = (SOLUONG + @SOLUONG) WHERE MALT = @MALT;
			END
	END
GO 
CREATE PROC SP_NHAPCHITIETPHIEUXUAT(@MAPHIEU INT,
									@MAKHO INT,
									@MAHH INT,
									@SOLUONG FLOAT,
									@DONGIA FLOAT)
AS
	BEGIN
		DECLARE @MALT INT;
		SELECT @MALT = MALT FROM LUUTRU WHERE MAKHO = @MAKHO AND MAHH = @MAHH;
		BEGIN TRY
			BEGIN TRAN
				INSERT INTO CHITIETPHIEU VALUES (@MAPHIEU, @MALT, @SOLUONG, @DONGIA);
				UPDATE LUUTRU SET SOLUONG = (SOLUONG - @SOLUONG) WHERE MALT = @MALT;
			COMMIT TRANSACTION
		END TRY  
		BEGIN CATCH  
			DECLARE
				@ErMessage NVARCHAR(2048),
				@ErSeverity INT,
				@ErState INT
			SELECT
				@ErMessage = ERROR_MESSAGE(),
				@ErSeverity =  ERROR_SEVERITY(),
				@ErState = ERROR_STATE()
			RAISERROR(
				@ErMessage,
				@ErSeverity,
				@ErState)  
		END CATCH;  
	END
GO

--INSERT INTO PHIEU( LOAI, TRANGTHAI, NGTHUCHIEN, NGHOANTHANH, MADT, MANV) VALUES( 0, 1, '20210610', '20210611', 2, 'khoalhd')
--SELECT * FROM PHIEU
--EXEC SP_NHAPCHITIETPHIEUNHAP 11, 3, 'ApexPRO', 100, 5000
--SELECT * FROM LUUTRU WHERE MAKHO = 3 AND MAHH = 'ApexPRO'
--SELECT * FROM CHITIETPHIEU WHERE MAPHIEU = 11

-------------------------------------------------------
-- TAO VIEW --
--











