
public class JoypadImplementation implements JoyPad {

	@Override
	public boolean setJoypadStrategy(boolean b) {
		
		return !b;
	}
	
	@Override
	public boolean setJoypadState(boolean b) {
		
		return b;
	}

}
