package com.example.di_ioc_spring.scope;

import io.micrometer.observation.Observation;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CustomScope implements Scope {

    private final Map<String, Object> scopedObject = Collections.synchronizedMap(new HashMap<>());
    private final Map<String, Object> destructionCallback = Collections.synchronizedMap(new HashMap<>());

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if(!scopedObject.containsKey(name)){
            scopedObject.put(name, objectFactory.getObject());
        }

        return scopedObject.get(name);
    }

    @Override
    public Object remove(String name) {
        destructionCallback.remove(name);

        return scopedObject.remove(name);
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        destructionCallback.put(name, callback);
    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
