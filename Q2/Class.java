public class SignedText{
    private String fN;
    private String lN;

    public SignedText(String n1;String n2){
        fN = n1;
        lN = n2;
    }

    public String getSignature(){
        if(fN.equals("")){
            return lN;
        }
        return fN.substring(0,1)+"-"+lN;
    }

    public String addSignature(String text){
        String r = "";
        if(getSignature().equals(text) == -1){
             r = text + getSinature();
        }
        if(getSignature().indexOf(text) == 0){
             r = getSignature();
        }

        if(text.indexOf(getSignature()) == 0){
             r = text.substring(getSignature().length())+getSignature();
        }
        return r;
    }
}
