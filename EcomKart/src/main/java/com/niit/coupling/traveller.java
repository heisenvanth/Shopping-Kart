package com.niit.coupling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class traveller {
@Autowired
private Vehicle vehicle;
public String getTravelDetails()
{
	return vehicle.modeOfTransport();
}
public Vehicle getVehicle() {
	return vehicle;
}
public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}
}
