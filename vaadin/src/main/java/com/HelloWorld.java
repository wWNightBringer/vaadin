package com;

import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

@Title("My UI")
public class HelloWorld extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout layout = new VerticalLayout();
        setContent(layout);

        layout.addComponent(new Label("Hello World"));
        Button button = new Button("Push me");
        button.addClickListener(v -> Notification.show("Push me"));
    }
}
