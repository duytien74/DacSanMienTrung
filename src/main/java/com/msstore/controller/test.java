package com.msstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.msstore.DAO.BinhLuanDAO;
import com.msstore.DAO.ChiTIetDonHangDAO;
import com.msstore.DAO.ChucVuDAO;
import com.msstore.DAO.DonHangDAO;
import com.msstore.DAO.HinhAnhDAO;
import com.msstore.DAO.LoaiSPDAO;
import com.msstore.DAO.SanPhamDAO;
import com.msstore.DAO.TaiKhoanDAO;

@Controller
public class test {
	@Autowired
	SanPhamDAO spDAO;
	@Autowired
	ChucVuDAO cvDAO;
	
	@Autowired
	LoaiSPDAO lspDAO;
	
	@Autowired
	TaiKhoanDAO tkDAO;
	
	@Autowired
	DonHangDAO dhDAO;
	
	@Autowired
	ChiTIetDonHangDAO ctDAO;
	
	@Autowired
	BinhLuanDAO blDAO;
	
	@Autowired
	HinhAnhDAO haDAO;
@RequestMapping("/index")
public String index() {
	System.out.println(spDAO.findAll().size() + " san pham");
	System.out.println(cvDAO.findAll().size() + " chuc vu");
	System.out.println(lspDAO.findAll().size() + " loai san pham");
	System.out.println(tkDAO.findAll().size() + " tai khoan");
	System.out.println(dhDAO.findAll().size() + " don hang");
	System.out.println(ctDAO.findAll().size() + " chi tiet don hang");
	System.out.println(blDAO.findAll().size() + " binh luan");
	System.out.println(haDAO.findAll().size() + " hinh anh");
	return"client/index";
}
}
