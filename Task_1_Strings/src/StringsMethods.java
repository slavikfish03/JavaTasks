import java.io.UnsupportedEncodingException;

public class StringsMethods {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // Constructors of the String class
        Constructors();

        // Methods of the String class
        Methods();
    }

    public static void Constructors() throws UnsupportedEncodingException {
        // creating an empty string
        String str1 = new String();
        String str1_1 = "";

        // creating a string based on another string
        String str2 = new String(str1);

        // creating a string from an array of bytes based on the encoding of the system
        byte[] bytes = {1, 2, 3, 4, 5};
        String str3 = new String(bytes);

        /*
        creating a string from an array of bytes, specifying the index
        of the first byte (offset) and specifying the length (length).
        Throws an exception IndexOutOfBoundsException if offset is negative,
        length is negative, or offset is greater than bytes.length - length
        */
        int offset = 2;
        int length = 2;
        String str4 = new String(bytes, offset, length);

        /*
        creating a string from an array of bytes specifying the specific
        encoding "charsetName". If the encoding is not supported, an
        exception is thrown UnsupportedEncodingException
        */
        String charsetName = "US-ASCII";
        String str5 = new String(bytes, charsetName);

        // creating a string from an array of characters
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        String str6 = new String(chars);

        // similar to the constructor for an array of bytes with offset and length
        String str7 = new String(chars, offset, length);
    }

    public static void Methods() {
        String str1 = "Hello";
        String str2 = "World";

        // output of strings
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // length of string
        System.out.println("Length str1: " + str1.length());

        // getting an element (characters) by index
        int i = 2;
        System.out.println("Element (character) in str1 at index 'i': " + str1.charAt(i));

        // concatenation of strings
        System.out.println("Concatenation str1 and str2: " + str1.concat(str2));

        // concatenation of string with delimiter
        String delimiter = " ";
        System.out.println(String.join(delimiter, str1, str2));

        // case-sensitive string comparison
        System.out.println("str1 == str2 case-sensitive: " + str1.equals(str2));

        // case-insensitive string comparison
        System.out.println("str1 == str2 case-insensitive: " + str1.equalsIgnoreCase(str2));

        // returning a substring starting from the index "beginIndex"
        int beginIndex = 2;
        System.out.println("Substring str2 starting from the index 'beginIndex': " + str2.substring(beginIndex));

        // converting all characters of a string to lower (toLowerCase)
        // or upper (toUpperCase) registers
        System.out.println("str2 to lower register: " + str2.toLowerCase());
        System.out.println("str2 to up register: " + str2.toUpperCase());

        // determining whether a string starts with a substring (startsWith)
        // or whether the string ends with a substring (endsWith)
        System.out.println("str1 start with str2? " + str1.startsWith(str2));
        System.out.println("str2 end with str1? " + str2.endsWith(str1));


        // removing spaces at the beginning and end of a string
        String str3 = "    not spaces      ";
        System.out.println("str3 without spaces at the beginning and end: " + str3.trim());

        // replacing a substring (target) with another substring (replacement)
        String target = "Hello";
        String replacement = "Hi";
        System.out.println("str1 with substring replacement: " + str1.replace(target, replacement));
    }
}