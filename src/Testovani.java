public class Testovani {
    private String text = "";
    private StringBuffer sb = new StringBuffer("");
    private Long casovac;


    public void string(){
        casovac = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            text = text + "x";
        }
        Long l = (System.currentTimeMillis() - casovac) * 1000;
        System.out.println("String Trvalo: " + l);
    }

    public void buff(){
        casovac = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("x");
        }
        Long l = (System.currentTimeMillis() - casovac) * 1000;
        System.out.println("StringBuffer Trvalo: " + l);
    }
}
