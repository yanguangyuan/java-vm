package com.ygy.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : yanguangyuan
 * @Date : 2020/5/18 14:40
 * @Description :堆内存溢出
 *  VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *  -Xms 堆最小值；
 *  -Xmx 堆最大值；
 *  -XX:+HeapDumpOnOutOfMemoryError 虚拟机在出现内存溢出异常的时候Dump出当前的内存堆转储快照以便进行事后分析
 *
 */
public class HeapOOM {
    static class OOMObject{}
    public static void main(String[] args){
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
