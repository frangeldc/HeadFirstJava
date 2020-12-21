package chap11.soundPlayer;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
	MiniMiniMusicApp mini = new MiniMiniMusicApp();
	mini.play();
    } // close main

    public void play() {
	try {
	    Sequencer player = MidiSystem.getSequencer();
	    player.open();
	    Sequence seq = new Sequence(Sequence.PPQ, 4);
	    Track track = seq.createTrack();

	    ShortMessage first = new ShortMessage();
	    first.setMessage(192, 1, 102, 0);
	    MidiEvent firstOn = new MidiEvent(first, 1);
	    track.add(firstOn);

	    ShortMessage a = new ShortMessage();
	    a.setMessage(144, 1, 30, 100);
	    MidiEvent noteOn = new MidiEvent(a, 1);
	    track.add(noteOn);

	    ShortMessage b = new ShortMessage();
	    b.setMessage(128, 1, 30, 100);
	    MidiEvent noteOff = new MidiEvent(b, 16);
	    track.add(noteOff);

	    player.setSequence(seq);
	    player.start();

	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    } // close play
} // close class
