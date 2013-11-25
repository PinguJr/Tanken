import java.util.*;


public class Treibstoff {

	private String mTreibstoffname;
	private float mPreis;
	private Date mDate;
	
	public void setmTreibstoffname(String mTreibstoffname) {
		this.mTreibstoffname = mTreibstoffname;
	}

	public String getmTreibstoffname() {
		return mTreibstoffname;
	}
	
    public void Treibstoffpreis(float pPreis) {
    	mDate = new Date();
    	setmPreis(pPreis);
    }

	public void setmPreis(float mPreis) {
		this.mPreis = mPreis;
	}
    
	
}
