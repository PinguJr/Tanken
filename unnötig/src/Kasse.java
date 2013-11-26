import java.util.ArrayList;
import java.util.List;


public class Kasse {
	
	List<Tanksaeule> Tanksaeulen = new ArrayList<Tanksaeule>();
	
	public void Zahlen(int pZapfsaeulenNr){
		for (Tanksaeule eineTanksaeule : Tanksaeulen) {
			eineTanksaeule.getmTanksaeulenNr();
		}
	}
}
