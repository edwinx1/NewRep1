public class StringLab 
{
    public static void main(String[] args) {
        // Working with String Methods
        String str = " Welcome to the Java String Lab! ";
        
     // Length
        System.out.println("Length: " + str.length());
        
      // Character at index 7
        System.out.println("Character at index 7: " + str.charAt(7));
        
    // Substring to extract "Java"
        System.out.println("Substring 'Java': " + str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));
        
       // Uppercase and Lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        
    // Index of "Java"
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        
       // Contains "Lab"
        System.out.println("Contains 'Lab': " + str.contains("Lab"));
        
      // Replace "Java" with "Java Programming"
        System.out.println("Replace 'Java' with 'Java Programming': " + str.replace("Java", "Java Programming"));
        
     // Split by spaces
                String[] words = str.trim().split(" ");
                System.out.println("Split by spaces:");
                for (String word : words) {
                    System.out.println(word);
                }
                
        // Trim leading and trailing spaces
        System.out.println("Trimmed string: '" + str.trim() + "'");
        
        // equals() and equalsIgnoreCase()
        String compareStr = "java string lab!";
        System.out.println("Equals: " + str.trim().equals(compareStr));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(compareStr));
        
        // StringBuilder
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        
        // Append
        sb.append(" - Learning Java");
        System.out.println("StringBuilder after append: " + sb);
        
        //  Insert
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        System.out.println("StringBuilder after insert: " + sb);
        
        //  Delete "Learning"
        int start = sb.indexOf("Learning");
        int end = start + "Learning".length();
        sb.delete(start, end);
        System.out.println("StringBuilder after delete: " + sb);
        
        //  Reverse
        sb.reverse();
        System.out.println("StringBuilder after reverse: " + sb);
        
        // Working with StringBuffer
        StringBuffer sbf = new StringBuffer("Multithreading Lab");
        
        // Same operations as StringBuilder
        // Append
        sbf.append(" - Learning Java");
        System.out.println("StringBuffer after append: " + sbf);
        
        // Insert
        sbf.insert(sbf.indexOf("Lab") + 3, " is fun");
        System.out.println("StringBuffer after insert: " + sbf);
        
        // Delete "Learning"
        int sbfStart = sbf.indexOf("Learning");
        int sbfEnd = sbfStart + "Learning".length();
        sbf.delete(sbfStart, sbfEnd);
        System.out.println("StringBuffer after delete: " + sbf);
        
        // Reverse
        sbf.reverse();
        System.out.println("StringBuffer after reverse: " + sbf);
    }
}