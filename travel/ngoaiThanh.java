package travel;

public class ngoaiThanh extends chuyenXe {
	private String noiDen;
	private int soNgayDi;
	
	public ngoaiThanh() {
		super();
	}
	
	public ngoaiThanh(String chuyenID, String taiXe, int soXe, String noiDen, int soNgayDi, long doanhThu) {
		super(chuyenID,taiXe,soXe,doanhThu);
		this.noiDen = noiDen;
		this.soNgayDi = soNgayDi;
	}		

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgayDi() {
		return soNgayDi;
	}

	public void setSoNgayDi(int soNgayDi) {
		this.soNgayDi = soNgayDi;
	}
	
	
}
