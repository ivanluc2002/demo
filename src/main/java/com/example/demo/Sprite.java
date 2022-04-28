
package com.example.demo;


import javafx.scene.Node;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.controlsfx.control.cell.ImageGridCell;

public class Sprite extends Node {
    String nome;
    double x;
    double y;
    ImageView imgView;

    Sprite(String nome, int x, int y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
        Image img = new Image(nome);
        this.imgView = new ImageView(img);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void moveup() {
        y+=50;
    }
    public void movedown() {
        y-=50;
    }
    public void moveright() {
        x+=50;
    }
    public void moveleft() {
        x-=50;
    }

    public ImageView getImgView() {
        return imgView;
    }

    public void setImgView(ImageView imgView) {
        this.imgView = imgView;
    }


    @Override
    public Node getStyleableNode() {
        return super.getStyleableNode();
    }
}
