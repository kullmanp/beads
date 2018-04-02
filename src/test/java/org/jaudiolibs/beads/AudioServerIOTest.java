package org.jaudiolibs.beads;

import net.beadsproject.beads.core.AudioContext;
import net.beadsproject.beads.ugens.Noise;
import org.junit.jupiter.api.Test;

class AudioServerIOTest {
    @Test
    void playNoiseThroughJack() throws Exception {
        AudioContext ac = new AudioContext(new AudioServerIO.Jack());
        Noise n = new Noise(ac);
        ac.out.addInput(n);
        ac.start();
        Thread.sleep(1000);
        ac.stop();
    }

    @Test
    void playNoiseThroughJavaSound() throws Exception {
        AudioContext ac = new AudioContext(new AudioServerIO.JavaSound());
        Noise n = new Noise(ac);
        ac.out.addInput(n);
        ac.start();
        Thread.sleep(1000);
        ac.stop();
    }
}
