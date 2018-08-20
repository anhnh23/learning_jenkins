package app;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TicTacToeSpec {
    private TicTacToe ticTacToe;
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void init(){
        ticTacToe = new TicTacToe();
    }

    @Test
    public void whenPointXOutsideTheBoardThenException(){
        exception.expect(RuntimeException.class);
        ticTacToe.play(4,2);
    }

    @Test
    public void whenPointYOutsideTheBoardThenException(){
        exception.expect(RuntimeException.class);
        ticTacToe.play(2, 5);
    }
}
