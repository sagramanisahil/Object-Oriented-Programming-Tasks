class A{
    int i;
}

class B extends A{
    B(int a, int b)
    {
        super.i = a;
        i = b;
    }
    void show(){
        System.out.println("i in super Class " + super.i);
        System.out.println("i in subclass " + i);
    }
}

class UseSuper {
    public static void main(String args[]){
        B ob = new B(1,2);
        ob.show();
    }
}