package com.skyPro.Algaritm24.Service;
import com.skyPro.Algaritm24.Interface.IntegerList;
import com.skyPro.Algaritm24.Utils.SortedUtil;

import java.util.Arrays;
import java.util.Collections;

public class SortedIntegerListImpl extends IntegerListImpl {


    public SortedIntegerListImpl() {
        super();
    }

    public SortedIntegerListImpl(int size) {
        super(size);
    }
    private void sort() {
        SortedUtil.insertionSort(storage);
    }

    @Override
    protected void compress() {
        sort();
        super.compress();
    }
}

