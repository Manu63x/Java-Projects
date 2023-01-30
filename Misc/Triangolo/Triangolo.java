class Triangolo{
	
	private Punto[] punti= new Punto[3];
	
	public Triangolo(Punto a, Punto b, Punto c) {
		punti[0] = a;
		punti[1] = b;
		punti[2] = c;
	}

	public String getPointName(int pointNum){
		return punti[pointNum].getNome();
	}

	public double getPointX(int pointNum){
		return punti[pointNum].getX();
	}

	public double getPointY(int pointNum){
		return punti[pointNum].getY();
	}
	
	public String getTrName(){
		return punti[0].getNome()+punti[1].getNome()+punti[2].getNome();
	}
	
	public double perimetro(){
		return punti[0].distanza(punti[1])+punti[1].distanza(punti[2])+punti[2].distanza(punti[0]);
	}
	
	public double areaSarrus(){
		return Math.abs((punti[0].getX()*punti[1].getY()+punti[0].getY()*punti[2].getX()+punti[1].getX()*punti[2].getY()-punti[2].getX()*punti[1].getY()-punti[2].getY()*punti[0].getX()-punti[1].getX()*punti[0].getY()))/2;
	}

	public double areaErone(){
		double p = perimetro()/2;
		return Math.sqrt(p*(p-punti[0].distanza(punti[1]))*(p-punti[1].distanza(punti[2]))*(p-punti[2].distanza(punti[0])));
	}
	
	
}