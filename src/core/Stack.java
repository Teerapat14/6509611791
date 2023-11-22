package core;

import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Object> elms =new ArrayList<Object>();
int count = 0 ;
stack = new Arraylist <>();
	
@Override
public boolean isEmpty1() {
	// TODO Auto-generated method stub
	return stack.isEmpty();

@Override
public int  getSize() {
	
	return stack.size;
}
	@Override
	public Integer pop() {
		if (isEmpty()) {
			return null;
		}
	
		
		@Override
		public Integer peek() {
			if (isEmpty()) {
				return null;
			}
		return stack.get(stack.size()-1;
	}
		
		
		@Override
		public void push(Integer item) {
			stack.add(item);
		
	}

}
			