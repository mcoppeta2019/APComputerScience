//	Dealership Test
//	Michael Coppeta
// 	This program tests the Car and Dealership classes

public class DealershipTest {

	public static void main(String[] args){
		//declares cars for dealership
		Car a = new Car();
		Car eq = new Car(2014, "Honda", "Accord", "White");
		Car car1 = new Car(2014, "Honda", "Accord", "White");
		Car car2 = new Car(2015, "Toyota", "Camry", "Red");
		Car car3 = new Car(2013, "Honda", "Civic", "Blue");
		
		//puts cars in an array
		Car[] carArray = {car1, car2, car3};
		
		//creates dealership object
		Dealership dealer = new Dealership("Joyal's Cars", carArray);
		
		//print dealer info
		System.out.println(dealer);
		
		//create car
		Car dreamCar = new Car(2014, "Honda", "Accord", "White");
		
		//see if it's in dealer
		System.out.println(dealer.inStock(dreamCar)); //true
		//System.out.println(dealer.inStock(a)); //false
		
	}
}
