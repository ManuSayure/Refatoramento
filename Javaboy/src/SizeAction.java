
public class SizeAction implements ActionInterface {

	@Override
	public int returnValueSizeOrFrame(String action) {

		if (action.equals("Size: 1x")) {
			return 1;
		} else if (action.equals("Size: 2x")) {
			return 2;
		} else if (action.equals("Size: 3x")) {
			return 3;
		} else if (action.equals("Size: 4x")) {
			return 4;
		}
		
		return 0;
	}
}
