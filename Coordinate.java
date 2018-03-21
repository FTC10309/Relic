package org.firstinspires.ftc.teamcode.Util;

/**
 * Created by Boaz Qiu on 10/3/2017.
 */

public class Coordinate {
    //Cartesian coordinate system, unit is micro for precision
    public int x;
    public int y;

    //constructor if X, Y are given
    public Coordinate(int inputX, int inputY){
        x = inputX;
        y = inputY;
    }

    //constructor if polar coordinates are given
    public Coordinate(int distance, double angle){
        x =(int)(Math.cos(angle) * distance);
        y =(int)(Math.sin(angle) * distance);
    }

    public void updateUsingPolar(int distance, double angle){
        x =(int)(Math.cos(angle) * distance);
        y =(int)(Math.sin(angle) * distance);
    }
}
