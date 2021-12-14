package bsu.comp152;
import java.junit.Test;
import java.awt.*;

public class Rectangle {
    public int upperLeftX;
    public int upperLeftY;
    public int lowerRightX;
    public int lowerRightY;

    public Rectangle(int uLeftX, int uLeftY, int lRightX, int lRightY) {
        upperLeftX = uLeftX;
        upperLeftY = uLeftY;
        lowerRightX = lRightX;
        lowerRightY = lRightY;
    }

    /**
     * @param other -another rectangle
     * @return should return true if this rectangle overlaps/intersections with the other rectangle
     */

    public boolean doesHit(Rectangle other) {
        if (this.upperLeftY > other.lowerRightY && other.upperLeftY > this.lowerRightY)
            return false;
        if (this.upperLeftX > other.lowerRightX || other.upperLeftX > this.lowerRightX)
            return false;
        return true;

    }


    }
    public class FarTest {
        @Test
        public void testDist(){
        var p1 = new Point(0, 0);
        var p2 = new Point(2, 2);
        assert BasicGeom.calcDistance;
        assert false;

}
    public class closeTest {
        @Test
        public void testDist(){
            var p1 = new Point(2,2);
            var p2 = new Point(2,2);
            assert BasicGeom.calcDistance(p1,p2);
        }
        }
    public class nearTest {
        @Test
        public void testDist(){
            var p1 = new Point(3,4);
            par p2 = new Point(3,5);
            assert BasicGeom.calcDistance(p1,p2);
        }
    }