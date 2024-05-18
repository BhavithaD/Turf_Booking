package Turf_booking.Spring_Boot.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component

public class Games {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int circket;
	private int football;
	private int tennis;
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCircket() {
		return circket;
	}
	public void setCircket(int circket) {
		this.circket = circket;
	}
	public int getFootball() {
		return football;
	}
	public void setFootball(int football) {
		this.football = football;
	}
	public int getTennis() {
		return tennis;
	}
	public void setTennis(int tennis) {
		this.tennis = tennis;
	}
	@Override
	public String toString() {
		return "Games [id=" + id + ", circket=" + circket + ", football=" + football + ", tennis=" + tennis + "]";
	}
	
	
	

}
