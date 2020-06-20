
public class Box {
	double width;
	double heigth;
	double depth;
	public Box(double width,
	double heigth,double depth) {
		this.width=width;
		this.heigth=heigth;
		this.depth=depth;
		
	}
	public   double volume() {
		double v;
		v=width*heigth*depth;
		return v;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(34,56,78);
		System.out.println(b.volume());
		

	}

}
