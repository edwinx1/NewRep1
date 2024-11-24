public class StringBufferclass {


    public static void main(String[] args) {
        // Create StringBuffer object 
        StringBuffer sbf = new StringBuffer("week7 Multithreading Lab");

        // Appended "re-submitting"
        sbf.append(" - Re-submitting assignment");
        System.out.println("Appended: " + sbf.toString());

        // Inserted my name
        int insertPosition = sbf.indexOf("Lab") + 3;
        sbf.insert(insertPosition, " completed by Edwin");
        System.out.println("Inserted: " + sbf.toString());

        // Deleted "re-submitting"
        int start = sbf.indexOf("Re-submitting");
        int end = start + "Re-submitting".length();
        sbf.delete(start, end);
        System.out.println("Deleted: " + sbf.toString());

        // Reverse the entire string and print 
        sbf.reverse();
        System.out.println("Reversed: " + sbf.toString());
    }
}
