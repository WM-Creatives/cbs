package cbs.Customers.Exceptions;

public class PhoneNumberAlreadyUsed extends Exception{
    public PhoneNumberAlreadyUsed(){
        super("Phone Number has already been used to register an Existing Customer");
    }
}
