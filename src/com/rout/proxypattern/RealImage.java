package com.rout.proxypattern;

public class RealImage implements Image {

    // Instance variables - To store image-related data
    private double[] location = new double[2];
    private String name;
    private boolean border;

    // Constructor - Used for object initializations
    public RealImage(String filename) {
        // Loads image from disk
        System.out.println("Loaded from disk : " + filename);
        name = filename;
    }

    // Image Border Information
    @Override
    public void setBorder(boolean border) {
        // sets the image border value
        this.border = border;
    }

    @Override
    public boolean getBorder() {
        // returns the image border value
        return this.border;
    }
    
    // Image Location Information
    @Override
    public void setLocation(double x, double y){
        // sets the image location
        this.location[0] = x;
        this.location[1] = y;
    }

    @Override
    public double[] getLocation() {
        // returns the image location
        return this.location;
    }
    
    // Image Display Functionality
    @Override
    public void display() {
        // Display the Image
        System.out.println("Displayed : " + this.name);
    }
}