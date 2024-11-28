import dept.CSE;
import dept.ECE;
import dept.EEE;
import dept.ME;

public class DepartmentTest {
    public static void main(String[] args) {
        // Creating objects of each department class
        CSE cse = new CSE();
        ECE ece = new ECE();
        EEE eee = new EEE();
        ME me = new ME();

        // Calling the showSubjectAndYear method
        cse.showSubjectAndYear();
        ece.showSubjectAndYear();
        eee.showSubjectAndYear();
        me.showSubjectAndYear();
    }
}