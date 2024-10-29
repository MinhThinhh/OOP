public class DemoPhong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phong p1 = new PhongLyThuyet("A101", 'X', 100, 30, true);
		//System.out.println(p1);
		Phong p2 = new PhongMayTinh("H501", 'H', 100, 40, 60);
		//System.out.println(p2);
		Phong p3 = new PhongThiNghiem("X301", 'Q', 200, 50, "Co khi",30,true);
		//System.out.println(p3);
		Phong p4 = new PhongLyThuyet("C001", 'A', 1000, 200, true);
		DanhSachPhong ds = new DanhSachPhong();
		ds.themPhong(p1);
		ds.themPhong(p2);
		ds.themPhong(p3);
		System.out.println(ds);
		System.out.println("Danh sach sap xep theo bonng den: ");
		ds.sapXepTheoBongDen();
		System.out.println(ds);
		ds.capNhat("H501", 66);
		System.out.println("Danh sach sau khi cap nhat: ");
		System.out.println(ds);
		System.out.println("Phong can tim: ");
		System.out.println(ds.timPhong("H501"));
		System.out.println("Them phong: ");
		System.out.println(ds.themPhong(p4));
	}
}
