package Algorithm.easy;

public class defangIPaddr {
    public String defangIPaddr(String address) {
        String[] addressArray = address.split("");
        StringBuffer sr = new StringBuffer();
        String  a= ".";
        for(int i=0;i<addressArray.length;i++){
            if(addressArray[i].equals(a)){
                addressArray[i]="[.]";
            }
            sr.append(addressArray[i]);
        }
        return sr.toString();
    }

    public static void main(String[] args) {
        defangIPaddr de = new defangIPaddr();
        String a = "1.1.1.1.1";
        //simple solutions
        System.out.println(a.replace(".","[.]"));
        System.out.println(de.defangIPaddr("1.1.1.1.1"));
    }
}
