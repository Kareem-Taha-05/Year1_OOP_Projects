public class Team2 {
	public static void main(String[] args) {
		
		//creating 2D shapes 
		Shape2D defaultCircle = new Circle();       //user does not specify a radius so we use default value
        Shape2D circle = new Circle(5);             //radius = 5 , change if needed
        Shape2D rectangle = new Rectangle(4, 7);    //length = 4 , width = 7 , change if needed

        //creating 3D shapes
        Shape3D defaultSphere = new Sphere();       //user does not specify a radius so we use default value
        Shape3D sphere = new Sphere(3);             //radius = 3 , change if needed
        Shape3D cylinder = new Cylinder(3, 7);      //radius = 3 , height = 7 , change if needed

        //Default Circle output
        System.out.println(defaultCircle.toString());
        System.out.println("Area: " + defaultCircle.get2DArea());
        System.out.println("Perimeter: " + defaultCircle.getParameter());
        System.out.println();
        
        //Circle output
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.get2DArea());
        System.out.println("Perimeter: " + circle.getParameter());
        System.out.println();

        //Rectangle output
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.get2DArea());
        System.out.println("Perimeter: " + rectangle.getParameter());
        System.out.println();
        
        //Default Sphere output
        System.out.println(defaultSphere.toString());
        System.out.println("Surface Area: " + defaultSphere.getSurfaceArea());
        System.out.println("Volume: " + defaultSphere.getVolume());
        System.out.println();

        //Sphere output
        System.out.println(sphere.toString());
        System.out.println("Surface Area: " + sphere.getSurfaceArea());
        System.out.println("Volume: " + sphere.getVolume());
        System.out.println();

        //Cylinder output
        System.out.println(cylinder.toString());
        System.out.println("Surface Area: " + cylinder.getSurfaceArea());
        System.out.println("Lateral Area: " + cylinder.getLateralArea());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
