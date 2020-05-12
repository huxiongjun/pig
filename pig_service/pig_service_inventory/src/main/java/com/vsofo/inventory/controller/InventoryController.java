package com.vsofo.inventory.controller;

import com.vsofo.inventory.pojo.PigsArchive;
import com.vsofo.inventory.service.InventoryService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/8 23:36
 * @description 存栏控制类 web 层
 */
@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;


    /**
     * 查询猪只档案的所有数据,得到猪只档案全部数据
     * @return 所有猪只档案列表
     */
    @GetMapping(value = "/findAll")
    public Result<PigsArchive> findAll() {
        System.out.println("进入查询所有的方法");
        List<PigsArchive> pigList = inventoryService.findAll();
        if ( pigList!=null){
            System.out.println(pigList);
            return new Result<>(true, StatusCode.OK, "查询存栏成功",  pigList);
        }
        return new Result<>(false, StatusCode.ERROR, "查询存栏失败");
    }

}
