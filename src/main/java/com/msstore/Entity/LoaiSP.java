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
@Table(name = "LoaiSP")
public class LoaiSP {
	@Id
	private String maloai;
	private String tenloai;
	
	@OneToMany(mappedBy = "maloai")
	List<SanPham> sp;
}
