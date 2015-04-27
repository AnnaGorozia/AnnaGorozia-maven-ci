package Step7;

public class AddingNumbers {
	private int res;
	
	public AddingNumbers(){}
	
	public void setNumbers(int left, int right){
		this.res = left + right;
	}
	
	public int getResult(){
		return res;
	}
	
}
