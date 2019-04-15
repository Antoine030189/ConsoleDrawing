import java.awt.*;

public class ConsoleDrawing {
    public static void main(String[] args) {
//        System.out.println("Opdracht 1-3");
//        System.out.println();
//
//        Rectangle myRectangle = new Rectangle(15, 7);
//        System.out.println(myRectangle);
//
//        Oval myOval = new Oval(15, 7);
//        System.out.println(myOval);
//
//        Triangle myTriangle = new Triangle(15, 7);
//        System.out.println(myTriangle);
//
//        System.out.println();
//        System.out.println("Opdracht 2-3");
//        System.out.println();
//
//        Canvas myCanvas = new Canvas(60, 8);
//        myCanvas.add(myRectangle, 0, 0);
//        myCanvas.add(myOval, 18, 0);
//        myCanvas.add(myTriangle, 36, 0);
//        myCanvas.fill();
//        System.out.println(myCanvas);

        System.out.println();
        System.out.println("Opdracht 2-4");
        System.out.println();

        Shape linkervoet = new Triangle(3, 2);
        Shape rechtervoet = new Triangle(3, 2);
        Shape linkerbeen = new Rectangle(1, 3);
        Shape rechterbeen = new Rectangle(1, 3);
        Shape linkerarm = new Rectangle(5,1);
        Shape rechterarm = new Rectangle(5,1);
        Shape romp = new Rectangle(7, 5);
        Shape hoofd = new Oval(5, 3);
        Shape extra1 = new Rectangle(1,2);
        Shape extra2 = new Rectangle(1,2);

        Canvas papier = new Canvas (25, 16);
        papier.add(linkervoet, 8, 0);
        papier.add(rechtervoet, 12, 0);
        papier.add(linkerbeen, 9, 2);
        papier.add(rechterbeen, 13, 2);
        papier.add(linkerarm, 3, 9);
        papier.add(extra1, 3, 7);
        papier.add(rechterarm, 15, 9);
        papier.add(extra2, 19, 10);
        papier.add(romp, 8, 5);
        papier.add(hoofd, 9, 10);
        papier.fill(); // is dat nodig, of kan dat slimmer?
        System.out.println(papier);

//        System.out.println();
//        System.out.println("Opdracht 2-5");
//        System.out.println();
//
//        papier.move(0, 5, 0);
//        papier.move(1, 17, 0);
//        papier.move(2, 8, 3);
//        papier.move(3, 16, 3);
//        papier.move(4, 3, 12);
//        papier.move(5, 0, 13);
//        papier.move(6, 17, 12);
//        papier.move(7, 24, 13);
//        papier.move(8, 9, 7);
//        papier.move(9, 10, 13);
//        papier.fill();
//        System.out.println(papier);
    }
}
