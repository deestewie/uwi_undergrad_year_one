Exercises
[TOC]



## Exercise #1 

The class Property stores data on a real estate property.   A real estate property has:
•	A volume number (a four digit whole number, e.g. 1104)
•	A folio number (a four digit number e.g. 7532)
•	An address (use a string to store this attribute)
•	The unimproved value of the property (the value of the land itself before any building is constructed on it)
 
1.	Write a constructor for the class Property which accepts as parameters values for all attributes (in the order given above).

2.	Write the following getter (accesor) methods:
	getVolume	-	returns the volume number of the property;
	getFolio	-	returns the folio number of the property
	getValue	-	returns the unimproved value of the property
	getAddress	-	returns the address of the property
	
1.	Write the method propertyTax which calculates and returns the property tax as 1% of the unimproved value of the property.

2.	Write a toString method for the Property class using a format of your choice.

3.	Test your class to make sure that all the methods work properly. Pay special attention to the proertyTax method to ensure that it works properly. You can use the data for vacant lots from the table below to do your testing.


    Volume	Folio	Address	Description	Unimproved
    Value ($M)
    1154	3012	12 Fleet Street	Vacant lot	70,000
    1034	3120	7 Petunia Avenue	3 Bedroom House	100,000
    1136	3300	1 Plum Lane	Vacant lot	50,000
    1788	2043	3 Mona Circle	2 Bedroom House	150,000
 
 
## Exercise #2 
In addition to being a lot of land, a real estate property can also be a house as described below:
•	A house has a number of bedrooms.
•	For a house, the value of the property is the value of the land (the unimproved value) plus $50,000 for every bedroom. For example, if a property with an unimproved value of $100,000 has a 4-bedroom house on it then the property value would be calculated as $100,000 + $200,000 = $300,000.
•	For a house, property tax is calculated at 1.2% of the property value. For the property described above property tax would be $3,600.00.  

1.	Create the class House as a subclass of the Property class.
. 
2.	Write the constructor for the House class to accept volume number, folio number, address, unimproved value, and number of bedrooms (in that order) as parameters.

3.	Override the getValue method in the subclass so that the value of the property is properly calculated. 

4.	Override the propertyTax method in the subclass so that the property tax is properly calculated.

5.	Write the method sewerageCharge() that accepts no parameters and returns the sewerage charge for a house (type double) calculated as $50 per bedroom in the house.


6.	Test the House class using the data from the table above.

Discussion

Say whether or not the following statements will compile and if not state what modification would have to be made to correct the error.

```java
Property myProperty = new House(1234, 5678,”14 Old Road”,100000,5);
double fee = myProperty.propertyTax();
double other = myProperty.sewerageCharge(); 
````
