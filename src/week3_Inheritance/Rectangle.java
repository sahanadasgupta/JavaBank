package week3_Inheritance;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }

    public int getHeight(){
        return height;
    }

    public int getArea()
    {
        return width * height;
    }
}
