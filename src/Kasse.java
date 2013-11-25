import java.util.*;

public class Kasse {
	
	List<Tanksaeule> Tanksaeulen = new ArrayList<Tanksaeule>();
	List<Treibstoff> Treibstoffe = new ArrayList<Treibstoff>();

	public void Zahlen(int pZapfsaeulenNr){
		for (Tanksaeule eineTanksaeule : Tanksaeulen) {
			eineTanksaeule.getmTanksaeulenNr();
		}
		
	}
		
}