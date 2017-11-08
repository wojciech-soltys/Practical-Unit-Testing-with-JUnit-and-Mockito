package my.chp03;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Wojciech_Soltys on 28.12.2016.
 */
public class HashMapTest {

    final String KEY_1 = "KEY_1";
    final String KEY_2 = "KEY_2";
    final String NULL_KEY = null;

    final String VALUE_1 = "VALUE_1";
    final String VALUE_2 = "VALUE_2";

    private HashMap<String,String> hashMap;

    @Before
    public void setUp() throws Exception {
        hashMap = new HashMap<String, String>();
    }

    @Test
    public void putShouldReturnOneElement() {
        hashMap.put(KEY_1,VALUE_1);
        assertEquals(1, hashMap.size());
        assertTrue(hashMap.containsKey(KEY_1));
        assertEquals(VALUE_1, hashMap.get(KEY_1));
    }

    @Test
    public void putWithTheSameKeyShouldReplaceValue() {
        hashMap.put(KEY_1,VALUE_1);
        hashMap.put(KEY_1,VALUE_2);
        assertEquals(1, hashMap.size());
        assertTrue(hashMap.containsKey(KEY_1));
        assertEquals(VALUE_2, hashMap.get(KEY_1));
    }

    @Test
    public void clearShouldRemoveAllItems() {
        hashMap.put(KEY_1,VALUE_1);
        hashMap.put(KEY_2,VALUE_2);
        hashMap.clear();
        assertEquals(0, hashMap.size());
        assertFalse(hashMap.containsKey(KEY_1));
        assertFalse(hashMap.containsKey(KEY_2));
    }

    @Test
    public void nullValueCanBeUsedAsKey() {
        hashMap.put(NULL_KEY, VALUE_1);
        assertEquals(1, hashMap.size());
        assertTrue(hashMap.containsKey(NULL_KEY));
        assertEquals(VALUE_1, hashMap.get(NULL_KEY));
    }

}