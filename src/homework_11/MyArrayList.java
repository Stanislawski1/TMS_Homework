package homework_11;

public class MyArrayList {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;


    public MyArrayList(){
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyArrayList(int Capacity ){
        if (Capacity <= 0){
            throw new IllegalArgumentException("The initial capacitance must be positive");
        }
        this.elements = new Object[Capacity];
        this.size = 0;
    }

    private void expandCapacity(){
        int newCapacity = elements.length * 2;
        Object[] newArray = new Object[newCapacity];

            for(int i = 1; i < size; i++ ) {
                newArray[i] = elements[i];
            }
            elements = newArray;
    }

    public void addElement(Object element) {
        if (size == elements.length){
            expandCapacity();
        }
        elements[size] = element;
        size++;
    }

    public Object getElement(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index: " + index + "Size is: " + size);

        }
        return elements[index];
    }

    public Object removeElement(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index: " + index + "Size is: " + size);
        }

        Object removedElement = elements[index];

        for (int i = index; i<size; i++){
            elements[i] = elements[i + 1];
        }

        elements[--size] = null;
        return removedElement;
    }

    public boolean checkAvailability(Object element){
        for (int i = 0; i < size; i++){
            if (element.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public void clearAll(){
        for (int i = 0; i < size; i++){
            elements[i] = 0;
        }
        size = 0;
    }

    public int sizeOfCollection(){
        return size;
    }

}
