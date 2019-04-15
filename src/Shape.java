public abstract class Shape extends PixelGrid {
    private int xPos;
    private int yPos;

    Shape(int x, int y) {
        super(x, y);
        xPos = 0;
        yPos = 0;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public boolean isFilledPixel(int xCanvas, int yCanvas) {
        return (this.getPixel(xCanvas - xPos, yCanvas - yPos).equals(FILLED));
    }

    public void makeHollow() {
        // TODO
    }
}

