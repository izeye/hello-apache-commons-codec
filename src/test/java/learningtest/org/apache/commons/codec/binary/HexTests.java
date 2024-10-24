package learningtest.org.apache.commons.codec.binary;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Hex}.
 *
 * @author Johnny Lim
 */
class HexTests {

    @Test
    void decodeHex() throws DecoderException {
        byte[] bytes = Hex.decodeHex("00011011ff");
        assertThat(bytes).containsExactly(0, 1, 16, 17, -1);
    }

}
