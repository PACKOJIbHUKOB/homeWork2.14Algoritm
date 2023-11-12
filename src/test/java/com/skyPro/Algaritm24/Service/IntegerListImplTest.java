package com.skyPro.Algaritm24.Service;

import com.skyPro.Algaritm24.Interface.IntegerList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.skyPro.Algaritm24.util.Test_massive.*;
import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {
    public final IntegerListImpl testlist = new IntegerListImpl();

    @Test
    void add_success() {
        //подготовка входных данных
        Integer item = NUMBER_1;
        //подготовка ожидаемого результата
        Integer expected = item;

        //начало теста
        IntegerList integerList = new IntegerListImpl(2);
        integerList.add(item);
        Integer actual = integerList.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void testAddIndex_success() {
        Integer item = NUMBER_1;
        Integer item1 = NUMBER_2;
        Integer item2 = NUMBER_3;
        Integer item3 = NUMBER_4;
        int index = 2;
        int size = 4;
        //подготовка ожидаемого результата
        Integer[] test = new Integer[4];
        test[0] = item1;
        test[1] = item2;
        test[2] = item3;
        for (int i = test.length - 1; i > index; i--) {
            test[i] = test[i - 1];
        }
        test[index] = item;
        Integer expected = test[index];
        //начало теста
        IntegerList stringList = new IntegerListImpl(size);
        stringList.add(item1);
        stringList.add(item2);
        stringList.add(item3);
        Integer actual = stringList.add(index, item);
        ;
        assertEquals(expected, actual);
    }

    @Test
    void remove_success() {
        //подготовка входных данных
        Integer item = NUMBER_1;
        //подготовка ожидаемого результата
        Integer expected = item;

        //начало теста
        IntegerList integerList = new IntegerListImpl(2);
        integerList.add(item);
        Integer actual = integerList.remove(item);
        assertEquals(expected, actual);
    }


    @Test
    void RemoveIndex_success() {
        Integer item = NUMBER_1;
        Integer item1 = NUMBER_2;
        Integer item2 = NUMBER_3;
        Integer item3 = NUMBER_4;
        int index = 2;
        int size = 4;
        //подготовка ожидаемого результата
        Integer[] test = new Integer[size];
        test[0] = item;
        test[1] = item1;
        test[2] = item2;
        test[3] = item3;
        Integer expected = test[index];
        //начало теста
        IntegerList integerList = new IntegerListImpl(size);
        integerList.add(item);
        integerList.add(item1);
        integerList.add(item2);
        integerList.add(item3);
        Integer actual = integerList.remove(index);
        assertEquals(expected, actual);
    }

    @Test
    void contains_success() {
        Integer item = NUMBER_1;
        Integer item1 = NUMBER_2;
        Integer item2 = NUMBER_3;
        Integer item3 = NUMBER_4;

        IntegerList integerList = new IntegerListImpl(4);

        //Подготовка ожидаемого результата
        integerList.add(item);
        integerList.add(item1);
        integerList.add(item2);
        integerList.add(item3);
        assertTrue(integerList.contains(1));
    }

    @Test
    void indexOf_success() {
        Integer item = NUMBER_1;
        Integer item1 = NUMBER_2;
        Integer item2 = NUMBER_3;

        int size = 3;
        int index = 0;
        //подготовка ожидаемого результата
        int expected = index;

        //начало теста
        IntegerList integerList = new IntegerListImpl(size);
        integerList.add(item);
        integerList.add(item1);
        integerList.add(item2);
        int actual = integerList.indexOf(item);
        assertEquals(expected, actual);
    }

    @Test
    void lastIndexOf_success() {
        Integer item = NUMBER_1;
        Integer item1 = NUMBER_2;
        Integer item2 = NUMBER_3;
        Integer item3 = NUMBER_4;
        int size = 3;
        int index = 2;
        //подготовка ожидаемого результата
        int expected = index;

        //начало теста
        IntegerList integerList = new IntegerListImpl(size);
        integerList.add(item);
        integerList.add(item1);
        integerList.add(item2);
        int actual = integerList.lastIndexOf(item2);
        assertEquals(expected, actual);
    }

    @Test
    void get_success() {
        Integer item = NUMBER_1;
        Integer item1 = NUMBER_2;
        Integer item2 = NUMBER_3;
        Integer item3 = NUMBER_4;
        int index = 2;
        int size = 4;
        //подготовка ожидаемого результата
        Integer[] test = new Integer[size];
        test[0] = item;
        test[1] = item1;
        test[2] = item2;
        test[3] = item3;
        Integer expected = test[index];
        //начало теста
        IntegerList integerList = new IntegerListImpl(size);
        integerList.add(item);
        integerList.add(item1);
        integerList.add(item2);
        integerList.add(item3);
        Integer actual = integerList.get(index);
        assertEquals(expected, actual);
    }

    @Test
    void set_success() {
        Integer item = NUMBER_1;
        Integer item1 = NUMBER_2;
        Integer item2 = NUMBER_3;
        Integer item3 = NUMBER_4;
        int index = 2;
        int size = 4;
        //подготовка ожидаемого результата
        Integer[] test = new Integer[size];
        test[0] = item;
        test[1] = item1;
        test[2] = item2;
        test[3] = item3;
        Integer expected = test[index];
        //начало теста
        IntegerList integerList = new IntegerListImpl(size);
        integerList.add(item);
        integerList.add(item1);
        integerList.add(item3);
        Integer actual = integerList.set(index, item2);
        assertEquals(expected, actual);
    }

    @Test
    void testEquals_success() {
        Integer item = NUMBER_1;
        Integer item1 = NUMBER_2;
        Integer item2 = NUMBER_3;
        Integer item3 = NUMBER_4;
        int size = 4;
        //подготовка ожидаемого результата
        IntegerList testlist = new IntegerListImpl(size);
        testlist.add(item);
        testlist.add(item1);
        testlist.add(item2);
        testlist.add(item3);
        boolean expected = true;
        //начало теста
        IntegerList integerList = new IntegerListImpl(size);
        integerList.add(item);
        integerList.add(item1);
        integerList.add(item2);
        integerList.add(item3);
        Boolean actual = integerList.equals(testlist);
        assertEquals(expected, actual);
    }

    @Test
    void size_success() {
        Integer item = NUMBER_1;
        Integer item1 = NUMBER_2;
        Integer item2 = NUMBER_3;
        Integer item3 = NUMBER_4;
        int size = 4;
        //подготовка ожидаемого результата
        int expected = 7;
        //начало теста
        IntegerList integerList = new IntegerListImpl(size);
        integerList.add(item);
        integerList.add(item1);
        integerList.add(item2);
        integerList.add(item3);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        int actual = integerList.size();
        assertEquals(expected, actual);
    }

    @Test
    void isEmpty_success() {

        int size = 4;
        //подготовка ожидаемого результата
        boolean expected = true;
        String item = TEXT_1;
        //начало теста
        IntegerList integerList = new IntegerListImpl(size);
        //stringList.add(item);
        Boolean actual = integerList.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    void clear_success() {
        Integer item = NUMBER_1;
        Integer item1 = NUMBER_2;
        Integer item2 = NUMBER_3;
        Integer item3 = NUMBER_4;
        int size = 4;
        //подготовка ожидаемого результата
        int expected = 0;
        //начало теста
        IntegerList integerList = new IntegerListImpl(size);
        integerList.add(item);
        integerList.add(item1);
        integerList.add(item2);
        integerList.add(item3);
        integerList.clear();
        int actual = integerList.size();
        assertEquals(expected, actual);
    }

    @Test
    void toArray_success() {
        Integer item = NUMBER_1;
        Integer item1 = NUMBER_2;
        Integer item2 = NUMBER_3;
        Integer item3 = NUMBER_4;
        int size = 4;
        //подготовка ожидаемого результата
        Integer[] test = new Integer[size];
        test[0] = item;
        test[1] = item1;
        test[2] = item2;
        test[3] = item3;
        String expected = Arrays.toString(test);
        //начало теста
        IntegerList integerList = new IntegerListImpl(size);
        integerList.add(item);
        integerList.add(item1);
        integerList.add(item2);
        integerList.add(item3);
        String actual = Arrays.toString(integerList.toArray());
        assertEquals(expected, actual);
    }
}