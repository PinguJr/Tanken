import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;


public class Start {

	/**
	 * @param args
	 */
	
	//Utilss
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    }
	    // only got here if we didn't return false
	    return true;
	}
	
	public enum Actions{
		TANKEN, BEZAHLEN, VERWALTEN		
	}
	
	public static void main(String[] args) {
		
		//Configure default ressources

		List<Treibstoff> treibstoffe = new ArrayList<Treibstoff>();
		List<Tanksaeule> tanksaeulen = new ArrayList<Tanksaeule>();
		
		treibstoffe.add(new Treibstoff("diesel", 5));
		treibstoffe.add(new Treibstoff("benzin", 7));
		treibstoffe.add(new Treibstoff("bioöl", 10));
		
		tanksaeulen.add(new Tanksaeule(0));
		tanksaeulen.add(new Tanksaeule(1));
		tanksaeulen.add(new Tanksaeule(2));
		tanksaeulen.add(new Tanksaeule(3));
		
		for (Tanksaeule saeule : tanksaeulen) {
			saeule.setmVerwendbar(true);
			saeule.treibstoffe.addAll(treibstoffe);
		}	
		
		//loop until user exits application
		boolean doRun = true;
		
		while (doRun)
		{
			String action = JOptionPane.showInputDialog("Welche Aktion ausführen?");
			Actions enumval = Actions.valueOf(action);
			switch (enumval) {
	            case TANKEN:
	            	Tanken(tanksaeulen);
	                     break;
	            case BEZAHLEN:  
	            	Bezahlen(tanksaeulen);
	                     break;
	            case VERWALTEN:  //TODO: Verwaltung Tankstellen-Ressoucen
	                break;
	            default: JOptionPane.showMessageDialog(null, "Nicht verfügbar.");
	                     break;
			}
			
		}		
	}
	
	public static void Tanken(List<Tanksaeule> saeulen)
	{
		Tanksaeule saeule = GetValidSaeule(saeulen);
		Treibstoff stoff = GetValidTreibstoff(saeule.treibstoffe);
		JOptionPane.showMessageDialog(null, "Der gewählte Treibstoff kostet: " + stoff.getmTreibstoffPrice());
		saeule.setmVerwendbar(false);
	}
	
	public static void Bezahlen(List<Tanksaeule> saeulen)
	{
		String saeule = JOptionPane.showInputDialog("Nummer der Zapfsäule?");
		if (isInteger(saeule))
		{
			int intSaeule = Integer.parseInt(saeule);
			for (Tanksaeule saeuleFromList : saeulen) {
				if (saeuleFromList.getmTanksaeulenNr() == intSaeule)
				{
					saeuleFromList.setmVerwendbar(true);
					JOptionPane.showMessageDialog(null, "Vielen dank.");
				}
			}
		}
	}
	
	public static Tanksaeule GetValidSaeule(List<Tanksaeule> saeulen)
	{
		boolean notFound = true;
		
		while(notFound)
		{
			String saeule = JOptionPane.showInputDialog("Nummer der Zapfsäule?");
			if (isInteger(saeule))
			{
				int intSaeule = Integer.parseInt(saeule);
				for (Tanksaeule saeuleFromList : saeulen) {
					if (saeuleFromList.getmTanksaeulenNr() == intSaeule && saeuleFromList.ismVerwendbar())
					{
						return saeuleFromList;
					}
				}
			}
		}
		return null;
	}
	
	public static Treibstoff GetValidTreibstoff(List<Treibstoff> stoffe)
	{
		boolean notFound = true;
		
		while(notFound)
		{
			String saeule = JOptionPane.showInputDialog("Name des Treibstoffes?");
			for (Treibstoff treibstoff : stoffe) {
				if (treibstoff.getmTreibstoffname() == saeule)
				{
					return treibstoff;
				}
			}
		}
		return null;
	}
}
