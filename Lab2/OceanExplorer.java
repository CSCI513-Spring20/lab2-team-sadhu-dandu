
import javafx.application.Application;
import java.util.Random;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;
import java.lang.String;

public class OceanExplorer extends Application {
    AnchorPane root;
    Ship img;
    final int dimension = 10;
    final int scale = 50;
    final int islandcount = 10;
    int xval = 6;
    int yval =6;
    Scene scene;
    Random rand;
    ImageView shipImageView;
     OceanMap map = new OceanMap();
    public static void main(String[]args){
        launch(args);
    }
    @Override
    public void start(Stage oceanStage) throws Exception {

        root = new AnchorPane();
        OceanMap map = new OceanMap();
         scene = new Scene( root, scale*dimension ,scale*dimension );
        img = new Ship();
        loadShipImage();
        oceanStage.setTitle("Columbus Game");
        oceanStage.setScene(scene);
        oceanStage.show();
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                Rectangle rect = new Rectangle(i*scale, j*scale, scale, scale);
                rect.setStroke(Color.BLACK);
                rect.setFill(Color.PALETURQUOISE);
                root.getChildren().add(rect);
            }
        }

        startSailing();
    }
     public void loadShipImage() throws Exception{
        Image shipImage = new Image("C:\\Users\\pavan\\IdeaProjects\\lab2-team-sadhu-dandu\\Lab2\\ship.png",50,50,true,true);
        shipImageView = new ImageView(shipImage);
        shipImageView.setX(map.getLocation().x * scale);
        shipImageView.setY(map.getLocation().y * scale);
        root.getChildren().add(shipImageView);
    }
    public  void startSailing() {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                switch (ke.getCode()) {
                    case RIGHT:
                        img.goEast(map.getLocation().x*scale, map.getLocation().y*scale);
                        break;
                    case LEFT:
                        img.goWest(map.getLocation().x*scale, map.getLocation().y*scale);
                        break;
                    case UP:
                        img.goNorth(map.getLocation().x*scale, map.getLocation().y*scale);
                        break;
                    case DOWN:
                        img.goSouth(map.getLocation().x*scale, map.getLocation().y*scale);
                        break;
                    default:
                        break;
                }
                shipImageView.setX(img.getLocation().x * scale);
                shipImageView.setY(img.getLocation().y * scale);
            }
        });

    }


}

