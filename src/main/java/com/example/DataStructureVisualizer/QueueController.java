package com.example.DataStructureVisualizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.*;

public class QueueController {

    @FXML
    private Button enqueueButton;

    @FXML
    private Button dequeueButton;
    @FXML
    private Pane stackPane;
    @FXML
    private TextField textField;
    public StackPane [] q;
    private int front;
    private int rear;
    private int size;
    private final int MAX_SIZE=15;
    public QueueController()
    {
        q=new StackPane[MAX_SIZE];
        size=0;
        front=0;
        rear=0;
    }
    public void initialize() {
        enqueueButton.setOnAction(event -> enqueueSquare());
        dequeueButton.setOnAction(event -> dequeueSquare());
    }

    public void enqueueSquare() {
        Rectangle rectangle = new Rectangle(30, 30);
        rectangle.setFill(Color.WHITE);
        int data = Integer.parseInt(textField.getText());
        String my_string = Integer.toString(data);
        Text text = new Text(my_string);
        StackPane stackpane = new StackPane();
        stackpane.getChildren().addAll(rectangle, text);
        q[rear]=stackpane;
        rear++;
        size++;
        visualizeQueue();
    }

    public void dequeueSquare() {
        StackPane dqStackPane=q[front];
        front++;
        size--;
        stackPane.getChildren().remove(dqStackPane);
        visualizeQueue();

    }
    public void visualizeQueue() {
            stackPane.getChildren().clear();
            int positionCounter=0;
            for(int i=front;i<rear;i++)
            {
                StackPane viewStackPane=q[i];
                viewStackPane.setLayoutX(2+positionCounter*22);
                positionCounter++;
                stackPane.getChildren().add(viewStackPane);
            }
        }

}
