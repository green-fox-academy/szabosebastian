public class TodoPrint {
    public static void main(String... args){
        StringBuilder builder = new StringBuilder();

        builder.insert(0,"My todo:\n");

        builder.append("- Buy milk\n");
        builder.append("- Download games\n");
        builder.append("\t - Diablo");

/*        String todoText = " - Buy milk\n";
        String item1 = " - Download games\n";
        String item2 = " - Diablo\n";
        String indent = "\t";


        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo


        todoText = todoText.concat(item1.concat(indent+item2));*/
        System.out.println(builder);
    }
}