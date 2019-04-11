public class Triangle extends Shape {
    public Triangle(int SIZEX, int SIZEY) {
        super(SIZEX, SIZEY);
        fill();
    }

    @Override
    public void fill() {
        boolean widthIsEven;
        int pixelsInMiddle;
        double pixelGrowthPerLine;
        double thisLineGrowthAsDouble;
        int thisLineGrowthAsInt;
        int numberOfPixels;
        int numberOfEmpty;

        widthIsEven = SIZEX % 2 == 0;

        if (widthIsEven) {
            pixelsInMiddle = 2;
        } else {
            pixelsInMiddle = 1;
        }
        pixelGrowthPerLine = (double) (SIZEX - pixelsInMiddle) / (SIZEY - 1);

        for (int lineNumber = 1; lineNumber <= SIZEY; lineNumber++) {
            thisLineGrowthAsDouble = (lineNumber - 1) * pixelGrowthPerLine;

            thisLineGrowthAsInt = 2 * (int) (thisLineGrowthAsDouble / 2);
            numberOfPixels = pixelsInMiddle + thisLineGrowthAsInt;

            numberOfEmpty = (SIZEX - numberOfPixels) / 2;

            for (int counter = 1; counter <= numberOfPixels; counter++) {
                fillPixel(numberOfEmpty + counter - 1, SIZEY - lineNumber);
            }
        }
    }

}

