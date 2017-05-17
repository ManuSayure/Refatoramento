
public class FrameAction implements ActionInterface {

	@Override
	public int returnValueSizeOrFrame(String action) {

		if (action.equals("FrameSkip: 0")) {
			return 1;
		} else if (action.equals("FrameSkip: 1")) {
			return 2;
		} else if (action.equals("FrameSkip: 2")) {
			return 3;
		} else if (action.equals("FrameSkip: 3")) {
			return 4;
		}
		
		return 0;
	}
}
