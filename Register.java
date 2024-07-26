import java.util.HashMap;
import java.util.Map;

public class Register {
    // Hash-map that contain the registers and their respectives codes.
    private Map<String, String> registers = new HashMap<String, String>();

    public Register() {
        registers.put("at", "00001");
        registers.put("v0", "00010");
        registers.put("v1", "00011");
        registers.put("a0", "00100");
        registers.put("a1", "00101");
        registers.put("a2", "00110");
        registers.put("a3", "00111");

        registers.put("t0", "01000");
        registers.put("t1", "01001");
        registers.put("t2", "01010");
        registers.put("t3", "01011");
        registers.put("t4", "01100");
        registers.put("t5", "01101");
        registers.put("t6", "01110");
        registers.put("t7", "01111");

        registers.put("s0", "10000");
        registers.put("s1", "10001");
        registers.put("s2", "10010");
        registers.put("s3", "10011");
        registers.put("s4", "10100");
        registers.put("s5", "10101");
        registers.put("s6", "10110");
        registers.put("s7", "10111");

        registers.put("t8", "10000");
        registers.put("t9", "10001");
        registers.put("k0", "10010");
        registers.put("k1", "10011");
        registers.put("gp", "10100");
        registers.put("sp", "10101");
        registers.put("s8", "10110");
        registers.put("ra", "10111");

        registers.put("zero", "00000");
    }

    public String getRegisterCode(String key){
        return registers.get(key);
    }
}
