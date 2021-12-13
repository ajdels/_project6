package bsu.comp152;

public class Rectangle {
    public int upperLeftX;
    public int upperLeftY;
    public int lowerRightX;
    public int lowerRightY;
    public Rectangle(int uLeftX, int uLeftY, int lRightX, int lRightY){
        upperLeftX = uLeftX;
        upperLeftY = uLeftY;
        lowerRightX = lRightX;
        lowerRightY = lRightY;
    }
    /**
     *
     * @param other -another rectangle
     * @return should return true if this rectangle overlaps/intersections with the other rectangle
     */
    public boolean doesHit(Rectangle other){
        if (this.upperLeftY > other.lowerRightY && other.upperLeftY > this.lowerRightY)
            return false;
        if (this.upperLeftX>other.lowerRightX || other.upperLeftX > this.lowerRightX)
            return false;
        return true;
}
