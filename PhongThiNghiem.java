public class PhongThiNghiem extends Phong {
	private String chuyenNganh;
	private int sucChua;
	private boolean bonRua;
	
	public PhongThiNghiem(String maPhong, char dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua,
			boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public boolean isBonRua() {
		return bonRua;
	}

	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}

	@Override
	public boolean xetDatChuan() {
		// TODO Auto-generated method stub
		if(duAnhSang() && bonRua)
			return true;
		else
			return false;
		//return super.duAnhSang() && bonRua;
	}

	@Override
	public String toString() {
		return "PhongThiNghiem: " + super.toString() + ", chuyenNganh=" + chuyenNganh + ", sucChua="
				+ sucChua + ", bonRua=" + (bonRua?"Co":"Khong");
	}
	
	
}
