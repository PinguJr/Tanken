import java.util.*;


public class Treibstoff {

	private String mTreibstoffname;
	private float mPreis;
	private Date mDate;
	
	public Treibstoff(String pTreibstoffname, int pPreis) {
		setmTreibstoffname(pTreibstoffname);
		setmPreis(pPreis);
		setmDate();
		
	}
	public String getmTreibstoffname() {
		return mTreibstoffname;
	}
	public void setmTreibstoffname(String mTreibstoffname) {
		this.mTreibstoffname = mTreibstoffname;
	}
	public float getmPreis() {
		return mPreis;
	}
	public void setmPreis(float mPreis) {
		this.mPreis = mPreis;
	}
	public Date getmDate() {
		return mDate;
	}
	public void setmDate() {
		Date datum = new Date();
	}
	
    
	
}
