public class Verify {
    public static void toCheck (String word){
        Register mipCode = new Register();
        Instruction instruction = new Instruction();

        String [] instructionParts = word.replace(",","").split(" ");//Transform "lw $s2, $s3,   $s4" to "lw $s2 $s3 $s4" and insert it into an array {lw, $s2, $s3, $s4}
        String formatedWord = word.replace("$", ",");//Transform "add $t0 $s2 $t0" to "add ,t0 ,s2 ,t0"
        formatedWord = formatedWord.replace(" ", "");//Transform "add ,t0 ,s2 ,t0" to "add,t0,s2,t0"
    }
}
