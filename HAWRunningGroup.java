package lab2.geoPosition;

import lab1.geoPosition.GeoPosition;

public class HAWRunningGroup {
public static GeoRoute createAlsterRoute3() {
	        GeoRoute route = new GeoRoute("City Park");

	        route.addWaypoint(new GeoPosition(53.5984201,10.0047147));
	        route.addWaypoint(new GeoPosition(53.5982148,10.00535));
	        route.addWaypoint(new GeoPosition(53.5991585,10.0289284));
	        route.addWaypoint(new GeoPosition(53.5998334,10.0286495));
	        route.addWaypoint(new GeoPosition(53.5964599,10.0278354));
	        route.addWaypoint(new GeoPosition(53.5936096,10.0108892));
	        route.addWaypoint(new GeoPosition(53.598328,10.0048685));
	        route.addWaypoint(new GeoPosition(53.5955901,10.0088169));
	        return route;
	  }
	   
	    public static void main(String[] args) {
	        GeoRoute binnenalster = RouteData.createAlsterRoute1();
	        GeoRoute aussenalster = RouteData.createAlsterRoute2();
	        GeoRoute cityPark     = createAlsterRoute3();
	        
	        
	        //
	       
	        System.out.println(binnenalster);
	        System.out.println(aussenalster);
	        System.out.println(cityPark);

	    }
	    
	 
		
	}

