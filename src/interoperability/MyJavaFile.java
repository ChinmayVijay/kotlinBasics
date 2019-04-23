package interoperability;

public class MyJavaFile {

    public static void main(String[] args) {
        int sum = MyCustomFileName.add(4,5);
        System.out.println(sum);

        int vol = MyCustomFileName.findVolume(4,3);
        System.out.println(vol);

        System.out.println(MyCustomFileName.findVolume(5,6,7));
    }

    public static int add(int a, int b){
        return a+b;
    }

}
