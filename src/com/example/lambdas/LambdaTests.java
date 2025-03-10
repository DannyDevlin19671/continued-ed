package com.example.lambdas;

/**
 * @author danieldevlin
 * @date 10/03/2025
 * @project continued-ed
 */
public class LambdaTests {
    public static void main(String[] args){
        Shop shop = new Shop(); // Create an instance of the shop class
        shop.open(); // call the open method of the shop class

        Openable opener = new Shop(); // Instantiate the Openable interface as a shop(not seen before)
        shop.open(); // this will call the shop open method during runtime

        Openable openable = () -> System.out.println("Open the shop please"); // add a lambda for the interface
        openable.open(); // call the open method of the Openable interface
    }
}
