package com.scoolfx.desktop.ui.stage;

import java.util.ResourceBundle;

public enum AppStage {
	LOGIN {
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("login.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/login.fxml";
		}
	},
	DASHBOARD {
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("dashboard.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/scoolfx.fxml";
		}
	};

	public abstract String getTitle();

	public abstract String getFxmlFile();

	String getStringFromResourceBundle(String key) {
		return ResourceBundle.getBundle("Bundle").getString(key);
	}

}
