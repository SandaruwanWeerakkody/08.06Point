public class Point{
	private double x1;
	private double x2;
	
	public Point(){
		x1 =4;
		x2 =3;
	}
	public Point(double x1){
		this.x1=x1;
		x2=3;
	}
	public Point(double x1,double x2){
		this.x1=x1;
		this.x2=x2;
	}
	public double getX1(){
		return x1;
	}
	public double getX2(){
		return x2;
	}
	public void setX1(double x1){
		this.x1=x1;
	}
	public void setX2(double x2){
		this.x2=x2;
	}
	public void setX1X2(double x1,double x2){
		this.x1=x1;
		this.x2=x2;
	}
	public double calPLenth(){
		return (Math.sqrt((this.x1*this.x1)+(this.x2*this.x2)));
	}
	
}
