package com.levdoc.vaadinnoteapp.views.mainview1;

import com.levdoc.vaadinnoteapp.views.MainLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("MainView Test Route")
@Route(value = "mainviewtest", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class MainView extends VerticalLayout {
    MainView() {
        add(new H1("Hello 2 All"));
    }
}
