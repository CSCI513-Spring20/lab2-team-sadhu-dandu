
import java.awt.Point;
//class Oceanmap
public class OceanMap {

    int xcoord ,ycoord  ;
//instantiating the boolean array with 10*10
    boolean[][] myGrid = new boolean[10][10];
// set method for the location
   public void setLocation(int i , int j){
        xcoord = i;
        ycoord = j;
       }

    public boolean[][] getMap() {
        return myGrid;
    }
//     get method for the location
    public Point getLocation(){
        return new Point(xcoord,ycoord);

    }
}
