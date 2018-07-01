package com.openyogaland.denis.openyoga;

import com.google.android.gms.maps.model.LatLng;

/**
 * Condeferate class represents a person who has something common with us, i.e.
 * our friend, somebody whom we can trust
 */
public class Confederate
{
  /**
  * fields - variables - attributes and properties
  **/
  private FullName fullName;
  private String   address;
  private LatLng   coordinates;
  
  //constructor
  public Confederate(String address)
  {
    fullName = new FullName("");
    this.address = address;
  }
  
  public Confederate(FullName fullName)
  {
    this.fullName = fullName;
  }
  
  // constructor
  public Confederate(LatLng coordinates)
  {
    fullName = new FullName("");
    this.coordinates = coordinates;
  }
  
  public Confederate(FullName fullName, String address)
  {
  
    this(fullName);
    this.address = address;
  }
  
  public Confederate(FullName fullName, String address, LatLng coordinates)
  {
    this(fullName, address);
    this.coordinates = coordinates;
  }
  
  // getter
  public FullName getFullName()
  {
    return fullName;
  }
  
  // setter
  public void setFullName(FullName fullName)
  {
    this.fullName = fullName;
  }
  
  // getter
  public String getAddress()
  {
    return address;
  }
  
  // setter
  public void setAddress(String address)
  {
    this.address = address;
  }
  
  // getter
  public LatLng getCoordinates()
  {
    return coordinates;
  }
  
  // setter
  public void setCoordinates(LatLng coordinates)
  {
    this.coordinates = coordinates;
  }
}
    