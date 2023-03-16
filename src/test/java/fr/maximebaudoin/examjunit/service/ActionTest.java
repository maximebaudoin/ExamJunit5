package fr.maximebaudoin.examjunit.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ActionTest {

    @Test
    public void test_actionRandom() throws Exception {

        when(Action.actionRandom()).thenReturn("feuille");

        assertEquals("feuille", Action.actionRandom());
    }

}
