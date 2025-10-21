package myPackage1;
interface CollegeInfo{
    void showName();
    void showAdd();
}
public class AnonymousExample {
    public static void main(String[] args){
        CollegeInfo obj = new CollegeInfo() {
            @Override
            public void showName() {
                System.out.println("College Name    : M.P.C.P.S");
            }

            @Override
            public void showAdd() {
                System.out.println("College Address : Kanpur ,Mandhand (Utter-Pradesh)");
            }
        };
        obj.showName();
        obj.showAdd();
    }
}
