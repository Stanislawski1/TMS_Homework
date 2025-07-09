package homework_11;

public class UseMyArray {
    public static void main(String[] args){
        MyArrayList list = new MyArrayList();

        System.out.println("Add Elements in collection");

        list.addElement("Hello");
        list.addElement("111");
        list.addElement("Its Stanislaw");

        System.out.println("Size of collection is: " + list.sizeOfCollection());

        System.out.println("Output all elements");

        System.out.println(list.getElement(0));
        System.out.println(list.getElement(1));
        System.out.println(list.getElement(2));

        System.out.println("Check availability of element ");

        System.out.println(list.checkAvailability("Its Stanislaw"));

        System.out.println("Remove element from collection");

        Object removed = list.removeElement(1);
        System.out.println("Removed element is: " + removed);
        System.out.println("Size after remove is: " + list.sizeOfCollection());

        System.out.println("Remaining elements is : ");
        for (int i = 0; i < list.sizeOfCollection(); i++){
            System.out.println("Element " + i + ": " + list.getElement(i));
        }

        System.out.println("Clear the collection");
        list.clearAll();

        System.out.println("Size after clear: " + list.sizeOfCollection());
    }
}
