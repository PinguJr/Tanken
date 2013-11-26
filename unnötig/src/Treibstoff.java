import java.util.ArrayList;
import java.util.List;


public class Treibstoff {

	private String mTreibstoffname;
	List<Treibstoffpreis> mExPreis = new ArrayList<Treibstoffpreis>();
	
	public void setmTreibstoffname(String mTreibstoffname) {
		this.mTreibstoffname = mTreibstoffname;
	}

	public String getmTreibstoffname() {
		return mTreibstoffname;
	}
	
}
