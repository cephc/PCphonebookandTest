package composition;

public class Dimension {
    private int width;
    private int height;
    private int depth;
    //constructors
    public Dimension(int width, int height, int depth){
        this.width = width;
        this.depth = depth;
        this.height = height;
    }
    //getters
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int getDepth() {
        return depth;
    }
}
