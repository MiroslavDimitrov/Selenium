package org.selenium.common;

public class MethodsDemo {
    /**
     * This clas is just a demo class for creating and using methods.
     * @param args
     */
    public static void main(String[] args) {
        /*
        Instead of repeating exactly the same line of code,
        we simply can use methods.
         */
        MethodsDemo methodsDemo = new MethodsDemo();
        System.out.println(methodsDemo.getData());//it is a good practise first to save the result value in a variable, then use it.
        int result = MethodsDemoTwo.getResult();
        System.out.println(result);

    }
    public int getData() {
        int result = 5 + 5;
        return result;
    }
}
