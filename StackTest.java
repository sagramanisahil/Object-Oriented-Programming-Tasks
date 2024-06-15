class Stack {
	 private int stck[] = new int[10];
  	 private int tos;
  
  Stack() {
    tos = -1;
  }

  void push(int item) {
    if(tos==9) 
      System.out.println("Stack is full.");
    else 
      stck[++tos] = item;
  }

  int pop() {
    if(tos < 0) {
      System.out.println("Stack underflow.");
      return 0;
    }
    else 
      return stck[tos--];
  }
}


class StackTest {
	public static void main(String args[]){
		Stack myStack1 = new Stack();
		Stack myStack2 = new Stack();
		
	for(int i=0; i<10; i++)
	{
		myStack1.push(i);
	}
	for(int i=0; i<20; i++)
	{
		myStack2.push(i);
	}
	
	/*for(int i=0; i<10; i++)
	{
		myStack1.pop();
	}
	for(int i=0; i<20; i++)
	{
		myStack2.pop();
	}*/

	}
}
	
	
