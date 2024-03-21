package com.sparta.jukebox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import com.mycompanny.jukebox.



public class Jukebox extends JFrame implements ActionListener {
        JButton checkBtn = new JButton("Check Library");
        JButton playlistBtn = new JButton("Create Playlist");
        JButton updateBtn = new JButton("Update Library");
        JButton quitBtn = new JButton("Exit");

    public static void main(String[] args) {
        new Jukebox();
    }
    
    public Jukebox() {
        setLayout(new BorderLayout());
        setSize(500, 100);
        setTitle("Jukebox");

        // close application only by clicking the quitBtn button
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        JPanel top = new JPanel();
        top.add(new JLabel("Select an option by clicking one of the buttons below"));
        add("North", top);

        JPanel bottom = new JPanel();
        bottom.add(checkBtn); checkBtn.addActionListener(this);
        bottom.add(playlistBtn); playlistBtn.addActionListener(this);
        bottom.add(updateBtn); updateBtn.addActionListener(this);
        bottom.add(quitBtn); quitBtn.addActionListener(this);
        add("South", bottom);

        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkBtn) {
            new CheckLibrary();
        } 
        else if (e.getSource() == playlistBtn) {
            //System.out.println(e.getSource());
            CreatePlaylist Obj = new CreatePlaylist();
            Obj.setVisible(true);
        }
        else if (e.getSource() == quitBtn) {
            LibraryData.close();
            System.exit(0);
        }
    }
}
