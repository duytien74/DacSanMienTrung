package com.msstore.Entity;

import java.util.Date;
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
@Table(name = "DONHANG")
public class DonHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int madon;
	private String manv;
	private String makh;
	private Date ngaytao;
	private String trangthai;
	
	@OneToMany(mappedBy = "madonhang")
	List<ChiTietDonHang> ctdh;
	
	@ManyToOne
	@JoinColumn(name = "Ma_NV")
	NhanVien taikhoan;
	
	@ManyToOne
	@JoinColumn(name = "Ma_KH")
	KhachHang taiKhoan;
	
}
