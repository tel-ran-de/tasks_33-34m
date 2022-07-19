public class Main {

    public static void main(String[] args) {
	// write your code here
        Student john = new Student("John",23);
        Student mary = new Student("Mary",20,"Street1");

        System.out.println("John:");
        System.out.println("name "+john.name+" ,age "+john.age);

        System.out.println("Mary:");
        System.out.println("name " + mary.name + " ,age "+mary.age+" ,address "+mary.address);

        Rectangle rectangle=new Rectangle(3,4);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Main main = new Main();
        System.out.println(main.helloName("Evgeny"));
        System.out.println(main.joinStrings("hi","bye"));
        System.out.println(main.firstTwoCapitals("hello"));
        System.out.println(main.secondThirdLetters("hello"));

    }

    //1. написать метод, принимающий имя и возвращающий  строку "Hello <имя> !"
    // public String helloName(String name) ->"Hello <name> !"
    public  String helloName(String name){

        String result= "Hello "+name+" !";

        return result;
    }

    //2.Написать метод,принимающий две строки и возвращающий их в таком виде:
    // public String joinStrings(String a, String b)-> abba
    public String joinStrings(String a, String b){
        String result= a+b+b+a;
        return result;
    }

    //3. Написать метод, возвращающий первые два символа строки заглавными буквами
    // (hello->HE)

    public String firstTwoCapitals(String string){
        String result= string.substring(0,2).toUpperCase();
        return result;
    }

    //4.Написать метод, возвращающий второй и третий символы строки ( Hello-> el)
    public String secondThirdLetters(String string){
        return string.substring(1,3);
    }

    //5.Написать метод, возвращающий целое число, равное двойной длине строки

    //6.Написать метод, принимающий строку четной длины и возвращающий половину
    // этой строки (Hell->He)

    //7.Даны две строки. Написать метод, возвращающий строки, соединенные вместе,
    // но без первых букв и большими буквами ("Hello","There"-> "ELLOHERE"

    //8.Написать метод, принимающий строку и


}
