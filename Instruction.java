import java.util.HashMap;
import java.util.Map;

public class Instruction {
    //Hash-maps that contains the instruction types.
    private final Map<String, String> typeI = new HashMap<String, String>();
    private final Map<String, String> typeJ = new HashMap<String, String>();
    private final Map<String, String> typeR = new HashMap<String, String>();

    public Instruction() {
        typeI.put("lb", "100000");
        typeI.put("lh", "100001");
        typeI.put("lwl", "100010");
        typeI.put("lw", "100011");
        typeI.put("lbu", "100100");
        typeI.put("lhu", "100101");
        typeI.put("lwr", "100110");

        typeI.put("sb", "101000");
        typeI.put("sh", "101001");
        typeI.put("swl", "101010");
        typeI.put("sw", "101011");
        typeI.put("swr", "101110");

        typeI.put("addi", "001000");
        typeI.put("addiu", "001001");
        typeI.put("slti", "001010");
        typeI.put("sltiu", "001011");

        typeI.put("andi", "001100");
        typeI.put("ori", "001101");
        typeI.put("xori", "001110");
        typeI.put("lui", "001111");

        typeI.put("bltz", "000001");
        typeI.put("bgez", "000001");

        typeI.put("beq", "000100");
        typeI.put("bne", "000101");
        typeI.put("blez", "000110");
        typeI.put("bgtz", "000111");

        typeI.put("bltzal", "000001");
        typeI.put("bgezal", "000001");

        typeR.put("add", "100000");
        typeR.put("addu", "100001");
        typeR.put("sub", "100010");
        typeR.put("subu", "100011");
        typeR.put("and", "100100");
        typeR.put("or", "100101");
        typeR.put("xor", "100110");
        typeR.put("nor", "100111");
        typeR.put("slt", "101010");
        typeR.put("sltu", "101011");

        typeR.put("sllv", "000100");
        typeR.put("srlv", "000110");
        typeR.put("srav", "000111");

        // diferentes
        typeR.put("sll", "000000");
        typeR.put("srl", "000010");
        typeR.put("sra", "000011");

        typeR.put("mfhi", "010000");
        typeR.put("mthi", "010001");
        typeR.put("mflo", "010010");
        typeR.put("mtlo", "010011");
        typeR.put("mult", "011000");
        typeR.put("multu", "011001");
        typeR.put("div", "011010");
        typeR.put("divu", "011011");
        typeR.put("jr", "001000");
        typeR.put("jarl", "001001");

        typeJ.put("j", "000010");
        typeJ.put("jal", "000011");
    }

    //Getters 
    public String getTypeI(String key) {
        return typeI.get(key);
   }
   public String getTypeR(String key) {
        return typeR.get(key);
   }
   public String getTypeJ(String key) {
        return typeJ.get(key);
   }
}
