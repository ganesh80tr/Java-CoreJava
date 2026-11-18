package Day21Sept.Method2;

import Day21Sept.Method1.Demo;

public class DemoDriver {
    public static void main(String[] args) {
        //Calling static method present in different package
        Demo.demoStaticTask();

        //Calling non-static method by creating object present in different package
        Demo d = new Demo();
        d.demoNonStaticTask();
    }
}
