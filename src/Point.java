public class Point{
    int first;
    int second;
    int third;
    String name;
    String secName;
    Point(int first, int second, int third, String name, String secName){
        this.first = first;
        this.second = second;
        this.third = third;
        this.name = name;
        this.secName = secName;
    }
    public int average(){
        return (first + second + third)/3;
    }
}
