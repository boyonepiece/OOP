package travel;

import java.util.Scanner;

public class quanLi {
	private noiThanh[] noi = new noiThanh[100];
	private ngoaiThanh[] ng = new ngoaiThanh[100];
	private int soNoi=1;
	private int soNgoai=1;
	private long thuNoi=0L;
	private long thuNgoai=0L;
	
	Scanner sc = new Scanner(System.in);
	
	public quanLi() {
		this.ng[0] = new ngoaiThanh("AD","B",11,"HN",5,12000);
		this.noi[0] = new noiThanh("AS","A",1,2,300,1000);
	}
	
	public void addChuyen() {
		int k;
		System.out.println("Loại chuyến: ");
		System.out.println("\t1. Nội thành.");
		System.out.println("\t2. Ngoại thành.");
		System.out.print("Nhập mã chuyến muốn thêm(1 or 2):");
		k = sc.nextInt();
		System.out.print("Mã số chuyến: ");
		sc.nextLine();
		String chuyenID = sc.nextLine();
		System.out.print("Họ tên tài xế: ");
		//sc.nextLine();
		String taiXe = sc.nextLine();
		System.out.print("Số xe: ");
		int soXe = sc.nextInt();
		if(k==1) {
			System.out.print("Số tuyến: ");
			int soTuyen = sc.nextInt();
			System.out.print("Số km đi được: ");
			int soKm = sc.nextInt();
			System.out.print("Doanh thu: ");
			long doanhThu = sc.nextLong();
			noi[soNoi++] = new noiThanh(chuyenID,taiXe,soXe,soTuyen,soKm,doanhThu);
		}
		if(k==2) {
			System.out.print("Nơi đến: ");
			sc.nextLine();
			String noiDen = sc.nextLine();
			System.out.print("Số ngày đi được: ");
			int soNgayDi = sc.nextInt();
			System.out.print("Doanh thu: ");
			long doanhThu = sc.nextLong();
			ng[soNgoai++] = new ngoaiThanh(chuyenID,taiXe,soXe,noiDen,soNgayDi,doanhThu);
		}
		System.out.println("Thêm thành công!\n-----------------------------");
	}
	
	public void inTT() {
		int i = 0;
		System.out.println("Danh sách các chuyến xe:");
		System.out.println("++++++++++++");
		System.out.println("Các chuyến nội thành:");
		System.out.println("Mã số chuyến\t Tài xế\t Số xe\t Số tuyến\t Số km đi được\t Doanh thu");
		while(noi[i]!=null) {
			System.out.printf("%s \t\t %s \t %d \t %d \t\t %d \t\t %d",this.noi[i].chuyenID,this.noi[i].taiXe,this.noi[i].soXe,this.noi[i].getSoTuyen(),this.noi[i].getSoKm(),this.noi[i].doanhThu);
			i++;
		}
		System.out.println();
		System.out.println("===========");
		i=0;
		System.out.println("Các chuyến ngoại thành:");
		System.out.println("Mã số chuyến\t Tài xế\t Số xe\t Nơi đến\t Số ngày đi được\t Doanh thu");
		while(ng[i]!=null) {
			System.out.printf("%s\t\t%s\t%d\t%s\t\t%d\t\t\t%d",this.ng[i].chuyenID,this.ng[i].taiXe,this.ng[i].soXe,this.ng[i].getNoiDen(),this.ng[i].getSoNgayDi(),this.ng[i].doanhThu);
			i++;
		}
		System.out.println();
		System.out.println("-------------------");
	}
	
	public void thuNoi() {
		int i=0;
		while(noi[i]!=null) {
			thuNoi += noi[i++].doanhThu; 		
		}
	}
	
	public void thuNgoai() {
		int i=0;
		while(ng[i]!=null) thuNgoai += ng[i++].doanhThu; 		
	}

	public long getThuNoi() {
		return thuNoi;
	}

	public void setThuNoi(long thuNoi) {
		this.thuNoi = thuNoi;
	}

	public long getThuNgoai() {
		return thuNgoai;
	}

	public void setThuNgoai(long thuNgoai) {
		this.thuNgoai = thuNgoai;
	}
	
	
}
