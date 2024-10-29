public class PhongLyThuyet extends Phong {
	private boolean mayChieu;
	
	public PhongLyThuyet(String maPhong, char dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}
	
	public boolean isMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}

	@Override
	public boolean xetDatChuan() {
		// TODO Auto-generated method stub
		if(duAnhSang() && mayChieu)
			return true;
		else
			return false;
		//return super.coDuAnhSang() && coMayChieu;
	}

	@Override
	public String toString() {
		return "PhongLyThuyet: " + super.toString() + ", mayChieu=" + (mayChieu?"Co":"Khong");
	}
	

}
