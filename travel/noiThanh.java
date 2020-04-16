package travel;

public class noiThanh extends chuyenXe {
	private long soTuyen;
	private long soKm;
	
	public noiThanh() {
		super();
	}
	
	public noiThanh(String chuyenID, String taiXe, int soXe, long soTuyen, long soKm, long doanhThu) {
		super(chuyenID,taiXe,soXe,doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	
	

	public long getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(long soTuyen) {
		this.soTuyen = soTuyen;
	}

	public long getSoKm() {
		return soKm;
	}

	public void setSoKm(long soKm) {
		this.soKm = soKm;
	}
	
	
}
