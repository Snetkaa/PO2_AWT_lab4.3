import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class Formularz extends Frame implements WindowListener, ActionListener, ItemListener {

	//deklaracja elementow wyswietlanych w oknie aplikacji
		Button dodaj;
		Button przypis;
		TextField noweImie;
		Frame okno;
		Choice imiewybor;
		List imionalista;
	//deklaracja i inicjalizacja tablicy zmiennych typu String 
		String[] imiona = new String[] {"Kornel","Filip","Witold","Marek","Michał","Miłosz","Julian","Maksyilian","Konrad","Paweł"};
		
	Formularz() {
		
	//inicjowanie wartości wczesniej zadeklarowanych elementow 
		dodaj = new Button("Dodaj");
		przypis = new Button("Przepisz");	
		noweImie = new TextField();
		okno = new Frame();
		imiewybor = new Choice();
		imionalista = new List();
		
	//wlaczanie nasluchiwania okna 
		this.addWindowListener(this);
	//rozmieszczenie elementow znajdujacych sie w oknie
		setLayout(null);
		
	//parametry okna aPLIKACJI
		setBounds(500,200,500,500);
		setTitle("Formularz1");
		setBackground(Color.LIGHT_GRAY);
		setVisible(true);
		
	//dodawanie zadeklarowanych i zainicjowanych elementow do okna 
		add(dodaj);
		add(przypis);
		add(noweImie);
		add(imiewybor);
		add(imionalista);
		
	//wymiary elementow
		dodaj.setBounds(40, 300, 70, 30);
		przypis.setBounds(350, 300, 70, 30);
		noweImie.setBounds(40, 360, 180, 20);
		imiewybor.setBounds(310, 50, 160, 50);
		imionalista.setBounds(40, 50, 200, 200);
	
	//nasluchiwanie dla przyciskow, listy i listy rozwijanej 
		dodaj.addActionListener(this);
		przypis.addActionListener(this);
		imionalista.addItemListener(this);
		imiewybor.addItemListener(this);
		 	 
	//petla odpowiedzialna za przekazywanie zmiennych zdefiniowanych w tablicy do listy
		     for (int x = 0; x < imiona.length; x++)
		     {
		      imionalista.add(imiona[x]);
		     }
		     imionalista.select(1);
	}

	public static void main(String[] args) {
		new Formularz();
		 new Frame();
		 
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
	//spelnianie warunku polegajacego na dodawaniu do listy nowej pozycji
		if((Button)arg0.getSource() == dodaj) {
			String x = noweImie.getText();
			imionalista.add(x);
		}
	//spelnianie warunku polegajacego na przepisywaniu wartosci z listy do listy rozwijanej
		if((Button)arg0.getSource() == przypis) {
			for(int i=0; i<imionalista.countItems(); i++) {
				imiewybor.add(imionalista.getItem(i));
			}
		}
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		//zamykanie okna
			System.exit(0); 
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void itemStateChanged(ItemEvent arg0) {
	//odswiezanie widoku i aktualizowanie zawartosci obiektow okna
		repaint();
	}

}
