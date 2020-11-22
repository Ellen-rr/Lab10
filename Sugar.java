//sugar(child)-->cookie(parents)
class Sugar extends Cookie {
  private String shape;
  private boolean isDecorated;

  //default constructor
  Sugar (){
    super();
    shape="";
    isDecorated = false;
  }
  //parameter constructor
  Sugar (String aShape, boolean aIsDecorated) {
    shape = aShape;
    isDecorated =aIsDecorated;
  }
  
  //getter
  String getShape(){
    return shape;
  }

  boolean getIsDecorated(){
    return isDecorated;
  }

  //setter
   void setShape(String aShape) {
    shape = aShape;
  }

  void setisDecorated(boolean aIsDecorated) {
    isDecorated = aIsDecorated;
  }

  void cutCookie(String theShape, int cutNumber){
    System.out.println(cutNumber + " cookies to cut into " + theShape);
    setTotalCookie(cutNumber);
    

  }
  void decorateCookie() {
  if (super.getIsBaked()) {
    System.out.println("The cookies were decorated");
    isDecorated=true;

}
  else {
    System.out.println("Make sure to bake the cookies first");
}
  }



  








}