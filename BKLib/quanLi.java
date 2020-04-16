package BKLib;

import java.util.Scanner;

public class quanLi {
	private giaoKhoa[] gk = new giaoKhoa[100];
	private thamKhao[] tk = new thamKhao[100];
	private ngoaiVan[] nv = new ngoaiVan[100];
	private int soGK=1;
	private int soTK=1;
	private int soNV=1;
	
	Scanner sc = new Scanner(System.in);
	
	public quanLi() {
		gk[0] = new giaoKhoa(1,"Giai tich","1/1/2010",15300,2,"DHBKHN","cu");
		tk[0] = new thamKhao(1,"Van mau","1/2/2010",23100,5,"NXB Nhi Dong","Van hoc",3000);
		nv[0] = new ngoaiVan(1,"TOEIC 1","2/1/2010",55500,3,"NXB BB","English");
	}
	
	public void addSach() {
		System.out.println("--------------");
		System.out.println("1. Sách giáo khoa.\n2. Sách tham khảo.\n3. Sách ngoại văn.");
		System.out.println("Bạn muốn thêm loại sách(1-3): ");
		int k = sc.nextInt();
		System.out.print("Mã sách: ");
		int ms = sc.nextInt();
		System.out.print("Tiêu đề sách: ");
		sc.nextLine();
		String td = sc.nextLine();
		System.out.print("Ngày nhập: ");
		String nn = sc.nextLine();
		System.out.print("Đơn giá: ");
		double gia = sc.nextDouble();
		System.out.print("Số lượng: ");
		int sl = sc.nextInt();
		System.out.print("Nhà xuất bản: ");
		String nxb = sc.nextLine();
		if(k==1) {
			System.out.print("Tình trạng: ");
			sc.nextLine();
			String tt = sc.nextLine();
			gk[soGK++] = new giaoKhoa(ms,td,nn,gia,sl,nxb,tt);
			System.out.println("Thêm sách thành công!\n---------------------");
		}else if(k==2) {
			System.out.print("Chuyên ngành: ");
			sc.nextLine();
			String cn = sc.nextLine();
			System.out.print("Thuế: ");
			double thue = sc.nextDouble();
			tk[soTK++] = new thamKhao(ms,td,nn,gia,sl,nxb,cn,thue);
			System.out.println("Thêm sách thành công!\n---------------");
		}else if(k==3) {
			System.out.print("Ngôn ngữ: ");
			sc.nextLine();
			String NN = sc.nextLine();
			nv[soNV++] = new ngoaiVan(ms,td,nn,gia,sl,nxb,NN);
			System.out.println("Thêm sách thành công!\n---------------");
		}
		
	}
	
	public void inGK() {
		int i=0;
		System.out.println("Danh sách sách giáo khoa:");
		System.out.println("Mã sách\t Tiêu đề\t Ngày nhập\t Đơn giá\t Số lượng\t Nhà xuất bản\t Tình trạng");
		
		while(gk[i]!=null) {
			System.out.printf("%d \t %s \t %s \t %f \t %d \t\t %s \t %s\n",this.gk[i].maSach,this.gk[i].ten,this.gk[i].ngayNhap,this.gk[i].gia,this.gk[i].soLuong,this.gk[i].nhaXuatBan,this.gk[i].getTinhTrang());
			i++;
		}		
	}
	
	public void inTK() {
		int i=0;
		System.out.println("Danh sách sách tham khảo:");
		System.out.println("Mã sách\t Tiêu đề\t Ngày nhập\t Đơn giá\t Số lượng\t Nhà xuất bản\t Chuyên ngành\t Thuế");
		
		while(tk[i]!=null) {
			System.out.printf("%d\t%s\t\t%s\t%f\t %d\t\t %s\t %s\t  %f\n",tk[i].maSach,tk[i].ten,tk[i].ngayNhap,this.tk[i].gia,tk[i].soLuong,tk[i].nhaXuatBan,tk[i].getChuyenNganh(),tk[i].getThue());
			i++;
		}
	}
	
	public void inNV() {
		int i=0;
		System.out.println("Danh sách sách ngoại văn:");
		System.out.println("Mã sách\t Tiêu đề\t Ngày nhập\t Đơn giá\t Số lượng\t Nhà xuất bản\t Ngôn ngữ");
		
		while(nv[i]!=null) {
			System.out.printf("%d\t%s\t\t%s\t%f\t  %d\t\t  %s\t  %s\n",nv[i].maSach,nv[i].ten,nv[i].ngayNhap,nv[i].gia,nv[i].soLuong,nv[i].nhaXuatBan,nv[i].getNgonNgu());
			i++;
		}
	}
	
	public double tienGK() {
		double t = 0;
		int i=0;
		while(gk[i]!=null) t += gk[i++].thanhTien();
		return t;
	}
	
	public double tienTK() {
		double t = 0;
		int i=0;
		while(tk[i]!=null) t += tk[i++].thanhTien();
		return t;
	}
	
	public double tienNV() {
		double t = 0;
		int i=0;
		while(nv[i]!=null) t += nv[i++].thanhTien();
		return t;
	}
	
	public double tbcTK() {
		double t=0;
		int i=0;
		while(tk[i]!=null) t += tk[i++].gia;
		return t/soTK;
	}
	
	public void timGK(String X) {
		int i=0;
		int d=0;
		System.out.println("Mã sách\t Tiêu đề\t Ngày nhập\t Đơn giá\t Số lượng\t Nhà xuất bản\t Tình trạng");
		while(gk[i]!= null) {
			if(gk[i].nhaXuatBan.contains(X)) {
				System.out.printf("%d \t %s \t %s \t %f \t %d \t\t %s \t %s\n",this.gk[i].maSach,this.gk[i].ten,this.gk[i].ngayNhap,this.gk[i].gia,this.gk[i].soLuong,this.gk[i].nhaXuatBan,this.gk[i].getTinhTrang());
				d++;
			}
			i++;
		}
		if(d==0) System.out.println("Không tìm thấy!");
	}
	
}
