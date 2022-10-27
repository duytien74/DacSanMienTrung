package com.msstore.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "ChiTietDonHang")
public class ChiTietDonHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mactdh;
	private int madon;
	private int masp;
	private Double dongia;
	private int soluong;
	
	@ManyToOne
	@JoinColumn(name = "Ma_SP")
	SanPham maSP;
	
	@ManyToOne
	@JoinColumn(name = "Ma_Don")
	DonHang madonhang;
}
