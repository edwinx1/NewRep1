public class StringLabclass {

    
    public static void main(String[] args) {
        // Create string to be used
        String myString = " Semester is almost over let's review string methods  ";

        // print out length of string
        System.out.println("Length: " + myString.length());

        // print character in specific postion 
        System.out.println("Character at index 14: " + myString.charAt(14));

        // printsubstring or part of the string
        System.out.println("Substring (Semester): " + myString.substring(0, 9));

        // print out string in all lower and all upper
        System.out.println("Uppercase: " + myString.toUpperCase());
        System.out.println("Lowercase: " + myString.toLowerCase());

        // print out index of word in string
        System.out.println("Index of 'string': " + myString.indexOf("string"));

        // check if string contains what is in arguement in method of "contain()"
        System.out.println("Contains 'fun': " + myString.contains("fun"));

        // replace substring with something else
        System.out.println("Replaced: " + myString.replace("review", "take a trip back to"));

        // split() string to create \n
        String[] words = myString.split(" ");
        System.out.println("Split:");
        for (String word : words) {
            System.out.println(word);
        }

        // removes whitespace in string 
        System.out.println("Trimmed: " + myString.trim());

        // create new string and compare to check for comparability
        String compareString = "review string methods";
        System.out.println("Equals: " + compareString.equals(myString.trim()));
        System.out.println("Equals Ignore Case: " + compareString.equalsIgnoreCase(myString.trim()));
    }
}
