
public class KeyStrategy {

	private JoyPad joypadStrategy;

	public boolean IsTrue(boolean b) {
		
		joypadStrategy = new JoypadImplementation();
		return joypadStrategy.setJoypadStrategy(b);
	}
}
