
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;


public class GuiApp extends JFrame implements ItemListener , ActionListener {



    private Boolean studentFlag = false;
    private Boolean adminFlag = false;


    private JButton addPersonButton;

    private JComboBox jobCombobox;
    String jobComboboxItems[] = {"Select Job","Dean","Admin" , "Staff" , "Student" };

    private JComboBox academicPositionCombobox;
    String apComboboxItems[]={"Select Academic Position","Professor","Assistant Professor","Teaching Assistant"};

    private JLabel nameLabel = new JLabel("Name: ");
    private JLabel birthDateLabel = new JLabel("Date Of Birth: ");
    private JLabel phoneLabel = new JLabel("Phone Number: ");
    private JLabel positionLabel = new JLabel("Job: ");

    private JLabel salaryLabel = new JLabel("Salary: ");
    private JLabel staffSalaryLabel = new JLabel("Salary: ");
    private JLabel studyCourses = new JLabel("Courses to Study: ");
    private JLabel teachCourses = new JLabel("Courses to Teach: ");
    private JLabel academicPosition = new JLabel("Academic Position: ");
    private JLabel TAStudyCourses = new JLabel("Studying Courses: ");

    private JLabel infoLabel = new JLabel("Created Personnel Info: ");
    private JLabel deanLabel = new JLabel("Current Dean: ");
    private JLabel deanSalary = new JLabel("Salary: ");

    private JTextField nameField = new JTextField();
    private JTextField phoneNumField = new JTextField();
    private JTextField dateOfBirthField = new JTextField();
    private JTextField salaryField = new JTextField();
    private JTextField staffSalaryField = new JTextField();
    private JTextField staffCoursesField = new JTextField();
    private JTextField teachingAssistantCoursesField = new JTextField();
    private JTextField studentCoursesField = new JTextField();
    private JTextField currentDeanField = new JTextField();
    private JTextField deanSalaryField = new JTextField();


    private DefaultListModel<String> model = new DefaultListModel<>();
    private JList personnelInfo = new JList(model);


    private JPanel MainPanel;
    private JPanel FormPanel;
    private JPanel cardsPanel;
    private JPanel subCardsPanel;
    private JPanel InfoPanel;
    private JPanel DeanInfoPanel;

    private JPanel adminPanel;
    private JPanel staffPanel;
    private JPanel studentPanel;
    private JPanel deanPanel;
    private JPanel TAPanel;
    private JPanel btnPanel;

    public GuiApp()
    {
        super("Faculty App");

        MainPanel = new JPanel();
        MainPanel.setLayout(new BoxLayout(MainPanel,BoxLayout.Y_AXIS));
        MainPanel.setBackground(Color.LIGHT_GRAY);
        MainPanel.setBorder(new LineBorder(Color.LIGHT_GRAY,3));


        FormPanel = new JPanel();
        FormPanel.setLayout(new GridLayout(4,2,40,40));
        FormPanel.setBackground(Color.LIGHT_GRAY);
        FormPanel.setBorder(new LineBorder(Color.WHITE,2));
        FormPanel.add(nameLabel);
        FormPanel.add(nameField);

        FormPanel.add(birthDateLabel);
        FormPanel.add(dateOfBirthField);
        FormPanel.add(phoneLabel);
        FormPanel.add(phoneNumField);

        jobCombobox = new JComboBox(jobComboboxItems);
        jobCombobox.setEditable(false);
        jobCombobox.addItemListener(this);

        academicPositionCombobox = new JComboBox(apComboboxItems);
        academicPositionCombobox.setEditable(false);
        academicPositionCombobox.addItemListener(this);

        addPersonButton = new JButton("add Person");
        addPersonButton.addActionListener(this);

        currentDeanField.setText(Dean.getDeanInstance().toString());
        currentDeanField.setEditable(false);

        //card 1
        adminPanel = new JPanel();
        adminPanel.setLayout(new GridLayout(4,2,40,40));
        adminPanel.setBorder(new LineBorder(Color.WHITE,2));
        adminPanel.setBackground(Color.lightGray);
        adminPanel.add(salaryLabel);
        adminPanel.add(salaryField);
        adminPanel.add(new Label(" "));
        adminPanel.add(new Label(" "));
        adminPanel.add(new Label(" "));
        adminPanel.add(new Label(" "));

        //Card 2
        studentPanel = new JPanel();
        studentPanel.setLayout(new GridLayout(4,2,40,40));
        studentPanel.setBackground(Color.LIGHT_GRAY);
        studentPanel.setBorder(new LineBorder(Color.WHITE,2));
        studentPanel.add(studyCourses);
        studentPanel.add(studentCoursesField);
        studentPanel.add(new Label(" "));
        studentPanel.add(new Label(" "));
        studentPanel.add(new Label(" "));
        studentPanel.add(new Label(" "));

        //Card3
        staffPanel = new JPanel();
        staffPanel.setLayout(new GridLayout(4,2,40,40));
        staffPanel.setBorder(new LineBorder(Color.WHITE,2));
        staffPanel.setBackground(Color.lightGray);

        staffPanel.add(staffSalaryLabel);
        staffPanel.add(staffSalaryField);

        staffPanel.add(academicPosition);
        staffPanel.add(academicPositionCombobox);

        staffPanel.add(teachCourses);
        staffPanel.add(staffCoursesField);

        //Card4
        deanPanel = new JPanel();
        deanPanel.setLayout(new GridLayout(4,2,40,40));
        deanPanel.setBorder(new LineBorder(Color.WHITE,2));
        deanPanel.setBackground(Color.lightGray);
        deanPanel.add(deanSalary);
        deanPanel.add(deanSalaryField);
        deanPanel.add(new Label(" "));
        deanPanel.add(new Label(" "));
        deanPanel.add(new Label(" "));
        deanPanel.add(new Label(" "));

        cardsPanel =new JPanel(new CardLayout());
        cardsPanel.setBackground(Color.LIGHT_GRAY);
        cardsPanel.add(new Label(" "),"Select Job");
        cardsPanel.add(deanPanel,"Dean");
        cardsPanel.add(adminPanel,"Admin");
        cardsPanel.add(studentPanel,"Student");
        cardsPanel.add(staffPanel,"Staff");

        //SubCards
        TAPanel = new JPanel(new GridLayout(1,2,40,40));
        TAPanel.setBackground(Color.lightGray);
        TAPanel.setBorder(new LineBorder(Color.white,2));
        TAPanel.add(TAStudyCourses);
        TAPanel.add(teachingAssistantCoursesField);

        subCardsPanel = new JPanel(new CardLayout());
        subCardsPanel.setBackground(Color.lightGray);

        subCardsPanel.add(new Label(" "),"Select Academic Position");
        subCardsPanel.add(new Label(" "),"Professor");
        subCardsPanel.add(new Label(" "),"Assistant Professor");
        subCardsPanel.add(TAPanel,"Teaching Assistant");

        btnPanel = new JPanel(new BorderLayout());
        btnPanel.setBackground(Color.lightGray);
        btnPanel.setBorder(new LineBorder(Color.WHITE,2));
        btnPanel.add(addPersonButton,BorderLayout.EAST);

        InfoPanel = new JPanel(new BorderLayout());
        InfoPanel.setBackground(Color.lightGray);
        InfoPanel.setBorder(new LineBorder(Color.WHITE,2));
        InfoPanel.add(infoLabel,BorderLayout.PAGE_START);
        InfoPanel.add(personnelInfo);

        DeanInfoPanel = new JPanel();
        DeanInfoPanel = new JPanel(new BorderLayout());
        DeanInfoPanel.setBackground(Color.lightGray);
        DeanInfoPanel.setBorder(new LineBorder(Color.WHITE,2));
        DeanInfoPanel.add(deanLabel,BorderLayout.PAGE_START);
        DeanInfoPanel.add(currentDeanField);

        //

        FormPanel.add(positionLabel);
        FormPanel.add(jobCombobox);

        MainPanel.add(DeanInfoPanel);
        MainPanel.add(FormPanel);
        MainPanel.add(cardsPanel);
        MainPanel.add(subCardsPanel);
        MainPanel.add(btnPanel);
        MainPanel.add(InfoPanel);

        add(MainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 750);
        setVisible(true);
    }

    // comboBoxes actions
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED)
        {
            if (e.getSource() == jobCombobox)
            {
                CardLayout cl = (CardLayout)(cardsPanel.getLayout());
                cl.show(cardsPanel, (String)e.getItem());
            }

            if (e.getSource() == academicPositionCombobox)
            {
                CardLayout c2 = (CardLayout)(subCardsPanel.getLayout());
                c2.show(subCardsPanel, (String)e.getItem());
            }
        }
    }

    public void clearFields()
    {
        nameField.setText("");
        phoneNumField.setText("");
        dateOfBirthField.setText("") ;
        salaryField.setText("") ;
        staffSalaryField.setText("");
        staffCoursesField.setText("") ;
        teachingAssistantCoursesField.setText("");
        studentCoursesField.setText("");
        deanSalaryField.setText("");

        jobCombobox.setSelectedItem("Select Job");
        academicPositionCombobox.setSelectedItem("Select Academic Position");

    }

    public void makeAdmin(){
        try{
            Admin admin = new Admin(nameField.getText(),
                    dateOfBirthField.getText(),phoneNumField.getText(),Integer.parseInt(salaryField.getText()));
            //personLabel.setText(admin.toString());
            model.addElement(admin.toString());
        }
        catch(IllegalArgumentException e){
         System.out.println("Invalid Parameter");
        }
    }

    public void makeStudent()
    {
        try
        {
            Student student = new Student(nameField.getText(),dateOfBirthField.getText()
                    ,phoneNumField.getText(),stringArray2ArrayList(studentCoursesField.getText()));
            model.addElement(student.toString());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid Parameter");
        }

    }

    public ArrayList<String> stringArray2ArrayList(String text){
        String[] str = text.split(",");
        return new ArrayList<>(Arrays.asList(str));
    }

    public void makeProfessor()
    {
        try
        {
            Professor professor = new Professor(nameField.getText(),dateOfBirthField.getText()
                    ,phoneNumField.getText(),Integer.parseInt(staffSalaryField.getText()),stringArray2ArrayList(staffCoursesField.getText()));
            model.addElement(professor.toString());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid Parameter");
        }
    }

    public void makeAssistantProfessor()
    {
        try
        {
            AssistantProfessor assistantProfessor = new AssistantProfessor(nameField.getText(),dateOfBirthField.getText()
                    ,phoneNumField.getText(),Integer.parseInt(staffSalaryField.getText()),stringArray2ArrayList(staffCoursesField.getText()));
            model.addElement(assistantProfessor.toString());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid Parameter");
        }
    }

    public void makeTeachingAssistant()
    {
        try
        {
            TeacherAssistant teacherAssistant = new TeacherAssistant(nameField.getText(),dateOfBirthField.getText()
                    ,phoneNumField.getText(),stringArray2ArrayList(teachingAssistantCoursesField.getText()),
                    Integer.parseInt(staffSalaryField.getText()),stringArray2ArrayList(staffCoursesField.getText()));
            model.addElement(teacherAssistant.toString());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid Parameter");
        }
    }

    public void changeDean(){
        try
        {
            Dean dean = Dean.getDeanInstance();
            dean.setName(nameField.getText());
            dean.setDateOfBirth(dateOfBirthField.getText());
            dean.setPhoneNum(phoneNumField.getText());
            dean.setSalary(Integer.parseInt(deanSalaryField.getText()));
            model.addElement(dean.toString());
            currentDeanField.setText(Dean.getDeanInstance().toString());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }


    public void ChoosePersonToMake()
    {
        switch (jobCombobox.getSelectedIndex())
        {
            case 0:
                break;
            case 1:
                changeDean();
                break;
            case 2:
                makeAdmin();
                break;
            case 4:
                makeStudent();
                break;
            case 3:
                switch (academicPositionCombobox.getSelectedIndex())
                {
                    case 0:
                        break;
                    case 1:
                        makeProfessor();
                        break;
                    case 2:
                        makeAssistantProfessor();
                        break;
                    case 3:
                        makeTeachingAssistant();
                        break;
                }

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("add Person"))
        {
            ChoosePersonToMake();
            System.out.println(" Person Created");
            clearFields();
        }
    }

    public static void main(String[] args) {
        GuiApp app = new GuiApp();
    }

}
