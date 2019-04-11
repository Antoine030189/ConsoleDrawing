public class Rectangle extends Shape {
    public Rectangle(int SIZEX, int SIZEY) {
        super(SIZEX, SIZEY);
        fill();
    }
    private static double offCenter(double center, int size, int pixel) {
        return  pixel / size;

    }

    @Override
    public void fill() {
        double xCenter = SIZEX ;
        double yCenter = SIZEY ;

        for (int xPixel = 0; xPixel < SIZEX; xPixel++) {
            double xOffCenter = offCenter(xCenter, SIZEX, xPixel);
            for (int yPixel = 0; yPixel < SIZEY; yPixel++) {
                double yOffCenter = offCenter(yCenter, SIZEY, yPixel);
                if (xOffCenter * xOffCenter + yOffCenter * yOffCenter <= 1) {
                    fillPixel(xPixel, yPixel);
                }
            }
        }
    }
}
