import java.awt.Point;
public class Ship  {
    int scale = 50;
    int xcoord  =300;
    int ycoord =300;
    Point currentLocation;


    public Point goEast(int x,int y) {
        if(x!=450) {
            xcoord  = x+50; }
        return new Point(xcoord ,y);

    }
    public Point goWest(int x,int y) {
        if(x!=0) {
            xcoord  = x-50; }
        return new Point(xcoord ,y);


    }
    public Point goNorth(int x,int y) {
        if(y!=0) {
            ycoord  = y-50; }
        return new Point(x,ycoord );

    }
    public Point goSouth(int x,int y) {
        if(y!=450) {
            ycoord  = y+50; }
        return new Point(x,ycoord );

    }

    public Point getLocation() {

        return new Point(xcoord ,ycoord);
    }
}
