package com.techoffice.oracle.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.techoffice.oracle.client.fx.SpringFxmlLoader;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

@Component
public class OracleJavaFxAppl extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		SpringFxmlLoader loader = new SpringFxmlLoader();
        VBox root = (VBox) loader.load("fxml/appl.fxml");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FXML Controller Example");
        primaryStage.show();
	}
	
	public void run(String[] args){
		launch(args);
	}
	
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		OracleJavaFxAppl helloWorldExample = context.getBean(OracleJavaFxAppl.class);
		helloWorldExample.run(args);
	}
	
	public void sayHi(){
		System.out.println("Hello");
	}
}
