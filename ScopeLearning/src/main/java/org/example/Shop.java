package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(scopeName = "prototype")
public class Shop {
    List<Device> list=new ArrayList<>();
    public List<Device> getList() {
        return list;
    }

    public void setList(List<Device> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "list=" + list +
                '}';
    }
}
