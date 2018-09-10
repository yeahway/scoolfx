package com.scoolfx.desktop.ui.utils;

import java.io.IOException;
import java.io.Serializable;
import java.util.ResourceBundle;

import org.springframework.context.ApplicationContext;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class FXMLoaderUtils implements Serializable {

	private static final long serialVersionUID = -1455935543892690946L;

	public static Parent load(ResourceBundle resourceBundle, ApplicationContext context, String fxmlPath)
			throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setControllerFactory(context::getBean);
		loader.setResources(resourceBundle);
		loader.setLocation(FXMLoaderUtils.class.getResource(fxmlPath));
		return loader.load();
	}
}
