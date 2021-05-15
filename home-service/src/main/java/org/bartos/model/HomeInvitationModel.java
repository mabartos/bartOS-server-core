package org.bartos.model;

public interface HomeInvitationModel {

    String getID();

    String getIssuer();

    void setIssuer(String issuerID);

    String getReceiver();

    void setReceiver(String receiverID);

    HomeModel getHome();
}
