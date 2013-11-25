import java.util.*;


public class Treibstoff {

	private String mTreibstoffname;

	
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

    
	
}
