package com.openyogaland.denis.openyoga;

class FullName
{
  /**
   * fields - variables - properties and attibutes
   */
  private String firstName;
  private String lastName;
  // pseudonym
  private String alias;
  
  /**
   * methods - functions - procedures
   */
  FullName(String name)
  {
    this.firstName = name;
  }
  
  FullName(String firstName, String lastName)
  {
    this(firstName);
    this.lastName = lastName;
  }
  
  FullName(String firstName, String secondString, boolean isAlias)
  {
    this.firstName = firstName;
    if(isAlias)
    {
      this.alias = secondString;
    }
    else
    {
      this.lastName = secondString;
    }
  }
  
  FullName(String firstName, String lastName, String alias)
  {
    this.firstName = firstName;
    this.lastName  = lastName;
    this.alias     = alias;
  }
  
  FullName(FullName fullName)
  {
    this.firstName = fullName.getFirstName();
    this.lastName  = fullName.getLastName();
    this.alias     = fullName.getAlias();
  }
  
  /**
   * setter
   * @param firstName
   */
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }
  
  /**
   * setter
   * @param lastName
   */
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }
  
  /**
   * setter
   * @param alias
   */
  public void setAlias(String alias)
  {
    this.alias = alias;
  }
  
  /**
   * getter
   * @return String firstName
   */
  public String getFirstName()
  {
    return firstName;
  }
  
  /**
   * getter
   * @return String lastName
   */
  public String getLastName()
  {
    return lastName;
  }
  
  /**
   * getter
   * @return String alias
   */
  public String getAlias()
  {
    return alias;
  }
  
  @Override
  public String toString()
  {
    return "FullName{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
           + ", alias='" + alias + '\'' + '}';
  }
}

