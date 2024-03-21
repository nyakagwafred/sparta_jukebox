package com.mycompany.jukebox;


import java.util.*;

public class LibraryData {

    private static class Item {

        Item(String n, String a, int r) {
            name = n;
            artist = a;
            rating = r;
        }

        // instance variables 
        private String name;
        private String artist;
        private int rating;
        private int playCount;

        public String toString() {
            return name + " - " + artist;
        }
    }

    // with a Map you use put to insert a key, value pair 
    // and get(key) to retrieve the value associated with a key
    // You don't need to understand how this works!
    private static Map<String, Item> libraryDataArray = new TreeMap<String, Item>();


    static {
        // if you want to have extra libraryDataArray items, put them in here
        // use the same style - keys should be 2 digit Strings
        libraryDataArray.put("01", new Item("How much is that doggy in the window", "Zee-J", 3));
        libraryDataArray.put("02", new Item("Exotic", "Maradonna", 5));
        libraryDataArray.put("03", new Item("I'm dreaming of a white Christmas", "Ludwig van Beethoven", 2));
        libraryDataArray.put("04", new Item("Pastoral Symphony", "Cayley Minnow", 1));
        libraryDataArray.put("05", new Item("Anarchy in the UK", "The Kings Singers", 0));
    }

    public static String listAll() {
        String output = "";
        Iterator iterator = libraryDataArray.keySet().iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            Item item = libraryDataArray.get(key);
            output += key + " " + item.name + " - " + item.artist + "\n";
        }
        return output;
    }

    public static String getName(String key) {
        Item item = libraryDataArray.get(key);
        if (item == null) {
            return null; // null means no such item
        } else {
            return item.name;
        }
    }

    public static String getArtist(String key) {
        Item item = libraryDataArray.get(key);
        if (item == null) {
            return null; // null means no such item
        } else {
            return item.artist;
        }
    }

    public static int getRating(String key) {
        Item item = libraryDataArray.get(key);
        if (item == null) {
            return -1; // negative quantity means no such item
        } else {
            return item.rating;
        }
    }

    public static void setRating(String key, int rating) {
        Item item = libraryDataArray.get(key);
        if (item != null) {
            item.rating = rating;
        }
    }

    public static int getPlayCount(String key) {
        Item item = libraryDataArray.get(key);
        if (item == null) {
            return -1; // negative quantity means no such item
        } else {
            return item.playCount;
        }
    }

    public static void incrementPlayCount(String key) {
        Item item = libraryDataArray.get(key);
        if (item != null) {
            item.playCount += 1;
        }
    }

    public static void close() {
        // Does nothing for this static version.
        // Write a statement to close the database when you are using one
    }
}
