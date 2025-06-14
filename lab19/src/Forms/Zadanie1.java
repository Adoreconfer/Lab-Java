package Forms;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Zadanie1 extends JFrame{
    private JPanel JPanel1;
    private JTabbedPane tabbedPane1;
    private JList list1;
    private JButton addNewTaskButton;
    private JButton backButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JList list2;
    private JList list3;
    private JTextField textField1;
    public static final DefaultListModel<Task> taskModel = new DefaultListModel<>();

    public Zadanie1() {
        super("Zadanie 1");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 600, height = 400;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);

        DefaultListModel<Task> model = taskModel;
        list1.setModel(model);

        DefaultListModel<Task> model1 = new DefaultListModel<>();
        list2.setModel(model1);

        DefaultListModel<Task> model2 = new DefaultListModel<>();
        list3.setModel(model2);

        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem deleteItem = new JMenuItem("Delete");
        JMenuItem editItem = new JMenuItem("Edit");

        popupMenu.add(deleteItem);
        popupMenu.add(editItem);

        list1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) showMenu(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) showMenu(e);
            }

            private void showMenu(MouseEvent e) {
                int index = list1.locationToIndex(e.getPoint());
                if (index != -1) {
                    list1.setSelectedIndex(index);
                    popupMenu.show(list1, e.getX(), e.getY());
                }
            }
        });

        deleteItem.addActionListener(e -> {
            int index = list1.getSelectedIndex();
            if (index != -1) {
                ((DefaultListModel<Task>) list1.getModel()).remove(index);
            }
        });

        editItem.addActionListener(e -> {
            int index = list1.getSelectedIndex();
            if (index != -1) {
                Task task = model.get(index);
                dispose();
                EditTask editTask = new EditTask(model, task, index);
                editTask.setVisible(true);
            }
        });

        list1.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                Task selected = (Task) list1.getSelectedValue();
                if (selected != null) {
                    textField1.setText(selected.getOpis());
                }
            }
        });

        list2.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                Task selected = (Task) list2.getSelectedValue();
                if (selected != null) {
                    textField1.setText(selected.getOpis());
                }
            }
        });

        list3.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                Task selected = (Task) list3.getSelectedValue();
                if (selected != null) {
                    textField1.setText(selected.getOpis());
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = list1.getSelectedIndex();
                model1.addElement(model.getElementAt(index));
                model.remove(index);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = list2.getSelectedIndex();
                model2.addElement(model1.getElementAt(index));
                model1.remove(index);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = list2.getSelectedIndex();
                model.addElement(model1.getElementAt(index));
                model1.remove(index);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = list3.getSelectedIndex();
                model1.addElement(model2.getElementAt(index));
                model2.remove(index);
            }
        });
        addNewTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AddTask addTask = new AddTask(model);
                addTask.setVisible(true);
            }
        });
    }
}
