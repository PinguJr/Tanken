import java.util.Date;


public class Treibstoffpreis {
	
	public Treibstoffpreis(int pPreis){
		setmPreis(pPreis);
		setmDate();
	}
	
	private float mPreis;
	private Date mDate;
	
	public float getmPreis() {
		return mPreis;
	}
	public void setmPreis(float pPreis) {
		this.mPreis = pPreis;
	}
	public Date getmDate() {
		return mDate;
	}
	public void setmDate() {
		Date datum = new Date();
	}
	
}
