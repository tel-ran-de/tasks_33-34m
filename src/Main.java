public class Main {

    public static void main(String[]  args) {
 /*       Scanner sc = new Scanner(System.in);
	// write your code here
        System.out.println("Enter the string: ");
        String name = sc.nextLine();

        System.out.println("Enter Gender: ");
        char gender = sc.next().charAt(0);

        System.out.println("Enter Age: ");
        int age = 0;

        if (sc.hasNextInt()) {
         age = sc.nextInt();
        } else {
            System.out.println("Sorry you entered not a Number");
            age=0;
         //   sc.next();
        }

        System.out.println("Enter the mobile phone:");
        Object object=sc.next();
      //  long phone = sc.nextLong();
        System.out.println(object.toString());*/


//создать класс Giraffe и обьявить 5 различных конструкторов
// 1.  самый простой контструктор содержит один параметр name
// 2. конструктор, имеющий name and  age. weight для всех жирафов будет одинаковый
 // 3. В третьем добавляется weight жирафа   name age weight
 // 4.weight, color (name, address, and age неизвестны)
 //5. weight,color, address

 //есть обязательные параметры для конструкторов 2-5 : возраст, вес,цвет.
        // Они присутствуют у всех создаваемых жирафов
        // и есть не обязательные : имя и адрес
    Giraffe giraffe1=new Giraffe("John");
   //     System.out.println("Giraffe1 name is "+giraffe1.name);

    Giraffe giraffe2=new Giraffe("Jack",4);
        System.out.println("Giraffe 2: ");
        System.out.println("name: "+giraffe2.name+
                           " age: "+giraffe2.age+
                           " weight: "+giraffe2.weight+
                            " colour: "+giraffe2.colour+
                           " address: "+giraffe2.address);


    Giraffe giraffe3= new Giraffe("Mary",5,60);
        System.out.println("Giraffe 3: ");
        System.out.println("name: "+giraffe3.name+
                " age: "+giraffe3.age+
                " weight: "+giraffe3.weight+
                " colour: "+giraffe3.colour
               );

    Giraffe giraffe4= new Giraffe(300,"Red");
        System.out.println("Giraffe 4: ");
        System.out.println("name: "+giraffe4.name+
                " weight: "+giraffe4.weight+
                " colour: "+giraffe4.colour+
                " age: "+giraffe4.age
        );


    Giraffe giraffe5 = new Giraffe(150,"Green","Berlin Zoo");
        System.out.println("Giraffe 5: ");
        System.out.println(
                " weight: "+giraffe5.weight+
                " colour: "+giraffe5.colour+
                " age: "+giraffe5.age+
                " address: " +giraffe5.address
        );

     //   Cat cat1= new Cat()
    }


}
