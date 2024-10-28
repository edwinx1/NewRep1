public class Week7lab {
    public static void main(String [] args) {


    // working with string mehtods
    String str = "Week 7 is string lab";

    //Length
    System.out.println("Length: " + str.length());

    //character at 2
    System.out.println("Character at 2: " + str.charAt(2));
    
    //substring to extract "string"
    System.out.println("substring 'string': " + str.substring(str.indexOf("string"), str.indexOf("string") + 5));

     // Uppercase and Lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

     // Index of "string"
        System.out.println("Index of 'string': " + str.indexOf("string"));
    
      // Contains "lab"
        System.out.println("Contains 'lab': " + str.contains("lab"));

      // Replace "lab" with "super"
        System.out.println("Replace 'lab' with 'super lab': " + str.replace("lab", "super lab"));

      // Split by spaces
                String[] words = str.trim().split(" ");
                System.out.println("Split by spaces:");
                for (String word : words) {
                    System.out.println(word);
                }
        // Trim leading and trailing spaces
        System.out.println("Trimmed string: '" + str.trim() + "'");

          String compareStr = "java string lab!";
        System.out.println("Equals: " + str.trim().equals(compareStr));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(compareStr));

      // StringBuilder
        StringBuilder sb = new StringBuilder("StringBuilder section");

     
        // Append
        sb.append(" - more optimal for string modification");
        System.out.println("StringBuilder after append: " + sb);
    
     //  Insert
        sb.insert(sb.indexOf("section") + 3, " is exciting");
        System.out.println("StringBuilder after insert: " + sb);
    
      //  Delete "Learning"
        int start = sb.indexOf("more");// iniciating beginning of string
        int end = start + "more".length();// assigning full length of string to 'end' in 
        sb.delete(start, end);
        System.out.println("StringBuilder after delete: " + sb);
    
            //  Reverse
        sb.reverse();
        System.out.println("StringBuilder after reverse: " + sb);
    
        // Working with StringBuffer
        StringBuffer sbf = new StringBuffer("Multiaccess Lab");

        
        // Same operations as StringBuilder
        // Append
        sbf.append(" - variation of stringbuilder more optimal for working with multiple accesses");
        System.out.println("StringBuffer after append: " + sbf);

       // Insert
        sbf.insert(sbf.indexOf("Lab") + 3, " is cool");
        System.out.println("StringBuffer after insert: " + sbf);

    // Delete "Learning"
        int sbfStart = sbf.indexOf("variation");
        int sbfEnd = sbfStart + "variation".length();
        sbf.delete(sbfStart, sbfEnd);// deleting start and end of string assingned in code lines above
        System.out.println("StringBuffer after delete: " + sbf);

         // Reverse
        sbf.reverse();
        System.out.println("StringBuffer after reverse: " + sbf);
    }
    }
