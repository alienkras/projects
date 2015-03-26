

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends JFrame {
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bp, bm, bu, bd, br, bz, bc;
		JTextField t1, t2, t3;
		
		int a1 = 0;  // переменные отражаемые в текстовых поляж соответственно первое второе и типа результат
		int a2 = 0;
		int a3 = 0;
		String s1, s2, s3;
		Character op;
		
		eHandler handler = new eHandler();  
	
		
		public Calc (String s) {
			super(s);
			setLayout (new FlowLayout());
			b0 = new JButton("0");  //кнопки от 0
			b1 = new JButton("1");
			b2 = new JButton("2");
			b3 = new JButton("3");
			b4 = new JButton("4");
			b5 = new JButton("5");
			b6 = new JButton("6");
			b7 = new JButton("7");
			b8 = new JButton("8");
			b9 = new JButton("9");  // до 9
			bp = new JButton("+");  // кнопка плюс
			bm = new JButton("-");  // кнопка минус
			bu = new JButton("*");  // .....
			bd = new JButton("/");
			br = new JButton("=");
			bz = new JButton("+-");
			bc = new JButton("C");  // кнопка сброса
			t1 = new JTextField(15);  // текстовые поля, по задумке предыдущее число перемещаеться в нижнюю строку
			t2 = new JTextField(15);  // целых три штуки сделал для наглядности
			t3 = new JTextField(15);
			
			
			add(t1); 	// размещение кнопок на форме
			add(t2);
			add(t3);
			
			add(b7);
			add(b8);
			add(b9);
			add(bd);
			add(b4);
			add(b5);
			add(b6);
			add(bu);
			add(b1);
			add(b2);
			add(b3);
			add(bm);
			add(b0);
			add(bz);
			add(bp);
			add(br);
			add(bc);
			
			b0.addActionListener(handler);   // слушатель нажатия кнопки
			b1.addActionListener(handler);
			b2.addActionListener(handler);
			b3.addActionListener(handler);
			b4.addActionListener(handler);
			b5.addActionListener(handler);
			b6.addActionListener(handler);
			b7.addActionListener(handler);
			b8.addActionListener(handler);
			b9.addActionListener(handler);
			bm.addActionListener(handler);
			bu.addActionListener(handler);
			bd.addActionListener(handler);
			bp.addActionListener(handler);
			br.addActionListener(handler);
			bz.addActionListener(handler);
			bc.addActionListener(handler);
	
		}
		public class eHandler implements ActionListener{

	
			public void actionPerformed(ActionEvent e) {
				try {
										
					if (e.getSource() == b0){ summ('0'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}			// отправляет в метод символ согласно нажатой кнопки
					if (e.getSource() == b1){ summ('1'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == b2){ summ('2'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == b3){ summ('3'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == b4){ summ('4'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == b5){ summ('5'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == b6){ summ('6'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == b7){ summ('7'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == b8){ summ('8'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == b9){ summ('9'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == bc){ summ('C'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == bp){ summ('p'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == bm){ summ('m'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == bu){ summ('u'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == bd){ summ('d'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == bz){ summ('z'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
					if (e.getSource() == br){ summ('r'); t1.setText(""+a1); t2.setText(""+a2); t3.setText(""+a3);}
														
					}catch (Exception ex){ JOptionPane.showMessageDialog(null, "Быть такого не может ))");}  // хотя бывает всякое
				
		}
			public void summ(char a){    // тут находиться сама логика вычислений, метод выбирает что делать согдасно переданому в параметре символу
				switch (a){				//  переменная ор реализует запоминание математической операции для нажатия клавиши равно
				
				case '0': { a1=a1*10+0; t1.setText(""+a1); break;} // ну блин сами додумайтесь 
				case '1': { a1=a1*10+1; t1.setText(""+a1); break;}
				case '2': { a1=a1*10+2; t1.setText(""+a1); break;}
				case '3': { a1=a1*10+3; t1.setText(""+a1); break;}
				case '4': { a1=a1*10+4; t1.setText(""+a1); break;}
				case '5': { a1=a1*10+5; t1.setText(""+a1); break;}
				case '6': { a1=a1*10+6; t1.setText(""+a1); break;}
				case '7': { a1=a1*10+7; t1.setText(""+a1); break;}
				case '8': { a1=a1*10+8; t1.setText(""+a1); break;}
				case '9': { a1=a1*10+9; t1.setText(""+a1); break;}
				
				case 'C': { a1= 0; a2=0; a3=0; op = ' '; break; }                // обнурение переменных
				
				case 'p': { if (a2 != 0) { a2= a2+a1; a1=0; a3=a2; break;}    // операция сумирования (проверкой реализован контроль ввода первого числа)
							else { op = 'p'; a2 = a1; a1 = 0;} break; }
				
				case 'm': { if (a2 != 0) { a2= a2-a1; a1=0; a3=a2; break;}   /// умножение
							else { op = 'm'; a2 = a1; a1 = 0;} break; }   
				
				case 'd': { if (a1 ==0) {JOptionPane.showMessageDialog(null, "Деление на ноль");break;}   // деление с проверкой деления на ноль 
							else { if (a2 != 0) { a2= a2/a1; a1=0; a3=a2; break;}
									else { op = 'd'; a2 = a1; a1 = 0; } break; }
									}		
				case 'u': { if (a2 != 0) { a2= a2*a1; a1=0; a3=a2; break;}  // умножение
							else { op = 'u'; a2 = a1; a1 = 0; } break; }
				
				case 'z': { a1= a1*(-1); break; }   // смена знака
				
								
				case 'r': { switch (op) {								// при нажатии клавиши равно определяеться какая операция была выбрана
							case 'p': { a2 = a2+a1; a1=0; a3=a2; break;}  
							case 'm': { a2 = a2-a1; a1=0; a3=a2; break;}
							case 'u': { a2 = a2*a1; a1=0; a3=a2; break;}
							case 'd': { if (a1 !=0) {a2 = a2/a1; a1=0; a3=a2; break;}
										else { JOptionPane.showMessageDialog(null, "Деление на ноль");break;} // еще одна проверка деления на ноль
									  }
										
							
							}	
				}
				
			}
		}
	}
		
}
		
		
		
