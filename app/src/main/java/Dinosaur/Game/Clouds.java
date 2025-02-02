package Dinosaur.Game;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;

public class Clouds {
    private Group root;
    private ImageView imageView = new ImageView();
    private int width = 70;//ширина
    private int height = 70;//высота
    private int posX = 500;
    private int posY = 0;


    public Clouds (Group root, int width, int height) throws FileNotFoundException {
        this.root = root;
        this.width = width;
        this.height = height;
        Image image;

        FileInputStream fileInputStream = new FileInputStream("/Users/vladalodocnikova/IdeaProjects/programming-task3-2022/app/src/main/resources/Image/cloud.png");
        image= new Image(fileInputStream);
        imageView = new ImageView(image);
        root.getChildren().add(imageView);
        imageView.setFitHeight(height);
        imageView.setFitWidth(width);
    }

    public Clouds () {

    }

    public Clouds(ImageView imageView){
        this.imageView = imageView;
    }
    public Clouds(int X, int Y){
        posX = X;
        posY = Y;
    }
    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public Group getRoot() {
        return root;
    }

    public void setRoot(Group root) {
        this.root = root;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
        imageView.setX(this.posX);
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
        imageView.setY(this.posY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clouds clouds = (Clouds) o;
        return width == clouds.width && height == clouds.height && posX == clouds.posX && posY == clouds.posY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, posX, posY);
    }
}