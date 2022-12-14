package ch18;

import java.awt.Container;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingFileIO extends JFrame implements ActionListener {
	Container cp;
	JButton btnSave, btnLoad;
	JTextArea ta;
	
	public SwingFileIO(String title) {
		super(title); //부모생성자 호출(매개변수1개짜리);
		cp = this.getContentPane(); //프레임위의 기본패널
		this.setBounds(100, 100, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setDesign();
		this.setVisible(true);
	}

	private void setDesign() {
		JPanel pTop = new JPanel();
		btnSave = new JButton("save file");
		btnLoad = new JButton("load file");
		pTop.add(btnSave);
		pTop.add(btnLoad);
		this.add("North", pTop); //보더레이아웃의 North영역에 패널 배치
		
		ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		this.add("Center", sp); //Center영역에 textarea 관련 패널 배치
		
		btnSave.addActionListener(this);
		btnLoad.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == btnSave) {
			FileDialog fd = new FileDialog(this, "saving file", FileDialog.SAVE);
			fd.setVisible(true);
			String filename = fd.getDirectory() + fd.getFile();
			if(fd.getFile()==null) {
				return;
			}
			
			FileWriter fw = null;
			try {
				fw = new FileWriter(filename);
				fw.write(ta.getText());
				ta.setText("saved");
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} else if(ob==btnLoad) {//파일 불러오기 기능
			FileDialog dlg = new FileDialog(this, "open file", FileDialog.LOAD);
			dlg.setVisible(true);
			String filename = dlg.getDirectory() + dlg.getFile();
			if(dlg.getFile()==null)
				return; //중괄호 없는 이유 => 1줄짜리여서
			FileReader fr = null;
			try {
				fr = new FileReader(filename);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			BufferedReader br = null;
			br = new BufferedReader(fr);
			ta.setText(""); //이전글 모두 삭제
			while(true) {
				String line = "";
				try {
					line = br.readLine();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				if(line == null)
					break;
				ta.append(line + "\n");
			}
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			
		}	
	} //actionPerformed()
	public static void main(String[] args) {
		new SwingFileIO("파일 입출력");
	}
}
