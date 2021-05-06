package chapter1.section2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;


import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Exercise121 {
    public static void main(String[] args){
        int N = 30;
        Random random = new Random();
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLUE);
        Point2D[] pointarray = new Point2D[N];
        for ( int i = 0;i < N; i++){
            double x = random.nextDouble();
            double y = random.nextDouble();
            StdDraw.point(x,y );
            pointarray[i] = new Point2D(x,y);

        }
        double maxValue = 0;
        for ( int i = 0; i < N; i ++){
            for ( int j = 0; j < N; j++){
                if ( pointarray[i].distanceTo(pointarray[j]) > maxValue){
                    maxValue = pointarray[i].distanceTo(pointarray[j]);
                    StdDraw.setPenColor(Color.magenta);
                    StdDraw.setPenRadius(0.001);
                    StdDraw.line(pointarray[i].x(), pointarray[i].y(), pointarray[j].x(),pointarray[j].y());
                    StdDraw.pause(1000);
                }
            }
        }
        StdDraw.setPenColor(Color.red);
        StdDraw.text(0.5,0.5 , "The maximal distance is " + Double.toString(maxValue));

    }
}
