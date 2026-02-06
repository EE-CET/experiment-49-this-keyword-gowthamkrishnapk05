import java.util.Scanner;

class ThisDemo {
    int value;

    // TODO: Define setValue(int value)
    // Use 'this.value = value' to resolve naming conflict
    
    // TODO: Define display() to print "Value: " + value
    void setvalue(int value)
    {
        this.value = value;
    }
    void display()
    {
        System.out.print("Value: "+value);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read the integer input
        
        // TODO: Create ThisDemo object
        // TODO: Call setValue() with the input
        // TODO: Call display()
        int value = sc.nextInt();
        ThisDemo d = new ThisDemo();
        d.setvalue(value);
        d.display();
    }
}
