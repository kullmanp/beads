package net.beadsproject.beads.core.io;

import net.beadsproject.beads.core.AudioContext;
import net.beadsproject.beads.ugens.Noise;
import org.junit.jupiter.api.Test;

class NonrealtimeIOTest {

    @Test
    void playNoise() throws Exception {
        AudioContext ac = new AudioContext(new NonrealtimeIO());
        Noise n = new Noise(ac);
        ac.out.addInput(n);
        ac.start();
        Thread.sleep(1000);
        ac.stop();
    }

}