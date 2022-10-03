package lambdaExam;

public class Tv01 {
        //객체생성 (tv의속성) /인스턴스 변수 
        String color;           //색상
        boolean power;          //전원 상태 (on/off)
        int channel;            //채널
        
        //메서드  (tv의 기능)
        void power() {
                    power = !power;      // on or off 기능
        }
        
        void channelUp() {
            ++channel;                   //채널 높이는 기능
        }
        
        void channelDown() {
            --channel;                   //채널 낮추는 기능
        }
        
    public static void main(String[] args) {
        //변수 선언
        Tv01 t = new Tv01();
        Tv01 t1 = new Tv01();
        Tv01 t2 = new Tv01();
        
        
        System.out.println("t1의 채널은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널은 " + t2.channel + "입니다.");
                
        
        t.channel= 7;
        t.channelUp();
        t1.channel =10 ;
        t2 = t1;
        
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
        System.out.println("t1의 현재 채널은 " + t1.channel + "입니다.");
        System.out.println("t2의 현재 채널은 " + t2.channel + "입니다.");
        
    }

}
