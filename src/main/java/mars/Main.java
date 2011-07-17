package mars;

import java.util.Iterator;

public class Main {

    public static void main(String[] args){
            ParseRoverInputs parseRoverInputs =new ParseRoverInputs();
            String fileName= "input.txt";
            parseRoverInputs.parseRoverInputAndGetValues(fileName);
            CoordinatePosition plateau= new CoordinatePosition(parseRoverInputs.plateauLimitPoint);

            Iterator<String> itrCommand = parseRoverInputs.command.iterator();
            Iterator<CoordinatePosition> itrPoint = parseRoverInputs.roverStartPoint.iterator();
            Iterator<Character> itrD = parseRoverInputs.roverStartDirection.iterator();

            while(itrCommand.hasNext()){
            Rover marsRover=new Rover(itrPoint.next(),itrD.next().charValue(),plateau);
            marsRover.executeCommands(itrCommand.next());
            System.out.println(marsRover);
            }

    }
}
