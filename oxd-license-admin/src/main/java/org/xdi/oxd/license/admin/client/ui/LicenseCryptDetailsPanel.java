package org.xdi.oxd.license.admin.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Yuriy Zabrovarnyy
 * @version 0.9, 23/09/2014
 */

public class LicenseCryptDetailsPanel implements IsWidget {

    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);



    interface MyUiBinder extends UiBinder<Widget, LicenseCryptDetailsPanel> {
    }

    @UiField
    HTML nameField;
    @UiField
    VerticalPanel rootPanel;
    @UiField
    HTML privatePassword;
    @UiField
    HTML clientPublicKey;
    @UiField
    HTML clientPrivateKey;
    @UiField
    HTML publicKey;
    @UiField
    HTML privateKey;
    @UiField
    HTML licensePassword;
    @UiField
    HTML publicPassword;

    public LicenseCryptDetailsPanel() {
        uiBinder.createAndBindUi(this);
    }

    public HTML getLicensePassword() {
        return licensePassword;
    }

    public HTML getPublicPassword() {
        return publicPassword;
    }

    @Override
    public Widget asWidget() {
        return rootPanel;
    }

    public HTML getNameField() {
        return nameField;
    }

    public HTML getClientPrivateKey() {
        return clientPrivateKey;
    }

    public HTML getClientPublicKey() {
        return clientPublicKey;
    }

    public HTML getPrivateKey() {
        return privateKey;
    }

    public HTML getPrivatePassword() {
        return privatePassword;
    }

    public HTML getPublicKey() {
        return publicKey;
    }
}