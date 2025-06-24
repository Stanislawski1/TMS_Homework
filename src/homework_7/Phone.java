package homework_7;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public static void main(String[] args){
        Phone phone1 = new Phone(" 33-343-12-32 ", "iPhone 15 pro ", 187);
        Phone phone2 = new Phone(" 29-654-18-22 ", "Xiaomi Redmi Note 11 ", 179);
        Phone phone3 = new Phone(" 29-900-29-67 ", "Google Pixel 9 Pro XL ", 221);

        System.out.println("Phone 1: " + phone1.getNumber() + phone1.getModel() + phone1.getWeight() + " grams");
        System.out.println("Phone 2: " + phone2.getNumber() + phone2.getModel() + phone2.getWeight() + " grams");
        System.out.println("Phone 3: " + phone3.getNumber() + phone3.getModel() + phone3.getWeight() + " grams");

        printAllInformation(phone1, phone2, phone3);
        startTheProgram(phone1, phone2, phone3);


    }

    public Phone(String number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){

    }

    public void receiveCall(String caller){
        System.out.println(caller + " is calling");
    }

    public void receiveCall(String caller, String number){
        System.out.println(caller + " is calling " + "from number: " + number);
    }

    public String getNumber(){
        return number;
    }

    public void sendMessage(String... phoneNumber){
        System.out.println("The message will be send on this number: ");
            for(String num : phoneNumber){
                System.out.println(num);
            }
    }

    public String getModel(){
        return model;
    }

    public double getWeight(){
        return weight;
    }

    public void printPhoneInformation(){
        System.out.println("Number: " +  number + "Model: " +  model + "Weight: " +  weight +
                " grams");

    }

    public static void printAllInformation(Phone... phones){
        System.out.println("\nInformation about all phones");
            for(int i = 0; i < phones.length; i++){
                System.out.print("Phone " + (i + 1) + ": ");
                phones[i].printPhoneInformation();
            }
    }

    public static void startTheProgram(Phone... phones){
        phones[0].receiveCall("Stanislaw");
        phones[1].receiveCall("Jozef");
        phones[2].receiveCall("Mary");

        phones[0].receiveCall("Stanislaw", "33-343-12-32");

        System.out.println("\nHere is all information of numbers: ");
        for (int i =0; i < phones.length; i++){
            System.out.println("Phone numbers" + (i + 1) + ": " + phones[i].getNumber());
        }

        System.out.println("***************Messages***************");
        phones[0].sendMessage("33-343-12-32", "29-654-18-22","29-900-29-67");


    }


}
