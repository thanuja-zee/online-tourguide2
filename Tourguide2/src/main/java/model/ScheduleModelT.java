package model;

import java.sql.Date;

public class ScheduleModelT {
	private int schedule_id;
	private int guide_id;
	private Date tour_date;
	private String location;   
	private String description;
	private String status;
	
	
	
	public ScheduleModelT(int schedule_id, int guide_id, Date tour_date, String location, String description,
			String status) {
		super();
		this.schedule_id = schedule_id;
		this.guide_id = guide_id;
		this.tour_date = tour_date;
		this.location = location;
		this.description = description;
		this.status = status;
	}
	public int getSchedule_id() {
		return schedule_id;
	}
	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}
	public int getGuide_id() {
		return guide_id;
	}
	public void setGuide_id(int guide_id) {
		this.guide_id = guide_id;
	}
	public Date getTour_date() { 
		return tour_date;
	} 
	public void setTour_date(Date tour_date) {
		this.tour_date = tour_date;
	}      
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
