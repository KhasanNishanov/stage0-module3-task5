package lang.print.gaps.task5;

public class TimeConvertor {  //1
    public void convert(float minutes) {
         minutes *= 60;
        System.out.println(minutes);
    }

    public static void main(String[] args) {
        TimeConvertor timeConvertor = new TimeConvertor();
        timeConvertor.convert(11.5f);
    }
}
