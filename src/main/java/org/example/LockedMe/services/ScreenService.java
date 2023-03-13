package org.example.LockedMe.services;

import org.example.LockedMe.entities.Directory;
import org.example.LockedMe.screens.FileOptionsScreen;
import org.example.LockedMe.screens.Screen;
import org.example.LockedMe.screens.WelcomeScreen;


public class ScreenService {
	
	//static Directory dir = new Directory();
	
	
	
	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
    
    

    public static Screen CurrentScreen = WelcomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
