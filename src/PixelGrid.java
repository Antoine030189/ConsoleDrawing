
    public abstract class PixelGrid {
        private String pixels[][];
        protected final int SIZEX;
        protected final int SIZEY;
        public final String FILLED = "*";
        public final String EMPTY  = " ";

        public PixelGrid(int SIZEX, int SIZEY) {
            if (SIZEX <= 0 || SIZEY <= 0) {
                throw new IllegalArgumentException("Illegal size of PixelObject");
            }
            this.SIZEX = SIZEX;
            this.SIZEY = SIZEY;
            pixels = new String[SIZEX][SIZEY];
        }

        public int getSIZEX() {
            return SIZEX;
        }

        public int getSIZEY() {
            return SIZEY;
        }

        public abstract void fill();

        public void fillPixel(int x, int y) {
            pixels[x][y] = FILLED;
        }

        public void clearPixel(int x, int y) {
            pixels[x][y] = EMPTY;
        }

        public String getPixel(int x, int y) {
            String result;
            if (0 <= x && x < SIZEX && 0 <= y && y < SIZEY)
            {
                result = this.pixels[x][y];
            }
            else
            {
                result = EMPTY;
            }
            return result;
        }

        public String toString() {
            String output = "";
            for (int y = SIZEY - 1; y >= 0; y--) {
                for (int x = 0; x < SIZEX; x++) {
                    output += pixels[x][y];
                }
                output += "\n";
            }
            return output;
        }

    }
