package BKLib;

public class sach {
	protected int maSach;
	protected String ten;
	protected String ngayNhap;
	protected double gia;
	protected int soLuong;
	protected String nhaXuatBan;
	protected double thanhTien=0.0;
	
	public sach() {
		
	}
	
	public sach(int maSach, String ten, String ngayNhap, double gia, int soLuong, String nhaXuatBan) {
		this.maSach = maSach;
		this.ten = ten;
		this.ngayNhap = ngayNhap;
		this.gia = gia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
	}
	
}
