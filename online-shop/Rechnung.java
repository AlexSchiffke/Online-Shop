
public class Rechnung{
	
	private AnzeigeStrategie strat;
	protected Artikel[] arts = new Artikel[999];
	private int index = 0;
	
	public void add(Artikel art){
		
		arts[index]=art;
		index++;
		
	}
	
	public void setStrategy(AnzeigeStrategie strat){
		this.strat = strat;
	}
	
	public void drucken(){
		strat.drucken(arts);
	}

}
