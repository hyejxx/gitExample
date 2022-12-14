package ch17;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pizza extends JFrame {
	public Pizza() {
		super("피자 메뉴");
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel.setBackground(Color.GRAY);
		panel1.setBackground(Color.CYAN);
		panel2.setBackground(Color.YELLOW);
		
		JLabel label = new JLabel("피자 종류를 선택하세요");
		panel1.add(label);
		
		JButton button1 = new JButton("치즈");
		JButton button2 = new JButton("페파로니");
		JButton button3 = new JButton("고구마");
		JButton button4 = new JButton("종료");
		
		//패널2에 버튼 추가
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		
		//패널에 다른 패널 추가
		panel.add(panel1);
		panel.add(panel2);
		
		//패널을 프레임에 부착
		add(panel, "North");
		setVisible(true);
		
		//이벤트 처리
		ActionListener handler = new ActionListener() { //익명클래스 자동 처리

			//모달창인 Dialog(경고, 안내창 등)들을 이벤트를 통해 출력
			//모달창인란 본창(부모) 앞에 튀어나온 별도의 창(자식)으로 부모-자식관계 가진 디자인요소이다.
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("치즈")) {
					JOptionPane.showMessageDialog(null, "치즈피자를 선택하셨습니다." 
				+ "\n가격 : 9,000원", "치즈피자", JOptionPane.INFORMATION_MESSAGE);
				} else if(e.getActionCommand().equals("페파로니")) {
					JOptionPane.showMessageDialog(null, "페파로니피자를 선택하셨습니다." 
							+ "\n가격 : 10,000원", "페파로니피자", JOptionPane.WARNING_MESSAGE);
				} else if(e.getActionCommand().equals("고구마")) {
					JOptionPane.showMessageDialog(null, "고구마피자를 선택하셨습니다." 
							+ "\n가격 : 12,000원", "고구마피자", JOptionPane.DEFAULT_OPTION);
				} else if(e.getActionCommand().equals("종료")) {
					JOptionPane.showMessageDialog(null, "프로그램을 정말 종료하시겠습니까?" 
				, "종료" , JOptionPane.OK_CANCEL_OPTION);
					System.exit(0);
				} 
			}
		};
		
		//버튼에 리스너를 부착해서 이벤트 헨들러(actionPerformed)를 호출해서 처리하게 함.
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);
		
	}
	
	public static void main(String[] args) {
		new Pizza();
	}

}
