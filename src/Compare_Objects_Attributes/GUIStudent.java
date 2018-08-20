/**
 * This application compares several Student-objects each other
 * by different attributes and will give a sorted output.
 *
 * Enjoy the course and feel free to contribute.
 */
package Compare_Objects_Attributes;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.TreeSet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIStudent extends JFrame implements ActionListener {

    private final JButton btnID = new JButton("Student ID");
    private final JButton btnName = new JButton("Student name");
    private final JButton btnDate = new JButton("Student birthday");

    public GUIStudent() {

        super.setTitle("GUI for Students");
        super.setLocation(800, 600);
        super.setLayout(new FlowLayout());
        super.add(this.btnID);
        super.add(this.btnName);
        super.add(this.btnDate);

        super.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.btnID.addActionListener(this);
        this.btnName.addActionListener(this);
        this.btnDate.addActionListener(this);

        super.pack();

    }

    //  "<?>" is a wildcard type. 
    //  It is short for "<? extends Object>" 
    //  If you get it, all you know is its an Object. 
    //  If you try to set, you can't because it could be any sub class of Object.
    @Override
    public void actionPerformed(ActionEvent actionEventObject) {

        if (actionEventObject.getSource() == this.btnID) {
            Comparator<?> myComparator = new StudentComparatorID();
            print(myComparator);
        }
        if (actionEventObject.getSource() == this.btnName) {
            Comparator<?> myComparator = new StudentComparatorName();
            print(myComparator);

        }
        if (actionEventObject.getSource() == this.btnDate) {
            Comparator<?> myComparator = new StudentComparatorDate();
            print(myComparator);
        }

    }

    void print(Comparator myComparator) {

        TreeSet<Student> myTreeSet = new TreeSet<>(myComparator);
        myTreeSet.addAll(new Students());
        myTreeSet.forEach((myStudent) -> {
            System.out.println(myStudent);
        });

        System.out.println();

    }

}
