package pack3;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame5Inner extends Frame{
	private Wevent wevent = new Wevent();
	int x, y; // 마우스클릭드에서 
	private String[] names = {"지명기", "도라이"};
	
		public MyFrame5Inner() {
			setTitle("내부 클래스");
			
			setSize(300, 250);
			setLocation(200, 200);
			setVisible(true);
			
			addWindowListener(wevent);
			addMouseListener(new Mevent());
		}
		class Wevent extends WindowAdapter{  // 내부 클래스 
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}

	class Mevent extends MouseAdapter{   // 내부 클래스
		
		@Override
		public void mouseClicked(MouseEvent e) {
			//setTitle("클릭");
			// int x = e.getX();   // 지역변수 값
			// int y = e.getY();
			
			x = e.getX();   // 전역변수에 값
			y = e.getY();
			setTitle("x : " + x + ", y" + y);
			
			// paint(getGraphics());    // 자동호출되는 paint()를 명시적으로 호출
			repaint();   // 이건 누를때마다 다시 찍힘 위에거는 계속 찍힘
		}
		
	}
			
	@Override
	public void paint(Graphics g) {  // 자동 호출이 기본
		// Graphics : 프레임이 제공하는 그림 그리기 객체
		// g.drawString("홍길동", 100, 100);
		g.setFont(new Font("굴림", Font.BOLD, (int)(Math.random() * 50 + 8)));
		// 폰트랑 글자크기 바꾸기
		// g.drawString("홍길동", x, y);  
		int n = (int)(Math.random() * 5);
		g.drawString(names[n], x, y);
	}
	
	public static void main(String[] args) {
		new MyFrame5Inner();
	}

}

