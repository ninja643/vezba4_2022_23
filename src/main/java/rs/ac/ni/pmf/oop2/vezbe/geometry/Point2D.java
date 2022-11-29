package rs.ac.ni.pmf.oop2.vezbe.geometry;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Point2D
{
    private int x;
    private int y;

    public double distance(final int x, final int y)
    {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(final Point2D point)
    {
        return distance(point.getX(), point.getY());
    }

    public double distance()
    {
        return distance(0, 0);
    }
}
