package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintExam extends JFrame{
	public PaintExam()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g); //JFrame의 paint()가 실행됨
		g.drawString("hello", 10, 60); //문자열, x좌표, y좌표
		g.drawOval(30, 100, 50, 50); //x좌표, y좌표, 가로(width), 세로(height)
		g.setColor(Color.blue); //색 지정
		g.fillOval(100, 100, 50, 50); //바로위에서 지정한 색을 채움
		g.setColor(Color.yellow);
		g.fillRect(200, 200, 60, 60);
		System.out.println("paint 호출...");
	}
	public static void main(String[] args) {
		new PaintExam();
	}
}
