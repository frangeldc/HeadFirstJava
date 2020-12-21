package chap11.musicMachine;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {

    public void play() {

	try {
	    Sequencer sequencer = MidiSystem.getSequencer();
	} catch (MidiUnavailableException ex) {
	    System.out.println("Bummer");
	}

	System.out.println("We got a sequencer");
    } // close play

    public static void main(String[] args) {
	MusicTest1 mt = new MusicTest1();
	mt.play();
    } // close main
} // close class
