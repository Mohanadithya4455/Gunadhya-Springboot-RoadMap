package org.example;

import java.util.HashMap;
import java.util.Map;

public class SimpleThreadLocal extends ThreadLocal{
    public Map<String,Object> fun(){
        return new HashMap<String, Object>();
    }
}
