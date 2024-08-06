public class testPoint{
	public static void main (String args[]){
		Point P1 = new Point();
		P1.setX1(6);
		P1.setX2(8);
		System.out.println(P1.getX1());
		System.out.println(P1.getX2());
		System.out.println(P1.calPLenth());
		
		Point P2 = new Point();
		System.out.println(P2.getX1());
		System.out.println(P2.getX2());
		System.out.println(P2.calPLenth());
	}
}
