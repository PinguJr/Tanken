import java.util.ArrayList;
import java.util.List;


public class Treibstoff {
	
	private String mTreibstoffname;
	private int mTreibstoffID;
	private int mTreibstoffPrice;


	public Treibstoff(String pTreibstoffname, int pTreibstoffID) {
		setmTreibstoffname(pTreibstoffname);
		setmTreibstoffID(pTreibstoffID);

	}

	public String getmTreibstoffname() {
		return mTreibstoffname;
	}
	public void setmTreibstoffname(String mTreibstoffname) {
		this.mTreibstoffname = mTreibstoffname;
	}

	public int getmTreibstoffPrice() {
		return mTreibstoffPrice;
	}
	public void setmTreibstoffPrice(int mTreibstoffPrice) {
		this.mTreibstoffPrice = mTreibstoffPrice;
	}

	public int getmTreibstoffID() {
		return mTreibstoffID;
	}

	public void setmTreibstoffID(int mTreibstoffID) {
		this.mTreibstoffID = mTreibstoffID;
	}

    
	
}
