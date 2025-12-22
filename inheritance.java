class C1 {
    int l = 5;

    void display() {
        System.out.println("Value of l = " + l);
    }
}

class C2 extends C1{
    int b = 10;

    void calculate() {
        System.out.println("Calculation = " + (l * b));
    }
    void display(){
        System.out.println(" in child class");
    }
}

public class inheritance{
    public static void main(String[] args) {
        C2 o1 = new C2();
        o1.calculate();
        o1.display();

    }
}



