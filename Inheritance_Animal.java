class Animal {
    protected String type;
    private String color;
 
    public void eat() {
       System.out.println("I can eat");
    }
 
    public void sleep() {
       System.out.println("I can sleep");
    }
 
    public String getColor(){
       return color;
    }
 
    public void setColor(String col){
       color = col;
    }
 }
 
 class Dog extends Animal {
    public void displayInfo(String c){
       System.out.println("I am a " + type);
       System.out.println("My color is " + c);
    }
    
    @Override
    public void eat(){
      System.out.println("I can only eat dog food");
    }
    public void bark() {
       System.out.println("I can bark");
    }
 }
 
 class Main {
    public static void main(String[] args) {
 
       Dog dog1 = new Dog();
       dog1.eat();
       dog1.sleep();
       dog1.bark();
  
       dog1.type = "mammal";
       dog1.setColor("black");
       dog1.displayInfo(dog1.getColor()); 
    }
 }