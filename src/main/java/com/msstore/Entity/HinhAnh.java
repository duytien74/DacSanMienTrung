package com.msstore.Entity;

import java.util.Date;

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
@Table(name = "HINHANH")
public class HinhAnh {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mahinh;
	private int masp;
	private String hinhanh;
	
	@ManyToOne
	@JoinColumn(name = "Ma_SP")
	SanPham maSP;
}
