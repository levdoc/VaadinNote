package com.levdoc.vaadinnoteapp.views.mainview2;

import com.levdoc.vaadinnoteapp.views.MainLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("MainView Test Route 2")
@Route(value = "mainviewtest2", layout = MainLayout.class)
//@RouteAlias(value = "", layout = MainLayout.class)
public class MainView2 extends VerticalLayout {
    MainView2() {
        add(new H1("Hello 2 All"));
    }
}
