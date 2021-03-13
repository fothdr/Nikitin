

package App; //����� Java �������

import java.awt.event.ActionListener; //���������� ��� ������� ���������
import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)

public class subversion {
	public static JPanel main_panel = new JPanel();
    public static JFrame main_GUI = new JFrame("subversion");
    public static JComboBox changeBox;
    public static JTextField textSideA;
    public static JTextField textSideB;
    public static JTextField textHeight;
    
    

    public static String ourinfo = "������� �.� (19130152) | ������� �.�.(19130615) 13.03.2021 | ��������� �.�.(19130340) | ������ �.�(191306371)13.03.2021";
	public subversion() {
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,400,400,500);
	main_GUI.setResizable(false); // ������������� ������ ����
	
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("������������ ������ �4"); // ����������� ������ ��� �����������
	laba_info.setBounds(120,0,150,30);
	JLabel name_group = new JLabel("���������� �����������");
	name_group.setBounds(115,0,160,250);
	main_panel.add(laba_info);
	main_panel.add(name_group);
	JLabel sideA = new JLabel("������� a");
    JLabel sideB = new JLabel("������� b");
    JLabel height = new JLabel("������");
    sideA.setBounds(30,260,60,20);
    sideB.setBounds(30,295,60,20);
    height.setBounds(30,330,60,20);
    main_panel.add(sideA);
    main_panel.add(sideB);
    main_panel.add(height);

        
    
    textSideA = new JTextField();
    textSideB = new JTextField();
    textHeight = new JTextField();
    textSideA.setBounds(100, 260, 60, 20);
    textSideB.setBounds(100, 295, 60, 20);
    textHeight.setBounds(100, 330, 60, 20);
    main_panel.add(textSideA);
    main_panel.add(textSideB);
    main_panel.add(textHeight);
    
    
    
    
    
    
    JButton button_result = new JButton("���������");
	button_result.setBounds(30,380,150,40);
	ActionListener resultListener = new ResultListener();
	button_result.addActionListener(resultListener);
	main_panel.add(button_result);
	
	
	
	JButton button_exit = new JButton("�����"); // ��������� ������
	button_exit.setBounds(270,200,100,40);
	ActionListener actionListener = new ListenerButton(); //������� ���������
	button_exit.addActionListener(actionListener); // ��������� ��������� � ������
	main_panel.add(button_exit);
	
	JButton button_info = new JButton("����������");
	button_info.setBounds(30,200,150,40);
	ActionListener infoListener = new ListenerInfo();
	button_info.addActionListener(infoListener);
	main_panel.add(button_info);
	
	JMenu mainMenu = new JMenu("�������");
	JMenuBar menuBar = new JMenuBar();
	JMenuItem menuItem1 = new JMenuItem("���������� ������� �����");
	JMenuItem menuItem2 = new JMenuItem("��������� ���� � ������11");
    JMenuItem menuItem3 = new JMenuItem("�����");
	menuItem1.addActionListener(new PictureListener());
	menuItem2.addActionListener(new UploadListener());
	menuItem3.addActionListener(new ListenerButton());

	mainMenu.add(menuItem1);
	mainMenu.add(menuItem2);
	mainMenu.add(menuItem3);
	menuBar.add(mainMenu);
	main_GUI.setJMenuBar(menuBar);
	
	
	String[] transfer = {"����������� ������� � ������ ������� ����", "����������� ������� � ��������", "����������� ������� � ����� ������� ����", "������� ������","������������� ������ � �������11"};
	    changeBox = new JComboBox(transfer);
	    changeBox.setBounds(30,140,350,30);
	    changeBox.addActionListener(new ChangeComboBoxListener());
	    main_panel.add(changeBox);
	    changeBox.setEnabled(true);
	
	main_GUI.setVisible(true);
	
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
	}
	
	
	
	
	public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}

}
