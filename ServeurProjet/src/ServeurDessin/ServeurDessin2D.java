package ServeurDessin;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServeurDessin2D {
	
	public static void main(String[] args)
	{
	int portServeurDessin = 9111;
	try
	    {
	    ServerSocket serveurDessin = new ServerSocket(portServeurDessin);
	    
	    System.out.println("serveur de dessin pr�t, \n d�tails : "+serveurDessin); 
	    int nombreClients;
	    nombreClients = 0;
	    while (true)
	        {
	    	System.out.println("attente nouvelle connexion");
			Socket interLocuteurClient = serveurDessin.accept();
			System.out.println("Nouveau client connect� : " +interLocuteurClient);
			Receveur receveur = new Receveur(interLocuteurClient,0);
			receveur.start();
	        }
	    }
	catch (IOException e)
	    {
	    
	    System.err.println("Le serveur n'a pu �tre connect� sur le port d'�coute ou la connexion sur ce port a �t� rompue. \n D�tails : "+e);
	    }
	}
}
