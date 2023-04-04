public class Shape {
	private String color;
	private final Point location = new Point();
	
	public Shape(String shape) {
		color = shape;
	}
	public double getX() {
		return this.location.getX();
	}
	public double getY() {
		return this.location.getY();
	}
	public void setLocation(double x, double y) {
		this.location.setX(x);
		this.location.setY(y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void Print() {
		System.out.println("I'm a Shape!!");
	}
}


public class Point {
	private double x;
	private double y;
	
	public void setY(double y) {
		this.y = y;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public void Print() {
		System.out.println("The value of x is " + x +"\n the value of Y is "+y);
	}
}


public class Circle extends Shape{
	public double radius;
	public Circle(double r) {
		super("White");
		radius = r;
	}
	
	public void setCenter(double x, double y) {
		setLocation(x,y);
	}
	
	public Point getCenter() {
		Point p = new Point();
		p.setX(getX());
		p.setY(getY());
		return p;
	}
	
	@Override
	public void setColor(String color) {
		super.setColor(color);
	}
	@Override
	public String getColor() {
		return super.getColor();
	}
	@Override
    public void Print() {
        System.out.println("I am a Circle!");;
    }
	
}


public class Rectangle extends Shape {
	public Rectangle(double w, double h) {
		super("While");
		// TODO Auto-generated constructor stub
		width = w; 
		height = h;
	}

	public double width;
	public double height;
	
	public Point getCornerLeftLow() {
		Point leftL = new Point();
		leftL.setX(getX());
		leftL.setY(getY());
		return leftL;
	}
	
	public Point getCornerLeftUpp() {
		Point leftU = new Point();
		leftU.setX(getX());
		leftU.setY(getY() + height);
		return leftU;
	}
	
    public Point getCornerRightLow() {
        Point rightL = new Point();
        rightL.setX(getX() + width);
        rightL.setY(getY());
        return rightL;
    }

    public Point getCornerRightUpp() {
        Point rightU = new Point();
        rightU.setX(getX() + width);
        rightU.setY(getY() + height);
        return rightU;
    }
    
    public double getArea() {
        return width * height;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void Print() {
        System.out.println("I am a Rectangle!");;
    }
}


public class CreateShapes {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(3,10);
		circle.setLocation(3, 4);
		circle.setColor("Green");
		
		System.out.printf("Radius of the circle centered at (%.1f, %.1f) is %.2f\n", circle.getX(), circle.getY(), circle.radius);
        System.out.printf("Area of rectangle is %.2f\n", rectangle.getArea());
        System.out.printf("Color of circle is %s\n", circle.getColor());
        System.out.printf("Color of rectangle is %s\n", rectangle.getColor());
        rectangle.setLocation(2, 10);
        System.out.printf("Rectangle is now located at (%.1f, %.1f)\n", rectangle.getX(), rectangle.getY());
		

	}

}
