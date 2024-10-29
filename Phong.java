public abstract  class Phong {
	protected String maPhong;
	protected char dayNha;
	protected double dienTich;
	protected int soBongDen;
	public Phong(String maPhong, char dayNha, double dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		setDienTich(dienTich);
		this.soBongDen = soBongDen;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public char getDayNha() {
		return dayNha;
	}
	public void setDayNha(char dayNha) {
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		if(dienTich > 0)
			this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	public boolean duAnhSang() {
		return (dienTich/soBongDen <= 10);
	}
	public abstract boolean xetDatChuan();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maPhong == null) ? 0 : maPhong.hashCode());
		result = prime * result + dayNha;
		long temp;
		temp = Double.doubleToLongBits(dienTich);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + soBongDen;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phong other = (Phong) obj;
		if (maPhong == null) {
			if (other.maPhong != null)
				return false;
		} else if (!maPhong.equals(other.maPhong))
			return false;
		if (dayNha != other.dayNha)
			return false;
		if (Double.doubleToLongBits(dienTich) != Double.doubleToLongBits(other.dienTich))
			return false;
		if (soBongDen != other.soBongDen)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MaPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen="
				+ soBongDen + ", xetDatChuan()=" + (xetDatChuan()?"Dat":"Khong");
	}
	
}