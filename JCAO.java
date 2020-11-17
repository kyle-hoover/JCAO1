class Pet {
  private String name;
  private int age;
  private String location;
  private String type;

  public Pet() {}
      
  public Pet(String name, int age, String location) {
    this.name = "Kitty";
    this.age = 5;
    this.location = "Raleigh";
  }

  public String getName(){
    return name; 
  }

  public int getAge(){
    return age;
  }

  public String getType(){
    return type;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public void setAge(int newAge){
    this.age = newAge;
  }

  public void setLocation(String newLocation){
    this.location = newLocation;
  }
}

class Phone {
  private String name;
  private int year;
  private String company;

  public Phone() {}

  public Phone(String name, int year){
    this.name = "iPhone";
    this.year = 2018;
  }

  public Phone(String name, int year, String company){
    this.name = "Galaxy";
    this.year = 2019;
    this.company = "Samsung";
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

  public String getCompany() {
    return company;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public void setYear(int newYear){
    this.year = newYear;
  }

  public void setCompany(String newCompany){
    this.company = newCompany;
  }

  public returnString(boolean a) {
    String correct = "Boolean a is true!";
    if (a == true) {
      return correct; 
    }
  }
}
