/*
 * Copyright (c) 2020.
 * Martin Bartos
 * SmartHome BartOS
 * All rights reserved.
 */

package org.bartos.model.jpa.entities.home;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.bartos.model.jpa.entities.room.RoomEntity;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "HOME")
@Cacheable
@NamedQueries({
        @NamedQuery(name = "getAllHomeIDs", query = "select home.id from HomeEntity home"),
        @NamedQuery(name = "getHomeByName", query = "select home from HomeEntity home where home.name=:name")
})
public class HomeEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue
    @Column(name = "HOME_ID")
    String id;

    @Column(nullable = false)
    protected String name;

    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    @BatchSize(size = 20)
    protected Set<String> unassignedDevices;

    @ElementCollection
    @LazyCollection(LazyCollectionOption.FALSE)
    @BatchSize(size = 20)
    protected Set<String> users;

    @OneToMany(targetEntity = RoomEntity.class, mappedBy = "home", cascade = CascadeType.ALL, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    @BatchSize(size = 20)
    protected Set<RoomEntity> rooms;

    @OneToMany(targetEntity = HomeInvitationEntity.class, mappedBy = "home", cascade = CascadeType.ALL, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    @BatchSize(size = 20)
    protected Set<HomeInvitationEntity> invitations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    /* USERS */
    public Set<String> getUsers() {
        if (users == null) {
            users = new HashSet<>();
        }
        return users;
    }

    public void setUsers(Set<String> users) {
        this.users = users;
    }

    /* DEVICES */
    public Set<String> getUnassignedDevices() {
        if (unassignedDevices == null) {
            unassignedDevices = new HashSet<>();
        }
        return unassignedDevices;
    }

    public void setUnassignedDevices(Set<String> devices) {
        this.unassignedDevices = devices;
    }

    /* ROOMS */
    public Set<RoomEntity> getRooms() {
        if (rooms == null) {
            rooms = new HashSet<>();
        }
        return rooms;
    }

    public void setRooms(Set<RoomEntity> rooms) {
        this.rooms = rooms;
    }

    /* INVITATIONS */
    public Set<HomeInvitationEntity> getInvitations() {
        if (invitations == null) {
            invitations = new HashSet<>();
        }
        return invitations;
    }

    public void setInvitations(Set<HomeInvitationEntity> invitations) {
        this.invitations = invitations;
    }

    /* MANAGE */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else if (!(obj instanceof HomeEntity))
            return false;
        else {
            HomeEntity object = (HomeEntity) obj;
            return (object.getID().equals(this.getID())
                    && object.getName().equals(this.getName())
            );
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
