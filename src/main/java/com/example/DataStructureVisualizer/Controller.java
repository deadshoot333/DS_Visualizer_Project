package com.example.DataStructureVisualizer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.Stack;

public class Controller {

    @FXML
    private Button pushButton;

    @FXML
    private Button popButton;

    @FXML
    private Pane stackPane;
    @FXML
    private TextField textField;
    private final Stack<StackPane> stack = new Stack<>();

    public void initialize() {
        pushButton.setOnAction(event -> pushSquare());
        popButton.setOnAction(event -> popSquare());
    }

    private void pushSquare()   {
        Rectangle rectangle = new Rectangle(30, 30);
        rectangle.setFill(Color.WHITE);
        //rectangle.setX(stackPane.getWidth());
        //rectangle.setY(stackPane.getHeight());
        int data=Integer.parseInt(textField.getText());
        String my_string=Integer.toString(data);
        Text text=new Text(my_string);
        StackPane stackpane=new StackPane();
        stackpane.getChildren().addAll(rectangle,text);
        stack.push(stackpane);
        //stackPane.getChildren().add(rectangle);

        visualizeStack();
    }

    private void popSquare() {
        if (stack.isEmpty()) {
            System.out.println("StackUnderFlow");
            return;
        }

        StackPane stakePane = stack.pop();
        stackPane.getChildren().remove(stakePane);

        visualizeStack();
    }

    private void visualizeStack() {
        stackPane.getChildren().clear();

        for (int i = 0; i < stack.size(); i++) {
            StackPane stk = stack.get(i);

            stk.setLayoutY(stackPane.getHeight() / 2 - i * 22);

            stackPane.getChildren().add(stk);
        }
    }
}
