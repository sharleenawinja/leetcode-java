// Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
// createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
// Don't forget the space after the closing parentheses!

public class PhoneNumberFormatter {
    public String createPhoneNumber(int[] numbers) {
        // intialize phone number with open bracket
        String phoneNumber = "(";

        // add first three digits to phone number
        for(int i = 0; i <3; i++) {
            phoneNumber += numbers[i];
        }

        // close bracket
        phoneNumber += ") ";

        //add next three digits
        for (int i =3; i < 6; i++) {
            phoneNumber += numbers[i];
        }

        //add dash
        phoneNumber += "-";

        //add remaining numbers
        for (int i = 6; i < 10; i++) {
            phoneNumber += numbers[i];
        }

        //return phone number
        return phoneNumber;
    }
}