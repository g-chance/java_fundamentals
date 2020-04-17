public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator strm = new StringManipulator();
        System.out.println(strm.getIndexOrNull("abc", "ac"));;
        System.out.println(strm.concatSubstring("Stuff", 2, 3, "Things"));
    }
}