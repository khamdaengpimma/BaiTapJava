package Person;

public class PersonTest {
    public static void main(String[] args){
        Person s1 = new Student("Kham",20,"dong hoi",8.9);
        Person s2 = new Student("daeng",21,"dong hoi",5.0);
        Person s3 = new Student("phim",22,"khammouane",7.6);
        Person t1 = new Teacher("jonh",28,"london",10000000);
        Person t2 = new Teacher("khon",37,"Laos",15000000);
        Person t3 = new Teacher("paolishu",48,"trung quoc",20000000);
        Person[] list = {s1,s2,s3,t1,t2,t3};
        for(Person i:list){
            i.display();
            System.out.println();
        }
    }
}
