package Directions;


import com.penta.marsrover.Position;
import java.util.Stack;

public class WEST implements Heading {
    @Override
    public void F(Position position, Stack<Position> lastValidCoordinates) {
        position.getCoordinates().x -= 1;
        lastValidCoordinates.push(new Position(position));
    }

    @Override
    public void B(Position position, Stack<Position> lastValidCoordinates) {
        position.getCoordinates().x += 1;
        lastValidCoordinates.push(new Position(position));
    }

    @Override
    public void L(Position position, Stack<Position> lastValidCoordinates) {
        position.heading = "SOUTH";
    }

    @Override
    public void R(Position position, Stack<Position> lastValidCoordinates) {
        position.heading = "NORTH";
    }
}
