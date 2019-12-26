package stream.serialization;

import java.io.*;

class Person implements Serializable /*직렬화 가능하다 선언*/  {
    String name;
    transient String job; //transient  이 변수는 그대로 직렬화 하지 마라

    //Constructor
    public Person(String name, String job){
        this.name = name;
        this.job = job;
    }

    //toString
    public String toString(){
        return name + "," + job;
    }
}

public class SerializationTest {
    public static void main(String[] args) {

        // Instance 생성
        Person personLee = new Person("이순신", "엔지니어");
        Person personKim = new Person("김유신", "선생님");

        //file 에 저장
        try(FileOutputStream fos = new FileOutputStream("serial.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);){

            oos.writeObject(personLee);
            oos.writeObject(personKim);
        } catch (IOException e){
            System.out.println(e);
        }

        try(FileInputStream fis = new FileInputStream("serial.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);){

            Person p1 = (Person)ois.readObject();
            Person p2 = (Person)ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        } catch (IOException e ){
            System.out.println(e);
        } catch (ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
