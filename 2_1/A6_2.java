
public class W6_2 {

	public static void main(String[] args) {
		Controllable c = new Controllable() {
			public void play() {
				System.out.println("PLAY");
			}
			public void stop() {
				System.out.println("STOP");
			}
		};
		c.play();
		c.stop();
	}

}
