public class Abstract{
    public static void main(String[] args) {
    }
}


class Nexia extends Sedan{

    @Override
    public void odamSoni() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void otKuchi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void vazni() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void uchishYonish() {
        // TODO Auto-generated method stub
        
    }
    
}

class Camaro extends Coupe{

    @Override
    public void tezligi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void otKuchi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void vazni() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void uchishYonish() {
        // TODO Auto-generated method stub
        
    }
    
}

abstract class Sedan extends YengilMashina{
    public abstract void odamSoni();
}

abstract class Coupe extends YengilMashina{
    public abstract void tezligi();
}

abstract class YengilMashina extends Mashina{
    public abstract void otKuchi();
}





class Gaz53 extends Bartovoy{

    @Override
    public void tepagaPastga() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void yukKutarish() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void vazni() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void uchishYonish() {
        // TODO Auto-generated method stub
        
    }
    
}

class Zil extends Samasvol{

    @Override
    public void harakatsiz() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void yukKutarish() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void vazni() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void uchishYonish() {
        // TODO Auto-generated method stub
        
    }

}

abstract class Bartovoy extends YukMashina{
    public abstract void tepagaPastga();
}

abstract class Samasvol extends YukMashina{
    public abstract void harakatsiz();
}

abstract class YukMashina extends Mashina{
    public abstract void yukKutarish();
}

abstract class Mashina extends Texnika{
    public abstract void vazni();
}





class Gaz extends Maishiy{

    @Override
    public void turi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void uchishYonish() {
        // TODO Auto-generated method stub
        
    }
   
}

class KirYuvish extends Maishiy{

    @Override
    public void turi() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void uchishYonish() {
        // TODO Auto-generated method stub
        
    }

}

abstract class Maishiy extends Texnika{
    public abstract void turi();
}

abstract class Texnika{
    Integer yili;
    String rang;

    public abstract void uchishYonish();
}
