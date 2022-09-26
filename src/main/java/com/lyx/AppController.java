package com.lyx;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController
{
    @GetMapping("/getPicOfTt")
    public String getPicOfTt()
    {
        int num = RandomUtil.randomInt(1, 136);
        String numStr = NumberUtil.decimalFormat("000", num);

        return StrUtil.format("redirect:/pic_tt/{}.JPG", numStr);
    }

    @GetMapping("/getPicOfLi")
    public String getPicOfLi()
    {
        int num = RandomUtil.randomInt(1, 3);
        String numStr = NumberUtil.decimalFormat("000", num);

        return StrUtil.format("redirect:/pic_li/{}.JPG", numStr);
    }
}