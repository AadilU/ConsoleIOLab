import java.util.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.chart.*;
import javafx.geometry.*;

public class graph extends Application
{
    public static void main(String[] args)
    {
       launch(args);
    }
    
    @Override
    public void start(Stage stage)
    {
        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(25, 25, 25, 25));
        
        Label x1 = new Label("x:");
        pane.add(x1, 0, 1);
        
        Label y1 = new Label("y:");
        pane.add(y1, 0, 2);
        
        TextField getX = new TextField();
        pane.add(getX, 1, 1);
        
        TextField getY = new TextField();
        pane.add(getY, 1, 2);
        
        Button b = new Button("graph");
        pane.add(b, 2, 2);
        
        Scene s1 = new Scene(pane, 300, 275);
        
        stage.setScene(s1);
        
        NumberAxis x = new NumberAxis();
        NumberAxis y = new NumberAxis();
        
        LineChart l = new LineChart(x, y);
        
        Scene scene1 = new Scene(l, 400, 500);
        
        XYChart.Series s = new XYChart.Series();
        
        s.setName("Test");
        
        XYChart.Data a = new XYChart.Data(500, 200);
        
        l.getData().add(s);
        
        b.setOnAction(e -> {
            stage.setScene(scene1);
            s.getData().add(new XYChart.Data(Integer.parseInt(getX.getText()), Integer.parseInt(getY.getText())));
        });
        
        stage.show();
    }
    
    public static int collectInp()
    {
        System.out.println("Enter:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        return x;
    }
}