//package com.example.DataStructureVisualizer;
//
//import com.example.DataStructureVisualizer.BinaryTree;
//import javafx.fxml.FXML;
//import javafx.scene.canvas.Canvas;
//import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//
//public class BinaryTreeController {
//
//    @FXML
//    private TextField input;
//
//    @FXML
//    private Button insertButton;
//
//    @FXML
//    private Button traverseButton;
//
//    @FXML
//    private Canvas canvas;
//
//    private BinaryTree tree;
//
//    public void initialize() {
//        tree = new BinaryTree();
//
//        insertButton.setOnAction(event -> {
//            int value = Integer.parseInt(input.getText());
//            tree.insert(value);
//            visualizeTree();
//        });
//
//        traverseButton.setOnAction(event -> {
//            tree.traverse();
//            visualizeTree();
//        });
//    }
//
//    private void visualizeTree() {
//        // Get the graphics context of the canvas.
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//
//        // Clear the canvas.
//        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
//
//        // Draw the tree.
//        drawTree(tree.getRoot(), gc);
//    }
//    private void drawTree(BinaryTree.Node node, GraphicsContext gc) {
//        if (node == null) {
//            return;
//        }
//
//        // Draw the node.
//        gc.setFill(Color.BLACK);
//        gc.fillRect(node.getX(), node.getY(), 20, 20);
//
//        // Draw the node's value.
//        gc.setFill(Color.WHITE);
//        gc.setFont(new Font(12));
//        gc.fillText(String.valueOf(node.getValue()), node.getX() + 5, node.getY() + 15);
//
//        // Draw the node's children.
//        drawTree(node.getLeft(), gc);
//        drawTree(node.getRight(), gc);
//    }
//}
