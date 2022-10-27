package com.msstore.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "KHACHHANG")
public class KhachHang {
	@Id
	private String taikhoan;
	private String matkhau;
	private String hoten;
	private String email;
	private String sdt;
	private String diachi;

	@OneToMany(mappedBy = "taikhoan")
	List<BinhLuan> binhluan;
	
	@OneToMany(mappedBy = "taiKhoan")
	List<DonHang> donhang;
}
