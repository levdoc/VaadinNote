package com.levdoc.vaadinnoteapp.views.hello;

import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.*;

@PageTitle("User Hello Service")
@Route(value = "hello")
public class Hello extends VerticalLayout implements HasUrlParameter<String> {

    Hello() {
    }

    @Override
    public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
        if (parameter == null) {
            setText("Welcome anonymous.");
        } else {
            setText(String.format("Welcome %s.", parameter));
        }
    }

    private void setText(String text) {
        add(new H4(text));
    }
}
