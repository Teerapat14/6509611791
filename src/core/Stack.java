package core;

import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Integer> stack;
	public static final int MAX_SIZE = 2;
	
	public Stack() {
		stack  = new ArrayList<>();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return stack.isEmpty();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return stack.size();
	}
	
	@Override
	public void push(Integer item) {
		stack.add(item);
	}
	
	@Override
	public Integer pop() {
		if(isEmpty()) {
			return null;
		}
		return stack.remove(stack.size()-1);
	}
	
	@Override
	public Integer peek() {
		if(isEmpty()) {
			return null;
		}
		return stack.get(stack.size()-1);
	}
	
	@Override
	public boolean isFull() {
		return stack.size() == MAX_SIZE;
	}
	


}
	
