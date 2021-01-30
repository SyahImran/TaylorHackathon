/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;
*/
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    private int width = 800;
    private int height = width / 16 * 9;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Canvas canvas = new Canvas(width, height);
        group.getChildren().add(canvas);
        Scene scene = new Scene(group);
        draw(canvas.getGraphicsContext2D());
        canvas.requestFocus();
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void draw(GraphicsContext gc) {
        gc.setFill(Color.PURPLE);
        gc.fillRect(0, 0, width, height);
    }

  /*

    public static void main(String[] args) {
        final String title = "Taylor HS Hackathon";
        final int width = 800;
        final int height = width / 16 * 9;

        //Creating the frame.
        JFrame frame = new JFrame(title);
        JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        JButton houseOwnerButton = new JButton("I am a House Owner");
        JButton lawnMowerButton = new JButton("I am a Lawn Mower");

        frame.setContentPane(pane);

        houseOwnerButton.setBounds(290, 100, 195, 50);
        frame.add(houseOwnerButton);
        //frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        lawnMowerButton.setBounds(290, 200, 195, 50);
        frame.add(lawnMowerButton);
        //frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        //Creating the canvas.
        Canvas canvas = new Canvas();

        canvas.setSize(width, height);
        canvas.setBackground(Color.WHITE);
        canvas.setVisible(true);
        canvas.setFocusable(false);


        //Putting it all together.
        frame.add(canvas);

        canvas.createBufferStrategy(3);

        boolean running = true;

        BufferStrategy bufferStrategy;
        Graphics graphics;

        while (running) {
            bufferStrategy = canvas.getBufferStrategy();
            graphics = bufferStrategy.getDrawGraphics();
            graphics.clearRect(0, 0, width, height);

            graphics.setColor(Color.BLACK);

            graphics.setFont(new Font("Arial", Font.PLAIN, 15));
            graphics.drawString("*This is an app to facilitate communication between homeowners and lawnmowers.", 5, 15);
            graphics.setFont(new Font("Arial", Font.PLAIN, 20));
            graphics.drawString("       Choose from the below:", 245, 75);

            bufferStrategy.show();
            graphics.dispose();
        }

        houseOwnerButton.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e )
            {
                final TextField tf = new TextField();
                tf.setBounds(250, 50, 150, 20);
                tf.setText("You have selected：Home Owner!");
                frame.add(tf);
            }
        });


    }
    */
}