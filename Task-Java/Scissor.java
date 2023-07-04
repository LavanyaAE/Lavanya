class Scissor
{
    String brand;
    double price;
    String color;
    String type;
    String usage;
    char Size;
    String material;
    
Scissor(String name)
{
      System.out.println(name);
      System.out.println("Name of the Scissor is "+name);
      this.name=name; 
}
Scissor(String name, double price)
{
      System.out.println("Name of the Scissor is "+name);
      System.out.println("Price of the Scissor is "+price);
      this.name=name;
      this.price=price;
}
    
Scissor(String name, int price, String color)
{
      System.out.println("Name of the Scissor is "+name);
      System.out.println("Price of the Scissor is "+price);
      System.out.println("Color of Scissor is  "+color);
      this.name=name;
      this.color=color;
      this.price=price;
}
    
Scissor(String name, int price, String color, String type)
{
      System.out.println("Name of the Scissor is "+name);
      System.out.println("Price of the Scissor is "+price);
      System.out.println("Color is "+color);
      System.out.println("Type is  "+type);
      this.name=name;
      this.color=color;
      this.price=price;
      this.type=type;
}
    
Scissor (String name, int price, String color, String type, String usage)
{
      System.out.println("Name of the Scissor is "+name);
      System.out.println("Price of the Scissor is "+price);
      System.out.println("Color is "+color);
      System.out.println("Type is  "+type);
      System.out.println("usage  "+usage);
      this.name=name;
      this.color=color;
      this.price=price;
      this.type=type;
      this.usage=usage;
}
Scissor (String name, int price, String color, String type, String usage,String material)
{
        System.out.println("Name of the Scissor is "+name);
        System.out.println("Price of the Scissor is "+price);
        System.out.println("Color is "+color);
        System.out.println("Type is  "+type);
        System.out.println("usage  "+usage);
        System.out.println("material "+material);
        this.name=name;
        this.color=color;
        this.price=price;
        this.type=type;
        this.usage=usage;
        this.material=material;
}
    
Scissor (String name, int price, String color, String type, String usage,String material,char Size)
{
            System.out.println("Name of the Scissor is "+name);
            System.out.println("Price of the Scissor is "+price);
            System.out.println("Color is "+color);
            System.out.println("Type is  "+type);
            System.out.println("usage  "+usage);
            System.out.println("material "+material);
            System.out.println("size "+size);
            this.name=name;
            this.color=color;
            this.price=price;
            this.type=type;
            this.usage=usage;
            this.material=material;
            this.size=size;
}
  
  
  
  