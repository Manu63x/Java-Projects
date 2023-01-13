public class Hello{
	public static void main(String args[]){
		//System.out.println("Hello 4G");
		Punto p1 = new Punto(3,4,"A");
		Punto p2 = new Punto(6,7,"B");
		
		System.out.println("X:" +p1.getX());
		System.out.println("Y:" +p1.getY());
		System.out.println("Nome:" +p1.getNome());
		
		System.out.println(p1.toString());
		System.out.println("Distanza tra A e B: "+p1.distanza(p2));
		
	}
}