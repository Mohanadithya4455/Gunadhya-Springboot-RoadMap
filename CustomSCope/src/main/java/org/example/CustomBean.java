package org.example;



import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.lang.annotation.Annotation;
import java.util.Map;

public class CustomBean implements Scope {
     SimpleThreadLocal simpleThreadLocal;
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Map<String,Object> map=(Map<String, Object>) simpleThreadLocal.get();
        Object obj = map.get(name);

        if(obj==null){
            obj=objectFactory.getObject();
            map.put(name,obj);
        }
        return obj;
    }

    @Override
    public Object remove(String name) {
        Map<String,Object> map=(Map<String, Object>) simpleThreadLocal.get();
        Object object=map.get(name);
        map.remove(name);
        return object;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return "";
    }

}

