package com.company;

public class Square {

    private int width;
    private int height;
    private int area;

    public void setWidth(int squareWidth) {
        width = squareWidth;
    }
    public int getWidth() {
        return width;
    }


    public void setHeight(int squareHeight) {
        height = squareHeight;
    }
    public int getHeight() {
        return height;
    }


    public int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }



}
