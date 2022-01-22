class bottel {
    String type;
    int rupees;

    public void prin() {
        System.out.println(this.type);
        System.out.println(this.rupees);
    }
    bottel() {                                                       /*/non parameter constructor/*/

    }
    bottel(bottel b2) {                                               /*/copy constructor/*/
        this.type = b2.type;
        this.rupees = b2.rupees;
    }
}
public class ConstructorS3 {
    public static void main(String[] args) {
        bottel b1 = new bottel();
        // b1.pennumber = 002;
        b1.type = "iron";
        b1.rupees = 599;

        b1.prin();

        bottel b2 = new bottel(b1);
        b2.prin();
    }
}
