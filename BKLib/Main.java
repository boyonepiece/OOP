package BKLib;

import java.util.Scanner;

public class Main {
	static quanLi ql = new quanLi();
	
	static Scanner sc = new Scanner(System.in);
	
	public static void Option() {
		System.out.println("Các tác vụ khả dụng:");
		System.out.println("1. Thêm đầu sách.");
		System.out.println("2. Xem thông tin các sách giáo khoa.");
		System.out.println("3. Xem thông tin các sách tham khảo.");
		System.out.println("4. Xem thông tin các sách ngoại văn.");
		System.out.println("5. Tổng thành tiền của sách giáo khoa.");
		System.out.println("6. Tổng thành tiền của sách tham khảo.");
		System.out.println("7. Tổng thành tiền của sách ngoại văn.");
		System.out.println("8. Trung bình cộng đơn giá của các sách tham khảo.");
		System.out.println("9. Thông tin sách theo nhà xuất bản.");
		System.out.println("10. Thoát.");
		System.out.print("Nhập lựa chọn của bạn(1-10): ");
		int k = sc.nextInt();
		if(k==1) {
			ql.addSach();
			System.out.println("---------------");
			System.out.println("Nhập lựa chọn tiếp theo của bạn:");
			Option();
		}else if(k==2) {
			ql.inGK();
			System.out.println("---------------");
			System.out.println("Nhập lựa chọn tiếp theo của bạn:");
			Option();
		}else if(k==3) {
			ql.inTK();
			System.out.println("---------------");
			System.out.println("Nhập lựa chọn tiếp theo của bạn:");
			Option();
		}else if(k==4) {
			ql.inNV();
			System.out.println("---------------");
			System.out.println("Nhập lựa chọn tiếp theo của bạn:");
			Option();
		}else if(k==5){
			System.out.println("Tổng thành tiền các sách giáo khoa là: "+ql.tienGK());
			System.out.println("---------------");
			System.out.println("Nhập lựa chọn tiếp theo của bạn:");
			Option();
		}else if(k==6){
			System.out.println("Tổng thành tiền các sách tham khảo là: "+ql.tienTK());
			System.out.println("---------------");
			System.out.println("Nhập lựa chọn tiếp theo của bạn:");
			Option();
		}else if(k==7){
			System.out.println("Tổng thành tiền các sách ngoại văn là: "+ql.tienNV());
			System.out.println("---------------");
			System.out.println("Nhập lựa chọn tiếp theo của bạn:");
			Option();
		}else if(k==8){
			System.out.println("Trung bình công đơn giá của các sách tham khảo là: "+ql.tbcTK());
			System.out.println("---------------");
			System.out.println("Nhập lựa chọn tiếp theo của bạn:");
			Option();
		}else if(k==9){
			System.out.print("Nhà xuất bản của sgk cần tìm: ");
			sc.nextLine();
			String nxb = sc.nextLine();
			ql.timGK(nxb);
			System.out.println("---------------");
			System.out.println("Nhập lựa chọn tiếp theo của bạn:");
			Option();
		}else if(k==10) {
			System.out.println("Tạm biệt!");
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Option();
	}

}
