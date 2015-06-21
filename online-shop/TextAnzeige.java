
public class TextAnzeige implements AnzeigeStrategie{

	public void drucken(Artikel[] arts) {
		
		for(int i = 0; i< arts.length; i++){
			
			if(arts[i]!=null){
				System.out.println(arts[i].bezeichnung + ":  " + arts[i].preis);
			}else{
				break;				
			}
			
		}
		
	}

}
