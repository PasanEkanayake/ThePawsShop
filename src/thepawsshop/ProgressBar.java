package thepawsshop;

public class ProgressBar {
    
    public void Progress(){
        LoadingPage loading = new LoadingPage();
        loading.setVisible(true);
        
        try{
            for(int x=0; x<=100; x++){
                Thread.sleep(50);
                loading.jProgressBar1.setValue(x);
            }
            
            StartPage start = new StartPage();
            start.setVisible(true);
            loading.setVisible(false);
        }
        catch (Exception ex){
            
        }
    }
    
}
