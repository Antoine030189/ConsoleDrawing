public class Triangle extends Shape {
    public Triangle(int SIZEX, int SIZEY) {
        super(SIZEX, SIZEY);
        fill();
    }

    @Override
    public void fill() {
        boolean widthIsEven;
        int     pixelsInMiddle;             // 1 bij oneven breedte, 2 bij even breedte
        double  pixelGrowthPerLine;         // het aantal kruisjes per regel erbij is een double
        double  thisLineGrowthAsDouble;     // de 'ruwe' toename voor elke regel is ook een double
        int     thisLineGrowthAsInt;        // dit moet een EVEN getal worden!
        int     numberOfPixels;
        int     numberOfEmpty;

        widthIsEven = SIZEX % 2 == 0;

        if (widthIsEven) {
            pixelsInMiddle = 2;
        } else {
            pixelsInMiddle = 1;
        }

        pixelGrowthPerLine = (double) (SIZEX - pixelsInMiddle) / (SIZEY - 1);

        // first: clear all the pixels
        for (int x = 0; x < SIZEX; x++) {
            for (int y = 0; y < SIZEY; y++) {
                clearPixel(x, y);
            }
        }

        for (int lineNumber = 1; lineNumber <= SIZEY; lineNumber++) {
            // first: calculate growth as double
            // no type conversion: double = int * double)
            thisLineGrowthAsDouble = (lineNumber - 1) * pixelGrowthPerLine;

            // the number of pixels grows in steps of 2
            // so half of the growth should be an integer
            // then double the half!
            thisLineGrowthAsInt = 2 * (int) (thisLineGrowthAsDouble / 2 + 0.5); // add 0.5 before converting to int!
            numberOfPixels = pixelsInMiddle + thisLineGrowthAsInt;

            // calculate number of empty pixels
            numberOfEmpty = (SIZEX - numberOfPixels) / 2;

            for (int counter = 1; counter <= numberOfPixels; counter++) {
                fillPixel(numberOfEmpty + counter - 1, SIZEY - lineNumber);
            }
        }
    }
}

