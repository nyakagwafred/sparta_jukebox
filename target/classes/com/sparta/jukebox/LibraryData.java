package com.sparta.jukebox;


import java.util.*;

public class LibraryData {

    private static class Item {

        Item(String n, String a, int r, String u) {
            name = n;
            artist = a;
            rating = r;
            imageURL = u;
        }

        // instance variables 
        private String name;
        private String artist;
        private int rating;
        private int playCount;
        private String imageURL;

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
        libraryDataArray.put("01", new Item("How much is that doggy in the window", "Zee-J", 3,  "/com/sparta/jukebox/images/bob_marley.png" ));
        libraryDataArray.put("02", new Item("Exotic", "Maradonna", 5, "/com/sparta/jukebox/images/bob_marley.png"));
        libraryDataArray.put("03", new Item("I'm dreaming of a white Christmas", "Ludwig van Beethoven", 2, "/com/sparta/jukebox/images/bob_marley.png"));
        libraryDataArray.put("04", new Item("Pastoral Symphony", "Cayley Minnow", 3 , "/com/sparta/jukebox/images/bob_marley.png"));
        libraryDataArray.put("05", new Item("Manzi wa Nairobi", "Nonini", 2 , "/com/sparta/jukebox/images/nonini.png"));
        libraryDataArray.put("06", new Item("Buffalo soldier", "Bob Marley", 1, "/com/sparta/jukebox/images/bob_marley.png"));
        libraryDataArray.put("07", new Item("Mgenge 2Tru", "Nonini", 5 , "/com/sparta/jukebox/images/nonini.png"));
        libraryDataArray.put("08", new Item("Revolution", "Bob Marley", 5 , "/com/sparta/jukebox/images/bob_marley.png"));
        libraryDataArray.put("09", new Item("Waliotuacha", "Nonini", 1, "/com/sparta/jukebox/images/nonini.png"));
        libraryDataArray.put("10", new Item("You caught my eye", "Judy Boucher", 3, "/com/sparta/jukebox/images/bob_marley.png"));
        libraryDataArray.put("11", new Item("I love JAVA", "Zee-J", 3, "/com/sparta/jukebox/images/jukebox_logo.png"));
        libraryDataArray.put("11", new Item("Life is Good", "Maradonna", 5, "/com/sparta/jukebox/images/nonini.png"));
        libraryDataArray.put("12", new Item("My love for Java", "Ludwig van Beethoven", 2, "/com/sparta/jukebox/images/nonini.png"));
        libraryDataArray.put("13", new Item("Symphony Love", "Cayley Minnow", 3, "/com/sparta/jukebox/images/nonini.png"));
        libraryDataArray.put("14", new Item("You close the door", "Judy Boucher", 3, "/com/sparta/jukebox/images/nonini.png"));
        libraryDataArray.put("15", new Item("I can be with you tonight", "Judy Boucher", 3, "/com/sparta/jukebox/images/nonini.png"));
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
    
    public static String getImageUrl(String key) {
        Item item = libraryDataArray.get(key);
        if (item == null) {
            return null; // null means no such item
        } else {
            return item.imageURL;
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
    
     public static String getTracksByArtist(String artistName) {
        String output = "";
        Iterator iterator = libraryDataArray.keySet().iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            Item item = libraryDataArray.get(key);
            if(artistName.equals(item.artist)){
                output += key + " " + item.name + " - " + item.artist + "\n";
            }
        }
        return output;
    }
    
    public static String[] getAllArtists() {
        // HashSet to store unique values
        //Set<Item> uniqueItems = new HashSet<>(libraryDataArray.values());
        int arrayLength = libraryDataArray.size();
        // Declare an array of type String with size 10
        String[] artists = new String[arrayLength];
        
        Iterator iterator = libraryDataArray.keySet().iterator();
        int index = 0;
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            Item item = libraryDataArray.get(key);
            //output += key + " " + item.name + " - " + item.artist + "\n";
            artists[index] = item.artist;
            index+=1;
        }
        
        // Convert the array to a Set to remove duplicates
        Set<String> uniqueSet = new HashSet<>(Arrays.asList(artists));
        
        // Convert the Set back to an array
        String[] allArtists = uniqueSet.toArray(new String[0]);

        
        return allArtists;
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
