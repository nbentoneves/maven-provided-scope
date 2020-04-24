package com.github.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CollectionConverterTest {

    @Test
    public void testConvertListToMap() {

        List<String> names = new ArrayList<String>();
        names.add("Nuno");
        names.add("Diogo");
        names.add("Ana");

        Map<Integer, String> mappingNames = CollectionConvert.convert(names);

        Assert.assertNotNull(mappingNames);
        assertEquals(3, mappingNames.size());
        assertEquals("Nuno", mappingNames.get(0));
        assertEquals("Diogo", mappingNames.get(1));
        assertEquals("Ana", mappingNames.get(2));

    }

}
