package com.myCode.point;

public final class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double deltaX, double deltaY) {
        return new Point(this.getX() + deltaX, this.getY() + deltaY);
    }

    public Point scale(double multiplier) {
        return new Point(this.getX() * multiplier, this.getY() * multiplier);
    }

    @Override
    public String toString() {
        return "Point(" + x +
                ", " + y +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o.getClass() != this.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.getX(), getX()) == 0 &&
                Double.compare(point.getY(), getY()) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = (int) (31 * result + Double.doubleToLongBits(getX()));
        result = (int) (31 * result + Double.doubleToLongBits(getY()));
        return result;
    }
}
