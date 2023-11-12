package com.skyPro.Algaritm24.Service;

import com.skyPro.Algaritm24.Exception.ElementNotFoundException;
import com.skyPro.Algaritm24.Exception.InvalidIndexException;
import com.skyPro.Algaritm24.Exception.ItemNullException;
import com.skyPro.Algaritm24.Interface.IntegerList;

import java.util.Arrays;
import java.util.Collections;

public class IntegerListImpl implements IntegerList {
    protected Integer[] storage;
    private int size;

    public IntegerListImpl() {
        this.storage = new Integer[size];
    }
    public IntegerListImpl(int size) {
        storage = new Integer[size];
    }


    @Override
    public Integer add(Integer item) {
        checkItem(item);
        grow();
        storage[size++] = item;
        return item;
    }

    @Override
    public Integer add(int index, Integer item) {
        grow();
        checkIndex(index);
        checkItem(item);
        if (index == size){
            storage[size++] = item;
            return item;
        }
        System.arraycopy(storage,index,storage,index+1,size-index);
        storage[index] = item;
        size++;
        return item;
    }

    @Override
    public Integer remove(Integer item) {
        checkItem(item);
        int index = indexOf(item);
        if(index == -1){
            throw new ElementNotFoundException("элемент не найден");
        }
        if(index == size){
            storage[size--]=null;
            return item;
        }
        System.arraycopy(storage,index+1,storage,index,size-(index+1));
        size--;
        return item;
    }

    @Override
    public Integer remove(int index) {
        checkIndex(index);
        Integer item = storage[index];
        if(index != size){
            System.arraycopy(storage,index+1,storage,index,size-(index+1));}
        size--;
        return item;
    }

    @Override
    public Integer set(int index, Integer item) {
        checkIndex(index);
        checkItem(item);
        storage[index]=item;
        return item;
    }

    @Override
    public boolean contains(Integer item) {
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(Integer item) {
        checkItem(item);
        return Collections.binarySearch(Arrays.asList(storage), item);
    }

    @Override
    public int lastIndexOf(Integer item) {
        for (int i = size-1; i>=0 ; i--) {
            if (storage[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Integer get(int index) {
        checkIndex(index);
        return storage[index];
    }

    @Override
    public boolean equals(IntegerList otherList) {
        return Arrays.equals(this.toArray(),otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size ==0;
    }

    @Override
    public void clear() {
        size = 0;

    }

    @Override
    public Integer[] toArray() {
        return Arrays.copyOf(storage,size());
    }

    private void grow(){
        if(size()>=storage.length){
            storage=Arrays.copyOf(storage,size+(size/2));
        }

    }
    private void checkItem(Integer item){
        if (item == null){
            throw new ItemNullException("элемент отсутствует");
        }
    }
    private void checkIndex(int index){
        if(index<0||index>=size()){
            throw new InvalidIndexException("индекс не соответствует параметрам");
        }
    }

    void compress() {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                continue;
            }

            for (int j = i; j < storage.length; j++) {
                if (storage[j] != null) {
                    storage[i] = storage[j];
                    storage[j] = null;
                    break;
                }
            }
        }
    }
}
