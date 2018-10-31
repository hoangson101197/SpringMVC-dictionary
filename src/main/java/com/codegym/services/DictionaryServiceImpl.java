package com.codegym.services;

import com.codegym.model.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryServiceImpl {
    private static Map<Integer, Dictionary> dictionaryMap = new HashMap<>();

    static {
        dictionaryMap.put(1, new Dictionary("hello", "xin chao"));
        dictionaryMap.put(2, new Dictionary("dog", "cho"));
        dictionaryMap.put(3, new Dictionary("cat", "meo"));
        dictionaryMap.put(4, new Dictionary("bye", "tam biet"));
    }

    public List<Dictionary> findAll() {
        return new ArrayList<>(dictionaryMap.values());
    }
}
