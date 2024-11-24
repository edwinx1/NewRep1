public class StringBuilderclass {


    public static void main(String[] args) {
        // Creat StringBuilder object
        StringBuilder sb = new StringBuilder("Week 7 StringBuilder Lab");

        // appended "re-submittign"
        sb.append(" - Re-submitting assignment");
        System.out.println("Appended: " + sb.toString());

        // inserted my name 
        int insertPosition = sb.indexOf("Lab") + 3;
        sb.insert(insertPosition, " completed by Edwin");
        System.out.println("Inserted: " + sb.toString());

        // Deleted "Re-submitting" from the StringBuilder
        int start = sb.indexOf("Re-submitting");
        int end = start + "Re-submitting".length();
        sb.delete(start, end);
        System.out.println("Deleted: " + sb.toString());

        // reverse the entire string and print
        sb.reverse();
        System.out.println("Reversed: " + sb.toString());
    }
}
