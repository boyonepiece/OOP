package travel;

public class chuyenXe {
	protected String chuyenID;
	protected String taiXe;
	protected int soXe;
	protected long doanhThu;
	
	public chuyenXe() {
		
	}
	
	public chuyenXe(String chuyenID, String taiXe, int soXe, long doanhThu) {
		this.chuyenID = chuyenID;
		this.doanhThu = doanhThu;
		this.soXe = soXe;
		this.taiXe = taiXe;
	}
		
}
