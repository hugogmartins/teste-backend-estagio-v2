package aikoEstagio.testeHugo.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipment_model_state_hourly_earnings")
public class HourlyEarnings {
    @Id
    @Column(name = "equipment_model_id")
    private UUID model;
    @Column(name = "equipment_state_id")
    private UUID state;
    private float value;

    
    public UUID getModel() {
        return model;
    }
    public void setModel(UUID model) {
        this.model = model;
    }
    public UUID getState() {
        return state;
    }
    public void setState(UUID state) {
        this.state = state;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }

}
