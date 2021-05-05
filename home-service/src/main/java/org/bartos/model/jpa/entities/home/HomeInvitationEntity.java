package org.bartos.model.jpa.entities.home;


import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "HOME_INVITATION")
@Cacheable
@NamedQueries({
        @NamedQuery(name = "getHomesInvitations", query = "select inv from HomeInvitationEntity inv join fetch inv.receiver join fetch inv.home where inv.home.id=:homeID"),
        @NamedQuery(name = "deleteHomeInvitations", query = "delete from HomeInvitationEntity where home.id=:homeID")
})
public class HomeInvitationEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue
    @Column(name = "INVITATION_ID")
    String id;

    @Column(name = "ISSUER")
    protected String issuer;

    @Column(name = "RECEIVER")
    protected String receiver;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HOME_ID")
    protected HomeEntity home;

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public HomeEntity getHome() {
        return home;
    }

    public void setHome(HomeEntity home) {
        this.home = home;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof HomeInvitationEntity)) {
            return false;
        } else {
            HomeInvitationEntity object = (HomeInvitationEntity) obj;

            return (id.equals(object.getID())
                    && issuer.equals(object.getIssuer())
                    && receiver.equals(object.getReceiver())
            );
        }
    }

    public int hashCode() {
        return Objects.hash(id, issuer, receiver);
    }
}
