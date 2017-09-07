package assignment2.problem2;

import java.time.LocalDate;
import java.time.Period;

/**
 * Assignment 2 Problem 2
 * @author Neeman
 *
 */
public class HeartRates {
	private String fname, lName;
	private LocalDate dob;
	
	private final int rhr = 70;
	private final int maxHR = 220;
	private final float lowerBoundry = 0.5f;
	private final float upperBoundry = 0.85f;
	
	public HeartRates(String fname, String lName, LocalDate dob) {
		super();
		this.fname = fname;
		this.lName = lName;
		this.dob = dob;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	// calculate age
	public int getAge() {
		LocalDate today = LocalDate.now();
        return Period.between(this.dob, today).getYears();
	}
	
	// calculate maximum heart rate
	public Integer getMaxmimumHeartRate() {
		return maxHR - this.getAge();
	}
	
	// calculate average heart rate
	public Integer getAverageHeartRate() {
		return this.getMaxmimumHeartRate() - rhr;
	}
	
	// calculate range of heart beat
	public String getheartRateRange() {
		float lbthr = this.getAverageHeartRate()*lowerBoundry + rhr;
		float ubthr = this.getAverageHeartRate()*upperBoundry + rhr;
		
		return lbthr + " - " + ubthr;
	}

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lName=" + lName + ", dob=" + dob + ", getAge()=" + getAge()
				+ ", getMaxmimumHeartRate()=" + getMaxmimumHeartRate() + ", getheartRateRange()=" + getheartRateRange() + "]";
	}
	
	
	
}
