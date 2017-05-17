
public class Action {
	
	private int size;
	private int frame;
	
	public void executeAction(String action, ActionInterface actionToDo) {
		this.size = actionToDo.returnValueSizeOrFrame(action);
		this.frame = actionToDo.returnValueSizeOrFrame(action);
	}

	public int getSize() {
		return size;
	}

	public int getFrame() {
		return frame;
	}
}
