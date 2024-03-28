package day0327;


public class Q4_1_Circle{
		int radius;
		String name;	
		
		public double getArea() {
			return 3.14 * radius * radius;
		}

	public static void main(String[] args) {
		Q4_1_Circle pizza;
		pizza = new Q4_1_Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);
		
		Q4_1_Circle dounut;
		dounut = new Q4_1_Circle();
		dounut.radius = 10;
		dounut.name = "자바도넛";
		area = dounut.getArea();
		System.out.println(dounut.name + "의 면적은" + area);

	}
}
