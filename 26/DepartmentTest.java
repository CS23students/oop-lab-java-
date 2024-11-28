//26. ᴄʀᴇᴀᴛᴇ ᴩᴀᴄᴋᴀɢᴇ ᴄᴀʟʟᴇᴅ ᴅᴇᴩᴛ.ꜰᴏᴜʀ ᴄʟᴀꜱꜱ ᴄʀᴇᴀᴛᴇ ᴄꜱᴇ,ᴇᴄᴇ,ᴇᴇᴇ,ᴍᴇ ᴇᴀᴄʜ ᴄʟᴀꜱꜱ ᴡʜɪᴄʜ ꜱʜᴏᴡ ꜱᴜʙᴊᴇᴄᴛ ʀᴇᴩᴇʀᴇꜱᴇɴᴛ yᴇᴀʀ

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



// OUTPUT:
// Department: Computer Science Engineering (CSE)
// Subjects: Data Structures, Algorithms, Operating Systems, etc.
// Year: 1st Year to 4th Year

// Department: Electronics and Communication Engineering (ECE)
// Subjects: Signals and Systems, Digital Electronics, etc.
// Year: 1st Year to 4th Year

// Department: Electrical and Electronics Engineering (EEE)
// Subjects: Circuit Theory, Electrical Machines, Power Systems, etc.
// Year: 1st Year to 4th Year

// Department: Mechanical Engineering (ME)
// Subjects: Thermodynamics, Strength of Materials, Fluid Mechanics, etc.
// Year: 1st Year to 4th Year
