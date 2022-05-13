package aikoEstagio.testeHugo.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipment_state_history")
public class StateHistory {
    @Id
    private UUID equipment_id;
    private UUID equipment_state_id;
    private Date date;

    public UUID getEquipment() {
        return equipment_id;
    }
    public void setEquipment(UUID equipment) {
        this.equipment_id = equipment;
    }
    public UUID getState() {
        return equipment_state_id;
    }
    public void setState(UUID state) {
        this.equipment_state_id = state;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}
