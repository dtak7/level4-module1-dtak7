package _05_Enum_Stuff;

import java.util.Random;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
		
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
		void zodiacMethod (Zodiac z) {
			switch (z) {
			case ARIES:{
				JOptionPane.showMessageDialog(null, "ARIES");
				break;
			}
			case TAURUS:{
				JOptionPane.showMessageDialog(null, "TAURUS");
				break;
			}
			case GEMINI:{
				JOptionPane.showMessageDialog(null, "GEMINI");
				break;
			}
			case CANCER:{
				JOptionPane.showMessageDialog(null, "CANCER");
				break;
			}
			case LEO:{
				JOptionPane.showMessageDialog(null, "LEO");
				break;
			}
			case VIRGO:{
				JOptionPane.showMessageDialog(null, "VIRGO");
				break;
			}
			case LIBRA:{
				JOptionPane.showMessageDialog(null, "LIBRA");
				break;
			}
			case SCORPIO:{
				JOptionPane.showMessageDialog(null, "SCORPIO");
				break;
			}
			case SAGITTARIUS:{
				JOptionPane.showMessageDialog(null, "SAGITTARIUS");
				break;
			}
			case CAPRICORN:{
				JOptionPane.showMessageDialog(null, "CAPRICORN");
			break;
			}
			case AQUARIUS:{
				JOptionPane.showMessageDialog(null, "AQUARIUS");
				break;
			}
			case PISCES:{
				JOptionPane.showMessageDialog(null, "PICES");
				break;
			}
			default: System.out.println("ya done goofed");
			}	
		}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac z;
		Random rand = new Random(); 
		int val =rand.nextInt(11);
		if(val==0) {
			 z=Zodiac.ARIES;
		}
		else if(val==1) {
			z= Zodiac.TAURUS;
		}
		else if(val==2) {
			 z = Zodiac.GEMINI;
		}
		else if(val==3) {
			 z = Zodiac.CANCER;
		}
		else if (val==4) {
			 z = Zodiac.LEO;
		}
		else if(val==5) {
			 z=Zodiac.VIRGO;
		}
		else if(val==6) {
			 z=Zodiac.LIBRA;
		}
		else if (val==7) {
			 z=Zodiac.SCORPIO;
		}
		else if(val==8) {
			 z =Zodiac.SAGITTARIUS;
		}
		else if(val==9) {
			 z=Zodiac.CAPRICORN;
		}
		else if(val==10) {
			 z = Zodiac.AQUARIUS;
		}
		else {
			 z =Zodiac.PISCES;
		}
		_00_Horoscope horo = new _00_Horoscope();
		horo.zodiacMethod(z);
		
	}
}
