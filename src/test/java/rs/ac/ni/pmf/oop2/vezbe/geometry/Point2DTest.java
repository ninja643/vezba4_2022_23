package rs.ac.ni.pmf.oop2.vezbe.geometry;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Point2DTest
{
    @Test
    public void shouldComputeDistance()
    {
        final Point2D point = new Point2D(1, 1);
        final double distance = point.distance(2, 2);
        final Point2D otherPoint = new Point2D(1, 10);

        assertThat(distance).isEqualTo(Math.sqrt(2));

        assertThat(point.distance()).isEqualTo(Math.sqrt(2));
        assertThat(point.distance()).isCloseTo(1.41, Offset.offset(0.01));

        assertThat(point.distance(otherPoint)).isEqualTo(9.0);
    }
}