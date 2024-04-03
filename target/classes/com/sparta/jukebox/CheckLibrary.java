package com.sparta.jukebox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckLibrary extends JFrame implements ActionListener {
    
    //Variable declaration
    JTextField trackNoTxtFld = new JTextField(2);
    TextArea trackInformationTxtArea = new TextArea(10, 60);
    JButton listTracksBtn = new JButton("List All Tracks");
    JButton checkTrackBtn = new JButton("Check Track");
    JButton exitBtn = new JButton("Exit");
    
    
    String[] items = LibraryData.getAllArtists();
    JComboBox<String> comboBox = new JComboBox<>(items);
   
    /**
     * CheckLibrary constructor
     */
    public CheckLibrary() {
        // Set the layout of the JFrame to BorderLayout
        setLayout(new BorderLayout());
        // Set the bounds (position and size) of the JFrame
        setBounds(100, 100, 600, 300);
        // Set the title of the JFrame
        setTitle("Check Library");
        // Set the default close operation of the JFrame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Create a JPanel for the top section
        JPanel top = new JPanel();
        // Add a JLabel and a JTextField for entering the track number
        top.add(new JLabel("Enter Track Number:"));
        top.add(trackNoTxtFld);
        // Add buttons for checking and listing tracks
        top.add(checkTrackBtn);
        top.add(listTracksBtn);
        // Add action listeners to the buttons
        listTracksBtn.addActionListener(this);
        checkTrackBtn.addActionListener(this);
        comboBox.addActionListener(this);
        // Add the top JPanel to the north position of the JFrame
        add("North", top);
        // Create a JPanel for the middle section
        JPanel middle = new JPanel();
        // Set the text of the JTextArea to display all tracks
        trackInformationTxtArea.setText(LibraryData.listAll());
        // Add the JTextArea to the middle JPanel
        middle.add(trackInformationTxtArea);
        // Add the middle JPanel to the center position of the JFrame
        add("Center", middle);
        
        JPanel bottom = new JPanel();
        bottom.add(new JLabel("List tracks by artist:"));
        bottom.add(comboBox);
        bottom.add(exitBtn);
        exitBtn.addActionListener(this);
        add("South", bottom);
        
        
        
        // Set the JFrame to not resizable
        setResizable(false);
        // Set the JFrame to be visible
        setVisible(true);
    }
    
    /**
     * Performs actions based on the event triggered by the user.
    * 
    * @param e The ActionEvent object representing the event
    */

    public void actionPerformed(ActionEvent e) {
        // If the listTracksBtn button is clicked
        if (e.getSource() == listTracksBtn) {
            // Display all tracks in the JTextArea
            trackInformationTxtArea.setText(LibraryData.listAll());
        } else if (e.getSource() == exitBtn){
             dispose(); 
        } else if(e.getSource() == comboBox){
            // Get the selected item from the combo box
            String selectedArtist = (String) comboBox.getSelectedItem();
            trackInformationTxtArea.setText(LibraryData.getTracksByArtist(selectedArtist));
            
        }
        else {
            // Get the selected track number from the JTextField
            String selectedTrackNumber = trackNoTxtFld.getText();
            // Get the name of the track from the LibraryData
            String name = LibraryData.getName(selectedTrackNumber);
            if (name == null) {
                //Inavlid track number dialog box
                JOptionPane.showMessageDialog(null, "Invalid track number!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                //List tracks from Library Data
                trackInformationTxtArea.setText(name + " - " + LibraryData.getArtist(selectedTrackNumber));
                trackInformationTxtArea.append("\nRating: " + displayStars(LibraryData.getRating(selectedTrackNumber)));
                trackInformationTxtArea.append("\nPlay count: " + LibraryData.getPlayCount(selectedTrackNumber));
            }
        }
    }
    
    /**
    * Generates a string of stars based on the given rating.
    * Each star represents one unit of the rating.
    * 
    * @param rating The rating value
    * @return A string of stars representing the rating
    */
    private String displayStars(int rating) {
        // Initialize an empty string to store the stars
        String stars = "";
        // Append a star to the string for each unit of the rating
        for (int i = 0; i < rating; ++i) {
            stars += "*";
        }
        // Return the string of stars
        return stars;
    }
}
