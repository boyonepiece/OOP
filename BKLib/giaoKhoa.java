package BKLib;

public class giaoKhoa extends sach {
	private String tinhTrang;
	
	public giaoKhoa() {
		super();
	}
	
	public giaoKhoa(int maSach, String ten, String ngayNhap, double gia, int soLuong, String nhaXuatBan, String tinhTrang) {
		super( maSach, ten, ngayNhap, gia,  soLuong, nhaXuatBan);
		this.tinhTrang = tinhTrang;
	}
	
	public double thanhTien() {
		if(this.tinhTrang == "cu" || this.tinhTrang =="Cu" || this.tinhTrang == "CU") {
			this.thanhTien = this.soLuong*this.gia;
		}else this.thanhTien = this.soLuong*this.gia*0.5;
		return this.thanhTien;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	
}
