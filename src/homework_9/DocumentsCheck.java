package homework_9;

class ABCDocumentsCheck extends Exception {
    public ABCDocumentsCheck(String message) {
        super(message);
    }
}

class Start555Exception extends Exception {
    public Start555Exception(String message) {
        super(message);
    }
}

class End1a2bException extends Exception {
    public End1a2bException(String message) {
        super(message);
    }
}

class DocumentNumberCheck {
    public static void checkABCDocuments(String documentNumber) throws ABCDocumentsCheck {
        if (!documentNumber.contains("abc")) {
            throw new ABCDocumentsCheck("Error: Document number does not contain sequence 'abc'");
        }
    }

    public static void check555Documents(String documentNumber) throws Start555Exception {
        if (!documentNumber.contains("555")) {
            throw new Start555Exception("Error: Document number does not contain sequence '555'");
        }
    }

    public static void check1a2bDocument(String documentNumber) throws End1a2bException {
        if (!documentNumber.contains("1a2b")) {
            throw new End1a2bException("Error: Document number does not contain sequence '1a2b'");
        }
    }

    public static void showDocumentNumber(String documentNumber) {
        try {
            checkABCDocuments(documentNumber);
            check555Documents(documentNumber);
            check1a2bDocument(documentNumber);
            System.out.println("Number of the document is: " + documentNumber);
        } catch (ABCDocumentsCheck e) {
            System.out.println(e.getMessage());
        } catch (Start555Exception e) {
            System.out.println(e.getMessage());
        } catch (End1a2bException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Check 555xxxabcxxx1a2b: ");
        showDocumentNumber("555xxxabcxxx1a2b");

        System.out.println("\n Check 555xxxabxxxx1a2b: ");
        showDocumentNumber("555xxxabxxxx1a2b");

        System.out.println("\n Check 556xxxabcxxx1a2b: ");
        showDocumentNumber("556xxxabcxxx1a2b");

        System.out.println("\n Check 555xxxabxxxx1a2c: ");
        showDocumentNumber("555xxxabxxxx1a2c");


    }

}
