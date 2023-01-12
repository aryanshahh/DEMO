package polymorphism;

class car {
    public void engine(){
        System.out.println("The Engine list of super car");
    }
}

  class main{
      public static void main(String[] args) {
          car mycar= new car();
          car BMW = new BMW();
          car Ferrari= new Ferrari();
          mycar.engine();
          BMW.engine();
          Ferrari.engine();
      }
  }
