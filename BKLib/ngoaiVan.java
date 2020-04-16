package BKLib;

public class ngoaiVan extends sach {
	private String ngonNgu;
	
	public ngoaiVan() {
		super();
	}
	
	public ngoaiVan(int maSach, String ten, String ngayNhap, double gia, int soLuong, String nhaXuatBan, String ngonNgu) {
		super(maSach, ten,  ngayNhap, gia,soLuong, nhaXuatBan);
		this.ngonNgu = ngonNgu;
	}
	
	public double thanhTien() {
		return this.thanhTien = this.soLuong*this.gia*1.2;
	}

	public String getNgonNgu() {
		return ngonNgu;
	}

	public void setNgonNgu(String ngonNgu) {
		this.ngonNgu = ngonNgu;
	}
	
	
}
