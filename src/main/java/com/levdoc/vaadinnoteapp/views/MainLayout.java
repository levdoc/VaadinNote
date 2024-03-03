package com.levdoc.vaadinnoteapp.views;

import com.levdoc.vaadinnoteapp.views.mainview1.MainView;
import com.levdoc.vaadinnoteapp.views.mainview2.MainView2;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.Route;

@Route("main")
public class MainLayout extends AppLayout {

//    private H1 siteNameBar;

    public MainLayout() {
        setPrimarySection(Section.DRAWER);
        
        addDrawerContent();
    }

    private void addDrawerContent() {
        //        H1 applicationName = new H1("Мои заметки");
        //        Header header = new Header(applicationName);

        DrawerToggle drawerToggle = new DrawerToggle();

        H1 title = new H1("Dashboard");
        title.getStyle().set("font-size", "var(--lumo-font-size-l)")
                .set("margin", "0");

        Scroller scroller = new Scroller(createNavigation());


        
//        addToDrawer(header, scroller, createFooter());
        addToDrawer(scroller, createFooter());
        addToNavbar(drawerToggle, title);
    }

    private Footer createFooter() {
        Footer footer = new Footer();

        footer.add(new H1("Created by LevDoc"));

        return footer;
    }

    private SideNav createNavigation() {
        SideNav sideNav = new SideNav();

        sideNav.addItem(new SideNavItem("MainViewTest", MainView.class));
        sideNav.addItem(new SideNavItem("MainTest 2", MainView2.class));

        return sideNav;
    }
}
