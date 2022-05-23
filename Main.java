public class Main {
    public static void main(String[] args) {
        Hayvon h = new Ayiq();
        Mushuk m = new Mushuk();
    }
    public static void ovozQani(Hayvon hayvon){
        hayvon.ovoz();
    }
}

class Ayiq extends YirtqichHayvon{

    @Override
    public void ov() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ovoz() {
        // TODO Auto-generated method stub
        
    }
}
    

class Mushuk extends UyHayvon{

    @Override
    public void uynash() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ovoz() {
        // TODO Auto-generated method stub
        
    }
    
} 


abstract class UyHayvon extends Hayvon{
    public abstract void uynash();
}

abstract class YirtqichHayvon  extends Hayvon{
    public abstract void ov();
}

abstract class Hayvon{
    String rang;
    String hajm;
    public abstract void ovoz();
} 