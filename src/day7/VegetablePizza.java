package day7;

public class VegetablePizza extends Pizza{

	@Override
	public String getDow() {
		String dow = super.getDow();
		/*
		 * 부모클래스의 메서드를 super.를 통해 호출한뒤 
		 * 데코레이팅(꾸밈) 한다 
		 * */
		if (dow != null ) {
			return dow;
		}
		return "";
	}
}

