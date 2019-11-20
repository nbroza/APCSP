public class main {
	public static void main(String[] args) {
		Robot rb = new Robot(4,2);
		rb.addToy(1);
		rb.addToy(2);
		rb.addToy(3);
		rb.addToy(3);
		rb.addToy(4);
		rb.addToy(4);

		rb.showToys();
		rb.clearHall();

		rb.showToys();
	}
}
