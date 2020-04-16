package OOP;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1.setX(x1);
		this.v1.setY(y1);
		this.v2.setX(x2);
		this.v2.setY(y2);
		this.v3.setX(x3);
		this.v3.setY(y3);
	}
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public String toString() {
		int x1 = this.v1.getX();
		int y1 = this.v1.getY();
		int x2 = this.v2.getX();
		int y2 = this.v2.getY();
		int x3 = this.v3.getX();		
		int y3 = this.v3.getY();

		String s = "MyTriangle[v1=("+x1+","+y1+"),"+"("+x2+","+y2+"),"+"("+x3+","+y3+")]";
		return s;
	}
	
	public double getPerimeter() {
		return this.v1.distance(v2)+this.v2.distance(v3)+this.v1.distance(v3);
	}
	
	public String getType() {
		double e1 = this.v1.distance(v2);
		double e2 = this.v1.distance(v3);
		double e3 = this.v3.distance(v2);
		
		if(e1 == e2 && e2 == e3) return "Equilateral triangle!";
		if(e1 == e2 || e2 == e3 || e1 == e3) return "Isosceles triangle!";
		if(e1*e1+e2*e2==e3*e3 || e2*e2+e3*e3==e1*e1 || e1*e1+e3*e3==e2*e2) return "Right triangle!";
		return "Normal!";
	}
}
