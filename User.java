package com.company;

import java.util.*;

public class User {
    String name;
    String surname;
    Integer age;

    public User(String name1, String surname1, Integer age1) {
        this.name = name1;
        this.surname = surname1;
        this.age = age1;
    }
    public ArrayList CreateUsers() {
        Vector v = new Vector();
        User user1 = new User("a", "k", 21);
        User user2 = new User("b", "l", 21);
        User user3 = new User("c", "m", 22);
        User user4 = new User("d", "n", 21);
        User user5 = new User("e", "o", 22);
        User user6 = new User("f", "p", 25);
        User user7 = new User("g", "q", 26);
        User user8 = new User("h", "r", 27);
        User user9 = new User("i", "s", 29);
        User user10 = new User("j", "t", 27);
        ArrayList<User> Users = new ArrayList<>(Arrays.asList(user1, user2, user3, user4, user5, user6, user7,
                user8, user9, user10));
        return Users;
    }

    public Map<Integer, User> processUsers(ArrayList<User> Users) {
        Map<Integer, User> mp = new HashMap();
        for (int i = 0; i < 10; i++) {
            if (mp.containsKey((Users.get(i)).age * 100)) {
                for (int j = 1; j <= 10; j++) {
                    if (mp.containsKey((Users.get(i)).age * 100 + j)) {
                        continue;
                    } else {
                        mp.put((Users.get(i)).age * 100 + j, Users.get(i));
                        break;
                    }
                }
            } else {
                mp.put((Users.get(i)).age * 100, Users.get(i));
            }
        }
        return mp;
    }

    public void printUserMap(Map<Integer, User> mp) {

        for (int i = 0; i <= 10000; i++) {
            if (mp.containsKey(i)) {
                int cnt = 1;
                for (int j = 1; j < 10; j++) {
                    if (mp.containsKey(i + j)) {
                        cnt++;
                    }
                }
                System.out.println("Всего с возрастом " + (mp.get(i)).age + ": " + cnt);
                for (int k = i; k < i + cnt; k++) {
                    System.out.println((mp.get(k)).name + " " + (mp.get(k)).surname + " " + (mp.get(k)).age);
                }
                i += 50;
            }
        }
    }
    public static void main(String[] args) {
        User user1 = new User(null, null, null);
        ArrayList<User> arr = user1.CreateUsers();
        Map<Integer, User> mp = user1.processUsers(arr);
        user1.printUserMap(mp);
    }
}
