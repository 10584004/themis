package dangod.themis.model.po.club;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
@Table(name = "club_application")
public class Application {
    @Id
    @GeneratedValue
    private long id;
    private String applyDate;
    @OneToOne(fetch= FetchType.EAGER, cascade= CascadeType.ALL)
    @JoinColumn(name="club_id",nullable=true)
    private Club club;
    private String activityName;
    private String activityPlace;
    private String activityStart;
    private String activityEnd;
    private String activitypeople;
    private Integer isFine;
    @Column(length = 1500)
    private String introduce;
    private Integer hasFile;// 0无 1有
    private Integer status;//-1,<0:未通过    =0:审核通过       1:审核中
    private Integer lv;//1,2,3,4

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityPlace() {
        return activityPlace;
    }

    public void setActivityPlace(String activityPlace) {
        this.activityPlace = activityPlace;
    }

    public String getActivityStart() {
        return activityStart;
    }

    public void setActivityStart(String activityStart) {
        this.activityStart = activityStart;
    }

    public String getActivityEnd() {
        return activityEnd;
    }

    public void setActivityEnd(String activityEnd) {
        this.activityEnd = activityEnd;
    }

    public String getActivitypeople() {
        return activitypeople;
    }

    public void setActivitypeople(String activitypeople) {
        this.activitypeople = activitypeople;
    }

    public Integer getIsFine() {
        return isFine;
    }

    public void setIsFine(Integer isFine) {
        this.isFine = isFine;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public Integer getHasFile() {
        return hasFile;
    }

    public void setHasFile(Integer hasFile) {
        this.hasFile = hasFile;
    }

    public Application() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E ");
        this.applyDate = sdf.format(Calendar.getInstance().getTime());
        this.status = 1;
        this.lv=1;
    }

    public Application(Club club, String activityName, String activityPlace, String activityStart, String activityEnd, String activitypeople, Integer isFine, String introduce, Integer hasFile) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E ");
        this.applyDate = sdf.format(Calendar.getInstance().getTime());
        this.club = club;
        this.activityName = activityName;
        this.activityPlace = activityPlace;
        this.activityStart = activityStart;
        this.activityEnd = activityEnd;
        this.activitypeople = activitypeople;
        this.isFine = isFine;
        this.introduce = introduce;
        this.status = 1;
        this.hasFile = hasFile;
        this.lv=1;
    }
}
