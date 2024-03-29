package egitim.uniyaz.ui.components;

import com.vaadin.server.FontAwesome;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

public class MenuButton extends Button {
    public MenuButton(FontAwesome fontAwesome) {
        setIcon(fontAwesome);
        setWidth(20, Sizeable.Unit.PERCENTAGE);
        addStyleName(ValoTheme.BUTTON_PRIMARY);
    }
}

