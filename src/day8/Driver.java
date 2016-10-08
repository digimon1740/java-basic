package day8;

public class Driver {

	/*
	 * 매개변수의 다형성 
	 * */
	public void drive(Vehicle vehicle) {
		vehicle.run();
		//vehicle.stop();
		System.out.println(vehicle.toString());
		
		// 다형성으로 작성된 코드는 부모클래스에 존재하는 메서드만 호출할수있다.
		//vehicle.stop();
		
		// 형변환 , 영어로하면 casting
		// Down casting : 부모클래스를 자식클래스로 형변환하는걸 말한다 
		
		// instanceof는 런타임시에 객체가 우변에 있는 클래스의 인스턴스가 맞는지 확인한다 
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.stop();	
		} else if (vehicle instanceof Taxi) {
			Taxi taxi = (Taxi) vehicle;
			taxi.stop();
		}
		// Up casting : 자식클래스를 부모클래스로 형변환하는걸 말한다
		//Vehicle vehicle2 = (Vehicle) bus;

	}
	
//	public void drive(Bus bus) {
//		bus.run();
//	}
//	
//	public void drive(Taxi taxi) {
//		taxi.run();
//	}
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		/*
		 * 다형성이란 ? 자식클래스의 객체를 부모클래스에 대입 할수있는 기법 
		 * */
		driver.drive(bus);
		driver.drive(taxi);
	}
}
