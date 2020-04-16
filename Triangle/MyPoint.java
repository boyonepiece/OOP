package OOP;

public class MyPoint {
	private int x=0;
	private int y=0;
	
	public MyPoint() {		
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		int a[] = new int[2];
		a[0] = this.x;
		a[1] = this.y;
		return a;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		String s = "(" + this.x + "," + this.y +")";
		return s;		
	}
	
	public double distance(int x, int y) {
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}
	
	public double distance(MyPoint another) {
		return Math.sqrt((this.x-another.x)*(this.x-another.x)+(this.y-another.y)*(this.y-another.y));
	}
	
	public double distance() {
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
}
