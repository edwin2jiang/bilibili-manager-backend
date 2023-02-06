
import javax.persistence.*;

@Entity
@Table(name = "date_use_time")
public class DateUseTime {
    @Column(name = "bid")
    private Integer bid;

    @Column(name = "date")
    private java.sql.Timestamp date;

    @Column(name = "sec")
    private Long sec;

    public Integer getBid() {
        return this.bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public java.sql.Timestamp getDate() {
        return this.date;
    }

    public void setDate(java.sql.Timestamp date) {
        this.date = date;
    }

    public Long getSec() {
        return this.sec;
    }

    public void setSec(Long sec) {
        this.sec = sec;
    }
}
