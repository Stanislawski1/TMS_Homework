package homework_10;

public class DocumentNumberChecker {

    public static void main(String[] args){
        String docNumbers = "2345-555-4321-ops-1a2b";

        printFirstTwoBlocks(docNumbers);
        replaceLetters(docNumbers);
        printLowerCase(docNumbers);
        printUpperCase(docNumbers);
        checkAbcSequence(docNumbers);
        check555Sequence(docNumbers);
        check1a2bSequence(docNumbers);
    }

    public static void printFirstTwoBlocks(String docNumbers) {
        String[] blocks = docNumbers.split("-");
        System.out.println(blocks[0] + " " + blocks[2]);

    }

    public static void replaceLetters(String docNumbers) {
        String[] blocks = docNumbers.split("-");
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].matches("[a-zA-Z]{3}")) {
                blocks[i] = "***";
            }

        }
        System.out.println(String.join("-", blocks));

    }

    public static void printLowerCase(String docNumbers){
        String[] blocks = docNumbers.split("-");
        StringBuilder result = new StringBuilder();

        for (String block : blocks) {
            if (block.matches("[a-zA-Z]{3}")) {
            if (result.length() > 0) result.append("/");
            result.append(block.toLowerCase());
            } else if (block.matches(".*[a-zA-Z].*")) {
                String letters = block.replaceAll("[^a-zA-Z]", "");
                if (!letters.isEmpty()){
                    if (result.length() > 0 ) result.append("/");
                    result.append(letters);
                }
            }

        }
        System.out.println(result.toString());
    }

    public static void printUpperCase(String docNumbers){
        String[] blocks = docNumbers.split("-");
        StringBuilder result = new StringBuilder();

        for (String block : blocks) {
            if (block.matches("[a-zA-Z]{3}")) {
                if (result.length() > 0) result.append("/");
                result.append(block.toUpperCase());
            } else if (block.matches(".*[a-zA-Z].*")) {
                String letters = block.replaceAll("[^a-zA-Z]", "").toUpperCase();
                if (!letters.isEmpty()){
                    if (result.length() > 0 ) result.append("/");
                    result.append(letters);
                }
            }

        }
        System.out.println(result.toString());
    }

    public static void checkAbcSequence(String docNumbers){
        boolean contains = docNumbers.toLowerCase().contains("abc");
        System.out.println(contains ? "contain" : "does not contain");
    }

    public static void check555Sequence(String docNumbers){
        boolean starts = docNumbers.startsWith("555");
        System.out.println(starts ? "start with" : "does not start with");
    }

    public static void check1a2bSequence(String docNumbers){
        boolean end = docNumbers.endsWith("1a2b");
        System.out.println(end ? "End with" : "Does not end with");
    }




}