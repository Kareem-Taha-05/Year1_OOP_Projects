//this abstract class is the parent to Circle and Rectangle
abstract class Shape2D extends Shape {
	
    private double secondDimension;

    //this constructor is called by the rectangle since it has 2 dimensions
    public Shape2D(double firstDimension, double secondDimension) {
        super(firstDimension);
        setsecondDimension(secondDimension);
    }

    //this constructor is called by the circle since it has 1 dimension
    public Shape2D(double firstDimension) {
        super(firstDimension);
    }
    
    //this constructor is called by the circle since if the user does not specify a radius 
    public Shape2D() {
        super();
    }

    //setter and getter for the second dimension (first dimension in the parent class)
    public void setsecondDimension(double secondDimension) {this.secondDimension = secondDimension; }
    public double getsecondDimension() {return secondDimension;}

    //abstract methods for Area and Parameter
    abstract double get2DArea();
    abstract double getParameter();
}

//child class to Shape2D
class Circle extends Shape2D {
	
	//constructor uses the parent constructor and passes the radius as the only dimension
    public Circle(double radius) {
        super(radius);
    }
    
    //called if the user does not specify a radius value
    public Circle() {
        super();
    }

    //override the abstract methods and the toString method
    @Override
    double get2DArea() {
        return Math.PI * Math.pow(getfirstDimension(), 2);
    }
    @Override
    double getParameter() {
        return 2 * Math.PI * getfirstDimension();
    }
    @Override
    public String toString() {
        return "Circle: Radius = " + getfirstDimension();
    }
}

//another child class to Shape2D
class Rectangle extends Shape2D {
	
	//uses the parent constructor and passes the length and width as the first and second dimension
    public Rectangle(double length, double width) {
        super(length, width);
    }

    //override the abstract methods and the toString method
    @Override
    double get2DArea() {
        return getfirstDimension() * getsecondDimension();
    }
    @Override
    double getParameter() {
        return 2 * (getfirstDimension() + getsecondDimension());
    }
    @Override
    public String toString() {
        return "Rectangle: Length = " + getfirstDimension() + ", Width = " + getsecondDimension();
    }
}