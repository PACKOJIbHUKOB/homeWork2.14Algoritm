package com.skyPro.Algaritm24.Service;

import com.skyPro.Algaritm24.Interface.StringList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.skyPro.Algaritm24.util.Test_massive.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringListImpTest {
    public final StringListImp testlist = new StringListImp();

    @Test
    void add_success() {
        //подготовка входных данных
        String item = TEXT_1;
        //подготовка ожидаемого результата
        String expected = item;

        //начало теста
        StringList stringList = new StringListImp(2);
        stringList.add(item);
        String actual  = stringList.get(0);
        assertEquals (expected,actual);
    }

    @Test
    void testAddIndex_success() {
        String item = TEXT_1;
        String item1 = TEXT_2;
        String item2 = TEXT_3;
        String item3 = TEXT_4;
        int index =2;
        int size =4;
        //подготовка ожидаемого результата
        String[] test =new String[4];
        test[0]=item1;
        test[1]=item2;
        test[2]=item3;
        for (int i = test.length - 1; i > index; i--) {
            test[i] = test[i - 1];
        }
        test[index] = item;
        String expected = test[index];
        //начало теста
        StringList stringList = new StringListImp(size);
        stringList.add(item1);
        stringList.add(item2);
        stringList.add(item3);
        String actual =stringList.add(index, item);;
        assertEquals(expected, actual);
    }

    @Test
    void remove_success() {
        //подготовка входных данных
        String item = TEXT_1;
        //подготовка ожидаемого результата
        String expected = item;

        //начало теста
        StringList stringList = new StringListImp(2);
        stringList.add(item);
        String actual = stringList.remove(item);
        assertEquals (expected,actual);
    }


    @Test
    void RemoveIndex_success() {
        String item = TEXT_1;
        String item1 = TEXT_2;
        String item2 = TEXT_3;
        String item3 = TEXT_4;
        int index =2;
        int size =4;
        //подготовка ожидаемого результата
        String[] test =new String[size];
        test[0]=item;
        test[1]=item1;
        test[2]=item2;
        test[3]=item3;
        String expected = test[index];
        //начало теста
        StringList stringList = new StringListImp(size);
        stringList.add(item);
        stringList.add(item1);
        stringList.add(item2);
        stringList.add(item3);
        String actual = stringList.remove(index);
        assertEquals(expected, actual);
    }

    @Test
    void contains_success() {
        String item = TEXT_1;
        int size =3;
        //подготовка ожидаемого результата
        Boolean expected = true;

        //начало теста
        StringList stringList = new StringListImp(size);
        stringList.add(item);
        boolean actual = stringList.contains(item);
        assertEquals(expected, actual);

    }

    @Test
    void indexOf_success() {
        String item = TEXT_1;
        String item1 = TEXT_2;
        String item2 = TEXT_3;
        int size =3;
        int index = 0;
        //подготовка ожидаемого результата
        int expected =index;

        //начало теста
        StringList stringList = new StringListImp(size);
        stringList.add(item);
        stringList.add(item1);
        stringList.add(item2);
        int actual = stringList.indexOf(item);
        assertEquals(expected, actual);
    }

    @Test
    void lastIndexOf_success() {
        String item = TEXT_1;
        String item1 = TEXT_2;
        String item2 = TEXT_3;
        int size =3;
        int index = 2;
        //подготовка ожидаемого результата
        int expected =index;

        //начало теста
        StringList stringList = new StringListImp(size);
        stringList.add(item);
        stringList.add(item1);
        stringList.add(item2);
        int actual = stringList.lastIndexOf(item2);
        assertEquals(expected, actual);
    }

    @Test
    void get_success() {
        String item = TEXT_1;
        String item1 = TEXT_2;
        String item2 = TEXT_3;
        String item3 = TEXT_4;
        int index =2;
        int size =4;
        //подготовка ожидаемого результата
        String[] test =new String[size];
        test[0]=item;
        test[1]=item1;
        test[2]=item2;
        test[3]=item3;
        String expected = test[index];
        //начало теста
        StringList stringList = new StringListImp(size);
        stringList.add(item);
        stringList.add(item1);
        stringList.add(item2);
        stringList.add(item3);
        String actual = stringList.get(index);
        assertEquals(expected, actual);
    }

    @Test
    void set_access_success() {
        String item = TEXT_1;
        String item1 = TEXT_2;
        String item2 = TEXT_3;
        String item3 = TEXT_4;
        int index =2;
        int size =4;
        //подготовка ожидаемого результата
        String[] test =new String[size];
        test[0]=item;
        test[1]=item1;
        test[2]=item2;
        test[3]=item3;
        String expected = test[index];
        //начало теста
        StringList stringList = new StringListImp(size);
        stringList.add(item);
        stringList.add(item1);
        stringList.add(item3);
        String actual = stringList.set(index,item2);
        assertEquals(expected, actual);
    }

    @Test
    void testEquals_success() {
        String item = TEXT_1;
        String item1 = TEXT_2;
        String item2 = TEXT_3;
        String item3 = TEXT_4;
        int size = 4;
        //подготовка ожидаемого результата
        StringList testlist = new StringListImp(size);
        testlist.add(item);
        testlist.add(item1);
        testlist.add(item2);
        testlist.add(item3);
        boolean expected = true;
        //начало теста
        StringList stringList = new StringListImp(size);
        stringList.add(item);
        stringList.add(item1);
        stringList.add(item2);
        stringList.add(item3);
        Boolean actual = stringList.equals(testlist);
        assertEquals(expected, actual);
    }

    @Test
    void size_success() {
        String item = TEXT_1;
        String item1 = TEXT_2;
        String item2 = TEXT_3;
        String item3 = TEXT_4;
        int size = 4;
        //подготовка ожидаемого результата
        int expected =size;
        //начало теста
        StringList stringList = new StringListImp(size);
        stringList.add(item);
        stringList.add(item1);
        stringList.add(item2);
        stringList.add(item3);
        int actual = stringList.size();
        assertEquals(expected, actual);
    }

    @Test
    void isEmpty_success() {

        int size = 4;
        //подготовка ожидаемого результата
        boolean expected = true;
        String item = TEXT_1;
        //начало теста
        StringList stringList = new StringListImp(size);
        //stringList.add(item);
        Boolean actual = stringList.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    void clear_success() {
        String item = TEXT_1;
        String item1 = TEXT_2;
        String item2 = TEXT_3;
        String item3 = TEXT_4;
        int size = 4;
        //подготовка ожидаемого результата
        int expected = 0;
        //начало теста
        StringList stringList = new StringListImp(size);
        stringList.add(item);
        stringList.add(item1);
        stringList.add(item2);
        stringList.add(item3);
        stringList.clear();
        int actual = stringList.size();
        assertEquals(expected, actual);
    }

    @Test
    void toArray_success() {
        String item = TEXT_1;
        String item1 = TEXT_2;
        String item2 = TEXT_3;
        String item3 = TEXT_4;
        int size = 4;
        //подготовка ожидаемого результата
        String[] test =new String[size];
        test[0]=item;
        test[1]=item1;
        test[2]=item2;
        test[3]=item3;
        String expected = Arrays.toString(test);
        //начало теста
        StringList stringList = new StringListImp(size);
        stringList.add(item);
        stringList.add(item1);
        stringList.add(item2);
        stringList.add(item3);
        String actual = Arrays.toString(stringList.toArray());
        assertEquals(expected, actual);
        }
}