package integration;

import mars.CoordinatePosition;
import mars.ParseRoverInputs;
import org.hamcrest.CoreMatchers;
import org.jruby.compiler.ir.operands.Array;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ParseRoverInputsTest {
    @Test
    public void testPlateauLimitsAreRead() {
        ParseRoverInputs parseRoverInputs =new ParseRoverInputs();
        parseRoverInputs.parseRoverInputAndGetValues("TestData.txt");
        assertThat(parseRoverInputs.getPlateauLimitPoint(),is(new CoordinatePosition(5,5)));
    }

    @Test
    public void testThatStartCoordinateIsParsed() {
    ParseRoverInputs parseRoverInputs =new ParseRoverInputs();
    parseRoverInputs.parseRoverInputAndGetValues("TestData.txt");
        ArrayList<CoordinatePosition> fakeStartPoint = new ArrayList<CoordinatePosition>();
        fakeStartPoint.add(new CoordinatePosition(1,2));
    assertThat(parseRoverInputs.getRoverStartPoint(), is(fakeStartPoint));
    }
    @Test
    public void testThatDirectionIsParsed(){
        ParseRoverInputs parseRoverInputs =new ParseRoverInputs();
            parseRoverInputs.parseRoverInputAndGetValues("TestData.txt");
            ArrayList<Character> fakeDirection =new ArrayList<Character>();
            fakeDirection.add('N');
        assertThat(parseRoverInputs.getRoverStartDirection(), is(fakeDirection));
    }

    @Test
    public void testThatCommandIsParsed(){
        ParseRoverInputs parseRoverInputs =new ParseRoverInputs();
                    parseRoverInputs.parseRoverInputAndGetValues("TestData.txt");
        ArrayList<String> fakeCommand = new ArrayList<String>();
        fakeCommand.add("LMLMLMLM");
        assertThat(parseRoverInputs.getCommand(), is(fakeCommand));
    }
}
