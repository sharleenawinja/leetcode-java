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

        //add hyphen
        phoneNumber += "-";

        //add remaining numbers
        for (int i = 6; i < 10; i++) {
            phoneNumber += numbers[i];
        }

        //return phone number
        return phoneNumber;
    }

    // using String.format
    // the string format method is used to format the output string using a specified format string and the given arguments
    // in this case, the format string contains placeholders for each digit in the phone number, separated by the desired formatting characters(parentheses, spaces, hyphens)
    // the placeholders are represented by "%d", which is a format specifier for integer values
    // the values to be inserted in these placeholders are obtained by accessing the corressponding element in the input "numbers" array
    // the formatted string is returne as the output 
    public static String createPhoneNumber2(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
      }
}