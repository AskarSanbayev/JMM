package com.askar.gc;

import java.util.Objects;

public class ReferenceValue {

    public static void main(String[] args) {
        int x = 0;
        int [] arr = {20};
        arrayF(x,arr);
        System.out.println(x + ", arr[0] =" + arr[0]);
        arrayG(x,arr);
        System.out.println(x + ", arr[0] =" + arr[0]);

        User user = new User(1,"test");
        obF(user);
        System.out.println(user.getId() + ",name:" + user.getName());
        obG(user);
        System.out.println(user.getId() + ",name:" + user.getName());
    }

    private static void arrayF(int x, int[] arr) {
        x += 30;
        arr[0] = x;
    }

    private static void arrayG(int x, int[] arr) {
        x += 40;
        arr = new int[]{60};
    }

    private static void obF(User user) {
        user.setName("testheap");
    }

    private static void obG(User user) {
        user = new User(2,"test2");
    }
}

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
