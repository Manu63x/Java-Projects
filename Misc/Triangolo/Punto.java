class Punto{
	private double x;
	private double y;
	private String nome;
	//costruttore
	public Punto(double x, double y, String nome){
		this.x=x;
		this.y=y;
		this.nome=nome;
	}
	
	//getter
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public String getNome(){
		return nome;
	}
	
	//setter
	public void setX(double x){
			this.x=x;
	}
	
	public void setY(double y){
			this.y=y;
	}
	
	public void setNome(String nome){
			this.nome=nome;
	}
	
	public double distanza(Punto a){
		return Math.sqrt(Math.pow((a.x-x),2)+Math.pow((a.y-y),2));
	}
	
	public String toString(){
		String res="";
		res+="X: "+x;
		res+=" Y: "+y;
		res+=" Nome: "+nome;
		return res;
	}
}