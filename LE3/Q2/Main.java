public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("Calling display from Test class:");
        test.display();

        AbsTest concreteTest = new ConcreteTest();
        System.out.println("\nCalling display from ConcreteTest class (extends AbsTest):");
        concreteTest.display();  class
    }
}
