package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField tin, document;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, spheresOfsociety, occupation, education, income;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        
        String valReligion[] = {"None", "Hinduism", "Buddhism", "Christianity", "Atheism", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel surname = new JLabel("Spheres of society:");
        surname.setFont(new Font("Raleway", Font.BOLD, 20));
        surname.setBounds(100, 190, 200, 30);
        add(surname);
        
        String valSpheresOfsociety[] = {"None", "Economic", "Political", "Social", "Religious", "Other"};
        spheresOfsociety = new JComboBox(valSpheresOfsociety);
        spheresOfsociety.setBounds(300, 190, 400, 30);
        spheresOfsociety.setBackground(Color.WHITE);
        add(spheresOfsociety);
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String incomecategory[] = {"Null", "+5.000", "+10.000", "+20.000", "+50.000", "More than 50.000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        String valEducation[] = {"None", "Complete general secondary education", "Professional (vocational) education", "Professional higher education", "Higher education", "Other"};
        education = new JComboBox(valEducation);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        String valOccupation[] = {"None", "Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other"};
        occupation = new JComboBox(valOccupation);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        

        JLabel adress = new JLabel("TIN Number:");
        adress.setFont(new Font("Raleway", Font.BOLD, 20));
        adress.setBounds(100, 440, 200, 30);
        add(adress);
        
        tin = new JTextField();
        tin.setFont(new Font("Raleway", Font.BOLD, 14));
        tin.setBounds(300, 440, 400, 30);
        add(tin);
        
        JLabel city = new JLabel("Document Number:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        document = new JTextField();
        document.setFont(new Font("Raleway", Font.BOLD, 14));
        document.setBounds(300, 490, 400, 30);
        add(document);
        
        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        
        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String )religion.getSelectedItem();
        String sspheresOfsociety = (String) spheresOfsociety.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        } else if(sno.isSelected()){
            seniorcitizen = "No";
        }
        
        
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "Yes";
        } else if (eno.isSelected()){
            existingaccount = "No";
        }

        
        String stin = tin.getText();
        String sdocument = document.getText();
        
        
        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+sspheresOfsociety+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+stin+"', '"+sdocument+"', '"+seniorcitizen+"', '"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                //Signup3 Object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String[] args) {
        new SignupTwo("");
    }
}
