//this class is used as the Parent to the abstract classes Shape2D and Shape3D
public class Shape {
	private double firstDimension = 10; //default value for the first dimension if they are not set when creating an object

	//this constructor is called if the user defines the first dimension
    public Shape(double firstDimension) {
        setfirstDimension(firstDimension);
    }

    //this constructor is called if the user does not define the first dimension so it uses the default value 10
    public Shape() {
        setfirstDimension(firstDimension);
    }

    //setter and getter
    public void setfirstDimension(double firstDimension) {this.firstDimension = firstDimension;}
    public double getfirstDimension() {return firstDimension;}
}