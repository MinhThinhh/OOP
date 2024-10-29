import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachPhong {
	private ArrayList<Phong> ds;

	public DanhSachPhong() {
		super();
		ds = new ArrayList<Phong>();
	}
	/*
	 * Tim co tra ve phong do, khong co tra ve null
	 */
	public Phong timPhong(String maPhong) {
		for(int i = 0; i < ds.size(); i++)
		{
			if(maPhong.equals(ds.get(i).maPhong))
				return ds.get(i);
		}
		return null;
	}
	public boolean themPhong(Phong p) {
		if(timPhong(p.maPhong)!=null)
			return false;
		ds.add(p);
		return true;
	}
	/*public void sapXepTheoDayNha() {
		Collections.sort(ds,new Comparator<Phong>() {
			@Override
			public int compare(Phong o1, Phong o2) {
				// TODO Auto-generated method stub
				return Character.valueOf(o1.dayNha).compareTo( Character.valueOf(o2.dayNha));
				//return o1.getDayNha().compareToIgnoreCase(o2.getDayNha());
			}
		});	
	}*/	
	public void sapXepTheoBongDen() {
		Collections.sort(ds, new Comparator<Phong>() {
			@Override
			public int compare(Phong o1, Phong o2) {
				if(o1.soBongDen > o2.soBongDen) {
					return 1;
				}
				else if(o1.soBongDen < o2.soBongDen) {
					return -1;
				}
				// TODO Auto-generated method stub
				return 0;	
			}
		});
	}
	public boolean capNhat(String maPhong, int soMayTinh ) {
		for(Phong ph : ds) {
			if(ph.getMaPhong().equalsIgnoreCase(maPhong)) {
				if(ph instanceof PhongMayTinh) {
					((PhongMayTinh)ph).setSoMayTinh(soMayTinh);
					return true;
				}
				else return false;
  			}
		}
		return false;
	}
	@Override
	public String toString() {
		String s = "Danh sach cac phong:";
		for(int i = 0; i < ds.size(); i++)
			s += "\n" + ds.get(i);
		return s;
	}
	
	
}
