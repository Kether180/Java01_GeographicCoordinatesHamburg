# Java01_GeographicCoordinatesHamburg

                                                        Java Praktikum Lab 1 
                                                  Geographic Coordinates Hamburg
 
 
1.1 Geographic Coordinates and Distances: 
1.2 Latitude and Longitude
▪ Latitudes are parallel to the equator. The range of values includes -90° ("southern latitude") at the South Pole to 90° ("northern latitude") at the North Pole.  
▪ Longitudes run through the North Pole and the South Pole. The range of values includes  -180° ("west longitude") to 180° ("east longitude"). The so-called zero meridian (longitude 0°) passes through the town of Greenwich in England. 

Notes:
▪ Note that the x- and y-components are reversed compared to conventional coordinates.
▪ In Google Maps, you get the geographic coordinates by clicking on a location.

2.1 Local Distance Calculation  
In the following, we want to determine the distance between two places on the earth's surface.
If two places are relatively close together, one can approximately neglect the curvature of the earth:    

▪ Determine the distances using of latitude and longitude in km.  
▪ From this, calculate the direct distance through the theorem of Pythagoras. 
▪ Dividing the circumference of the earth in 360°, so 1° corresponds to about 111.3 km.

Since the distance between neighboring latitudes is the same everywhere on the earth, a difference of 1° latitude corresponds to 111.3 km. The distance between two latitudes 𝑙𝑎𝑡1 and 𝑙𝑎𝑡2 in km is therefore: 


                                     Δ𝑦=111,3∙|𝑙𝑎𝑡1−𝑙𝑎𝑡2|  

The distance between neighboring longitudes depends on the latitude of the places. At the equator (0° latitude), the distance is 111.3 km. Towards the poles, the longitudes converge and the distance becomes smaller (Fig. 2). At the north and south poles, the longitudes intersect, so there corresponds to the distance 0 km. This is expressed in the following formula by the cosine giving 0 at the equator (0° latitude) and 0 at the poles (±90° latitude). The argument used is the mean of the latitudes of both places: 


                                Δ𝑥=111,3∙cos(𝑙𝑎𝑡1+𝑙𝑎𝑡22)∙|𝑙𝑜𝑛1−𝑙𝑜𝑛2| 


▪ Overall, the distance d in km between two geographic locations 𝑔1 and 𝑔2 is:  𝑑=√Δ𝑥2+Δ𝑦2  

2.2 Distance Calculation on the Globe 
For a more precise calculation of the distance between two places on the earth's surface, the following formula is given without derivation3. Here, the factor 6378,388 km corresponds to the earth's radius. 

                     𝑑=6378,388∙arccos(sin𝑙𝑎𝑡1∙sin𝑙𝑎𝑡2+cos𝑙𝑎𝑡1∙cos𝑙𝑎𝑡2∙cos(𝑙𝑜𝑛2−𝑙𝑜𝑛1)) 

3 Class GeoPosition  
There is a class GeoPosition to be created that allows to represent geographic coordinates. The class is basically described by the adjacent UML symbol. In the box below the class name, the attributes are given with the respective data type. A minus sign indicates that the modifier private is to be used. The lower section lists the methods with parameter lists and after the colon the data type of their return value. Underlined elements are class methods. 



3.2 Attributes, Constructors and Getter  
▪ Requirement 1 The class has private variables called latitude and longitude to store latitude and longitude, respectively. Both variables are of type double.      

▪ Requirement 2 There is a constructor with two double parameters that assigns the passed parameter values to the attributes. (Hint: Use the menu item "Source / Generate ..." in Eclipse to have the method generated automatically.)   

▪ Requirement 3 There are getter methods that return the value of latitude and longitude, respectively. (Also have these methods automatically generated in Eclipse.)  

Declarations:          ▪ public GeoPosition(double latitude, double longitude)
                       ▪ public double getLatitude() 
                       ▪ public double getLongitude() 
                
                
3.3 Query of the Hemisphere     

▪ Requirement 4 There are methods to query if a geographic location is in the northern or southern hemisphere. 

Declarations:         ▪ public boolean isNorthernHemisphere()
                      ▪ public boolean isSouthernHemisphere() 


3.4 Distances between two Geographic Locations 
▪ Requirement 5 There are two class methods to calculate the distance (linear) between two locations that are passed as parameters. In both cases, the distance is returned in kilometers. The method localDistanceInKm() uses for the calculation the approach presented in Section Fehler! Verweisquelle konnte nicht gefunden werden.. The methods distanceInKm() uses the more accurate approach presented in Section Fehler! Verweisquelle konnte nicht gefunden werden.. 

▪ Requirement 6 There is a non-static method distanceInKm(), that calculates the distance to a location passed as parameter. The calculation follows the approach presented in Section Fehler! Verweisquelle konnte nicht gefunden werden.. 

Notes:  ▪ For mathematical functions use the methods provided by the class Math.
        ▪ Please consider that the trigonometric functions expect angles to be in radian (not in degree).

Declarations:      ▪ public static double localDistanceInKm(GeoPosition a, GeoPosition b) 
                   ▪ public static double distanceInKm(GeoPosition a, GeoPosition b) 
                   ▪ public double distanceInKm(GeoPosition other) 
               
              
3.5 Method toString() 
▪ Requirement 7 The class has a method toString() that returns a string formatted as follows: (, ). (Hint: Let the structure of this method be automatically generated by Eclipse.) 

Declarations:      ▪ public String toString()  

3.6 Unit-Tests 

▪ Requirement 8 Ensure that all given Unit-tests are executed properly. 

4.1 Distances  
Create an executable class GeoApp (i.e. an executable application), that displays in the console the distance from the HAW Hamburg to all locations given by the following table. For determining the distances use both the local and the accurate approach and enter the results in the table. Additionally, add the deviation of the local and the accurate approach.
