package thepawsshop;

public class ThePawsShop {

    public static void main(String[] args) {
        LoadingPage loading = new LoadingPage();
        loading.setVisible(true);
        
        try{
            for(int x=0; x<=100; x++){
                Thread.sleep(50);
//                loading.lblloading.setText(Integer.toString(x) + "%");
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
