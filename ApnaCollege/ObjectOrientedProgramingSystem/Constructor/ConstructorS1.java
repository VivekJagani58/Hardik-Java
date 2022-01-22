

class bottel {
    String type;
    int rupees;

    public void prin() {
        System.out.println(this.type);
        System.out.println(this.rupees);
    }
    bottel() {                                                        /*/non parameterize constructor/*/
        System.out.println("difference");
    }
}
public class ConstructorS1 {
    public static void main(String[] args) {
        bottel b1 = new bottel();
        b1.type = "iron";
        b1.rupees = 599;
        b1.prin();
    } 
}