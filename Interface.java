import java.util.Scanner;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import static java.awt.BorderLayout.*;
import javax.swing.JLabel;



import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import java.security.*;





class Interface{

  static MyPanel[] Panels = new MyPanel[8];
  public static void main(String[] args) {
  JFrame frame = new JFrame("Drum Synthesizer");
  Container pane = frame.getContentPane();
  
  buildGUI(pane);
  
  frame.addWindowListener(new Exiter());
  frame.pack();
  frame.setVisible(true);
  }
  
  
  static void buildGUI(Container pane){
    //Create action listen
    Actions doAction = new Actions(Panels,pane);
    //Create Initial panel
    Panels[0] = new MyPanel("Channel 1");
    MyPanel.numPanels = 1;
    //add numChannel panels to the initial one
    for(int i=1;i<MyPanel.numPanels;i++){
      Panels[i] = new MyPanel("Channel "+(i+1));
      Panels[0].add(Panels[i]);
    }
    //Put addchannel button under last channel
    JButton addChannel = new JButton("ADD");
    Panels[(MyPanel.numPanels-1)].add(addChannel);
    addChannel.addActionListener(doAction);
    //add panels to pane(window)
    pane.add(Panels[0]);
    
  }
  
  static void updateGUI(Container pane){
    //add numChannel panels to the initial one 
    System.out.println(MyPanel.numPanels);
    for(int i=1;i<MyPanel.numPanels;i++){
      Panels[i] = new MyPanel("Channel "+(i+1));
      Panels[0].add(Panels[i]);
    }
    pane.add(Panels[0]);
  }
 
    
    
    
  }
