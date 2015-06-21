
public class HTMLAnzeige implements AnzeigeStrategie{

	public void drucken(Artikel[] arts) {
		
		for(int i = 0; i< arts.length; i++){
			System.out.println("<table>");
			if(arts[i]!=null){
				System.out.println("<tr><td>" + arts[i].bezeichnung + "</td>");	
				System.out.println("<td>" + arts[i].preis + "</td></tr>");				
			}else{
				break;				
			}
			System.out.println("</table>");
			
		}
		
	}

}
