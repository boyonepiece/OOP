package travel;

import java.util.Scanner;

public class Main {
	static quanLi ql = new quanLi();
	
	static Scanner sc = new Scanner(System.in);
	
	public static void Option() {
		System.out.println("Các tác vụ khả dụng:");
		System.out.println("1. Thêm thông tin chuyến xe.");
		System.out.println("2. Xem thông tin các chuyến xe.");
		System.out.println("3. Xem tổng doanh thu xe nội thành.");
		System.out.println("4. Xem tổng doanh thu xe ngoại thành.");
		System.out.println("5. Thoát. ");
		System.out.print("Nhập lựa chọn của bạn(1-4): ");
		int k = sc.nextInt();
		if(k==1) {
			ql.addChuyen();
			System.out.println("---------------");
			System.out.println("Nhập lựa chọn tiếp theo của bạn:");
			Option();
		}else if(k==2) {
			ql.inTT();
			System.out.println("---------------");
			System.out.println("Nhập lựa chọn tiếp theo của bạn:");
			Option();
		}else if(k==3) {
			ql.thuNoi();
			System.out.println("Tổng doanh thu xe nội thành: " + ql.getThuNoi());	
			System.out.println("---------------");
			System.out.println("Nhập lựa chọn tiếp theo của bạn:");
			Option();
		}else if(k==4) {
			ql.thuNgoai();
			System.out.println("Tổng doanh thu xe ngoại thành: " + ql.getThuNgoai());			
			System.out.println("---------------");
			System.out.println("Nhập lựa chọn tiếp theo của bạn:");
			Option();
		}else if(k==5) {
			System.out.println("Tạm biệt!");
			return;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Option();
	}

}
