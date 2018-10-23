package com.taotao.common.Utli;


import java.util.Random;

/**
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/22 15:14
 */
public class IDUtli {

    /**
     * 生成商品id
     *
     * @return
     */
    public static Long genItemId() {
        //取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();

        //加上2位随机数
        Random random = new Random();
        int end2 = random.nextInt(99);

        //如果不足6位前面补0
        String str = millis + String.format("%02d", end2);
        return new Long(str);
    }

}
