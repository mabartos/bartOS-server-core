package org.bartos.model.jpa.entities.room;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.bartos.model.RoomType;
import org.bartos.model.jpa.entities.home.HomeEntity;

import javax.persistence.Cacheable;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Rooms")
@Cacheable
@JsonIgnoreProperties(ignoreUnknown = true)
@NamedQueries({
        @NamedQuery(name = "getRoomByID", query = "select room from RoomEntity room where room.id=:id and room.home.id=:homeID"),
        @NamedQuery(name = "getAllRooms", query = "select room from RoomEntity room  where room.home.id=:homeID"),
        @NamedQuery(name = "deleteRoomByID", query = "delete from RoomEntity where id=:id and home.id=:homeID"),
        @NamedQuery(name = "deleteRoomsFromHome", query = "delete from RoomEntity where home.id=:homeID"),
        @NamedQuery(name = "getCountOfRooms", query = "select count(room) from RoomEntity room where room.home.id=:homeID")
})
public class RoomEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    protected String id;

    @Column(nullable = false)
    protected String name;

    @Column(nullable = false)
    @Enumerated
    protected RoomType type = RoomType.NONE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HOME_ID")
    protected HomeEntity home;

    @Column
    @ElementCollection
    @CollectionTable(name = "ROOM_DEVICES", joinColumns = {@JoinColumn(name = "ROOM_ID")})
    protected Set<String> devices;

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

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public Set<String> getDevices() {
        if (devices == null) {
            devices = new HashSet<>();
        }
        return devices;
    }

    public void setDevices(Set<String> devices) {
        this.devices = devices;
    }

    public HomeEntity getHome() {
        return home;
    }

    public void setHome(HomeEntity home) {
        this.home = home;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else if (!(obj instanceof RoomEntity))
            return false;
        else {
            RoomEntity room = (RoomEntity) obj;
            return (id.equals(room.getID())
                    && name.equals(room.getName())
                    && type.equals(room.getType())
            );
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type);
    }
}
