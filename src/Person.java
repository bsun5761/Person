import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Person {
    private String name;
    private String hobby;
    private String zodiac;

    public Person() {
        name = "";
        hobby = "";
        zodiac = "";
    }

    public Person(String name, String hobby, String zodiac) {
        this.name = name;
        this.hobby = hobby;
        this.zodiac = zodiac;
    }

    public String getName() {
        return name;
    }

    public String getHobby() {
        return hobby;
    }

    public String getZodiac() {
        return zodiac;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }

    public String greet() {
        if (name.equals("") && hobby.equals("") && zodiac.equals("")) {
            return "Hello! Please introduce yourself!";
        }
        else {
            return "Name: " + name + "\n" + "Hobby: " + hobby + "Zodiac: " + zodiac;
        }
    }

    // This method saves the Person object's state to a file
    // (this "persisting it" so it can be loaded the next time
    // the program is run)
    public void save() {
        try {
            File f = new File("src/person.data");
            f.createNewFile(); // this method will create the file if it does not exist; if it does exist, it does nothing
            FileWriter fw = new FileWriter("src/person.data");
            fw.write(name + "\n");
            fw.write(hobby);
            fw.write(zodiac);
            fw.close();
            System.out.println("Data saved!");
        }
        catch (IOException e) {
            System.out.println("Unable to create file");
            System.out.println(e.getMessage());
        }
    }
}