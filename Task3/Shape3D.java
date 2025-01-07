//this abstract class is the parent to Sphere and Cylinder
abstract class Shape3D extends Shape {
	
    private double secondDimension;

	//this constructor is called by the Cylinder since it has 2 dimensions 
	public Shape3D(double firstDimension, double secondDimension) {
        super(firstDimension);
        setsecondDimension(secondDimension);
    }
	
	//this constructor is called by the Sphere since it has 1 dimension 
    public Shape3D(double firstDimension) {
        super(firstDimension);
    }

	//this constructor is called by the Sphere if the user does not define a default radius
    public Shape3D() {
        super();
    }
    
    //setter and getter for the second dimension (first dimension in the parent class)
    public void setsecondDimension(double secondDimension) {this.secondDimension = secondDimension; }
    public double getsecondDimension() {return secondDimension;}

    //abstract methods for Surface area and Lateral area and Volume
    abstract double getSurfaceArea();
    abstract double getLateralArea();
    abstract double getVolume();
}


class Sphere extends Shape3D {
	
	//constructor uses the parent constructor and passes the radius as the only dimension
    public Sphere(double radius) {
        super(radius);
    }

    //called if the user does not specify a radius value
    public Sphere() {
        super();
    }

    //override the abstract methods and the toString method
    @Override
    double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(getfirstDimension(), 2);
    }
    @Override
    double getLateralArea() {
        return getSurfaceArea(); //same as surface area for a sphere
    }
    @Override
    double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(getfirstDimension(), 3);
    }
    @Override
    public String toString() {
        return "Sphere: Radius = " + getfirstDimension();
    }
}


class Cylinder extends Shape3D {
	
    public Cylinder(double radius, double height) {
        super(radius, height);
    }

    //override the abstract methods and the toString method
    @Override
    double getSurfaceArea() {
        return 2 * Math.PI * getfirstDimension() * (getfirstDimension() + getsecondDimension());
    }
    @Override
    double getLateralArea() {
        return 2 * Math.PI * getfirstDimension() * getsecondDimension();
    }
    @Override
    double getVolume() {
        return Math.PI * Math.pow(getfirstDimension(), 2) * getsecondDimension();
    }
    @Override
    public String toString() {
        return "Cylinder: Radius = " + getfirstDimension() + ", Height = " + getsecondDimension();
    }
}
