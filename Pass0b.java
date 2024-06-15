class Test {
  int a, b;

  Test(int i, int j) {
    a = i;
    b = j;
  }

  // return true if o is equal to the invoking object
  boolean equalTo(Test o) {
    if(o.a == a && o.b == b) return true;
    else return false;
  }

  boolean equalTo1(Test object){
	if(object.a== a || object.b== b) return true;
	else return false;
	}
}

class Pass0b {
  public static void main(String args[]) {
    Test ob1 = new Test(100, 22);
    Test ob2 = new Test(100, 22);
    Test ob3 = new Test(-1, -1);
    Test ob4 = new Test(100, 14);
    Test ob5 = new Test(50, 22);
    
    System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));

    System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));

    System.out.println("ob1 == ob4: " + ob1.equalTo1(ob4));

    System.out.println("ob1 == ob5: " + ob1.equalTo1(ob5));
  }
}