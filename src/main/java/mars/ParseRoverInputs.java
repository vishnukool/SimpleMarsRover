package mars;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParseRoverInputs {

    ArrayList<CoordinatePosition> roverStartPoint = new ArrayList<CoordinatePosition>();
    ArrayList<Character> roverStartDirection = new ArrayList<Character>();
    ArrayList<String> command = new ArrayList<String>();
    CoordinatePosition plateauLimitPoint = new CoordinatePosition();


    public void parseRoverInputAndGetValues(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = null;
            line = reader.readLine();
            String[] plateauLimits = line.split(" ");
            plateauLimitPoint = readPoint(plateauLimits);

            setInitialRoverStatesAndCommand(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void setInitialRoverStatesAndCommand(BufferedReader reader) {
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] roverStartState = line.split(" ");
                roverStartPoint.add(readPoint(roverStartState));
                roverStartDirection.add(roverStartState[2].charAt(0));

                line = reader.readLine();
                command.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public CoordinatePosition readPoint(String[] wordList) {
        return new CoordinatePosition(Integer.parseInt(wordList[0]), Integer.parseInt(wordList[1]));
    }

     public ArrayList<CoordinatePosition> getRoverStartPoint() {
        return roverStartPoint;
    }


    public ArrayList<Character> getRoverStartDirection() {
        return roverStartDirection;
    }

    public ArrayList<String> getCommand() {
        return command;
    }

    public CoordinatePosition getPlateauLimitPoint() {
        return plateauLimitPoint;
    }


}
