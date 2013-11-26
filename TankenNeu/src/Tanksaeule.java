import java.util.ArrayList;
import java.util.List;


public class Tanksaeule {

	private int mTanksaeulenNr;
	private boolean mVerwendbar;
	private double mLKW;
	private double mAuto;
	public List<Treibstoff> treibstoffe = new ArrayList<Treibstoff>();
	
	public Tanksaeule(int pTanksaeulenNr){
		setmTanksaeulenNr(pTanksaeulenNr);
	}
	
	public void setmVerwendbar(boolean mVerwendbar) {
		this.mVerwendbar = mVerwendbar;
	}
	
	public boolean ismVerwendbar() {
		return mVerwendbar;
	}
	
	public void setmTanksaeulenNr(int mTanksaeulenNr) {
		this.mTanksaeulenNr = mTanksaeulenNr;
	}
	
	public int getmTanksaeulenNr() {
		return mTanksaeulenNr;
	}
	
	
}
