package com.bread.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.bread.main;

public class DesktopLauncher {
	public static int width = 800;
	public static int height = 800;
	public static String title = "The World Is Shrinking";

	public static void main (String[] arg) {
		new LwjglApplication(new main(), title, width, height);
	}
}
