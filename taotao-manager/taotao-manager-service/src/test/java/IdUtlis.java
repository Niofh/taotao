import org.junit.Test;

import java.util.Random;

/**
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/22 15:19
 */
public class IdUtlis {
    @Test
    public  void genItemId() {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        //加上两位随机数
        Random random = new Random();
        int end2 = random.nextInt(99);
        //如果不足两位前面补0
        String str = millis + String.format("%02d", end2);
        long id = new Long(str);
        System.out.println(id);

    }
}
