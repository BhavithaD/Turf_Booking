package Turf_booking.Spring_Boot.dto;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component

public class Maintainance {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		 private int id;
	 	 LocalDateTime datetime;
	 	 private int noofproductcollection;
	 	 private boolean productstatus;
	 	 private boolean isCleaned;
	 	 
	 	//getters and setters
 	 	 
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public LocalDateTime getDatetime() {
			return datetime;
		}
		public void setDatetime(LocalDateTime datetime) {
			this.datetime = datetime;
		}
		public int getNoofproductcollection() {
			return noofproductcollection;
		}
		public void setNoofproductcollection(int noofproductcollection) {
			this.noofproductcollection = noofproductcollection;
		}
		public boolean isProductstatus() {
			return productstatus;
		}
		public void setProductstatus(boolean productstatus) {
			this.productstatus = productstatus;
		}
		public boolean isCleaned() {
			return isCleaned;
		}
		public void setCleaned(boolean isCleaned) {
			this.isCleaned = isCleaned;
		}
		@Override
		public String toString() {
			return "Maintainance [id=" + id + ", datetime=" + datetime + ", noofproductcollection="
					+ noofproductcollection + ", productstatus=" + productstatus + ", isCleaned=" + isCleaned + "]";
		}
		
		
	 	 
	 	 
	 	 
	 	 
	 	 
	 	 
	
		
}
