package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void sameXY() {
        Cell exp = Cell.A1;
        BishopBlack slon = new BishopBlack(exp);
        assertEquals(slon.position(), exp);
    }

    @Test
    public void testCopy() {
        Cell in = Cell.A1;
        Cell out = Cell.C1;
        BishopBlack slon = new BishopBlack(in);
        BishopBlack slon2 = (BishopBlack) slon.copy(out);
        assertEquals(slon2.position(), out);
    }

    @Test
    public void testWay() {
        Cell in = Cell.C1;
        Cell out = Cell.G5;
        BishopBlack slon = new BishopBlack(in);
        assertEquals(slon.way(out).length, 4);
    }

    @Test
    public void isD() {
        Cell in = Cell.C1;
        Cell out = Cell.G5;
        BishopBlack slon = new BishopBlack(in);
        assertTrue(slon.isDiagonal(in, out));
    }

    @Test (expected = IllegalStateException.class)
    public void wayEx() {
        Cell in = Cell.C1;
        Cell out = Cell.G6;
        BishopBlack slon = new BishopBlack(in);
        int len = slon.way(out).length;
    }


}