package com.msstore.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity 
@Table(name = "SANPHAM")
public class SanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int masp;
	private String tensp;
	private int soluong;
	private Double dongia;
	private String mota;
	
	@ManyToOne
	@JoinColumn(name = "MaLoai")
	LoaiSP maloai;
	
	@OneToMany(mappedBy = "maSP")
	List<HinhAnh> hinhanh;
	
	@OneToMany(mappedBy = "maSP")
	List<ChiTietDonHang> ctdh;
}
