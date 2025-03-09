package com.carlotaml21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DnaToRnaConverterTest {

    private final DnaToRnaConverter converter = new DnaToRnaConverter();

    @Test
    void testTranscribeSingleNucleotides(){
        assertEquals("C", converter.transcribe("G"));
        assertEquals("G", converter.transcribe("C"));
        assertEquals("A", converter.transcribe("T"));
        assertEquals("U", converter.transcribe("A"));
    }

    }
}
