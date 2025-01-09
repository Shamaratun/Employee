package twentyFifth;

public class ObjectSelf {
    String name,gender,address;
    int phone,age;
    ObjectSelf( String name ,String address,int age){
        this.name=name;
        this.      address =address;
        this.age=age;
        this.gender="not specified";
        this.phone=0;
    }
     void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
        System.out.println("Phone :"+phone);
        System.out.println("Age: "+age);


    }
}
