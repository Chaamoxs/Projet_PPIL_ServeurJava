package ServeurDessin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Receveur extends Thread {
	int noClient;
	BufferedReader fluxEntrant;
	
	
	public Receveur(Socket interLocuteurClient, int nbConnexion) throws IOException {
		this.fluxEntrant = new BufferedReader(new InputStreamReader(interLocuteurClient.getInputStream()));
		this.noClient = nbConnexion;
		//test
	}

	public void run() {
		try {
			
		System.out.println("conversation demarré avec le client numéro : "+this.noClient);
		String requete;
		requete = this.fluxEntrant.readLine();
		System.out.println("Le client numéro  "+this.noClient+" a envoyé " +requete);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
