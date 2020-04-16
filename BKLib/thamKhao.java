package BKLib;

public class thamKhao extends sach {
	private String chuyenNganh;
	private double thue;
	
	public thamKhao() {
		super();
	}
	
	public thamKhao(int maSach, String ten, String ngayNhap, double gia, int soLuong, String nhaXuatBan, String chuyenNganh, double thue) {
		super(maSach, ten,  ngayNhap, gia,soLuong, nhaXuatBan);
		this.chuyenNganh = chuyenNganh;
		this.thue = thue;
	}
	
	public double thanhTien() {
		return this.thanhTien = this.soLuong*this.gia+this.thue;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(long thue) {
		this.thue = thue;
	}
	
	
}
