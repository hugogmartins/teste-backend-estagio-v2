package aikoEstagio.testeHugo.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipment_position_history")
public class PositionHistory {
    @Id
    @Column(name = "equipment_id")
    private UUID equipment;
    private Date date;
    private long lat;
    private long lon;

    public UUID getEquipment() {
        return equipment;
    }
    public void setEquipment(UUID equipment) {
        this.equipment = equipment;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public long getLat() {
        return lat;
    }
    public void setLat(long lat) {
        this.lat = lat;
    }
    public long getLon() {
        return lon;
    }
    public void setLon(long lon) {
        this.lon = lon;
    }
}
