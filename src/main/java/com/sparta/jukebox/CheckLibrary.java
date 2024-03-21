package com.sparta.jukebox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckLibrary extends JFrame implements ActionListener {
    JTextField trackNoTxtFld = new JTextField(2);
    TextArea trackInformationTxtArea = new TextArea(10, 50);
    JButton listTracksBtn = new JButton("List All Tracks");
    JButton checkTrackBtn = new JButton("Check Track");
    public CheckLibrary() {
        setLayout(new BorderLayout());
        setBounds(100, 100, 500, 300);
        setTitle("Check Library");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel top = new JPanel();
        top.add(new JLabel("Enter Track Number:"));
        top.add(trackNoTxtFld);
        top.add(checkTrackBtn);
        top.add(listTracksBtn);
        listTracksBtn.addActionListener(this);
        checkTrackBtn.addActionListener(this);
        add("North", top);
        JPanel middle = new JPanel();
        trackInformationTxtArea.setText(LibraryData.listAll());
        middle.add(trackInformationTxtArea);
        add("Center", middle);

        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == listTracksBtn) {
            trackInformationTxtArea.setText(LibraryData.listAll());
        } else {
            String selectedTrackNumber = trackNoTxtFld.getText();
            
            String name = LibraryData.getName(selectedTrackNumber);
            //System.out.println(name);
            if (name == null) {
                //information.setText(" No such track number");
                trackInformationTxtArea.setText("No such track number");
            } else {
                trackInformationTxtArea.setText(name + " - " + LibraryData.getArtist(selectedTrackNumber));
                trackInformationTxtArea.append("\nRating: " + stars(LibraryData.getRating(selectedTrackNumber)));
                trackInformationTxtArea.append("\nPlay count: " + LibraryData.getPlayCount(selectedTrackNumber));
            }
        }
    }

    private String stars(int rating) {
        String stars = "";
        for (int i = 0; i < rating; ++i) {
            stars += "*";
        }
        return stars;
    }
}
