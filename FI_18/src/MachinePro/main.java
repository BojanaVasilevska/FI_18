package MachinePro;

public class main {

	public static void main(String[] args) {
		Machine m = new Machine() {
			@Override
			public void start() {
				System.out.println("Woooo");
			}
		};
		m.start();

	}

}
