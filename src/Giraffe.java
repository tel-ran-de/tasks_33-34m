public class Giraffe {
    public String name;
    public int age;
    public int weight;
    public String address;
    public String colour;

//создать класс Giraffe и обьявить 5 различных конструкторов
// 1.  самый простой контструктор содержит один параметр name
// 2. конструктор, имеющий name and  age. weight для всех жирафов будет одинаковый
    // 3. В третьем добавляется weight жирафа   name age weight
    // 4.weight, color (name, address, and age неизвестны)
    //5. weight,color, address

    //есть обязательные параметры для конструкторов 2-5 : возраст, вес,цвет.
    // Они присутствуют у всех создаваемых жирафов
    // и есть не обязательные : имя и адрес



    public Giraffe (String name){
        this.name=name;
        System.out.println("Giraffe's name is "+this.name);
    }

    public Giraffe (int address){}

    public Giraffe (String name,int age){
        this.name=name;
        this.age=age;
        this.weight=100;
        this.colour="Yellow";
    }

    public Giraffe (String name,int age,int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.colour="White";
    }

    public Giraffe ( int weight, String colour){
        this.weight=weight;
        this.colour=colour;
        this.age=2;
    }

    public Giraffe (int weight,String colour,String address){
        this.weight=weight;
        this.colour=colour;
        this.address=address;
        this.age=35;
    }


}
