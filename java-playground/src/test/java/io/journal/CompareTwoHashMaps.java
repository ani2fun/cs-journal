package io.journal;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompareTwoHashMaps {
    private boolean areEqual(Map<Integer, Character> first, Map<Integer, Character> second) {
        if (first.size() != second.size()) {
            return false;
        }

        return first.entrySet().stream()
                .allMatch(e -> e.getValue().equals(second.get(e.getKey())));
    }

    @Test
    public void whenCompareTwoHashMapsWithArrayValuesUsingEquals_thenFail() {
        Map<Integer, Character> asiaCapital1 = new HashMap<Integer, Character>();
        asiaCapital1.put(1, 'p');
        asiaCapital1.put(2, 'o');


        Map<Integer, Character> asiaCapital2 = new HashMap<Integer, Character>();
        asiaCapital2.put(1, 'p');
        asiaCapital2.put(2, 'o');

        Map<Integer, Character> asiaCapital3 = new HashMap<Integer, Character>();
        asiaCapital3.put(1, 'p');
        asiaCapital3.put(2, 'r');

        assertTrue(asiaCapital1.equals(asiaCapital2));
        assertFalse(asiaCapital1.equals(asiaCapital3));
    }
}
