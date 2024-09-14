import utils.HammingUtils;
import utils.SimHashUtils;

public class MainPaperCheck {

    public static void main(String[] args) {
        // 从命令行输入的路径名读取对应的文件，将文件的内容转化为对应的字符串
        String str0 = TxtIOUtils.readTxt("src/main/TestText/orig.txt");
        String str1 = TxtIOUtils.readTxt("src/main/TestText/orig_0.8_add.txt");
        String str2 = TxtIOUtils.readTxt("src/main/TestText/orig_0.8_del.txt");
        String str3 = TxtIOUtils.readTxt("src/main/TestText/orig_0.8_dis_1.txt");
        String str4 = TxtIOUtils.readTxt("src/main/TestText/orig_0.8_dis_10.txt");
        String str5 = TxtIOUtils.readTxt("src/main/TestText/orig_0.8_dis_15.txt");

        String resultFileName = "src/main/TestText/res.txt";
        // 由字符串得出对应的 simHash值
        String simHash0 = SimHashUtils.getSimHash(str0);
        String simHash1 = SimHashUtils.getSimHash(str1);
        String simHash2 = SimHashUtils.getSimHash(str2);
        String simHash3 = SimHashUtils.getSimHash(str3);
        String simHash4 = SimHashUtils.getSimHash(str4);
        String simHash5 = SimHashUtils.getSimHash(str5);
        // 由 simHash值求出相似度
        double similarity0 = HammingUtils.getSimilarity(simHash0, simHash1);
        double similarity1 = HammingUtils.getSimilarity(simHash0, simHash2);
        double similarity2 = HammingUtils.getSimilarity(simHash0, simHash3);
        double similarity3 = HammingUtils.getSimilarity(simHash0, simHash4);
        double similarity4 = HammingUtils.getSimilarity(simHash0, simHash5);
        // 把相似度写入最后的结果文件中
        TxtIOUtils.writeTxt(similarity0, resultFileName);
        TxtIOUtils.writeTxt(similarity1, resultFileName);
        TxtIOUtils.writeTxt(similarity2, resultFileName);
        TxtIOUtils.writeTxt(similarity3, resultFileName);
        TxtIOUtils.writeTxt(similarity4, resultFileName);
        // 退出程序
        System.exit(0);
    }

}