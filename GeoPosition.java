package lab1.geoPosition;

public class GeoPosition {

	private double latitude;
	private double longitude;

	public GeoPosition(double latitude, double longitude) { 
		this.latitude = latitude;
		this.longitude = longitude;

	}

	public double getLatitude() {  // get this was added to get values from private latitude and longitude 
		return this.latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	@Override
	public String toString() {  
		
		return "(" + this.latitude + ", " + this.longitude + ")";
	}

	public boolean isNorthernHemisphere() {
		if (this.latitude >= 0)
			return true;
		else
			return false;

	}

	public boolean isSouthernHemisphere() { //boolean to identify if it's in the north or south, and we decided that equator(latitude= 0) is part of North 
		if (this.latitude < 0)
			return true;
		else
			return false;
	}

	private static double degToRad(double deg) {  // we can actually use math.radians instead of having a separate function
		return deg * Math.PI / 180;
	}

	public static double localDistanceInKm(GeoPosition a, GeoPosition b) { // local distance giving in PDF 
		
		double dY = 111.3 * Math.abs(a.latitude - b.latitude);// Δ𝑦=111,3∙|𝑙𝑎𝑡1−𝑙𝑎𝑡2|
		
		double dX = 111.3 * Math.cos(degToRad((a.getLatitude() + b.getLatitude())) / 2)   //  Δ𝑥=111,3∙cos(𝑙𝑎𝑡1+𝑙𝑎𝑡22)∙|𝑙𝑜𝑛1−𝑙𝑜𝑛2|
				
				* Math.abs(a.longitude - b.longitude);
		
		return Math.sqrt(dX * dX + dY * dY); // 𝑑=√Δ𝑥2+Δ𝑦2
	}

	public double distanceInKm(GeoPosition other) {
		return GeoPosition.distanceInKm(this,other); // Uses the same formula as below, with this as using the object 
	}

	public static double distanceInKm(GeoPosition a, GeoPosition b) { // formula from the PDF to which uses two parameters
		return 6378.388 * Math.acos(Math.sin(degToRad(a.getLatitude())) * Math.sin(degToRad(b.getLatitude()))
				+ Math.cos(degToRad(a.getLatitude())) * Math.cos(degToRad(b.getLatitude()))
						* Math.cos(degToRad(b.getLongitude() - a.getLongitude())));
	}

}
