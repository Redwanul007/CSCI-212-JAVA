
public class Candle {
    private int height;
    private int width;
    private float price;
    private boolean isLit;

    //Constructor for candle

    public Candle(int height, int width, float price) {
        this.height = height;
        this.width = width;
        this.price = price;
        isLit = false;
    }
    //getters and setters for candles

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isLit() {
        return isLit;
    }

    public void setLit(boolean lit) {
        isLit = lit;
    }

    @Override
    public String toString() {
        return height+", "+width+", "+price;
    }
}

