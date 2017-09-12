package assignment4.problem5;

public class Computer {
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	
	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}

	public int getRamSize() {
		return ramSize;
	}
	
	public int getDiskSize() {
		return diskSize;
	}
	
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	public double computePower() {
		return ramSize*processorSpeed;
	}

	@Override
	public String toString() {
		return "Computer [manufacturer: " + manufacturer +
				", processor: " + processor + 
				", ramSize: " + ramSize + 
				", diskSize: " + diskSize + 
				", processorSpeed: " + processorSpeed + "]";
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Computer)) return false;
		Computer com = (Computer) ob;
		if(com.manufacturer.equals(manufacturer) && com.processor.equals(processor) 
				&& com.diskSize == diskSize && com.ramSize == ramSize 
				&& com.processorSpeed == processorSpeed) return true;
		
		return false;
	}
	
	@Override
	public int hashCode() {
		int seed = 13;
		int result = 11 * seed + manufacturer.hashCode();
		result = 11 * result + processor.hashCode();
		result = 11 * result + Integer.valueOf(diskSize).hashCode();
		result = 11 * result + Integer.valueOf(ramSize).hashCode();
		result = 11 * result + Double.valueOf(processorSpeed).hashCode();
		
		return result;
	}
	
}
