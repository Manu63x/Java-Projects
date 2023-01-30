public class carrello{
	private String elenco;
	private double costo;
	//costruttore
	public carrello(String elenco, double costo){
		this.elenco=elenco;
		this.costo=costo;
	}
	
	public void addItem(String nomeItem, double costoItem){
		elenco+=nomeItem;
		costo+=costoItem;
	}
	
	public void svuota(){
		elenco="";
		costo=0.0;
	}
	
	//toString
	public String toString(){
		String res="";
		res="Elenco: \n" + elenco + "\n\n-Costo totale " + costo;
		return res;
	}
}