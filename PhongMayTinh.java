public class PhongMayTinh extends Phong {
	private int soMayTinh;
	
	public PhongMayTinh(String maPhong, char dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}
	
	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}
	
	@Override
	public boolean xetDatChuan() {
		// TODO Auto-generated method stub
		if(duAnhSang() && dienTich/soMayTinh>=1.5)
			return true;
		else
			return false;
		//return super.coDuAnhSang() && (dienTich/soMayTinh >=1.5);
	}

	@Override
	public String toString() {
		return "PhongMayTinh: " + super.toString() + ", soMayTinh=" + soMayTinh;
	}
	
}
