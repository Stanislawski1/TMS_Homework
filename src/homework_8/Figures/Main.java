package homework_8.Figures;

public class Main {
    public static void main(String[] args) {
        Figures[] Figures = new Figures[5];
        Figures[0] = new Tringle(3, 4, 5);
        Figures[1] = new Rectangle(3, 4);
        Figures[2] = new Circle(6);
        Figures[3] = new Rectangle(2, 7);
        Figures[4] = new Tringle(5, 6, 3);

        double sumOfPerimeteres = 0;
        for (Figures Figure : Figures) {
            sumOfPerimeteres += Figure.perimeter();
        }
        System.out.println("Sum of perimeteres of all figures is: " + sumOfPerimeteres);

    }
}
