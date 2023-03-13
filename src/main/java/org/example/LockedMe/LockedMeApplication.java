package org.example.LockedMe;

import org.example.LockedMe.screens.WelcomeScreen;

public class LockedMeApplication {

    public static void main(String[] args) {
    	
    	WelcomeScreen welcome = new WelcomeScreen();
    	welcome.introWS();
    	welcome.GetUserInput();

    }
}
