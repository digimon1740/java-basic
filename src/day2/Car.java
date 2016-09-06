package day2;

public class Car {

	String company = "chevorlet";
	String model = "malibu";
	String color = "black";
	int maxSpeed = 240;

	int speed = 100;
	int rpm = 2000;

	Body body;
	Engine engine;
	Tire tire;

	Car() {

	}

	Car(String model) {
		this.model = model;
	}

	Car(String model, String color) {
		// this.model = model;
		// this.color = color;
		this(model, color, 240);
		// 생성자 체이닝
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
