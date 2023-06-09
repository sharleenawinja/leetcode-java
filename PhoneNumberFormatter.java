// Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
// createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
// Don't forget the space after the closing parentheses!

import java.util.Arrays;

public class PhoneNumberFormatter {

    public static void main(String[] args) {
        PhoneNumberFormatter phoneNumber = new PhoneNumberFormatter();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(phoneNumber.createPhoneNumber(numbers));
        System.out.println(PhoneNumberFormatter.createPhoneNumber2(numbers));
        System.out.println(PhoneNumberFormatter.createPhoneNumber3(numbers));
        System.out.println(phoneNumber.createPhoneNumber4(numbers));
    }

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

    
      //using string builder method
      public static String createPhoneNumber3(int[] numbers) {

        //create an instance of string builder class
        StringBuilder phoneNumber = new StringBuilder();

        //append opening bracket
        phoneNumber.append("(");

        //append first three numbers
        for(int i =0; i < 3; i++) {
            phoneNumber.append(numbers[i]); 
        }

        //append closing bracket
        phoneNumber.append(") ");

        
        //append next three numbers
        for (int i = 3; i < 6; i++){
            phoneNumber.append(numbers[i]);
        }

        //append hyphen
        phoneNumber.append("-");
        
        //append last three numbers
        for(int i = 6; i  < 10; i++ ) {
            phoneNumber.append(numbers[i]);
        }

        //calling toString method to convert phoneNumber object to a string
        return phoneNumber.toString();
      }

    //   using string.join and arrays.copyofrange
      public String createPhoneNumber4(int[] numbers) {
        String[] numStrArr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStrArr[i] = Integer.toString(numbers[i]);
        }
        String areaCode = String.join("", Arrays.copyOfRange(numStrArr, 0, 3));
        String firstThree = String.join("", Arrays.copyOfRange(numStrArr, 3, 6));
        String lastFour = String.join("", Arrays.copyOfRange(numStrArr, 6, 10));
        return String.format("(%s) %s-%s", areaCode, firstThree, lastFour);
      }

    //   OTHER METHODS OF CONVERTING AN INTEGER ARRAY INTO A STRING ARRAY
    // using java 8 string
    // convert the specified primitive array into a IntStream using Arrays.stream() or IntStream.of()
    // convert each element of the stream to a string using IntSream.mapToObj()
    // return a string array containing elements of this stream using Stream.toArray()

    public void convertStringArrayToIntArray() {
        int[] intArray = { 1, 2, 3, 4, 5 };
        String[] strArray = Arrays.stream(intArray).mapToObj(String::valueOf).toArray(String[]::new);
        System.out.println(Arrays.toString(strArray));

        // converting int array to string array using regex => not recommended
        // using regex to remove whitespaces in a string is not recommended because it can be less efficient than other methods and can also be less readable/maintainable
        // the regex pattern being use below may work for small inputs, but it may not be the most efficient solution for larger inputs, as regular expressions can be slow for certain patterns or input sizes
        // furthermore this code can be less readable or maintainable because regular expressions can be difficult to understand or modify, especially for people who are not familiar with them
        String str = Arrays.toString(intArray)        // [1, 2, 3, 4, 5]
                            .replaceAll("\\s+", "");   // [1,2,3,4,5]
        
        String[] stringArray = str.substring(1, str.length() - 1)  // 1,2,3,4,5
                            .split(",");

        System.out.println(Arrays.toString(stringArray));
    }

    // using int stream
    public static String createPhoneNumber5(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
      }
} 

