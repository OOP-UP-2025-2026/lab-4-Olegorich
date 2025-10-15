package ua.opnu;

import java.awt.*;

public class Point3D extends Point {

    int z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public int getZ() {
        return z;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public void setLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point3D p) {
        int newX = (p.x - this.x) * (p.x - this.x);
        int newY = (p.y - this.y) * (p.y - this.y);
        int newZ = (p.z - this.z) * (p.z - this.z);
        return Math.sqrt(newX + newY + newZ);
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }

    public double distanceFromOrigin() {
        int newX = this.x * this.x;
        int newY = this.y * this.y;
        int newZ = this.z * this.z;
        return Math.sqrt(newX + newY + newZ);
    }
}
