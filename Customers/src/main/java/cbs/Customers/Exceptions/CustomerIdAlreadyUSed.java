package cbs.Customers.Exceptions;

public class CustomerIdAlreadyUSed extends Exception{
    public CustomerIdAlreadyUSed(){
        super("The Customer ID filled has already been used to register an existing customer");
    }
}
