class Main {
  public static void main(String[] args) {
    Sugar tree = new Sugar("Tree", false);
    tree.cutCookie(tree.getShape(), 10);
    tree.bakeCookie(350, 12);
    tree.decorateCookie();
    
    Sugar aCookie = new Sugar();
    aCookie.decorateCookie();





  }

}