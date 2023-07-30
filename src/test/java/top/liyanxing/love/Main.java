package top.liyanxing.love;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;

public class Main
{
    public static void main(String[] args)
    {
        DateTime begin = DateUtil.parse("2020-04-18 17:00:00");

        long days = DateUtil.betweenDay(DateUtil.date(), begin, true);

        Console.log("打印数据：{}", days); // TODO 删除 李艳兴
    }
}