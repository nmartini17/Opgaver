import java.util.Collections;

public class MainController {
    GetList gl = new GetList();

    public void runProgram() {
    gl.addStringToList(gl.stringArrayList, "Abe");
        gl.addStringToList(gl.stringArrayList, "Hval");
        gl.addStringToList(gl.stringArrayList, "Krokodille");
        gl.addStringToList(gl.stringArrayList, "Flodhest");
        gl.addStringToList(gl.stringArrayList, "Dovendyr");
        Collections.sort(gl.stringArrayList);
        System.out.println(gl.stringArrayList);
    }
}
