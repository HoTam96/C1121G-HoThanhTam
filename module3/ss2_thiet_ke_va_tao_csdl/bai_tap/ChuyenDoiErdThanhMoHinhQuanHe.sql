-- drop database produc_eer;
create database produc_eer;
use produc_eer;
create table nha_cung_cap(
ma_nhacc int auto_increment not null,
ten_nhacc varchar(100),
dia_chi varchar(100),
primary key (ma_nhacc));


create table so_dien_thoai(
ma_sdt int auto_increment not null,
ma_nhacc int,
so_dien_thoai varchar(20),
primary key (ma_sdt),
foreign key(ma_nhacc)references nha_cung_cap (ma_nhacc)
);


create table phieu_xuat(
so_px int auto_increment not null,
ngay_xuat date,
primary key (so_px));


create table vat_tu(
ma_vat_tu int auto_increment not null,
ten_vat_tu varchar(100),
primary key (ma_vat_tu)
);


create table chi_tiet_phieu_xuat(
don_gia double,
so_luong_xuat int,
ma_vat_tu int ,
so_px int ,
unique(ma_vat_tu, so_px),
primary key(ma_vat_tu, so_px),
foreign key(ma_vat_tu)references vat_tu(ma_vat_tu),
foreign key (so_px)references phieu_xuat(so_px)
);


create table don_dat_hang(
so_dh int auto_increment,
ngay_dh date,
ma_nhacc int,
primary key (so_dh),
foreign key (ma_nhacc)references nha_cung_cap(ma_nhacc)
);

-- create table cung_cap(
-- so_dh int,
-- ma_nhacc int,
-- primary key (so_dh,ma_nhacc),
-- foreign key (so_dh)references don_dat_hang(so_dh),
-- foreign key (ma_nhacc)references nha_cung_cap(ma_nhacc)
-- );
create table chi_tiet_dat_hang(
so_dh int,
ma_vat_tu int,
primary key (so_dh, ma_vat_tu),
unique(so_dh,ma_vat_tu),
 foreign key (so_dh)references don_dat_hang(so_dh),
foreign key(ma_vat_tu)references vat_tu(ma_vat_tu)
);


create table phieu_nhap(
so_pn int  auto_increment,
ngay_nhap date,
primary key (so_pn)
);


create table chi_tiet_nhap(
don_gia double,
so_luong_nhap int,
so_pn int,
ma_vat_tu int,
unique(so_pn,ma_vat_tu),
primary key(so_pn,ma_vat_tu),
foreign key(so_pn)references phieu_nhap(so_pn),
foreign key(ma_vat_tu)references vat_tu(ma_vat_tu)
);
	





