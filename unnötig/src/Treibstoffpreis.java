import java.util.Date;


public class Treibstoffpreis {
	
	@SuppressWarnings("unused")
	private float mPreis;
    @SuppressWarnings("unused")
	private Date mDate;
    
    public Treibstoffpreis(float pPreis) {
    	mDate = new Date();
    	setmPreis(pPreis);
    }

	public void setmPreis(float mPreis) {
		this.mPreis = mPreis;
	}
    
}
