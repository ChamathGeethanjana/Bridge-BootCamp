import java.util.Scanner;

public class ShapesCalculator{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		int choice;

		// user inetrction
		System.out.println("Hi welcome to the my Shapes Calculator Application");

		while (true) {

			System.out.println("Following are the shapes");

			System.out.println("1) Circle");
			System.out.println("2) Cuboid");
			System.out.println("3) Rectangle");
			System.out.println("4) Cylinder");
			System.out.println("5) Sphere");
			System.out.println("6) Cone");
			choice = input.nextInt();

			switch (choice) {
				//here, use to create object and call methods

				case 1:

					System.out.println("You selceted the circle");
					System.out.print("Enter the radius : ");
					double cirRadius = input.nextDouble();

					// creating the object
					Circle c1 = new Circle(cirRadius);

					// call the methods
					System.out.println("Circle Area = " + c1.calculateCircleArea());

					System.out.println("Circle Circumference = " + c1.calculateCircleCircumference());
					break;

				case 2:
					System.out.println("You selceted the Cuboid");
					System.out.println("Enter all values using a single unit");
					System.out.print("Enter the height : ");
					int cubHeight = input.nextInt();
					System.out.print("Enter the width : ");
					int cubWidth = input.nextInt();
					System.out.print("Enter the length : ");
					int cubLength = input.nextInt();

					// creating the object
					Cuboid cub1 = new Cuboid(cubLength, cubWidth, cubHeight);

					// call the methods
					System.out.println("Cuboid Surface Area = " + cub1.calculateCuboidSurfaceArea());

					System.out.println("Cuboid Volume = " + cub1.calculateCuboidVolume());
					break;

				case 3:
					System.out.println("You selceted the Rectangle");
					System.out.println("Enter all values using a single unit");
					System.out.print("Enter the width : ");
					int rectWidth = input.nextInt();
					System.out.print("Enter the length : ");
					int rectLength = input.nextInt();

					// creat the object
					Rectangle rect1 = new Rectangle(rectLength, rectWidth);

					// call the methods
					System.out.println("Rectangle Area = " + rect1.calculateRectangleArea());

					System.out.println("Rectangle Perimeter = " + rect1.calculateRectanglePerimeter());
					break;

				case 4:
					System.out.println("You selceted the Cylinder");
					System.out.println("Enter all values using a single unit");
					System.out.print("Enter the radius : ");
					double cylRadius = input.nextDouble();
					System.out.print("Enter the height : ");
					double cylHeight = input.nextDouble();

					// creat the object
					Cylinder cyl1 = new Cylinder(cylRadius, cylHeight);

					// call the methods
					System.out.println("Cylinder Surface Area = " + cyl1.calculateCylinderSurfaceArea());

					System.out.println("Cylinder Volume = " + cyl1.calculateCylinderVolume());
					break;

				case 5:
					System.out.println("You selceted the Sphere");
					System.out.print("Enter the radius : ");
					double spiRadius = input.nextDouble();

					// creat the object
					Sphere sph1 = new Sphere(spiRadius);

					// call the methods
					System.out.println("Sphere Surface Area = " + sph1.calculateSphereSurfaceArea());

					System.out.println("Sphere Sphere Volume = " + sph1.calculateSphereVolume());
					break;

				case 6:
					System.out.println("You selceted the Cone");
					System.out.println("Enter all values using a single unit");
					System.out.print("Enter the radius : ");
					double conRadius = input.nextDouble();
					System.out.print("Enter the height : ");
					double conHeight = input.nextDouble();

					// creat the object
					Cone con1 = new Cone(conRadius, conHeight);

					// call the methods
					System.out.println("Cone Surface Area = " + con1.calculateConeSurfaceArea());

					System.out.println("Cone Volume = " + con1.calculateConeVolume());
					break;

			}

			String use;
			System.out.print("Do you want to use the application further (Y/N) :");
			use = input.next();

			if (!use.equals("Y"))
				break;


		}
		System.out.println("Thank you for using this application");

	}
	

	

}