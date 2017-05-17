
public class KeyState {

	private JoyPad joypadState;

	public boolean IsChange(boolean b) {
		
		joypadState = new JoypadImplementation();
		return joypadState.setJoypadState(b);
	}
}
