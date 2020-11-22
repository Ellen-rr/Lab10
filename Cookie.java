
class Cookie {
  private int totalCookie;
  private double temperature;
  private double time;
  private boolean isBaked;


//default constructors
Cookie () {
  totalCookie = 0;
  temperature = 0.0;
  time = 0.0;
  isBaked = false;

}
//parameterized constructor
  Cookie (int aTotalCookie, double aTemperature, double aTime) {
    totalCookie = aTotalCookie;
    temperature = aTemperature;
    time = aTime;
    isBaked = false;
  }

  //getter
  int getTotalCookie(){
    return totalCookie;
  }

  double getTemperature(){
    return temperature;
  }

  double getTime(){
    return time;
  }

  boolean getIsBaked(){
    return isBaked;
  }


  //setter
  void setTotalCookie(int aTotalCookie) {
    totalCookie= aTotalCookie;
  }

  void setTemperature(double aTemperature){
    temperature=aTemperature;
  }

  void setTime(double aTime){
    time= aTime;
  }

  void setIsBaked(boolean aIsBaked){
    isBaked = aIsBaked;
  }
//method
  void bakeCookie (double theTemperature, double theTime) {
    System.out.println(totalCookie + " were baked at " +theTemperature +" F for " + theTime +" minutes");
    isBaked = true;
    temperature = theTemperature;
    time = theTime;

  }


  

}