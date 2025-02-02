/*
 * This Java source file was generated by the Gradle 'init' task.
 */


package Dinosaur.Game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App extends Application {

    public App() throws FileNotFoundException {
    }

    @Override
    public void start (Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/Scene1.fxml"));//для создания интерфейса, получить определение интерфейса из файла
        Scene scene = new Scene(fxmlLoader.load());//Метод FXMLLoader.load() возвращает объект типа Parent, который мы можем передать в конструктор объекта Scene, и таким образом, наше приложение получит интерфейс из fxml.
        primaryStage.setTitle("Dino Game");

        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(600);
        primaryStage.setWidth(600);
        primaryStage.setHeight(600);
        primaryStage.setMaxWidth(600);
        primaryStage.setMaxHeight(600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {//запускаем наше приложение
        launch(args);
    }
}