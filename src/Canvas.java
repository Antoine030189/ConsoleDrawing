import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private int SIZEX;
    private int SIZEY;
    private List<ShapeInstance> canvas = new ArrayList<>();
    char charFilled = '*';
    char charEmpty = '.';

    public Canvas(int SIZEX, int SIZEY){
        this.SIZEX = SIZEX;
        this.SIZEY = SIZEY;
    }

    public void add(Shape shape, int x, int y){
        canvas.add(new ShapeInstance(shape, x, y));
    }

    private boolean isPixel(ShapeInstance obj, int x, int y){
        int relX = x - obj.getX();
        int relY = y - obj.getY();

        if( relX < 0 || relY < 0) {
            return false;
        }
        if( relX >= obj.getShape().SIZEX || relY >= obj.getShape().SIZEY) {
            return false;
        }
        return obj.getShape().isFilledPixel(relX, relY);
    }

    public String toString(){
        // overrides the default method
        StringBuilder string = new StringBuilder();

        for(int y = 0; y < SIZEY; y++){
            for(int x = 0; x < SIZEX; x++){
                boolean isFilled = false;

                for(ShapeInstance shapeInstance : canvas){
                    isFilled = isFilled || isPixel(shapeInstance, x, y);
                }
                if(isFilled) string.append(charFilled);
                else string.append(charEmpty);
            }
            // Newline in the end
            string.append('\n');
        }
        // Return everything in string form
        return string.toString();
    }

    public void clear() {
        canvas.clear();
    }

    public ShapeInstance last() {
        return canvas.get(canvas.size() - 1);
    }

}

